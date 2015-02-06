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

	private static final long serialVersionUID = -2079202376;

	/**
	 * The reference instance of <code>namedentities.individualprofiles</code>
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
	 * The column <code>namedentities.individualprofiles.id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.nedid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> NEDID = createField("nedid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.firstname</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.middlename</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> MIDDLENAME = createField("middlename", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.lastname</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.nickname</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.nameprefixtypeid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> NAMEPREFIXTYPEID = createField("nameprefixtypeid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedentities.individualprofiles.namesuffixtypeid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> NAMESUFFIXTYPEID = createField("namesuffixtypeid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedentities.individualprofiles.displayname</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> DISPLAYNAME = createField("displayname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.biography</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.String> BIOGRAPHY = createField("biography", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.sourcetypeid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Integer> SOURCETYPEID = createField("sourcetypeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.isactive</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.lang.Byte> ISACTIVE = createField("isactive", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.created</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedentities.individualprofiles.lastmodified</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, java.sql.Timestamp> LASTMODIFIED = createField("lastmodified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>namedentities.individualprofiles</code> table reference
	 */
	public Individualprofiles() {
		this("individualprofiles", null);
	}

	/**
	 * Create an aliased <code>namedentities.individualprofiles</code> table reference
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
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_8;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_8, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_888881);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualprofilesRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_88, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_8888, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_88888, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_888);
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
