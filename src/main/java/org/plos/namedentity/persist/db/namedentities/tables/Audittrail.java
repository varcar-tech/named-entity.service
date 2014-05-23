/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Audittrail extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord> {

	private static final long serialVersionUID = 782075178;

	/**
	 * The singleton instance of <code>namedEntities.auditTrail</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Audittrail AUDITTRAIL = new org.plos.namedentity.persist.db.namedentities.tables.Audittrail();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord.class;
	}

	/**
	 * The column <code>namedEntities.auditTrail.auditTrailId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> AUDITTRAILID = createField("auditTrailId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.auditTrail.sourceFieldId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> SOURCEFIELDID = createField("sourceFieldId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.auditTrail.rowNumber</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> ROWNUMBER = createField("rowNumber", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.auditTrail.oldValue</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.String> OLDVALUE = createField("oldValue", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.auditTrail.newValue</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.String> NEWVALUE = createField("newValue", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.auditTrail.lastModified</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.sql.Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.auditTrail.lastModifiedBy</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> LASTMODIFIEDBY = createField("lastModifiedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>namedEntities.auditTrail</code> table reference
	 */
	public Audittrail() {
		this("auditTrail", null);
	}

	/**
	 * Create an aliased <code>namedEntities.auditTrail</code> table reference
	 */
	public Audittrail(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Audittrail.AUDITTRAIL);
	}

	private Audittrail(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord> aliased) {
		this(alias, aliased, null);
	}

	private Audittrail(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_AUDITTRAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.KEY_AUDITTRAIL_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.KEY_AUDITTRAIL_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.AUDITTRAIL_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Audittrail as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Audittrail(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Audittrail rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Audittrail(name, null);
	}
}
