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
public class IndividualsRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord> implements org.jooq.Record13<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, byte[], java.lang.Byte, java.lang.Byte> {

	private static final long serialVersionUID = 642382428;

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.NAMEDENTITYID</code>.
	 */
	public void setNamedentityid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.NAMEDENTITYID</code>.
	 */
	public java.lang.Integer getNamedentityid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.FIRSTNAME</code>.
	 */
	public void setFirstname(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.FIRSTNAME</code>.
	 */
	public java.lang.String getFirstname() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.MIDDLENAME</code>.
	 */
	public void setMiddlename(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.MIDDLENAME</code>.
	 */
	public java.lang.String getMiddlename() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.LASTNAME</code>.
	 */
	public void setLastname(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.LASTNAME</code>.
	 */
	public java.lang.String getLastname() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.NICKNAME</code>.
	 */
	public void setNickname(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.NICKNAME</code>.
	 */
	public java.lang.String getNickname() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.NAMEPREFIXTYPEID</code>.
	 */
	public void setNameprefixtypeid(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.NAMEPREFIXTYPEID</code>.
	 */
	public java.lang.Integer getNameprefixtypeid() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.NAMESUFFIXTYPEID</code>.
	 */
	public void setNamesuffixtypeid(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.NAMESUFFIXTYPEID</code>.
	 */
	public java.lang.Integer getNamesuffixtypeid() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.DISPLAYNAME</code>.
	 */
	public void setDisplayname(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.DISPLAYNAME</code>.
	 */
	public java.lang.String getDisplayname() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.PREFERREDLANGUAGETYPEID</code>.
	 */
	public void setPreferredlanguagetypeid(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.PREFERREDLANGUAGETYPEID</code>.
	 */
	public java.lang.Integer getPreferredlanguagetypeid() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.PREFERREDCOMMUNICATIONMETHODTYPEID</code>.
	 */
	public void setPreferredcommunicationmethodtypeid(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.PREFERREDCOMMUNICATIONMETHODTYPEID</code>.
	 */
	public java.lang.Integer getPreferredcommunicationmethodtypeid() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.PHOTOIMAGE</code>.
	 */
	public void setPhotoimage(byte[] value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.PHOTOIMAGE</code>.
	 */
	public byte[] getPhotoimage() {
		return (byte[]) getValue(10);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.ISACTIVE</code>.
	 */
	public void setIsactive(java.lang.Byte value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.ISACTIVE</code>.
	 */
	public java.lang.Byte getIsactive() {
		return (java.lang.Byte) getValue(11);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.INDIVIDUALS.ISVISIBLE</code>.
	 */
	public void setIsvisible(java.lang.Byte value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.INDIVIDUALS.ISVISIBLE</code>.
	 */
	public java.lang.Byte getIsvisible() {
		return (java.lang.Byte) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, byte[], java.lang.Byte, java.lang.Byte> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, byte[], java.lang.Byte, java.lang.Byte> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.NAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.MIDDLENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.NICKNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.NAMEPREFIXTYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.NAMESUFFIXTYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.DISPLAYNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.PREFERREDLANGUAGETYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.PREFERREDCOMMUNICATIONMETHODTYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field11() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.PHOTOIMAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field12() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.ISACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field13() {
		return org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS.ISVISIBLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getNamedentityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getMiddlename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getNickname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getNameprefixtypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getNamesuffixtypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getDisplayname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getPreferredlanguagetypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getPreferredcommunicationmethodtypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value11() {
		return getPhotoimage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value12() {
		return getIsactive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value13() {
		return getIsvisible();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value1(java.lang.Integer value) {
		setNamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value2(java.lang.String value) {
		setFirstname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value3(java.lang.String value) {
		setMiddlename(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value4(java.lang.String value) {
		setLastname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value5(java.lang.String value) {
		setNickname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value6(java.lang.Integer value) {
		setNameprefixtypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value7(java.lang.Integer value) {
		setNamesuffixtypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value8(java.lang.String value) {
		setDisplayname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value9(java.lang.Integer value) {
		setPreferredlanguagetypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value10(java.lang.Integer value) {
		setPreferredcommunicationmethodtypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value11(byte[] value) {
		setPhotoimage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value12(java.lang.Byte value) {
		setIsactive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value13(java.lang.Byte value) {
		setIsvisible(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.String value8, java.lang.Integer value9, java.lang.Integer value10, byte[] value11, java.lang.Byte value12, java.lang.Byte value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IndividualsRecord
	 */
	public IndividualsRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS);
	}

	/**
	 * Create a detached, initialised IndividualsRecord
	 */
	public IndividualsRecord(java.lang.Integer namedentityid, java.lang.String firstname, java.lang.String middlename, java.lang.String lastname, java.lang.String nickname, java.lang.Integer nameprefixtypeid, java.lang.Integer namesuffixtypeid, java.lang.String displayname, java.lang.Integer preferredlanguagetypeid, java.lang.Integer preferredcommunicationmethodtypeid, byte[] photoimage, java.lang.Byte isactive, java.lang.Byte isvisible) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS);

		setValue(0, namedentityid);
		setValue(1, firstname);
		setValue(2, middlename);
		setValue(3, lastname);
		setValue(4, nickname);
		setValue(5, nameprefixtypeid);
		setValue(6, namesuffixtypeid);
		setValue(7, displayname);
		setValue(8, preferredlanguagetypeid);
		setValue(9, preferredcommunicationmethodtypeid);
		setValue(10, photoimage);
		setValue(11, isactive);
		setValue(12, isvisible);
	}
}
