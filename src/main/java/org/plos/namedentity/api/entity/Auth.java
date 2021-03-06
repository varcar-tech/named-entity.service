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
package org.plos.namedentity.api.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.plos.namedentity.api.NedException;
import org.plos.namedentity.service.PasswordDigestService;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;
import java.util.regex.Pattern;

import static org.plos.namedentity.api.NedException.ErrorType.CasIdError;
import static org.plos.namedentity.api.NedException.ErrorType.DigestPasswordError;
import static org.plos.namedentity.api.NedException.ErrorType.InvalidCasId;
import static org.plos.namedentity.api.NedException.ErrorType.PasswordError;
import static org.plos.namedentity.api.NedException.ErrorType.PasswordFormatError;
import static org.plos.namedentity.api.NedException.ErrorType.TamperedPasswordError;

import static org.plos.namedentity.service.PasswordDigestService.isValidDigestFormat;

@XmlRootElement
public class Auth extends Entity {

  public static final int PASSWORD_MIN_LENGTH = 8;

  private static final int CASID_MIN_LENGTH = 28;
  private static final int CASID_MAX_LENGTH = 36;

  private static final Pattern casRegex = Pattern.compile("^[A-Za-z0-9-]+$");
  private static final Pattern passwordRegexp = Pattern.compile("(\\d+\\D+)|(\\D+\\d+)");

  private String   email;
  private Integer  emailid;
  private String   authid;

  // plain text password is a transient attribute used to generate the secure
  // password and in marshalling from json to pojo entity (not stored in db)
  private String   plainTextPassword;

  // digested password (salt + hashed password) stored in db
  private String   password;

  private Boolean  passwordreset;
  private String   verificationtoken;
  private Boolean  verified;
  private Boolean  isactive;

  public Auth() {
    this.authid = UUID.randomUUID().toString();  // cas id
  }

  private static String EXCLUDED_FIELDS[] = {
    "authid",
    "emailid",
    "isactive",
    "password",
    "plainTextPassword"
  };

  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, concat(Entity.EXCLUDED_FIELDS, Auth.EXCLUDED_FIELDS));
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, concat(Entity.EXCLUDED_FIELDS, Auth.EXCLUDED_FIELDS));
  }

  @Override
  public void validate() {
    validateAuthid(this.authid);
    validatePlainTextPassword(this.plainTextPassword);
    validatePasswordDigest(this.password);
  }

  public java.lang.Integer getEmailid() {
    return this.emailid;
  }

  public void setEmailid(java.lang.Integer emailid) {
    this.emailid = emailid;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public java.lang.String getAuthid() {
    return this.authid;
  }

  public void setAuthid(java.lang.String authid) {
    this.authid = authid;
  }

  @XmlElement(name = "password")
  public String getPlainTextPassword() { return this.plainTextPassword; }

  @XmlElement(name = "password")
  public void setPlainTextPassword(String plainTextPassword) {
    this.plainTextPassword = plainTextPassword;
    if (plainTextPassword != null) {
      setPassword(new PasswordDigestService().generateDigest(plainTextPassword));
    }
  }

  public String getPassword() {
    return this.password;
  }

  // setter called from 1. plaintext setter, 2. jooq populating pojo from db,
  // and 3. etl migrating ambra password.
  @XmlElement(name = "password_digest")
  public void setPassword(String hashedPassword) {
    this.password = hashedPassword;
  }

  public Boolean getPasswordreset() {
    return this.passwordreset;
  }

  public void setPasswordreset(Boolean passwordreset) {
    this.passwordreset = passwordreset;
  }

  public java.lang.String getVerificationtoken() {
    return this.verificationtoken;
  }

  public void setVerificationtoken(java.lang.String verificationtoken) {
    this.verificationtoken = verificationtoken;
  }

  public Boolean getVerified() {
    return this.verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public Boolean getIsactive() {
    return this.isactive;
  }

  public void setIsactive(Boolean isactive) {
    this.isactive = isactive;
  }

  private String[] concat(String[] a, String[] b) {
    String[] c = new String[a.length + b.length];
    System.arraycopy(a, 0, c, 0, a.length);
    System.arraycopy(b, 0, c, a.length, b.length);
    return c;
  }

  private void validateAuthid(String casid) {
    if (casid == null) {
      throw new NedException(CasIdError, "undefined cas id. this is a required field.");
    }

    if (casid.length() < CASID_MIN_LENGTH)
      throw new NedException(InvalidCasId, "CAS ID can not be shorter then " + CASID_MIN_LENGTH + " characters");

    if (casid.length() > CASID_MAX_LENGTH)
      throw new NedException(InvalidCasId, "CAS ID can not be longer then " + CASID_MAX_LENGTH + " characters");

    if (!casRegex.matcher(casid).matches())
      throw new NedException(InvalidCasId, "CAS ID contains invalid characters");
  }

  private void validatePlainTextPassword(String password) {
    // only validate if not null
    if (password != null) {
      if (password.length() < PASSWORD_MIN_LENGTH)
        throw new NedException(PasswordFormatError, "password must be at least "+PASSWORD_MIN_LENGTH+" characters");
      if (!passwordRegexp.matcher(password).find())
        throw new NedException(PasswordFormatError, "password must contain at least one number and one non-number");
    }
  }

  private void validatePasswordDigest(String password) {
    if (password == null) {
      throw new NedException(PasswordError, "undefined password. this is a required field.");
    }
    if ( !isValidDigestFormat(password) ) {
      throw new NedException(DigestPasswordError, String.format(
        "invalid encoded password (length:%d)", password.length()));
    }
    if (plainTextPassword != null) {
      boolean verifyResult = new PasswordDigestService().verifyPassword(plainTextPassword, password);
      if (!verifyResult) {
        throw new NedException(TamperedPasswordError, "secure password doesn't match input password");
      }
    }
  }
}
