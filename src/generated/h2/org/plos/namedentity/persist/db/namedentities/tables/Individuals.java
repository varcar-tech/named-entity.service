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

	private static final long serialVersionUID = 588763418;

	/**
	 * The singleton instance of <code>NAMEDENTITIES.INDIVIDUALS</code>
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
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.NAMEDENTITYID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> NAMEDENTITYID = createField("NAMEDENTITYID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.FIRSTNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> FIRSTNAME = createField("FIRSTNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647).nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.MIDDLENAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> MIDDLENAME = createField("MIDDLENAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.LASTNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> LASTNAME = createField("LASTNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647).nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.NICKNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> NICKNAME = createField("NICKNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.NAMEPREFIXTYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> NAMEPREFIXTYPEID = createField("NAMEPREFIXTYPEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.NAMESUFFIXTYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> NAMESUFFIXTYPEID = createField("NAMESUFFIXTYPEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.DISPLAYNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.String> DISPLAYNAME = createField("DISPLAYNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647).nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.PREFERREDLANGUAGETYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> PREFERREDLANGUAGETYPEID = createField("PREFERREDLANGUAGETYPEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.PREFERREDCOMMUNICATIONMETHODTYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Integer> PREFERREDCOMMUNICATIONMETHODTYPEID = createField("PREFERREDCOMMUNICATIONMETHODTYPEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.PHOTOIMAGE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, byte[]> PHOTOIMAGE = createField("PHOTOIMAGE", org.jooq.impl.SQLDataType.VARBINARY, this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.ISACTIVE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Byte> ISACTIVE = createField("ISACTIVE", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALS.ISVISIBLE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, java.lang.Byte> ISVISIBLE = createField("ISVISIBLE", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * Create a <code>NAMEDENTITIES.INDIVIDUALS</code> table reference
	 */
	public Individuals() {
		this("INDIVIDUALS", null);
	}

	/**
	 * Create an aliased <code>NAMEDENTITIES.INDIVIDUALS</code> table reference
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
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualsRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_2A, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_2AC, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_2ACA, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_2ACA4);
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
