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
public class FunctionColumnsRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord> implements org.jooq.Record17<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1634453540;

	/**
	 * Setter for <code>information_schema.function_columns.alias_catalog</code>.
	 */
	public void setAliasCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.alias_catalog</code>.
	 */
	public java.lang.String getAliasCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.function_columns.alias_schema</code>.
	 */
	public void setAliasSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.alias_schema</code>.
	 */
	public java.lang.String getAliasSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.function_columns.alias_name</code>.
	 */
	public void setAliasName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.alias_name</code>.
	 */
	public java.lang.String getAliasName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.function_columns.java_class</code>.
	 */
	public void setJavaClass(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.java_class</code>.
	 */
	public java.lang.String getJavaClass() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.function_columns.java_method</code>.
	 */
	public void setJavaMethod(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.java_method</code>.
	 */
	public java.lang.String getJavaMethod() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.function_columns.column_count</code>.
	 */
	public void setColumnCount(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.column_count</code>.
	 */
	public java.lang.Integer getColumnCount() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.function_columns.pos</code>.
	 */
	public void setPos(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.pos</code>.
	 */
	public java.lang.Integer getPos() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.function_columns.column_name</code>.
	 */
	public void setColumnName(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.column_name</code>.
	 */
	public java.lang.String getColumnName() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.function_columns.data_type</code>.
	 */
	public void setDataType(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.data_type</code>.
	 */
	public java.lang.Integer getDataType() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.function_columns.type_name</code>.
	 */
	public void setTypeName(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.type_name</code>.
	 */
	public java.lang.String getTypeName() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.function_columns.precision</code>.
	 */
	public void setPrecision(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.precision</code>.
	 */
	public java.lang.Integer getPrecision() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.function_columns.scale</code>.
	 */
	public void setScale(java.lang.Short value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.scale</code>.
	 */
	public java.lang.Short getScale() {
		return (java.lang.Short) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.function_columns.radix</code>.
	 */
	public void setRadix(java.lang.Short value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.radix</code>.
	 */
	public java.lang.Short getRadix() {
		return (java.lang.Short) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.function_columns.nullable</code>.
	 */
	public void setNullable(java.lang.Short value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.nullable</code>.
	 */
	public java.lang.Short getNullable() {
		return (java.lang.Short) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.function_columns.column_type</code>.
	 */
	public void setColumnType(java.lang.Short value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.column_type</code>.
	 */
	public java.lang.Short getColumnType() {
		return (java.lang.Short) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.function_columns.remarks</code>.
	 */
	public void setRemarks(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.remarks</code>.
	 */
	public java.lang.String getRemarks() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.function_columns.column_default</code>.
	 */
	public void setColumnDefault(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.function_columns.column_default</code>.
	 */
	public java.lang.String getColumnDefault() {
		return (java.lang.String) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.ALIAS_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.ALIAS_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.ALIAS_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.JAVA_CLASS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.JAVA_METHOD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.COLUMN_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.POS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.TYPE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.PRECISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field12() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.SCALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field13() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.RADIX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field14() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.NULLABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field15() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.COLUMN_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS.COLUMN_DEFAULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAliasCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAliasSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAliasName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getJavaClass();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getJavaMethod();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getColumnCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getPos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getTypeName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getPrecision();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value12() {
		return getScale();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value13() {
		return getRadix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value14() {
		return getNullable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value15() {
		return getColumnType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getColumnDefault();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value1(java.lang.String value) {
		setAliasCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value2(java.lang.String value) {
		setAliasSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value3(java.lang.String value) {
		setAliasName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value4(java.lang.String value) {
		setJavaClass(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value5(java.lang.String value) {
		setJavaMethod(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value6(java.lang.Integer value) {
		setColumnCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value7(java.lang.Integer value) {
		setPos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value8(java.lang.String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value9(java.lang.Integer value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value10(java.lang.String value) {
		setTypeName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value11(java.lang.Integer value) {
		setPrecision(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value12(java.lang.Short value) {
		setScale(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value13(java.lang.Short value) {
		setRadix(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value14(java.lang.Short value) {
		setNullable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value15(java.lang.Short value) {
		setColumnType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value16(java.lang.String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord value17(java.lang.String value) {
		setColumnDefault(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionColumnsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.String value8, java.lang.Integer value9, java.lang.String value10, java.lang.Integer value11, java.lang.Short value12, java.lang.Short value13, java.lang.Short value14, java.lang.Short value15, java.lang.String value16, java.lang.String value17) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FunctionColumnsRecord
	 */
	public FunctionColumnsRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS);
	}

	/**
	 * Create a detached, initialised FunctionColumnsRecord
	 */
	public FunctionColumnsRecord(java.lang.String aliasCatalog, java.lang.String aliasSchema, java.lang.String aliasName, java.lang.String javaClass, java.lang.String javaMethod, java.lang.Integer columnCount, java.lang.Integer pos, java.lang.String columnName, java.lang.Integer dataType, java.lang.String typeName, java.lang.Integer precision, java.lang.Short scale, java.lang.Short radix, java.lang.Short nullable, java.lang.Short columnType, java.lang.String remarks, java.lang.String columnDefault) {
		super(org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS);

		setValue(0, aliasCatalog);
		setValue(1, aliasSchema);
		setValue(2, aliasName);
		setValue(3, javaClass);
		setValue(4, javaMethod);
		setValue(5, columnCount);
		setValue(6, pos);
		setValue(7, columnName);
		setValue(8, dataType);
		setValue(9, typeName);
		setValue(10, precision);
		setValue(11, scale);
		setValue(12, radix);
		setValue(13, nullable);
		setValue(14, columnType);
		setValue(15, remarks);
		setValue(16, columnDefault);
	}
}
