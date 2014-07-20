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
public class Organizations extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord> {

	private static final long serialVersionUID = -955961363;

	/**
	 * The singleton instance of <code>namedentities.organizations</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Organizations ORGANIZATIONS = new org.plos.namedentity.persist.db.namedentities.tables.Organizations();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord.class;
	}

	/**
	 * The column <code>namedentities.organizations.namedentityid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.Integer> NAMEDENTITYID = createField("namedentityid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedentities.organizations.organizationtypeid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.Integer> ORGANIZATIONTYPEID = createField("organizationtypeid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedentities.organizations.organizationfamiliarname</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.String> ORGANIZATIONFAMILIARNAME = createField("organizationfamiliarname", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>namedentities.organizations.organizationlegalname</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.String> ORGANIZATIONLEGALNAME = createField("organizationlegalname", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>namedentities.organizations.organizationmaincontactid</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.Integer> ORGANIZATIONMAINCONTACTID = createField("organizationmaincontactid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedentities.organizations.isactive</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.Byte> ISACTIVE = createField("isactive", org.jooq.impl.SQLDataType.TINYINT, this, "");

	/**
	 * The column <code>namedentities.organizations.isvisible</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.Byte> ISVISIBLE = createField("isvisible", org.jooq.impl.SQLDataType.TINYINT, this, "");

	/**
	 * The column <code>namedentities.organizations.url</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * Create a <code>namedentities.organizations</code> table reference
	 */
	public Organizations() {
		this("organizations", null);
	}

	/**
	 * Create an aliased <code>namedentities.organizations</code> table reference
	 */
	public Organizations(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Organizations.ORGANIZATIONS);
	}

	private Organizations(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Organizations(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_3C;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_3C);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.OrganizationsRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.CONSTRAINT_3C1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Organizations as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Organizations(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Organizations rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Organizations(name, null);
	}
}
