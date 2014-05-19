/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RightsRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.RightsRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -754465075;

	/**
	 * Setter for <code>information_schema.rights.grantee</code>.
	 */
	public void setGrantee(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.rights.grantee</code>.
	 */
	public java.lang.String getGrantee() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.rights.granteetype</code>.
	 */
	public void setGranteetype(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.rights.granteetype</code>.
	 */
	public java.lang.String getGranteetype() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.rights.grantedrole</code>.
	 */
	public void setGrantedrole(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.rights.grantedrole</code>.
	 */
	public java.lang.String getGrantedrole() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.rights.rights</code>.
	 */
	public void setRights(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.rights.rights</code>.
	 */
	public java.lang.String getRights() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.rights.table_schema</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.rights.table_schema</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.rights.table_name</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.rights.table_name</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.rights.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.rights.id</code>.
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
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS.GRANTEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS.GRANTEETYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS.GRANTEDROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS.RIGHTS_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getGrantee();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getGranteetype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getGrantedrole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getRights();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getTableName();
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
	public RightsRecord value1(java.lang.String value) {
		setGrantee(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RightsRecord value2(java.lang.String value) {
		setGranteetype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RightsRecord value3(java.lang.String value) {
		setGrantedrole(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RightsRecord value4(java.lang.String value) {
		setRights(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RightsRecord value5(java.lang.String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RightsRecord value6(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RightsRecord value7(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RightsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.Integer value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RightsRecord
	 */
	public RightsRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS);
	}

	/**
	 * Create a detached, initialised RightsRecord
	 */
	public RightsRecord(java.lang.String grantee, java.lang.String granteetype, java.lang.String grantedrole, java.lang.String rights, java.lang.String tableSchema, java.lang.String tableName, java.lang.Integer id) {
		super(org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS);

		setValue(0, grantee);
		setValue(1, granteetype);
		setValue(2, grantedrole);
		setValue(3, rights);
		setValue(4, tableSchema);
		setValue(5, tableName);
		setValue(6, id);
	}
}
