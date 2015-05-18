/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.ringgold.tables;

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
public class DeletedId extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord> {

	private static final long serialVersionUID = 580222000;

	/**
	 * The reference instance of <code>ringgold.deleted_id</code>
	 */
	public static final org.plos.namedentity.persist.db.ringgold.tables.DeletedId DELETED_ID = new org.plos.namedentity.persist.db.ringgold.tables.DeletedId();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord> getRecordType() {
		return org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord.class;
	}

	/**
	 * The column <code>ringgold.deleted_id.ID__No</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.lang.Long> ID__NO = createField("ID__No", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>ringgold.deleted_id.old_id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.lang.Long> OLD_ID = createField("old_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.deleted_id.new_id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.lang.Long> NEW_ID = createField("new_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.deleted_id.details</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.lang.String> DETAILS = createField("details", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

	/**
	 * The column <code>ringgold.deleted_id.Timestamp</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.sql.Timestamp> TIMESTAMP = createField("Timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>ringgold.deleted_id</code> table reference
	 */
	public DeletedId() {
		this("deleted_id", null);
	}

	/**
	 * Create an aliased <code>ringgold.deleted_id</code> table reference
	 */
	public DeletedId(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.ringgold.tables.DeletedId.DELETED_ID);
	}

	private DeletedId(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord> aliased) {
		this(alias, aliased, null);
	}

	private DeletedId(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.ringgold.Ringgold.RINGGOLD, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.lang.Long> getIdentity() {
		return org.plos.namedentity.persist.db.ringgold.Keys.IDENTITY_DELETED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.ringgold.Keys.KEY_DELETED_ID_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord>>asList(org.plos.namedentity.persist.db.ringgold.Keys.KEY_DELETED_ID_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.ringgold.tables.DeletedId as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.ringgold.tables.DeletedId(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.ringgold.tables.DeletedId rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.ringgold.tables.DeletedId(name, null);
	}
}
