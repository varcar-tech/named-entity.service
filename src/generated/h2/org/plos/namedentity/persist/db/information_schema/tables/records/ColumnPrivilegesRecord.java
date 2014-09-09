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
public class ColumnPrivilegesRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.ColumnPrivilegesRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 369348781;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTOR</code>.
	 */
	public void setGrantor(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTOR</code>.
	 */
	public java.lang.String getGrantor() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTEE</code>.
	 */
	public void setGrantee(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTEE</code>.
	 */
	public java.lang.String getGrantee() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public java.lang.String getTableCatalog() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_NAME</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_NAME</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
	 */
	public void setColumnName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
	 */
	public java.lang.String getColumnName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public void setPrivilegeType(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public java.lang.String getPrivilegeType() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public void setIsGrantable(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public java.lang.String getIsGrantable() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.GRANTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.GRANTEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.PRIVILEGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES.IS_GRANTABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getGrantor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getGrantee();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getPrivilegeType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getIsGrantable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value1(java.lang.String value) {
		setGrantor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value2(java.lang.String value) {
		setGrantee(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value3(java.lang.String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value4(java.lang.String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value5(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value6(java.lang.String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value7(java.lang.String value) {
		setPrivilegeType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value8(java.lang.String value) {
		setIsGrantable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ColumnPrivilegesRecord
	 */
	public ColumnPrivilegesRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES);
	}

	/**
	 * Create a detached, initialised ColumnPrivilegesRecord
	 */
	public ColumnPrivilegesRecord(java.lang.String grantor, java.lang.String grantee, java.lang.String tableCatalog, java.lang.String tableSchema, java.lang.String tableName, java.lang.String columnName, java.lang.String privilegeType, java.lang.String isGrantable) {
		super(org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES);

		setValue(0, grantor);
		setValue(1, grantee);
		setValue(2, tableCatalog);
		setValue(3, tableSchema);
		setValue(4, tableName);
		setValue(5, columnName);
		setValue(6, privilegeType);
		setValue(7, isGrantable);
	}
}
