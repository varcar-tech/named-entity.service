/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.ringgold.tables.records;

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
public class AltNameRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.ringgold.tables.records.AltNameRecord> implements org.jooq.Record10<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 1140803820;

	/**
	 * Setter for <code>ringgold.alt_name.Rec_ID</code>.
	 */
	public void setRecId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Rec_ID</code>.
	 */
	public java.lang.Long getRecId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>ringgold.alt_name.P_Code</code>.
	 */
	public void setPCode(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.P_Code</code>.
	 */
	public java.lang.Long getPCode() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>ringgold.alt_name.Name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>ringgold.alt_name.Ext_Name</code>.
	 */
	public void setExtName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Ext_Name</code>.
	 */
	public java.lang.String getExtName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>ringgold.alt_name.City</code>.
	 */
	public void setCity(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.City</code>.
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>ringgold.alt_name.Ext_City</code>.
	 */
	public void setExtCity(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Ext_City</code>.
	 */
	public java.lang.String getExtCity() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>ringgold.alt_name.Country</code>.
	 */
	public void setCountry(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Country</code>.
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>ringgold.alt_name.Lang</code>.
	 */
	public void setLang(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Lang</code>.
	 */
	public java.lang.String getLang() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>ringgold.alt_name.Notes</code>.
	 */
	public void setNotes(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Notes</code>.
	 */
	public java.lang.String getNotes() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>ringgold.alt_name.Timestamp</code>.
	 */
	public void setTimestamp(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>ringgold.alt_name.Timestamp</code>.
	 */
	public java.sql.Timestamp getTimestamp() {
		return (java.sql.Timestamp) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.REC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.P_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.EXT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.EXT_CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.LANG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.NOTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getRecId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getPCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getExtName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getExtCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getLang();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getNotes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value1(java.lang.Long value) {
		setRecId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value2(java.lang.Long value) {
		setPCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value3(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value4(java.lang.String value) {
		setExtName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value5(java.lang.String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value6(java.lang.String value) {
		setExtCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value7(java.lang.String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value8(java.lang.String value) {
		setLang(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value9(java.lang.String value) {
		setNotes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord value10(java.sql.Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AltNameRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.sql.Timestamp value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AltNameRecord
	 */
	public AltNameRecord() {
		super(org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME);
	}

	/**
	 * Create a detached, initialised AltNameRecord
	 */
	public AltNameRecord(java.lang.Long recId, java.lang.Long pCode, java.lang.String name, java.lang.String extName, java.lang.String city, java.lang.String extCity, java.lang.String country, java.lang.String lang, java.lang.String notes, java.sql.Timestamp timestamp) {
		super(org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME);

		setValue(0, recId);
		setValue(1, pCode);
		setValue(2, name);
		setValue(3, extName);
		setValue(4, city);
		setValue(5, extCity);
		setValue(6, country);
		setValue(7, lang);
		setValue(8, notes);
		setValue(9, timestamp);
	}
}
