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
public class InDoubtRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.InDoubtRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -243631188;

	/**
	 * Setter for <code>information_schema.in_doubt.transaction</code>.
	 */
	public void setTransaction(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.in_doubt.transaction</code>.
	 */
	public java.lang.String getTransaction() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.in_doubt.state</code>.
	 */
	public void setState(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.in_doubt.state</code>.
	 */
	public java.lang.String getState() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.InDoubt.IN_DOUBT.TRANSACTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.InDoubt.IN_DOUBT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getTransaction();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InDoubtRecord value1(java.lang.String value) {
		setTransaction(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InDoubtRecord value2(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InDoubtRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InDoubtRecord
	 */
	public InDoubtRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.InDoubt.IN_DOUBT);
	}

	/**
	 * Create a detached, initialised InDoubtRecord
	 */
	public InDoubtRecord(java.lang.String transaction, java.lang.String state) {
		super(org.plos.namedentity.persist.db.information_schema.tables.InDoubt.IN_DOUBT);

		setValue(0, transaction);
		setValue(1, state);
	}
}
