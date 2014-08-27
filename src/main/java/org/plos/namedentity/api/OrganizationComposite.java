package org.plos.namedentity.api;

import org.plos.namedentity.api.entity.Address;
import org.plos.namedentity.api.entity.Email;
import org.plos.namedentity.api.entity.Organization;
import org.plos.namedentity.api.entity.Phonenumber;
import org.plos.namedentity.api.entity.Uniqueidentifier;
import org.plos.namedentity.validate.Validatable;

import java.util.List;

public class OrganizationComposite implements Validatable {

  private Organization           organization;
  private List<Address>          addresses;
  private List<Email>            emails;
  private List<Phonenumber>      phonenumbers;
  private List<Uniqueidentifier> uniqueidentifiers;

  public OrganizationComposite() {
    this.organization = new Organization();
  }

  public Integer getNamedentityid() {
    return this.organization.getNamedentityid();
  }

  public void setNamedentityid(Integer namedentityid) {
    this.organization.setNamedentityid(namedentityid);
  }

  public Integer getOrganizationtypeid() {
    return this.organization.getOrganizationtypeid();
  }

  public void setOrganizationtypeid(Integer organizationtypeid) {
    this.organization.setOrganizationtypeid(organizationtypeid);
  }

  public String getOrganizationfamiliarname() {
    return this.organization.getOrganizationfamiliarname();
  }

  public void setOrganizationfamiliarname(String organizationfamiliarname) {
    this.organization.setOrganizationfamiliarname(organizationfamiliarname);
  }

  public String getOrganizationlegalname() {
    return this.organization.getOrganizationlegalname();
  }

  public void setOrganizationlegalname(String organizationlegalname) {
    this.organization.setOrganizationlegalname(organizationlegalname);
  }

  public Integer getOrganizationmaincontactid() {
    return this.organization.getOrganizationmaincontactid();
  }

  public void setOrganizationmaincontactid(Integer organizationmaincontactid) {
    this.organization.setOrganizationtypeid(organizationmaincontactid);
  }

  public Byte getIsactive() {
    return this.organization.getIsactive();
  }

  public void setIsactive(Byte isactive) {
    this.organization.setIsactive(isactive);
  }

  public Byte getIsvisible() {
    return this.organization.getIsvisible();
  }

  public void setIsvisible(Byte isvisible) {
    this.organization.setIsvisible(isvisible);
  }

  public String getUrl() {
    return this.organization.getUrl();
  }

  public void setUrl(String url) {
    this.organization.setUrl(url);
  }

  public String getOrganizationtype() {
    return this.organization.getOrganizationtype();
  }

  public void setOrganizationtype(String organizationtype) {
    this.organization.setOrganizationtype(organizationtype);
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

  @Override
  public void validate() {
  }
}
