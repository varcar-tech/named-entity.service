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
public class SubjectareasRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.SubjectareasRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 783517733;

	/**
	 * Setter for <code>namedEntities.subjectAreas.subjectAreaId</code>.
	 */
	public void setSubjectareaid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.subjectAreas.subjectAreaId</code>.
	 */
	public java.lang.Integer getSubjectareaid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.subjectAreas.namedEntityId</code>.
	 */
	public void setNamedentityid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.subjectAreas.namedEntityId</code>.
	 */
	public java.lang.Integer getNamedentityid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.subjectAreas.subjectAreaTypeId</code>.
	 */
	public void setSubjectareatypeid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.subjectAreas.subjectAreaTypeId</code>.
	 */
	public java.lang.Integer getSubjectareatypeid() {
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
		return org.plos.namedentity.persist.db.namedentities.tables.Subjectareas.SUBJECTAREAS.SUBJECTAREAID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Subjectareas.SUBJECTAREAS.NAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Subjectareas.SUBJECTAREAS.SUBJECTAREATYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getSubjectareaid();
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
		return getSubjectareatypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectareasRecord value1(java.lang.Integer value) {
		setSubjectareaid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectareasRecord value2(java.lang.Integer value) {
		setNamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectareasRecord value3(java.lang.Integer value) {
		setSubjectareatypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectareasRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SubjectareasRecord
	 */
	public SubjectareasRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Subjectareas.SUBJECTAREAS);
	}

	/**
	 * Create a detached, initialised SubjectareasRecord
	 */
	public SubjectareasRecord(java.lang.Integer subjectareaid, java.lang.Integer namedentityid, java.lang.Integer subjectareatypeid) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Subjectareas.SUBJECTAREAS);

		setValue(0, subjectareaid);
		setValue(1, namedentityid);
		setValue(2, subjectareatypeid);
	}
}
