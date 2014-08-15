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
public class Individuals extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord> {

	private static final long serialVersionUID = 1470718775;

	/**
	 * The singleton instance of <code>namedEntities.individuals</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Individuals INDIVIDUALS = new org.plos.namedentity.persist.db.namedentities.tables.Individuals();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord.class;
	}

	/**
	 * The column <code>namedEntities.individuals.namedEntityId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> NAMEDENTITYID = createField("namedEntityId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.individuals.firstName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> FIRSTNAME = createField("firstName", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.individuals.middleName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> MIDDLENAME = createField("middleName", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.individuals.lastName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> LASTNAME = createField("lastName", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.individuals.nickName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> NICKNAME = createField("nickName", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.individuals.namePrefixTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> NAMEPREFIXTYPEID = createField("namePrefixTypeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.individuals.nameSuffixTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> NAMESUFFIXTYPEID = createField("nameSuffixTypeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.individuals.displayName</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> DISPLAYNAME = createField("displayName", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.individuals.preferredLanguageTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> PREFERREDLANGUAGETYPEID = createField("preferredLanguageTypeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.individuals.preferredCommunicationMethodTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> PREFERREDCOMMUNICATIONMETHODTYPEID = createField("preferredCommunicationMethodTypeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.individuals.photoImage</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, byte[]> PHOTOIMAGE = createField("photoImage", org.jooq.impl.SQLDataType.VARBINARY.length(256), this, "");

	/**
	 * The column <code>namedEntities.individuals.url</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>namedEntities.individuals.isActive</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Byte> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.TINYINT, this, "");

	/**
	 * The column <code>namedEntities.individuals.isVisible</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Byte> ISVISIBLE = createField("isVisible", org.jooq.impl.SQLDataType.TINYINT, this, "");

	/**
	 * Create a <code>namedEntities.individuals</code> table reference
	 */
	public Individuals() {
		this("individuals", null);
	}

	/**
	 * Create an aliased <code>namedEntities.individuals</code> table reference
	 */
	public Individuals(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Individuals.INDIVIDUALS);
	}

	private Individuals(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Individuals(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.KEY_INDIVIDUALS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.KEY_INDIVIDUALS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALS_IBFK_1, org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALS_IBFK_2, org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALS_IBFK_3, org.plos.namedentity.persist.db.namedentities.Keys.INDIVIDUALS_IBFK_4);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Individuals as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Individuals(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Individuals rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Individuals(name, null);
	}
}