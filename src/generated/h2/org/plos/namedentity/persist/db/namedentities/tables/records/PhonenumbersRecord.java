/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhonenumbersRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.PhonenumbersRecord> implements org.jooq.Record8<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte> {

	private static final long serialVersionUID = -1815973346;

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.ID</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.NEDID</code>.
	 */
	public void setNedid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.NEDID</code>.
	 */
	public java.lang.Integer getNedid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.TYPEID</code>.
	 */
	public void setTypeid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.TYPEID</code>.
	 */
	public java.lang.Integer getTypeid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.COUNTRYCODETYPEID</code>.
	 */
	public void setCountrycodetypeid(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.COUNTRYCODETYPEID</code>.
	 */
	public java.lang.Integer getCountrycodetypeid() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.PHONENUMBER</code>.
	 */
	public void setPhonenumber(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.PHONENUMBER</code>.
	 */
	public java.lang.String getPhonenumber() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.EXTENSION</code>.
	 */
	public void setExtension(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.EXTENSION</code>.
	 */
	public java.lang.String getExtension() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.ISPRIMARY</code>.
	 */
	public void setIsprimary(java.lang.Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.ISPRIMARY</code>.
	 */
	public java.lang.Byte getIsprimary() {
		return (java.lang.Byte) getValue(6);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.PHONENUMBERS.ISACTIVE</code>.
	 */
	public void setIsactive(java.lang.Byte value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.PHONENUMBERS.ISACTIVE</code>.
	 */
	public java.lang.Byte getIsactive() {
		return (java.lang.Byte) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
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
	public org.jooq.Field<java.lang.Byte> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS.ISPRIMARY;
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
	public java.lang.Byte value7() {
		return getIsprimary();
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
	public PhonenumbersRecord value7(java.lang.Byte value) {
		setIsprimary(value);
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
	public PhonenumbersRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.String value5, java.lang.String value6, java.lang.Byte value7, java.lang.Byte value8) {
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
	public PhonenumbersRecord(java.lang.Integer id, java.lang.Integer nedid, java.lang.Integer typeid, java.lang.Integer countrycodetypeid, java.lang.String phonenumber, java.lang.String extension, java.lang.Byte isprimary, java.lang.Byte isactive) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Phonenumbers.PHONENUMBERS);

		setValue(0, id);
		setValue(1, nedid);
		setValue(2, typeid);
		setValue(3, countrycodetypeid);
		setValue(4, phonenumber);
		setValue(5, extension);
		setValue(6, isprimary);
		setValue(7, isactive);
	}
}
