/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypedescriptionsRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1186724670;

	/**
	 * Setter for <code>namedEntities.typeDescriptions.typeId</code>.
	 */
	public void setTypeid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.typeDescriptions.typeId</code>.
	 */
	public java.lang.Integer getTypeid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.typeDescriptions.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.typeDescriptions.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.typeDescriptions.howUsed</code>.
	 */
	public void setHowused(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.typeDescriptions.howUsed</code>.
	 */
	public java.lang.String getHowused() {
		return (java.lang.String) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS.TYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS.HOWUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getTypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getHowused();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypedescriptionsRecord value1(java.lang.Integer value) {
		setTypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypedescriptionsRecord value2(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypedescriptionsRecord value3(java.lang.String value) {
		setHowused(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypedescriptionsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TypedescriptionsRecord
	 */
	public TypedescriptionsRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS);
	}

	/**
	 * Create a detached, initialised TypedescriptionsRecord
	 */
	public TypedescriptionsRecord(java.lang.Integer typeid, java.lang.String description, java.lang.String howused) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS);

		setValue(0, typeid);
		setValue(1, description);
		setValue(2, howused);
	}
}
