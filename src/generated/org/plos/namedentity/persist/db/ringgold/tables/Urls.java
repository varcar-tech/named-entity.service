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
public class Urls extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord> {

	private static final long serialVersionUID = 2144310585;

	/**
	 * The reference instance of <code>ringgold.urls</code>
	 */
	public static final org.plos.namedentity.persist.db.ringgold.tables.Urls URLS = new org.plos.namedentity.persist.db.ringgold.tables.Urls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord.class;
	}

	/**
	 * The column <code>ringgold.urls.rec_id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord, java.lang.Integer> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ringgold.urls.ringgold_id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord, java.lang.Integer> RINGGOLD_ID = createField("ringgold_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.urls.url</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.urls.notes</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord, java.lang.String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.urls.timestamp</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord, java.sql.Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>ringgold.urls</code> table reference
	 */
	public Urls() {
		this("urls", null);
	}

	/**
	 * Create an aliased <code>ringgold.urls</code> table reference
	 */
	public Urls(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.ringgold.tables.Urls.URLS);
	}

	private Urls(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Urls(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.ringgold.Ringgold.RINGGOLD, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.ringgold.Keys.IDENTITY_URLS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.ringgold.Keys.KEY_URLS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.UrlsRecord>>asList(org.plos.namedentity.persist.db.ringgold.Keys.KEY_URLS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.ringgold.tables.Urls as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.ringgold.tables.Urls(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.ringgold.tables.Urls rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.ringgold.tables.Urls(name, null);
	}
}