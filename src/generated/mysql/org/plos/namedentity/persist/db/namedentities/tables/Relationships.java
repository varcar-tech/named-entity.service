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
public class Relationships extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord> {

	private static final long serialVersionUID = 1758606392;

	/**
	 * The reference instance of <code>namedEntities.relationships</code>
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
	 * The column <code>namedEntities.relationships.id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.relationships.typeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> TYPEID = createField("typeId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.relationships.masterNamedEntityId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> MASTERNAMEDENTITYID = createField("masterNamedEntityId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.relationships.childNamedEntityId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> CHILDNAMEDENTITYID = createField("childNamedEntityId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.relationships.title</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>namedEntities.relationships.startDate</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Date> STARTDATE = createField("startDate", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>namedEntities.relationships.endDate</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Date> ENDDATE = createField("endDate", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>namedEntities.relationships.created</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.relationships.lastModified</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.sql.Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.relationships.createdBy</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> CREATEDBY = createField("createdBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.relationships.lastModifiedBy</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, java.lang.Integer> LASTMODIFIEDBY = createField("lastModifiedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>namedEntities.relationships</code> table reference
	 */
	public Relationships() {
		this("relationships", null);
	}

	/**
	 * Create an aliased <code>namedEntities.relationships</code> table reference
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
		return org.plos.namedentity.persist.db.namedentities.Keys.KEY_RELATIONSHIPS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.KEY_RELATIONSHIPS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.RelationshipsRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.RELATIONSHIPS_IBFK_1);
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
