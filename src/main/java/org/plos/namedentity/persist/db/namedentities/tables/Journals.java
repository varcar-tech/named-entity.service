/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Journals extends org.jooq.impl.TableImpl<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord> {

	private static final long serialVersionUID = -630602487;

	/**
	 * The singleton instance of <code>namedEntities.journals</code>
	 */
	public static final org.plos.namedentity.persist.db.namedentities.tables.Journals JOURNALS = new org.plos.namedentity.persist.db.namedentities.tables.Journals();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord> getRecordType() {
		return org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord.class;
	}

	/**
	 * The column <code>namedEntities.journals.journalId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord, java.lang.Integer> JOURNALID = createField("journalId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.journals.namedEntityId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord, java.lang.Integer> NAMEDENTITYID = createField("namedEntityId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.journals.journalTypeId</code>.
	 */
	public final org.jooq.TableField<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord, java.lang.Integer> JOURNALTYPEID = createField("journalTypeId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>namedEntities.journals</code> table reference
	 */
	public Journals() {
		this("journals", null);
	}

	/**
	 * Create an aliased <code>namedEntities.journals</code> table reference
	 */
	public Journals(java.lang.String alias) {
		this(alias, org.plos.namedentity.persist.db.namedentities.tables.Journals.JOURNALS);
	}

	private Journals(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Journals(java.lang.String alias, org.jooq.Table<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.plos.namedentity.persist.db.namedentities.Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord, java.lang.Integer> getIdentity() {
		return org.plos.namedentity.persist.db.namedentities.Keys.IDENTITY_JOURNALS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord> getPrimaryKey() {
		return org.plos.namedentity.persist.db.namedentities.Keys.KEY_JOURNALS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord>>asList(org.plos.namedentity.persist.db.namedentities.Keys.KEY_JOURNALS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.plos.namedentity.persist.db.namedentities.tables.records.JournalsRecord, ?>>asList(org.plos.namedentity.persist.db.namedentities.Keys.JOURNALS_IBFK_1, org.plos.namedentity.persist.db.namedentities.Keys.JOURNALS_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.plos.namedentity.persist.db.namedentities.tables.Journals as(java.lang.String alias) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Journals(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.plos.namedentity.persist.db.namedentities.tables.Journals rename(java.lang.String name) {
		return new org.plos.namedentity.persist.db.namedentities.tables.Journals(name, null);
	}
}
