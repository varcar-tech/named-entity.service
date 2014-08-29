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
public class AddressesRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.AddressesRecord> implements org.jooq.Record15<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Byte, java.lang.Byte> {

	private static final long serialVersionUID = -1783932314;

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSID</code>.
	 */
	public void setAddressid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSID</code>.
	 */
	public java.lang.Integer getAddressid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.NAMEDENTITYID</code>.
	 */
	public void setNamedentityid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.NAMEDENTITYID</code>.
	 */
	public java.lang.Integer getNamedentityid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSTYPEID</code>.
	 */
	public void setAddresstypeid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSTYPEID</code>.
	 */
	public java.lang.Integer getAddresstypeid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSLINE1</code>.
	 */
	public void setAddressline1(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSLINE1</code>.
	 */
	public java.lang.String getAddressline1() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSLINE2</code>.
	 */
	public void setAddressline2(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSLINE2</code>.
	 */
	public java.lang.String getAddressline2() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSLINE3</code>.
	 */
	public void setAddressline3(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.ADDRESSLINE3</code>.
	 */
	public java.lang.String getAddressline3() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.CITY</code>.
	 */
	public void setCity(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.CITY</code>.
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.STATECODETYPEID</code>.
	 */
	public void setStatecodetypeid(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.STATECODETYPEID</code>.
	 */
	public java.lang.Integer getStatecodetypeid() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.COUNTRYCODETYPEID</code>.
	 */
	public void setCountrycodetypeid(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.COUNTRYCODETYPEID</code>.
	 */
	public java.lang.Integer getCountrycodetypeid() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.POSTALCODE</code>.
	 */
	public void setPostalcode(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.POSTALCODE</code>.
	 */
	public java.lang.String getPostalcode() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.MAINCONTACTNAMEDENTITYID</code>.
	 */
	public void setMaincontactnamedentityid(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.MAINCONTACTNAMEDENTITYID</code>.
	 */
	public java.lang.Integer getMaincontactnamedentityid() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.LATITUDE</code>.
	 */
	public void setLatitude(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.LATITUDE</code>.
	 */
	public java.lang.Integer getLatitude() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.LONGITUDE</code>.
	 */
	public void setLongitude(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.LONGITUDE</code>.
	 */
	public java.lang.Integer getLongitude() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.ISPRIMARY</code>.
	 */
	public void setIsprimary(java.lang.Byte value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.ISPRIMARY</code>.
	 */
	public java.lang.Byte getIsprimary() {
		return (java.lang.Byte) getValue(13);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.ADDRESSES.ISACTIVE</code>.
	 */
	public void setIsactive(java.lang.Byte value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.ADDRESSES.ISACTIVE</code>.
	 */
	public java.lang.Byte getIsactive() {
		return (java.lang.Byte) getValue(14);
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
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Byte, java.lang.Byte> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Byte, java.lang.Byte> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.ADDRESSID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.NAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.ADDRESSTYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.ADDRESSLINE1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.ADDRESSLINE2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.ADDRESSLINE3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.STATECODETYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.COUNTRYCODETYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.POSTALCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.MAINCONTACTNAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.LATITUDE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.LONGITUDE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field14() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.ISPRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field15() {
		return org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES.ISACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAddressid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getNamedentityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getAddresstypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getAddressline1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getAddressline2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddressline3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getStatecodetypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getCountrycodetypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getPostalcode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getMaincontactnamedentityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getLatitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getLongitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value14() {
		return getIsprimary();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value15() {
		return getIsactive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value1(java.lang.Integer value) {
		setAddressid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value2(java.lang.Integer value) {
		setNamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value3(java.lang.Integer value) {
		setAddresstypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value4(java.lang.String value) {
		setAddressline1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value5(java.lang.String value) {
		setAddressline2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value6(java.lang.String value) {
		setAddressline3(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value7(java.lang.String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value8(java.lang.Integer value) {
		setStatecodetypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value9(java.lang.Integer value) {
		setCountrycodetypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value10(java.lang.String value) {
		setPostalcode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value11(java.lang.Integer value) {
		setMaincontactnamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value12(java.lang.Integer value) {
		setLatitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value13(java.lang.Integer value) {
		setLongitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value14(java.lang.Byte value) {
		setIsprimary(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value15(java.lang.Byte value) {
		setIsactive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8, java.lang.Integer value9, java.lang.String value10, java.lang.Integer value11, java.lang.Integer value12, java.lang.Integer value13, java.lang.Byte value14, java.lang.Byte value15) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressesRecord
	 */
	public AddressesRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES);
	}

	/**
	 * Create a detached, initialised AddressesRecord
	 */
	public AddressesRecord(java.lang.Integer addressid, java.lang.Integer namedentityid, java.lang.Integer addresstypeid, java.lang.String addressline1, java.lang.String addressline2, java.lang.String addressline3, java.lang.String city, java.lang.Integer statecodetypeid, java.lang.Integer countrycodetypeid, java.lang.String postalcode, java.lang.Integer maincontactnamedentityid, java.lang.Integer latitude, java.lang.Integer longitude, java.lang.Byte isprimary, java.lang.Byte isactive) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Addresses.ADDRESSES);

		setValue(0, addressid);
		setValue(1, namedentityid);
		setValue(2, addresstypeid);
		setValue(3, addressline1);
		setValue(4, addressline2);
		setValue(5, addressline3);
		setValue(6, city);
		setValue(7, statecodetypeid);
		setValue(8, countrycodetypeid);
		setValue(9, postalcode);
		setValue(10, maincontactnamedentityid);
		setValue(11, latitude);
		setValue(12, longitude);
		setValue(13, isprimary);
		setValue(14, isactive);
	}
}
