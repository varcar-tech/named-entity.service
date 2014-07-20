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
public class CrossReferences extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord> {

	private static final long serialVersionUID = -1265460108;

	/**
	 * The singleton instance of <code>information_schema.cross_references</code>
	 */
	public static final org.plos.namedentity.persist.db.information_schema.tables.CrossReferences CROSS_REFERENCES = new org.plos.namedentity.persist.db.information_schema.tables.CrossReferences();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord> getRecordType() {
		return org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord.class;
	}

	/**
	 * The column <code>information_schema.cross_references.pktable_catalog</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKTABLE_CATALOG = createField("pktable_catalog", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.pktable_schema</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKTABLE_SCHEMA = createField("pktable_schema", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.pktable_name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKTABLE_NAME = createField("pktable_name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.pkcolumn_name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKCOLUMN_NAME = createField("pkcolumn_name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.fktable_catalog</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKTABLE_CATALOG = createField("fktable_catalog", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.fktable_schema</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKTABLE_SCHEMA = createField("fktable_schema", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.fktable_name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKTABLE_NAME = createField("fktable_name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.fkcolumn_name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKCOLUMN_NAME = createField("fkcolumn_name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.ordinal_position</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>information_schema.cross_references.update_rule</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> UPDATE_RULE = createField("update_rule", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>information_schema.cross_references.delete_rule</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> DELETE_RULE = createField("delete_rule", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>information_schema.cross_references.fk_name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FK_NAME = createField("fk_name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.pk_name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PK_NAME = createField("pk_name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.cross_references.deferrability</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> DEFERRABILITY = createField("deferrability", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * Create a <code>information_schema.cross_references</code> table reference
	 */
	public CrossReferences() {
		this("cross_references", null);
	}

	/**
	 * Create an aliased <code>information_schema.cross_references</code> table reference
	 */
	public CrossReferences(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.information_schema.tables.CrossReferences.CROSS_REFERENCES);
	}

	private CrossReferences(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord> aliased) {
		this(alias, aliased, null);
	}

	private CrossReferences(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.CrossReferencesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.information_schema.tables.CrossReferences as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.information_schema.tables.CrossReferences(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.information_schema.tables.CrossReferences rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.information_schema.tables.CrossReferences(name, null);
	}
}
