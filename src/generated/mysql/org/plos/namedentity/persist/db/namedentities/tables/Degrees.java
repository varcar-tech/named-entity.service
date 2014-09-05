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
public class Degrees extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord> {

	private static final long serialVersionUID = 1829573038;

	/**
	 * The singleton instance of <code>namedEntities.degrees</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Degrees DEGREES = new org.plos.namedentity.persist.db.namedentities.tables.Degrees();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord.class;
	}

	/**
	 * The column <code>namedEntities.degrees.id</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.degrees.nedId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord, java.lang.Integer> NEDID = createField("nedId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.degrees.typeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord, java.lang.Integer> TYPEID = createField("typeId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>namedEntities.degrees</code> table reference
	 */
	public Degrees() {
		this("degrees", null);
	}

	/**
	 * Create an aliased <code>namedEntities.degrees</code> table reference
	 */
	public Degrees(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Degrees.DEGREES);
	}

	private Degrees(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Degrees(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_DEGREES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.KEY_DEGREES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.KEY_DEGREES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.DegreesRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.DEGREES_IBFK_1, org.plos.namedentity.persist.db.namedentities.Keys.DEGREES_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Degrees as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Degrees(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Degrees rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Degrees(name, null);
	}
}
