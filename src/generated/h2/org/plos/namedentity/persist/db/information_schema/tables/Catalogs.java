/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Catalogs extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.information_schema.tables.records.CatalogsRecord> {

	private static final long serialVersionUID = 15567073;

	/**
	 * The singleton instance of <code>information_schema.catalogs</code>
	 */
	public static final org.plos.namedentity.persist.db.information_schema.tables.Catalogs CATALOGS = new org.plos.namedentity.persist.db.information_schema.tables.Catalogs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.information_schema.tables.records.CatalogsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.information_schema.tables.records.CatalogsRecord.class;
	}

	/**
	 * The column <code>information_schema.catalogs.catalog_name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CatalogsRecord, java.lang.String> CATALOG_NAME = createField("catalog_name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>information_schema.catalogs</code> table reference
	 */
	public Catalogs() {
		this("catalogs", null);
	}

	/**
	 * Create an aliased <code>information_schema.catalogs</code> table reference
	 */
	public Catalogs(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.information_schema.tables.Catalogs.CATALOGS);
	}

	private Catalogs(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.CatalogsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Catalogs(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.CatalogsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.information_schema.tables.Catalogs as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.information_schema.tables.Catalogs(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.information_schema.tables.Catalogs rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.information_schema.tables.Catalogs(name, null);
	}
}
