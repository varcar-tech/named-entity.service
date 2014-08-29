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
public class Namedentityidentifiers extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord> {

	private static final long serialVersionUID = 85128892;

	/**
	 * The singleton instance of <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Namedentityidentifiers NAMEDENTITYIDENTIFIERS = new org.plos.namedentity.persist.db.namedentities.tables.Namedentityidentifiers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord.class;
	}

	/**
	 * The column <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS.NAMEDENTITYID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, java.lang.Integer> NAMEDENTITYID = createField("NAMEDENTITYID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS.TYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, java.lang.Integer> TYPEID = createField("TYPEID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS.CREATED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, java.sql.Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS.LASTMODIFIED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, java.sql.Timestamp> LASTMODIFIED = createField("LASTMODIFIED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS.CREATEDBY</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, java.lang.Integer> CREATEDBY = createField("CREATEDBY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS.LASTMODIFIEDBY</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, java.lang.Integer> LASTMODIFIEDBY = createField("LASTMODIFIEDBY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS</code> table reference
	 */
	public Namedentityidentifiers() {
		this("NAMEDENTITYIDENTIFIERS", null);
	}

	/**
	 * Create an aliased <code>NAMEDENTITIES.NAMEDENTITYIDENTIFIERS</code> table reference
	 */
	public Namedentityidentifiers(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Namedentityidentifiers.NAMEDENTITYIDENTIFIERS);
	}

	private Namedentityidentifiers(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Namedentityidentifiers(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_NAMEDENTITYIDENTIFIERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_9;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_9);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.NamedentityidentifiersRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_9F);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Namedentityidentifiers as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Namedentityidentifiers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Namedentityidentifiers rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Namedentityidentifiers(name, null);
	}
}
