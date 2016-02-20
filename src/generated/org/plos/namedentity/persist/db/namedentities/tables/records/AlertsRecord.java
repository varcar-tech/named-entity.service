/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables.records;

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
public class AlertsRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.AlertsRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.Integer> {

	private static final long serialVersionUID = 1447736666;

	/**
	 * Setter for <code>namedEntities.alerts.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.alerts.nedId</code>.
	 */
	public void setNedid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.nedId</code>.
	 */
	public java.lang.Integer getNedid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.alerts.frequencyTypeId</code>.
	 */
	public void setFrequencytypeid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.frequencyTypeId</code>.
	 */
	public java.lang.Integer getFrequencytypeid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>namedEntities.alerts.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>namedEntities.alerts.query</code>.
	 */
	public void setQuery(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.query</code>.
	 */
	public java.lang.String getQuery() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>namedEntities.alerts.sourceTypeId</code>.
	 */
	public void setSourcetypeid(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.sourceTypeId</code>.
	 */
	public java.lang.Integer getSourcetypeid() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>namedEntities.alerts.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.created</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>namedEntities.alerts.createdBy</code>.
	 */
	public void setCreatedby(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.createdBy</code>.
	 */
	public java.lang.Integer getCreatedby() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>namedEntities.alerts.lastModified</code>.
	 */
	public void setLastmodified(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.lastModified</code>.
	 */
	public java.sql.Timestamp getLastmodified() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>namedEntities.alerts.lastModifiedBy</code>.
	 */
	public void setLastmodifiedby(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>namedEntities.alerts.lastModifiedBy</code>.
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
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.Integer> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.NEDID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.FREQUENCYTYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.SOURCETYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.CREATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.LASTMODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS.LASTMODIFIEDBY;
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
	public java.lang.Integer value2() {
		return getNedid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getFrequencytypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getQuery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getSourcetypeid();
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
	public java.lang.Integer value8() {
		return getCreatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getLastmodified();
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
	public AlertsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value2(java.lang.Integer value) {
		setNedid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value3(java.lang.Integer value) {
		setFrequencytypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value4(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value5(java.lang.String value) {
		setQuery(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value6(java.lang.Integer value) {
		setSourcetypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value7(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value8(java.lang.Integer value) {
		setCreatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value9(java.sql.Timestamp value) {
		setLastmodified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord value10(java.lang.Integer value) {
		setLastmodifiedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlertsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.sql.Timestamp value7, java.lang.Integer value8, java.sql.Timestamp value9, java.lang.Integer value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlertsRecord
	 */
	public AlertsRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS);
	}

	/**
	 * Create a detached, initialised AlertsRecord
	 */
	public AlertsRecord(java.lang.Integer id, java.lang.Integer nedid, java.lang.Integer frequencytypeid, java.lang.String name, java.lang.String query, java.lang.Integer sourcetypeid, java.sql.Timestamp created, java.lang.Integer createdby, java.sql.Timestamp lastmodified, java.lang.Integer lastmodifiedby) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Alerts.ALERTS);

		setValue(0, id);
		setValue(1, nedid);
		setValue(2, frequencytypeid);
		setValue(3, name);
		setValue(4, query);
		setValue(5, sourcetypeid);
		setValue(6, created);
		setValue(7, createdby);
		setValue(8, lastmodified);
		setValue(9, lastmodifiedby);
	}
}