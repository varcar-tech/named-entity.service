/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Audittrail extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord> {

	private static final long serialVersionUID = 1605699305;

	/**
	 * The singleton instance of <code>namedentities.audittrail</code>
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
	 * The column <code>namedentities.audittrail.audittrailid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> AUDITTRAILID = createField("audittrailid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedentities.audittrail.sourcefieldid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> SOURCEFIELDID = createField("sourcefieldid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedentities.audittrail.rownumber</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> ROWNUMBER = createField("rownumber", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedentities.audittrail.oldvalue</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.String> OLDVALUE = createField("oldvalue", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedentities.audittrail.newvalue</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.String> NEWVALUE = createField("newvalue", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedentities.audittrail.lastmodified</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.sql.Timestamp> LASTMODIFIED = createField("lastmodified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedentities.audittrail.lastmodifiedby</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, java.lang.Integer> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>namedentities.audittrail</code> table reference
	 */
	public Audittrail() {
		this("audittrail", null);
	}

	/**
	 * Create an aliased <code>namedentities.audittrail</code> table reference
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
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_82;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_82);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.AudittrailRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_82F);
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
