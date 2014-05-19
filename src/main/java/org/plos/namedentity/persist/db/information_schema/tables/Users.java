/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord> {

	private static final long serialVersionUID = -1915435126;

	/**
	 * The singleton instance of <code>information_schema.users</code>
	 */
	public static final org.plos.namedentity.persist.db.information_schema.tables.Users USERS = new org.plos.namedentity.persist.db.information_schema.tables.Users();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord> getRecordType() {
		return org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord.class;
	}

	/**
	 * The column <code>information_schema.users.name</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.users.admin</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord, java.lang.String> ADMIN = createField("admin", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.users.remarks</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord, java.lang.String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>information_schema.users.id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>information_schema.users</code> table reference
	 */
	public Users() {
		this("users", null);
	}

	/**
	 * Create an aliased <code>information_schema.users</code> table reference
	 */
	public Users(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.information_schema.tables.Users.USERS);
	}

	private Users(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Users(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.information_schema.tables.records.UsersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.information_schema.tables.Users as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.information_schema.tables.Users(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.information_schema.tables.Users rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.information_schema.tables.Users(name, null);
	}
}
