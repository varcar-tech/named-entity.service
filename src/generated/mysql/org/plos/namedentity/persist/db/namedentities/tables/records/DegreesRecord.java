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
public class DegreesRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1954662785;

	/**
	 * Setter for <code>namedEntities.degrees.degreeId</code>.
	 */
	public void setDegreeid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.degrees.degreeId</code>.
	 */
	public java.lang.Integer getDegreeid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.degrees.namedEntityId</code>.
	 */
	public void setNamedentityid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.degrees.namedEntityId</code>.
	 */
	public java.lang.Integer getNamedentityid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.degrees.degreeTypeId</code>.
	 */
	public void setDegreetypeid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.degrees.degreeTypeId</code>.
	 */
	public java.lang.Integer getDegreetypeid() {
		return (java.lang.Integer) getValue(2);
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
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Degrees.DEGREES.DEGREEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Degrees.DEGREES.NAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Degrees.DEGREES.DEGREETYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getDegreeid();
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
		return getDegreetypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DegreesRecord value1(java.lang.Integer value) {
		setDegreeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DegreesRecord value2(java.lang.Integer value) {
		setNamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DegreesRecord value3(java.lang.Integer value) {
		setDegreetypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DegreesRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DegreesRecord
	 */
	public DegreesRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Degrees.DEGREES);
	}

	/**
	 * Create a detached, initialised DegreesRecord
	 */
	public DegreesRecord(java.lang.Integer degreeid, java.lang.Integer namedentityid, java.lang.Integer degreetypeid) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Degrees.DEGREES);

		setValue(0, degreeid);
		setValue(1, namedentityid);
		setValue(2, degreetypeid);
	}
}
