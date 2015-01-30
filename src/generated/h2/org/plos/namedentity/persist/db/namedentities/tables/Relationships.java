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
public class Relationships extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord> {

	private static final long serialVersionUID = 1311528140;

	/**
	 * The singleton instance of <code>NAMEDENTITIES.RELATIONSHIPS</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Relationships RELATIONSHIPS = new org.plos.namedentity.persist.db.namedentities.tables.Relationships();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord.class;
	}

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.ID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.TYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> TYPEID = createField("TYPEID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.MASTERNAMEDENTITYID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> MASTERNAMEDENTITYID = createField("MASTERNAMEDENTITYID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.CHILDNAMEDENTITYID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> CHILDNAMEDENTITYID = createField("CHILDNAMEDENTITYID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.TITLE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.STARTDATE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Date> STARTDATE = createField("STARTDATE", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.ENDDATE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Date> ENDDATE = createField("ENDDATE", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.CREATED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.LASTMODIFIED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Timestamp> LASTMODIFIED = createField("LASTMODIFIED", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.CREATEDBY</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> CREATEDBY = createField("CREATEDBY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.RELATIONSHIPS.LASTMODIFIEDBY</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> LASTMODIFIEDBY = createField("LASTMODIFIEDBY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>NAMEDENTITIES.RELATIONSHIPS</code> table reference
	 */
	public Relationships() {
		this("RELATIONSHIPS", null);
	}

	/**
	 * Create an aliased <code>NAMEDENTITIES.RELATIONSHIPS</code> table reference
	 */
	public Relationships(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Relationships.RELATIONSHIPS);
	}

	private Relationships(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Relationships(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_RELATIONSHIPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_D5;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_D5);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_D5E);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Relationships as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Relationships(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Relationships rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Relationships(name, null);
	}
}
