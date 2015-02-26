/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables;

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
public class Typedescriptions extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord> {

	private static final long serialVersionUID = -1771827790;

	/**
	 * The reference instance of <code>NAMEDENTITIES.TYPEDESCRIPTIONS</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions TYPEDESCRIPTIONS = new org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord.class;
	}

	/**
	 * The column <code>NAMEDENTITIES.TYPEDESCRIPTIONS.ID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.TYPEDESCRIPTIONS.DESCRIPTION</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.CLOB.length(2147483647).nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.TYPEDESCRIPTIONS.HOWUSED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord, java.lang.String> HOWUSED = createField("HOWUSED", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.TYPEDESCRIPTIONS.CREATED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord, java.sql.Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.TYPEDESCRIPTIONS.LASTMODIFIED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord, java.sql.Timestamp> LASTMODIFIED = createField("LASTMODIFIED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>NAMEDENTITIES.TYPEDESCRIPTIONS</code> table reference
	 */
	public Typedescriptions() {
		this("TYPEDESCRIPTIONS", null);
	}

	/**
	 * Create an aliased <code>NAMEDENTITIES.TYPEDESCRIPTIONS</code> table reference
	 */
	public Typedescriptions(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions.TYPEDESCRIPTIONS);
	}

	private Typedescriptions(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Typedescriptions(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_TYPEDESCRIPTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.TypedescriptionsRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Typedescriptions(name, null);
	}
}
