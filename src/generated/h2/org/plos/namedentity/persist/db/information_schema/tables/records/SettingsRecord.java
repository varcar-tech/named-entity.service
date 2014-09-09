/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SettingsRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.SettingsRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 428039389;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SETTINGS.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SETTINGS.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SETTINGS.VALUE</code>.
	 */
	public void setValue(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SETTINGS.VALUE</code>.
	 */
	public java.lang.String getValue() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.Settings.SETTINGS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.Settings.SETTINGS.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingsRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingsRecord value2(java.lang.String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingsRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SettingsRecord
	 */
	public SettingsRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.Settings.SETTINGS);
	}

	/**
	 * Create a detached, initialised SettingsRecord
	 */
	public SettingsRecord(java.lang.String name, java.lang.String value) {
		super(org.plos.namedentity.persist.db.information_schema.tables.Settings.SETTINGS);

		setValue(0, name);
		setValue(1, value);
	}
}
