/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 864716920;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA</code>
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("INFORMATION_SCHEMA");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.plos.namedentity.persist.db.information_schema.tables.QueryStatistics.QUERY_STATISTICS,
			org.plos.namedentity.persist.db.information_schema.tables.SessionState.SESSION_STATE,
			org.plos.namedentity.persist.db.information_schema.tables.Locks.LOCKS,
			org.plos.namedentity.persist.db.information_schema.tables.Sessions.SESSIONS,
			org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS,
			org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS,
			org.plos.namedentity.persist.db.information_schema.tables.Constants.CONSTANTS,
			org.plos.namedentity.persist.db.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS,
			org.plos.namedentity.persist.db.information_schema.tables.Constraints.CONSTRAINTS,
			org.plos.namedentity.persist.db.information_schema.tables.CrossReferences.CROSS_REFERENCES,
			org.plos.namedentity.persist.db.information_schema.tables.InDoubt.IN_DOUBT,
			org.plos.namedentity.persist.db.information_schema.tables.Views.VIEWS,
			org.plos.namedentity.persist.db.information_schema.tables.Collations.COLLATIONS,
			org.plos.namedentity.persist.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES,
			org.plos.namedentity.persist.db.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES,
			org.plos.namedentity.persist.db.information_schema.tables.Schemata.SCHEMATA,
			org.plos.namedentity.persist.db.information_schema.tables.FunctionAliases.FUNCTION_ALIASES,
			org.plos.namedentity.persist.db.information_schema.tables.Rights.RIGHTS,
			org.plos.namedentity.persist.db.information_schema.tables.Roles.ROLES,
			org.plos.namedentity.persist.db.information_schema.tables.Users.USERS,
			org.plos.namedentity.persist.db.information_schema.tables.Sequences.SEQUENCES,
			org.plos.namedentity.persist.db.information_schema.tables.Help.HELP,
			org.plos.namedentity.persist.db.information_schema.tables.Settings.SETTINGS,
			org.plos.namedentity.persist.db.information_schema.tables.Catalogs.CATALOGS,
			org.plos.namedentity.persist.db.information_schema.tables.TypeInfo.TYPE_INFO,
			org.plos.namedentity.persist.db.information_schema.tables.TableTypes.TABLE_TYPES,
			org.plos.namedentity.persist.db.information_schema.tables.Indexes.INDEXES,
			org.plos.namedentity.persist.db.information_schema.tables.Columns.COLUMNS,
			org.plos.namedentity.persist.db.information_schema.tables.Tables.TABLES);
	}
}
