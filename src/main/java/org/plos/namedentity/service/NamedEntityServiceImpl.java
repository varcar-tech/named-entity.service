/*
 * Copyright (c) 2017 Public Library of Science
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */
package org.plos.namedentity.service;

import org.plos.namedentity.api.Consumer;
import org.plos.namedentity.api.IndividualComposite;
import org.plos.namedentity.api.NedException;
import org.plos.namedentity.api.entity.*;
import org.plos.namedentity.api.enums.UidTypeEnum;
import org.plos.namedentity.persist.NamedEntityDBService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import static org.plos.namedentity.api.NedException.ErrorType.ServerError;
import static org.plos.namedentity.api.entity.Individualprofile.DISPLAYNAME_MAX_LENGTH;
import static org.plos.namedentity.api.entity.Individualprofile.rejectedCharsDisplayName;

public class NamedEntityServiceImpl implements NamedEntityService {

  private static final Logger logger = LoggerFactory.getLogger(NamedEntityServiceImpl.class);

  @Inject
  private NamedEntityDBService nedDBSvc;

  public <T extends Entity> T resolveValuesToIds(T t) {

    resolveCreatedAndLastmodifiedBy(t);

    if (t instanceof Individualprofile)
      resolveProfile((Individualprofile) t);
    else if (t instanceof Organization)
      resolveOrganization((Organization) t);
    else if (t instanceof Address)
      resolveAddress((Address) t);
    else if (t instanceof Alert)
      resolveAlert((Alert) t);
    else if (t instanceof Phonenumber)
      resolvePhonenumber((Phonenumber) t);
    else if (t instanceof Email)
      resolveEmail((Email) t);
    else if (t instanceof Uniqueidentifier)
      resolveReference((Uniqueidentifier) t);
    else if (t instanceof Degree)
      resolveDegree((Degree) t);
    else if (t instanceof Group)
      resolveGroup((Group) t);
    else if (t instanceof Url)
      resolveUrl((Url) t);
    else if (t instanceof Auth)
      resolveAuth((Auth) t);
    else if (t instanceof Relationship)
      resolveIndividualRelationship((Relationship) t);
    else
      throw new UnsupportedOperationException("Can not resolve entity for " + t.getClass());

    return t;
  }

  private <T extends Entity> void resolveCreatedAndLastmodifiedBy(T entity) {
    if (entity.getCreatedbyname() != null) {
      entity.setCreatedby(findAppuserId(entity.getCreatedbyname()));
    }
    if (entity.getLastmodifiedbyname() != null) {
      entity.setLastmodifiedby(findAppuserId(entity.getLastmodifiedbyname()));
    }
  }

  private Individualprofile resolveProfile(Individualprofile entity) {

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    if (entity.getNameprefix() != null) {
      Integer prefixTypeClassId = nedDBSvc.findTypeClass("Named Party Prefixes");
      Integer prefixTypeId = nedDBSvc.findTypeValue(prefixTypeClassId, entity.getNameprefix());
      entity.setNameprefixtypeid(prefixTypeId);
    }

    if (entity.getNamesuffix() != null) {
      Integer suffixTypeClassId = nedDBSvc.findTypeClass("Named Party Suffixes");
      Integer suffixTypeId      = nedDBSvc.findTypeValue(suffixTypeClassId, entity.getNamesuffix());
      entity.setNamesuffixtypeid(suffixTypeId);
    }

    return entity;
  }

  public String generateDisplayname(Individualprofile entity, Random rand) {

    final int MAX_TRIES = 100;
    final int MIN_VAL = 100;
    final int MAX_VAL = 999;

    // (max displayname length) - (uuid length)
    final int MAX_BASE_LENGTH = DISPLAYNAME_MAX_LENGTH - 32;

    StringBuilder basename = new StringBuilder();

    try {
      entity.validateFirstname();
      entity.validateLastname();

      // merge first and last name and strip special characters
      String cleanbase = rejectedCharsDisplayName.matcher((entity.getFirstname().charAt(0) + entity.getLastname()).toLowerCase()).replaceAll("");

      Individualprofile.validateDisplayname(cleanbase);

      basename.append(cleanbase.length() > MAX_BASE_LENGTH ? cleanbase.substring(0, MAX_BASE_LENGTH) : cleanbase);
    } catch (NedException e) {
      basename.append("plosuser");
    }

    int count = 0;

    while (true) {
      StringBuilder displayname = new StringBuilder();
      displayname.append(basename);

      if (count > 0) {
        // nextInt is exclusive at top end, so add 1 to make it inclusive
        displayname.append(rand.nextInt((MAX_VAL - MIN_VAL) + 1) + MIN_VAL);
      }

      Individualprofile profileCriteria = new Individualprofile();
      profileCriteria.setDisplayname(displayname.toString());
      List<Individualprofile> profilesResult = nedDBSvc.findByAttribute(profileCriteria, false);
      if (profilesResult.size() == 0) {
        return displayname.toString();   // displayname is available
      }

      if (++count == MAX_TRIES) {

        // we've exhausted generation attempts with random number. fall back
        // to initials plus uuid (w/o dashes).

        displayname.setLength(0);
        displayname.append(basename).append("-");
        displayname.append(UUID.randomUUID().toString().replaceAll("-", ""));

        logger.warn(String.format("Exhausted displayname generation with random " +
                "number for firstname:%s lastname:%s. Generating uuid-variant: %s",
            entity.getFirstname(), entity.getLastname(), displayname.toString()));

        return displayname.toString();
      }
    }
  }

  public List<Alert> getAlerts(String frequency) {
    return nedDBSvc.getAlerts(frequency);
  }

  public Integer countGlobalTypes() {
    return nedDBSvc.countGlobalTypes();
  }

  public Integer countConsumers() {
    return nedDBSvc.countConsumers();
  }

  private Organization resolveOrganization(Organization entity) {

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Organization Types"), entity.getType()));

    return entity;
  }

  private Address resolveAddress(Address entity) {

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Physical Address Types"), entity.getType()));

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    if (entity.getCountrycodetype() != null)
      entity.setCountrycodetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Country Types"), entity.getCountrycodetype()));

    if (entity.getStatecodetype() != null)
      entity.setStatecodetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("State and Province Codes"), entity.getStatecodetype()));

    return entity;
  }

  private Alert resolveAlert(Alert entity) {

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    if (entity.getFrequency() != null)
      entity.setFrequencytypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Alert Frequency"), entity.getFrequency()));

    return entity;
  }

  private Phonenumber resolvePhonenumber(Phonenumber entity) {

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Telephone Number Types"), entity.getType()));

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    if (entity.getCountrycodetype() != null)
      entity.setCountrycodetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Country Codes for Phone Numbers"), entity.getCountrycodetype()));

    return entity;
  }

  private Email resolveEmail(Email entity) {

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Email Address Types"), entity.getType()));

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    return entity;
  }

  private Relationship resolveIndividualRelationship(Relationship entity) {

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Relationship Types"), entity.getType()));

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    return entity;
  }

  private Degree resolveDegree(Degree entity) {

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Degrees"), entity.getType()));

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    return entity;
  }

  private Url resolveUrl(Url entity) {

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    return entity;
  }

  private Auth resolveAuth(Auth entity) {

    if (entity.getEmail() != null) {
      Email searchCriteria = new Email();
      searchCriteria.setEmailaddress( entity.getEmail() );

      searchCriteria.setSourcetypeid(nedDBSvc.findTypeValue(
        nedDBSvc.findTypeClass("Source Applications"), UidTypeEnum.AMBRA.getName()));

      List<Email> searchResult = nedDBSvc.findByAttribute(searchCriteria, false);
      
      if (searchResult.size() != 1) {
        throw new NedException(ServerError, String.format(
          "Expected to find one email for %s. Found %d.", 
            entity.getEmail(), searchResult.size()));
      }
      entity.setEmailid( searchResult.get(0).getId() );
    }
    return entity;
  }

  private Group resolveGroup(Group entity) {

    if (entity.getApplicationtype() != null)
      entity.setApplicationtypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("User Applications"), entity.getApplicationtype()));

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Groups"), entity.getType()));

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    return entity;
  }

  private Uniqueidentifier resolveReference(Uniqueidentifier entity) {

    if (entity.getType() != null)
      entity.setTypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClassByInspection("type", entity), entity.getType()));

    if (entity.getSource() != null)
      entity.setSourcetypeid(nedDBSvc.findTypeValue(nedDBSvc.findTypeClass("Source Applications"), entity.getSource()));

    return entity;
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T extends Composite> T findComposite(Integer nedId, Class<T> clazz) {

    Constructor<?> ctor = clazz.getConstructors()[0];
    try {
      T composite = (T)ctor.newInstance();

      Map<Class, List<? extends Entity>> compositeMap = composite.readAsMap();

      for (Class entityType : compositeMap.keySet())
        compositeMap.put(entityType, findResolvedEntities(nedId, entityType));

      composite.setFromMap(compositeMap);

      return composite;

    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
      throw new NedException(ServerError, String.format(
        "findComposite(): unable to assemble composite (nedid=%d, %s)", nedId, clazz.getSimpleName()));
    }
  }

  public void deleteIndividual(Integer nedId) {

    IndividualComposite composite = findComposite(nedId, IndividualComposite.class);

    // delete auth because it has a foreign key to emails
    composite.getAuth().stream().forEach(e -> nedDBSvc.delete(e));
    composite.setAuth(new ArrayList<>());

    // delete the composite sub entities
    composite.readAsMap().values().stream()
        .forEach(entities -> entities.forEach(e -> nedDBSvc.delete(e)));

    // delete the items that belong to an individual but are outside of a composite
    findResolvedEntities(nedId, Alert.class).stream()
        .forEach(e -> nedDBSvc.delete(e));

  }

  @Override @Transactional
  public  <T extends Composite> T createComposite(T composite, Class<T> clazz) {

    Integer nedId = nedDBSvc.newNamedEntityId(composite.getTypeName());

    // insert into NED

    Map<Class, List<? extends Entity>> compositeMap = composite.readAsMap();

    for (List<? extends Entity> entities : compositeMap.values()) {
      if (entities != null) {
        for (Entity entity : entities) {
          entity.setNedid(nedId);
          nedDBSvc.create(resolveValuesToIds(entity));
        }
      }
    }

    return findComposite(nedId, clazz);
  }

  @Override
  public <T extends Entity> List<T> findResolvedEntities(Integer nedId, Class<T> clazz) {
    return nedDBSvc.findResolvedEntities(nedId, clazz);
  }

  @Override
  public <T extends Entity> T findResolvedEntityByKey(Integer pk, Class<T> clazz) {
    return nedDBSvc.findResolvedEntityByKey(pk, clazz);
  }

  @Override
  public <T extends Entity> T findResolvedEntityByUid(String srcType, String uid, Class<T> clazz) {
    return nedDBSvc.findResolvedEntityByUid(srcType, uid, clazz);
  }

  @Override
  public void checkNedIdForType(Integer nedId, String namedPartyType) {
    nedDBSvc.checkNedIdForType(nedId, namedPartyType);
  }
    
  public NamedEntityDBService getNamedEntityDBService() {
    return nedDBSvc;
  }
    
  public void setNamedEntityDBService(NamedEntityDBService nedDBSvc) {
    this.nedDBSvc = nedDBSvc;
  }

  private Integer findAppuserId(String username) {
    //TODO: cache app users in memory.
    Consumer filter = new Consumer();
    filter.setName(username);
    List<Consumer> consumers = nedDBSvc.findByAttribute(filter, false);
    if (consumers.size() == 0) {
      throw new NedException(ServerError, "Unknown application user: "+username);
    }
    return consumers.get(0).getId();
  }
}
