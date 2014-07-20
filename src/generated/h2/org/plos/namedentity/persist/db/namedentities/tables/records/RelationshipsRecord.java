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
public class RelationshipsRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1333644739;

	/**
	 * Setter for <code>namedentities.relationships.relationshipid</code>.
	 */
	public void setRelationshipid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.relationshipid</code>.
	 */
	public java.lang.Integer getRelationshipid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedentities.relationships.masternamedentityid</code>.
	 */
	public void setMasternamedentityid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.masternamedentityid</code>.
	 */
	public java.lang.Integer getMasternamedentityid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedentities.relationships.childnamedentityid</code>.
	 */
	public void setChildnamedentityid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.childnamedentityid</code>.
	 */
	public java.lang.Integer getChildnamedentityid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>namedentities.relationships.relationshiptypeid</code>.
	 */
	public void setRelationshiptypeid(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.relationshiptypeid</code>.
	 */
	public java.lang.Integer getRelationshiptypeid() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>namedentities.relationships.startdate</code>.
	 */
	public void setStartdate(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.startdate</code>.
	 */
	public java.sql.Timestamp getStartdate() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>namedentities.relationships.enddate</code>.
	 */
	public void setEnddate(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.enddate</code>.
	 */
	public java.sql.Timestamp getEnddate() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>namedentities.relationships.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.created</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>namedentities.relationships.lastmodified</code>.
	 */
	public void setLastmodified(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.lastmodified</code>.
	 */
	public java.sql.Timestamp getLastmodified() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>namedentities.relationships.createdby</code>.
	 */
	public void setCreatedby(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.createdby</code>.
	 */
	public java.lang.Integer getCreatedby() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>namedentities.relationships.lastmodifiedby</code>.
	 */
	public void setLastmodifiedby(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>namedentities.relationships.lastmodifiedby</code>.
	 */
	public java.lang.Integer getLastmodifiedby() {
		return (java.lang.Integer) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.RELATIONSHIPID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.MASTERNAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.CHILDNAMEDENTITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.RELATIONSHIPTYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.STARTDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.ENDDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.LASTMODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.CREATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS.LASTMODIFIEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRelationshipid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getMasternamedentityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getChildnamedentityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getRelationshiptypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getStartdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getEnddate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getLastmodified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getCreatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getLastmodifiedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value1(java.lang.Integer value) {
		setRelationshipid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value2(java.lang.Integer value) {
		setMasternamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value3(java.lang.Integer value) {
		setChildnamedentityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value4(java.lang.Integer value) {
		setRelationshiptypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value5(java.sql.Timestamp value) {
		setStartdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value6(java.sql.Timestamp value) {
		setEnddate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value7(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value8(java.sql.Timestamp value) {
		setLastmodified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value9(java.lang.Integer value) {
		setCreatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord value10(java.lang.Integer value) {
		setLastmodifiedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelationshipsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.sql.Timestamp value5, java.sql.Timestamp value6, java.sql.Timestamp value7, java.sql.Timestamp value8, java.lang.Integer value9, java.lang.Integer value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RelationshipsRecord
	 */
	public RelationshipsRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS);
	}

	/**
	 * Create a detached, initialised RelationshipsRecord
	 */
	public RelationshipsRecord(java.lang.Integer relationshipid, java.lang.Integer masternamedentityid, java.lang.Integer childnamedentityid, java.lang.Integer relationshiptypeid, java.sql.Timestamp startdate, java.sql.Timestamp enddate, java.sql.Timestamp created, java.sql.Timestamp lastmodified, java.lang.Integer createdby, java.lang.Integer lastmodifiedby) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS);

		setValue(0, relationshipid);
		setValue(1, masternamedentityid);
		setValue(2, childnamedentityid);
		setValue(3, relationshiptypeid);
		setValue(4, startdate);
		setValue(5, enddate);
		setValue(6, created);
		setValue(7, lastmodified);
		setValue(8, createdby);
		setValue(9, lastmodifiedby);
	}
}
