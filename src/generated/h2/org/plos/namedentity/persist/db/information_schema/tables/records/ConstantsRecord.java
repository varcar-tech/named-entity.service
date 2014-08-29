/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConstantsRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.ConstantsRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -1349923057;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_CATALOG</code>.
	 */
	public void setConstantCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_CATALOG</code>.
	 */
	public java.lang.String getConstantCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_SCHEMA</code>.
	 */
	public void setConstantSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_SCHEMA</code>.
	 */
	public java.lang.String getConstantSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_NAME</code>.
	 */
	public void setConstantName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_NAME</code>.
	 */
	public java.lang.String getConstantName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.DATA_TYPE</code>.
	 */
	public void setDataType(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.DATA_TYPE</code>.
	 */
	public java.lang.Integer getDataType() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.REMARKS</code>.
	 */
	public void setRemarks(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.REMARKS</code>.
	 */
	public java.lang.String getRemarks() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.SQL</code>.
	 */
	public void setSql(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.SQL</code>.
	 */
	public java.lang.String getSql() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.ID</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS.CONSTANT_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS.CONSTANT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS.CONSTANT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS.SQL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getConstantCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getConstantSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getConstantName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getSql();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value1(java.lang.String value) {
		setConstantCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value2(java.lang.String value) {
		setConstantSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value3(java.lang.String value) {
		setConstantName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value4(java.lang.Integer value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value5(java.lang.String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value6(java.lang.String value) {
		setSql(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value7(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4, java.lang.String value5, java.lang.String value6, java.lang.Integer value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ConstantsRecord
	 */
	public ConstantsRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS);
	}

	/**
	 * Create a detached, initialised ConstantsRecord
	 */
	public ConstantsRecord(java.lang.String constantCatalog, java.lang.String constantSchema, java.lang.String constantName, java.lang.Integer dataType, java.lang.String remarks, java.lang.String sql, java.lang.Integer id) {
		super(org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS);

		setValue(0, constantCatalog);
		setValue(1, constantSchema);
		setValue(2, constantName);
		setValue(3, dataType);
		setValue(4, remarks);
		setValue(5, sql);
		setValue(6, id);
	}
}
