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
public class Individualprofiles extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord> {

	private static final long serialVersionUID = 1788113261;

	/**
	 * The reference instance of <code>namedEntities.individualProfiles</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Individualprofiles INDIVIDUALPROFILES = new org.plos.namedentity.persist.db.namedentities.tables.Individualprofiles();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord.class;
	}

	/**
	 * The column <code>namedEntities.individualProfiles.id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.nedId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> NEDID = createField("nedId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.firstName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> FIRSTNAME = createField("firstName", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.middleName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> MIDDLENAME = createField("middleName", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.lastName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> LASTNAME = createField("lastName", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.nickName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> NICKNAME = createField("nickName", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.namePrefixTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> NAMEPREFIXTYPEID = createField("namePrefixTypeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.nameSuffixTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> NAMESUFFIXTYPEID = createField("nameSuffixTypeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.displayName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> DISPLAYNAME = createField("displayName", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.biography</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> BIOGRAPHY = createField("biography", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.sourceTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> SOURCETYPEID = createField("sourceTypeId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.isActive</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Byte> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.created</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.individualProfiles.lastModified</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.sql.Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>namedEntities.individualProfiles</code> table reference
	 */
	public Individualprofiles() {
		this("individualProfiles", null);
	}

	/**
	 * Create an aliased <code>namedEntities.individualProfiles</code> table reference
	 */
	public Individualprofiles(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Individualprofiles.INDIVIDUALPROFILES);
	}

	private Individualprofiles(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Individualprofiles(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_INDIVIDUALPROFILES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.KEY_INDIVIDUALPROFILES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.KEY_INDIVIDUALPROFILES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALPROFILES_IBFK_1, org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALPROFILES_IBFK_3, org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALPROFILES_IBFK_4, org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALPROFILES_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Individualprofiles as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Individualprofiles(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Individualprofiles rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Individualprofiles(name, null);
	}
}
