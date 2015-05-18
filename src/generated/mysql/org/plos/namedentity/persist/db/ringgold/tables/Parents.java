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
public class Parents extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> {

	private static final long serialVersionUID = 20681341;

	/**
	 * The reference instance of <code>ringgold.parents</code>
	 */
	public static final org.plos.namedentity.persist.db.ringgold.tables.Parents PARENTS = new org.plos.namedentity.persist.db.ringgold.tables.Parents();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord.class;
	}

	/**
	 * The column <code>ringgold.parents.Rec_ID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.Long> REC_ID = createField("Rec_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>ringgold.parents.GP_Code</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.Long> GP_CODE = createField("GP_Code", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this, "");

	/**
	 * The column <code>ringgold.parents.P_Code</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.Long> P_CODE = createField("P_Code", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.parents.Name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.parents.Ext_Name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> EXT_NAME = createField("Ext_Name", org.jooq.impl.SQLDataType.VARCHAR.length(250), this, "");

	/**
	 * The column <code>ringgold.parents.City</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> CITY = createField("City", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.parents.Ext_City</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> EXT_CITY = createField("Ext_City", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>ringgold.parents.Zip</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> ZIP = createField("Zip", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>ringgold.parents.Country</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> COUNTRY = createField("Country", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.parents.State</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> STATE = createField("State", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

	/**
	 * The column <code>ringgold.parents.Type</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.String> TYPE = createField("Type", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.parents.Timestamp</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.sql.Timestamp> TIMESTAMP = createField("Timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>ringgold.parents</code> table reference
	 */
	public Parents() {
		this("parents", null);
	}

	/**
	 * Create an aliased <code>ringgold.parents</code> table reference
	 */
	public Parents(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.ringgold.tables.Parents.PARENTS);
	}

	private Parents(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Parents(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.ringgold.Ringgold.RINGGOLD, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.Long> getIdentity() {
		return org.plos.namedentity.persist.db.ringgold.Keys.IDENTITY_PARENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.ringgold.Keys.KEY_PARENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord>>asList(org.plos.namedentity.persist.db.ringgold.Keys.KEY_PARENTS_PRIMARY, org.plos.namedentity.persist.db.ringgold.Keys.KEY_PARENTS_P_CODE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.ringgold.tables.Parents as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.ringgold.tables.Parents(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.ringgold.tables.Parents rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.ringgold.tables.Parents(name, null);
	}
}
