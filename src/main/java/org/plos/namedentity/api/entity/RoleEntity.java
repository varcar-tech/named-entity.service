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
package org.plos.namedentity.api.entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Modified JOOQ generated class(pojo=true).
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleEntity implements java.io.Serializable {

  private static final long serialVersionUID = 315701916;

  private Integer  roleid;
  private Integer  namedentityid;
  private Integer  sourceapplicationtypeid;
  private Integer  roletypeid;
  private Timestamp startdate;
  private Timestamp enddate;
  private Timestamp created;
  private Timestamp lastmodified;
  private Integer  createdby;
  private Integer  lastmodifiedby;

  private String  sourceapplication;
  private String  roletype;


  public RoleEntity() {
    //this(null,null,null,null,null,null,null,null,null,null);
  }

//  public RoleEntity(
//    Integer  roleid,
//    Integer  namedentityid,
//    Integer  sourceapplicationtypeid,
//    Integer  roletypeid,
//    Timestamp startdate,
//    Timestamp enddate,
//    Timestamp created,
//    Timestamp lastmodified,
//    Integer  createdby,
//    Integer  lastmodifiedby
//  ) {
//    this.roleid         = roleid;
//    this.namedentityid  = namedentityid;
//    this.sourceapplicationtypeid = sourceapplicationtypeid;
//    this.roletypeid     = roletypeid;
//    this.startdate      = startdate;
//    this.enddate        = enddate;
//    this.created        = (created != null ? created : new Timestamp(new Date().getTime()));
//    this.lastmodified   = (lastmodified != null ? lastmodified : new Timestamp(new Date().getTime()));
//    this.createdby      = createdby;
//    this.lastmodifiedby = lastmodifiedby;
//  }

  public String getSourceapplication() {
    return sourceapplication;
  }

  public void setSourceapplication(String sourceapplication) {
    this.sourceapplication = sourceapplication;
  }

  public String getRoletype() {
    return roletype;
  }

  public void setRoletype(String roletype) {
    this.roletype = roletype;
  }

  public Integer getRoleid() {
    return this.roleid;
  }

  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
  }

  public Integer getNamedentityid() {
    return this.namedentityid;
  }

  public void setNamedentityid(Integer namedentityid) {
    this.namedentityid = namedentityid;
  }

  public Integer getSourceapplicationtypeid() {
    return this.sourceapplicationtypeid;
  }

  public void setSourceapplicationtypeid(Integer sourceapplicationtypeid) {
    this.sourceapplicationtypeid = sourceapplicationtypeid;
  }

  public Integer getRoletypeid() {
    return this.roletypeid;
  }

  public void setRoletypeid(Integer roletypeid) {
    this.roletypeid = roletypeid;
  }

  public java.sql.Timestamp getStartdate() {
    return this.startdate;
  }

  public void setStartdate(java.sql.Timestamp startdate) {
    this.startdate = startdate;
  }

  public java.sql.Timestamp getEnddate() {
    return this.enddate;
  }

  public void setEnddate(java.sql.Timestamp enddate) {
    this.enddate = enddate;
  }

  public java.sql.Timestamp getCreated() {
    return this.created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }

  public java.sql.Timestamp getLastmodified() {
    return this.lastmodified;
  }

  public void setLastmodified(java.sql.Timestamp lastmodified) {
    this.lastmodified = lastmodified;
  }

  public Integer getCreatedby() {
    return this.createdby;
  }

  public void setCreatedby(Integer createdby) {
    this.createdby = createdby;
  }

  public Integer getLastmodifiedby() {
    return this.lastmodifiedby;
  }

  public void setLastmodifiedby(Integer lastmodifiedby) {
    this.lastmodifiedby = lastmodifiedby;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) { return true; }

    if (o == null || this.getClass() != o.getClass()) { return false; }

    RoleEntity entity = (RoleEntity) o;
    return Objects.equals(this.roleid, entity.roleid)
        && Objects.equals(this.namedentityid, entity.namedentityid)
        && Objects.equals(this.roletypeid, entity.roletypeid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleid, namedentityid, roletypeid);
  }
}
