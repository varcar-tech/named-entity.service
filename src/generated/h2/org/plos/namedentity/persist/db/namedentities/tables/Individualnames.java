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
public class Individualnames extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord> {

	private static final long serialVersionUID = -1109004628;

	/**
	 * The singleton instance of <code>NAMEDENTITIES.INDIVIDUALNAMES</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Individualnames INDIVIDUALNAMES = new org.plos.namedentity.persist.db.namedentities.tables.Individualnames();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord.class;
	}

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.ID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.NEDID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.Integer> NEDID = createField("NEDID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.FIRSTNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.String> FIRSTNAME = createField("FIRSTNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.MIDDLENAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.String> MIDDLENAME = createField("MIDDLENAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.LASTNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.String> LASTNAME = createField("LASTNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.NICKNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.String> NICKNAME = createField("NICKNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.NAMEPREFIXTYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.Integer> NAMEPREFIXTYPEID = createField("NAMEPREFIXTYPEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.NAMESUFFIXTYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.Integer> NAMESUFFIXTYPEID = createField("NAMESUFFIXTYPEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.DISPLAYNAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.String> DISPLAYNAME = createField("DISPLAYNAME", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.SOURCETYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.Integer> SOURCETYPEID = createField("SOURCETYPEID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.INDIVIDUALNAMES.ISACTIVE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.Byte> ISACTIVE = createField("ISACTIVE", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * Create a <code>NAMEDENTITIES.INDIVIDUALNAMES</code> table reference
	 */
	public Individualnames() {
		this("INDIVIDUALNAMES", null);
	}

	/**
	 * Create an aliased <code>NAMEDENTITIES.INDIVIDUALNAMES</code> table reference
	 */
	public Individualnames(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Individualnames.INDIVIDUALNAMES);
	}

	private Individualnames(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Individualnames(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_INDIVIDUALNAMES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_7;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_7);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.IndividualnamesRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_7F, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_7FE0, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_7FE08, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_7FE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Individualnames as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Individualnames(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Individualnames rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Individualnames(name, null);
	}
}
