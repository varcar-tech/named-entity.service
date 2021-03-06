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
package org.plos.namedentity.api;

import org.plos.namedentity.api.entity.*;
import org.plos.namedentity.api.enums.NamedPartyEnum;
import org.plos.namedentity.validate.Validatable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.plos.namedentity.api.NedException.ErrorType.NoAuthEntity;
import static org.plos.namedentity.api.NedException.ErrorType.NoEmailEntities;
import static org.plos.namedentity.api.NedException.ErrorType.NoProfileEntities;

@XmlRootElement
public class IndividualComposite extends Composite implements Validatable {

  @XmlElement(name = "credentials")
  private List<Auth>              auth;

  private List<Individualprofile> individualprofiles;
  private List<Group>             groups;
  private List<Address>           addresses;
  private List<Email>             emails;
  private List<Phonenumber>       phonenumbers;
  private List<Uniqueidentifier>  uniqueidentifiers;
  private List<Degree>            degrees;
  private List<Url>               urls;
  private List<Relationship>      relationships;

  public NamedPartyEnum getTypeName() {
    return NamedPartyEnum.INDIVIDUAL;
  }

  @XmlTransient
  public Map<Class, List<? extends Entity>> readAsMap() {

    // use a linked map to preserve insertion order. this will ensure
    // that email inserts before auth record during composite creation
    // (auth record has a foreign key to email record)

    Map<Class, List<? extends Entity>> map = new LinkedHashMap<>();

    map.put(Individualprofile.class, individualprofiles);
    map.put(Group.class, groups);
    map.put(Address.class, addresses);
    map.put(Email.class, emails);
    map.put(Phonenumber.class, phonenumbers);
    map.put(Uniqueidentifier.class, uniqueidentifiers);
    map.put(Degree.class, degrees);
    map.put(Url.class, urls);
    map.put(Auth.class, auth);
    map.put(Relationship.class, relationships);

    return map;
  }

  @SuppressWarnings("unchecked")
  public void setFromMap(Map<Class, List<? extends Entity>> map) {
    individualprofiles = (List<Individualprofile>) map.get(Individualprofile.class);
    groups             = (List<Group>) map.get(Group.class);
    addresses          = (List<Address>) map.get(Address.class);
    emails             = (List<Email>) map.get(Email.class);
    phonenumbers       = (List<Phonenumber>) map.get(Phonenumber.class);
    uniqueidentifiers  = (List<Uniqueidentifier>) map.get(Uniqueidentifier.class);
    degrees            = (List<Degree>) map.get(Degree.class);
    urls               = (List<Url>) map.get(Url.class);
    auth               = (List<Auth>) map.get(Auth.class);
    relationships      = (List<Relationship>) map.get(Relationship.class);
  }

  @Override
  public void validate() {

    Map<Class, List<? extends Entity>> compositeMap = readAsMap();

    for (List<? extends Entity> entities : compositeMap.values()) {

      if (entities != null) {
        for (Entity entity : entities)
          entity.validate();
      }
    }

    if (individualprofiles == null || individualprofiles.size() == 0)
      throw new NedException(NoProfileEntities, "Profile entities can not be empty");

    if (emails == null || emails.size() == 0)
      throw new NedException(NoEmailEntities, "Email entities can not be empty");

    if (auth == null || auth.size() == 0)
      throw new NedException(NoAuthEntity, "User credentials can not be empty");
  }

  public List<Auth> getAuth() {
    return auth;
  }

  public void setAuth(List<Auth> auth) {
    this.auth = auth;
  }

  public List<Individualprofile> getIndividualprofiles() {
    return individualprofiles;
  }

  public void setIndividualprofiles(List<Individualprofile> individualprofiles) {
    this.individualprofiles = individualprofiles;
  }

  public List<Url> getUrls() {
    return urls;
  }

  public void setUrls(List<Url> urls) {
    this.urls = urls;
  }

  public List<Degree> getDegrees() {
    return degrees;
  }

  public void setDegrees(List<Degree> degrees) {
    this.degrees = degrees;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public List<Email> getEmails() {
    return emails;
  }

  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }

  public List<Phonenumber> getPhonenumbers() {
    return phonenumbers;
  }

  public void setPhonenumbers(List<Phonenumber> phonenumbers) {
    this.phonenumbers = phonenumbers;
  }

  public List<Uniqueidentifier> getUniqueidentifiers() {
    return uniqueidentifiers;
  }

  public void setUniqueidentifiers(List<Uniqueidentifier> uniqueidentifiers) {
    this.uniqueidentifiers = uniqueidentifiers;
  }

  public List<Relationship> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<Relationship> relationships) {
    this.relationships = relationships;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    Map<Class, List<? extends Entity>> compositeMap = readAsMap();
    for (List<? extends Entity> entities : compositeMap.values()) {
      if (entities != null) {
        for (Entity entity : entities)
          sb.append(entity).append("\n");
      }
    }
    return sb.toString();
  }
}
