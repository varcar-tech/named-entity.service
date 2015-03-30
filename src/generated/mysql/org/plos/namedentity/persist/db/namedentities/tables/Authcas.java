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
public class Authcas extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord> {

	private static final long serialVersionUID = -1643244857;

	/**
	 * The reference instance of <code>namedEntities.authCas</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Authcas AUTHCAS = new org.plos.namedentity.persist.db.namedentities.tables.Authcas();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord.class;
	}

	/**
	 * The column <code>namedEntities.authCas.id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.nedId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.Integer> NEDID = createField("nedId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.emailId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.Integer> EMAILID = createField("emailId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.authId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.String> AUTHID = createField("authId", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.password</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.passwordReset</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.Byte> PASSWORDRESET = createField("passwordReset", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.verificationToken</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.String> VERIFICATIONTOKEN = createField("verificationToken", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>namedEntities.authCas.verified</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.Byte> VERIFIED = createField("verified", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.isActive</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.Byte> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.created</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.lastModified</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.sql.Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>namedEntities.authCas</code> table reference
	 */
	public Authcas() {
		this("authCas", null);
	}

	/**
	 * Create an aliased <code>namedEntities.authCas</code> table reference
	 */
	public Authcas(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Authcas.AUTHCAS);
	}

	private Authcas(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord> aliased) {
		this(alias, aliased, null);
	}

	private Authcas(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_AUTHCAS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.KEY_AUTHCAS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.KEY_AUTHCAS_PRIMARY, org.plos.namedentity.persist.db.namedentities.Keys.KEY_AUTHCAS_AUTHID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.AUTHCAS_IBFK_1, org.plos.namedentity.persist.db.namedentities.Keys.AUTHCAS_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Authcas as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Authcas(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Authcas rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Authcas(name, null);
	}
}