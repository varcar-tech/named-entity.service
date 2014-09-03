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
public class JournalsRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1922420907;

	/**
	 * Setter for <code>NAMEDENTITIES.JOURNALS.JOURNALID</code>.
	 */
	public void setJournalid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.JOURNALS.JOURNALID</code>.
	 */
	public java.lang.Integer getJournalid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.JOURNALS.NAMEDENTITYID</code>.
	 */
	public void setNamedentityid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.JOURNALS.NAMEDENTITYID</code>.
	 */
	public java.lang.Integer getNamedentityid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>NAMEDENTITIES.JOURNALS.JOURNALTYPEID</code>.
	 */
	public void setJournaltypeid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>NAMEDENTITIES.JOURNALS.JOURNALTYPEID</code>.
	 */
	public java.lang.Integer getJournaltypeid() {
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
		return org.plos.namedentity.persist.db.namedentities.tables.Journals.JOURNALS.JOURNALID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Journals.JOURNALS.NAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Journals.JOURNALS.JOURNALTYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getJournalid();
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
		return getJournaltypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JournalsRecord value1(java.lang.Integer value) {
		setJournalid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JournalsRecord value2(java.lang.Integer value) {
		setNamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JournalsRecord value3(java.lang.Integer value) {
		setJournaltypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JournalsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JournalsRecord
	 */
	public JournalsRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Journals.JOURNALS);
	}

	/**
	 * Create a detached, initialised JournalsRecord
	 */
	public JournalsRecord(java.lang.Integer journalid, java.lang.Integer namedentityid, java.lang.Integer journaltypeid) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Journals.JOURNALS);

		setValue(0, journalid);
		setValue(1, namedentityid);
		setValue(2, journaltypeid);
	}
}
