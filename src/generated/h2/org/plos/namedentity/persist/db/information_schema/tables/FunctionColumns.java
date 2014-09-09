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
public class FunctionColumns extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord> {

	private static final long serialVersionUID = 570293913;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code>
	 */
	public static final org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns FUNCTION_COLUMNS = new org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> ALIAS_CATALOG = createField("ALIAS_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> ALIAS_SCHEMA = createField("ALIAS_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_NAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> ALIAS_NAME = createField("ALIAS_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_CLASS</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_METHOD</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> JAVA_METHOD = createField("JAVA_METHOD", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_COUNT</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Integer> COLUMN_COUNT = createField("COLUMN_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.POS</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Integer> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.TYPE_NAME</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.PRECISION</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.SCALE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.RADIX</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Short> RADIX = createField("RADIX", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.NULLABLE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Short> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_TYPE</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.Short> COLUMN_TYPE = createField("COLUMN_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.REMARKS</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_DEFAULT</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord, java.lang.String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
	 */
	public FunctionColumns() {
		this("FUNCTION_COLUMNS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
	 */
	public FunctionColumns(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS);
	}

	private FunctionColumns(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord> aliased) {
		this(alias, aliased, null);
	}

	private FunctionColumns(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.FunctionColumnsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns(name, null);
	}
}
