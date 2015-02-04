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
public class GlobaltypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.GlobaltypesRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -224048094;

	/**
	 * Setter for <code>namedEntities.globalTypes.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.typeId</code>.
	 */
	public void setTypeid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.typeId</code>.
	 */
	public java.lang.Integer getTypeid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.shortDescription</code>.
	 */
	public void setShortdescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.shortDescription</code>.
	 */
	public java.lang.String getShortdescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.longDescription</code>.
	 */
	public void setLongdescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.longDescription</code>.
	 */
	public java.lang.String getLongdescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.typeCode</code>.
	 */
	public void setTypecode(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.typeCode</code>.
	 */
	public java.lang.String getTypecode() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.created</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.lastModified</code>.
	 */
	public void setLastmodified(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.lastModified</code>.
	 */
	public java.sql.Timestamp getLastmodified() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.createdBy</code>.
	 */
	public void setCreatedby(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.createdBy</code>.
	 */
	public java.lang.Integer getCreatedby() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.lastModifiedBy</code>.
	 */
	public void setLastmodifiedby(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.lastModifiedBy</code>.
	 */
	public java.lang.Integer getLastmodifiedby() {
		return (java.lang.Integer) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.TYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.SHORTDESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.LONGDESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.TYPECODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.LASTMODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.CREATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES.LASTMODIFIEDBY;
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
		return getTypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getShortdescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getLongdescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTypecode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getLastmodified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getCreatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getLastmodifiedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value2(java.lang.Integer value) {
		setTypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value3(java.lang.String value) {
		setShortdescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value4(java.lang.String value) {
		setLongdescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value5(java.lang.String value) {
		setTypecode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value6(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value7(java.sql.Timestamp value) {
		setLastmodified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value8(java.lang.Integer value) {
		setCreatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value9(java.lang.Integer value) {
		setLastmodifiedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.sql.Timestamp value6, java.sql.Timestamp value7, java.lang.Integer value8, java.lang.Integer value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GlobaltypesRecord
	 */
	public GlobaltypesRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES);
	}

	/**
	 * Create a detached, initialised GlobaltypesRecord
	 */
	public GlobaltypesRecord(java.lang.Integer id, java.lang.Integer typeid, java.lang.String shortdescription, java.lang.String longdescription, java.lang.String typecode, java.sql.Timestamp created, java.sql.Timestamp lastmodified, java.lang.Integer createdby, java.lang.Integer lastmodifiedby) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Globaltypes.GLOBALTYPES);

		setValue(0, id);
		setValue(1, typeid);
		setValue(2, shortdescription);
		setValue(3, longdescription);
		setValue(4, typecode);
		setValue(5, created);
		setValue(6, lastmodified);
		setValue(7, createdby);
		setValue(8, lastmodifiedby);
	}
}
