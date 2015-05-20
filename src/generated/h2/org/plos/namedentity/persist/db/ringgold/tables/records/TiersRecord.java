/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.ringgold.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TiersRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.ringgold.tables.records.TiersRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -986601005;

	/**
	 * Setter for <code>RINGGOLD.TIERS.REC_ID</code>.
	 */
	public void setRecId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>RINGGOLD.TIERS.REC_ID</code>.
	 */
	public java.lang.Integer getRecId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>RINGGOLD.TIERS.P_CODE</code>.
	 */
	public void setPCode(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>RINGGOLD.TIERS.P_CODE</code>.
	 */
	public java.lang.Long getPCode() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>RINGGOLD.TIERS.TIER_TYPE</code>.
	 */
	public void setTierType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>RINGGOLD.TIERS.TIER_TYPE</code>.
	 */
	public java.lang.String getTierType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>RINGGOLD.TIERS.TIER</code>.
	 */
	public void setTier(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>RINGGOLD.TIERS.TIER</code>.
	 */
	public java.lang.String getTier() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>RINGGOLD.TIERS.TIMESTAMP</code>.
	 */
	public void setTimestamp(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>RINGGOLD.TIERS.TIMESTAMP</code>.
	 */
	public java.sql.Timestamp getTimestamp() {
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
	public org.jooq.Row5<java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS.REC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS.P_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS.TIER_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS.TIER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRecId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getPCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTierType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTier();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TiersRecord value1(java.lang.Integer value) {
		setRecId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TiersRecord value2(java.lang.Long value) {
		setPCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TiersRecord value3(java.lang.String value) {
		setTierType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TiersRecord value4(java.lang.String value) {
		setTier(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TiersRecord value5(java.sql.Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TiersRecord values(java.lang.Integer value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4, java.sql.Timestamp value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TiersRecord
	 */
	public TiersRecord() {
		super(org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS);
	}

	/**
	 * Create a detached, initialised TiersRecord
	 */
	public TiersRecord(java.lang.Integer recId, java.lang.Long pCode, java.lang.String tierType, java.lang.String tier, java.sql.Timestamp timestamp) {
		super(org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS);

		setValue(0, recId);
		setValue(1, pCode);
		setValue(2, tierType);
		setValue(3, tier);
		setValue(4, timestamp);
	}
}