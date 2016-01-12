/*
 * Copyright (c) 2006-2014 by Public Library of Science
 * http://plos.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.plos.namedentity.service;

import org.plos.namedentity.api.entity.Alert;
import org.plos.namedentity.api.entity.Composite;
import org.plos.namedentity.api.entity.Entity;
import org.plos.namedentity.api.entity.Individualprofile;

import java.util.List;
import java.util.Random;

/* -------------------------------------------------------------------------- */
/*   Named Entity Service High-Level Convenience API                          */
/* -------------------------------------------------------------------------- */

public interface NamedEntityService {

  <T extends Composite> T findComposite(Integer nedId, Class<T> clazz);

  <T extends Composite> T createComposite(T composite, Class<T> clazz);

  void deleteIndividual(Integer nedId);

  /**
   * Finds entity by a unique identifier. Type id references in entity are
   * replaced by equivalent type names (ie, "resolved"). Unique identifiers are
   * unique for a given type class. For example, "Office" could a unique
   * identifier for either Telephone or Physical Address type classes. This is
   * why it is also necessary to specify a type class along with the type value.
   *
   * @param srcType  type class to evaluate unique identifier (ex: "Editorial Manager")
   * @param uid      type value
   * @param clazz    type of resolved entity to return (ex: individual) 
   *
   * @return list of entities with unique identifier (typically just one)
   */
  <T extends Entity> T findResolvedEntityByUid(String srcType, String uid, Class<T> clazz);


  /**
   * Finds entity by primary key. Type id references in entity are replaced by
   * equivalent type names (ie, "resolved").
   *
   * @param pk     primary key of entity
   * @param clazz  entity class to lookup by key 
   *
   * @return entity with specified primary key
   */
  <T extends Entity> T findResolvedEntityByKey(Integer pk, Class<T> clazz);


  /**
   * Finds entities by ned id. Type id references in entity are replaced by
   * equivalent type names (ie, "resolved"). It is assumed that ned id is a 
   * foreign key in the entity. For example, the phone numbers for an individual 
   * are associated by ned id (which is the primary key of the individual).
   *
   * @param nedId  foreign key to individual or organization. 
   * @param clazz  entity class to search by ned id
   *
   * @return       a list of entities (of type T) that have ned id.
   */
  <T extends Entity> List<T> findResolvedEntities(Integer nedId, Class<T> clazz);


  /**
   * Resolves entity's type names to their corresponding primary key (ie,
   * foreign key references). 
   *
   * @param  t  entity object containing type names to resolve
   * @return    same entity object with type ids populated (ie, resolved) 
   */
  <T extends Entity> T resolveValuesToIds(T t);


  /**
   * Check to make sure the given NedId exists for the namedPartyType
   * (ie - Individual). If the ID does not exist, an exception is thrown.
   *
   * @param nedId
   * @param namedPartyType
   */
  void checkNedIdForType(Integer nedId, String namedPartyType);


  /**
   * Generates unique displayname from first and last names in profile entity.
   *
   * @param profile Profile entity to generate displayname for
   * @param rand    Random number generator
   *
   * @return        generated displayname if successful, null otherwise.
   */
  String generateDisplayname(Individualprofile profile, Random rand);


  /**
   * Get a list of search alerts by frequency
   *
   * @param frequency
   * @param journal
   * @return  List of Alert objects
   */
  List<Alert> getAlerts(String frequency, String journal);
}
