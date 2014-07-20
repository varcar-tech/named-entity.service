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
public class AudittrailRecord extends org.jooq.impl.UpdatableRecordImpl<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer> {

	private static final long serialVersionUID = -821606929;

	/**
	 * Setter for <code>namedEntities.auditTrail.auditTrailId</code>.
	 */
	public void setAudittrailid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.auditTrail.auditTrailId</code>.
	 */
	public java.lang.Integer getAudittrailid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.auditTrail.sourceFieldId</code>.
	 */
	public void setSourcefieldid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.auditTrail.sourceFieldId</code>.
	 */
	public java.lang.Integer getSourcefieldid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.auditTrail.rowNumber</code>.
	 */
	public void setRownumber(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.auditTrail.rowNumber</code>.
	 */
	public java.lang.Integer getRownumber() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>namedEntities.auditTrail.oldValue</code>.
	 */
	public void setOldvalue(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>namedEntities.auditTrail.oldValue</code>.
	 */
	public java.lang.String getOldvalue() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>namedEntities.auditTrail.newValue</code>.
	 */
	public void setNewvalue(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>namedEntities.auditTrail.newValue</code>.
	 */
	public java.lang.String getNewvalue() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>namedEntities.auditTrail.lastModified</code>.
	 */
	public void setLastmodified(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>namedEntities.auditTrail.lastModified</code>.
	 */
	public java.sql.Timestamp getLastmodified() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>namedEntities.auditTrail.lastModifiedBy</code>.
	 */
	public void setLastmodifiedby(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>namedEntities.auditTrail.lastModifiedBy</code>.
	 */
	public java.lang.Integer getLastmodifiedby() {
		return (java.lang.Integer) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL.AUDITTRAILID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL.SOURCEFIELDID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL.ROWNUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL.OLDVALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL.NEWVALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL.LASTMODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL.LASTMODIFIEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAudittrailid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getSourcefieldid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getRownumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getOldvalue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getNewvalue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getLastmodified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLastmodifiedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord value1(java.lang.Integer value) {
		setAudittrailid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord value2(java.lang.Integer value) {
		setSourcefieldid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord value3(java.lang.Integer value) {
		setRownumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord value4(java.lang.String value) {
		setOldvalue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord value5(java.lang.String value) {
		setNewvalue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord value6(java.sql.Timestamp value) {
		setLastmodified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord value7(java.lang.Integer value) {
		setLastmodifiedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudittrailRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.String value4, java.lang.String value5, java.sql.Timestamp value6, java.lang.Integer value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AudittrailRecord
	 */
	public AudittrailRecord() {
		super(org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL);
	}

	/**
	 * Create a detached, initialised AudittrailRecord
	 */
	public AudittrailRecord(java.lang.Integer audittrailid, java.lang.Integer sourcefieldid, java.lang.Integer rownumber, java.lang.String oldvalue, java.lang.String newvalue, java.sql.Timestamp lastmodified, java.lang.Integer lastmodifiedby) {
		super(org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL);

		setValue(0, audittrailid);
		setValue(1, sourcefieldid);
		setValue(2, rownumber);
		setValue(3, oldvalue);
		setValue(4, newvalue);
		setValue(5, lastmodified);
		setValue(6, lastmodifiedby);
	}
}
