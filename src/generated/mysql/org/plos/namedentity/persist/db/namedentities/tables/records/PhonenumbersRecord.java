/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhonenumbersRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.PhonenumbersRecord> implements org.jooq.Record12<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Byte, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.Integer> {

	private static final long serialVersionUID = -1627466917;

	/**
	 * Setter for <code>namedEntities.phoneNumbers.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.nedId</code>.
	 */
	public void setNedid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.nedId</code>.
	 */
	public java.lang.Integer getNedid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.typeId</code>.
	 */
	public void setTypeid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.typeId</code>.
	 */
	public java.lang.Integer getTypeid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.countryCodeTypeId</code>.
	 */
	public void setCountrycodetypeid(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.countryCodeTypeId</code>.
	 */
	public java.lang.Integer getCountrycodetypeid() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.phoneNumber</code>.
	 */
	public void setPhonenumber(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.phoneNumber</code>.
	 */
	public java.lang.String getPhonenumber() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.extension</code>.
	 */
	public void setExtension(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.extension</code>.
	 */
	public java.lang.String getExtension() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.sourceTypeId</code>.
	 */
	public void setSourcetypeid(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.sourceTypeId</code>.
	 */
	public java.lang.Integer getSourcetypeid() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.isActive</code>.
	 */
	public void setIsactive(java.lang.Byte value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.isActive</code>.
	 */
	public java.lang.Byte getIsactive() {
		return (java.lang.Byte) getValue(7);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.created</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.createdBy</code>.
	 */
	public void setCreatedby(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.createdBy</code>.
	 */
	public java.lang.Integer getCreatedby() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.lastModified</code>.
	 */
	public void setLastmodified(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.lastModified</code>.
	 */
	public java.sql.Timestamp getLastmodified() {
		return (java.sql.Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>namedEntities.phoneNumbers.lastModifiedBy</code>.
	 */
	public void setLastmodifiedby(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>namedEntities.phoneNumbers.lastModifiedBy</code>.
	 */
	public java.lang.Integer getLastmodifiedby() {
		return (java.lang.Integer) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Byte, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Byte, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.Integer> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.NEDID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.TYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.COUNTRYCODETYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.PHONENUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.EXTENSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.SOURCETYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field8() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.ISACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.CREATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.LASTMODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.LASTMODIFIEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getNedid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getTypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCountrycodetypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPhonenumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getExtension();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getSourcetypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value8() {
		return getIsactive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getCreatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getLastmodified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getLastmodifiedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value2(java.lang.Integer value) {
		setNedid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value3(java.lang.Integer value) {
		setTypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value4(java.lang.Integer value) {
		setCountrycodetypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value5(java.lang.String value) {
		setPhonenumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value6(java.lang.String value) {
		setExtension(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value7(java.lang.Integer value) {
		setSourcetypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value8(java.lang.Byte value) {
		setIsactive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value9(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value10(java.lang.Integer value) {
		setCreatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value11(java.sql.Timestamp value) {
		setLastmodified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord value12(java.lang.Integer value) {
		setLastmodifiedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonenumbersRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.String value5, java.lang.String value6, java.lang.Integer value7, java.lang.Byte value8, java.sql.Timestamp value9, java.lang.Integer value10, java.sql.Timestamp value11, java.lang.Integer value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PhonenumbersRecord
	 */
	public PhonenumbersRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS);
	}

	/**
	 * Create a detached, initialised PhonenumbersRecord
	 */
	public PhonenumbersRecord(java.lang.Integer id, java.lang.Integer nedid, java.lang.Integer typeid, java.lang.Integer countrycodetypeid, java.lang.String phonenumber, java.lang.String extension, java.lang.Integer sourcetypeid, java.lang.Byte isactive, java.sql.Timestamp created, java.lang.Integer createdby, java.sql.Timestamp lastmodified, java.lang.Integer lastmodifiedby) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS);

		setValue(0, id);
		setValue(1, nedid);
		setValue(2, typeid);
		setValue(3, countrycodetypeid);
		setValue(4, phonenumber);
		setValue(5, extension);
		setValue(6, sourcetypeid);
		setValue(7, isactive);
		setValue(8, created);
		setValue(9, createdby);
		setValue(10, lastmodified);
		setValue(11, lastmodifiedby);
	}
}
