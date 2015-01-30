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
public class Roles extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord> {

	private static final long serialVersionUID = 2042597427;

	/**
	 * The singleton instance of <code>NAMEDENTITIES.ROLES</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Roles ROLES = new org.plos.namedentity.persist.db.namedentities.tables.Roles();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord.class;
	}

	/**
	 * The column <code>NAMEDENTITIES.ROLES.ID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.NEDID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> NEDID = createField("NEDID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.TYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> TYPEID = createField("TYPEID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.APPLICATIONTYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> APPLICATIONTYPEID = createField("APPLICATIONTYPEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.STARTDATE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.sql.Date> STARTDATE = createField("STARTDATE", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.ENDDATE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.sql.Date> ENDDATE = createField("ENDDATE", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.SOURCETYPEID</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> SOURCETYPEID = createField("SOURCETYPEID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.CREATED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.sql.Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.LASTMODIFIED</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.sql.Timestamp> LASTMODIFIED = createField("LASTMODIFIED", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.CREATEDBY</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> CREATEDBY = createField("CREATEDBY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>NAMEDENTITIES.ROLES.LASTMODIFIEDBY</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> LASTMODIFIEDBY = createField("LASTMODIFIEDBY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>NAMEDENTITIES.ROLES</code> table reference
	 */
	public Roles() {
		this("ROLES", null);
	}

	/**
	 * Create an aliased <code>NAMEDENTITIES.ROLES</code> table reference
	 */
	public Roles(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Roles.ROLES);
	}

	private Roles(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Roles(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_ROLES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_4A;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_4A);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.RolesRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_4A8, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_4A89, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_4A8969, org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_4A896);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Roles as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Roles(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Roles rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Roles(name, null);
	}
}
