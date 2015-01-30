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
public class TypedescriptionsRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = -1408014082;

	/**
	 * Setter for <code>namedEntities.typeDescriptions.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.typeDescriptions.id</code>.
	 */
	public java.lang.Integer getId() {
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

	/**
	 * Setter for <code>namedEntities.typeDescriptions.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>namedEntities.typeDescriptions.created</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>namedEntities.typeDescriptions.lastModified</code>.
	 */
	public void setLastmodified(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>namedEntities.typeDescriptions.lastModified</code>.
	 */
	public java.sql.Timestamp getLastmodified() {
		return (java.sql.Timestamp) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS.ID;
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
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS.LASTMODIFIED;
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
	public java.sql.Timestamp value4() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getLastmodified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypedescriptionsRecord value1(java.lang.Integer value) {
		setId(value);
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
	public TypedescriptionsRecord value4(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypedescriptionsRecord value5(java.sql.Timestamp value) {
		setLastmodified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypedescriptionsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.sql.Timestamp value4, java.sql.Timestamp value5) {
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
	public TypedescriptionsRecord(java.lang.Integer id, java.lang.String description, java.lang.String howused, java.sql.Timestamp created, java.sql.Timestamp lastmodified) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS);

		setValue(0, id);
		setValue(1, description);
		setValue(2, howused);
		setValue(3, created);
		setValue(4, lastmodified);
	}
}
