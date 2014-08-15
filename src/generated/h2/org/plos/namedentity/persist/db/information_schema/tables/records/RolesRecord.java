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
public class RolesRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.RolesRecord> implements org.jooq.Record3<java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -1429664314;

	/**
	 * Setter for <code>information_schema.roles.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.roles.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.roles.remarks</code>.
	 */
	public void setRemarks(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.roles.remarks</code>.
	 */
	public java.lang.String getRemarks() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.roles.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.roles.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.Roles.ROLES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.Roles.ROLES.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.information_schema.tables.Roles.ROLES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord value2(java.lang.String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord value3(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord values(java.lang.String value1, java.lang.String value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RolesRecord
	 */
	public RolesRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.Roles.ROLES);
	}

	/**
	 * Create a detached, initialised RolesRecord
	 */
	public RolesRecord(java.lang.String name, java.lang.String remarks, java.lang.Integer id) {
		super(org.plos.namedentity.persist.db.information_schema.tables.Roles.ROLES);

		setValue(0, name);
		setValue(1, remarks);
		setValue(2, id);
	}
}