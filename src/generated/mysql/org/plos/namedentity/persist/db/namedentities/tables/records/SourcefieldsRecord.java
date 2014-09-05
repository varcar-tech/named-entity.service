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
public class SourcefieldsRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.SourcefieldsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1837067127;

	/**
	 * Setter for <code>namedEntities.sourceFields.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.sourceFields.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.sourceFields.sourceTable</code>.
	 */
	public void setSourcetable(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.sourceFields.sourceTable</code>.
	 */
	public java.lang.String getSourcetable() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.sourceFields.sourceField</code>.
	 */
	public void setSourcefield(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.sourceFields.sourceField</code>.
	 */
	public java.lang.String getSourcefield() {
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
		return org.plos.namedentity.persist.db.namedentities.tables.Sourcefields.SOURCEFIELDS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Sourcefields.SOURCEFIELDS.SOURCETABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Sourcefields.SOURCEFIELDS.SOURCEFIELD;
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
		return getSourcetable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getSourcefield();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SourcefieldsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SourcefieldsRecord value2(java.lang.String value) {
		setSourcetable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SourcefieldsRecord value3(java.lang.String value) {
		setSourcefield(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SourcefieldsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SourcefieldsRecord
	 */
	public SourcefieldsRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Sourcefields.SOURCEFIELDS);
	}

	/**
	 * Create a detached, initialised SourcefieldsRecord
	 */
	public SourcefieldsRecord(java.lang.Integer id, java.lang.String sourcetable, java.lang.String sourcefield) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Sourcefields.SOURCEFIELDS);

		setValue(0, id);
		setValue(1, sourcetable);
		setValue(2, sourcefield);
	}
}
