package org.plos.namedentity.api.entity;

import org.plos.namedentity.validate.Validatable;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class Entity implements Validatable {

  @Override
  public void validate() {
  }
}
