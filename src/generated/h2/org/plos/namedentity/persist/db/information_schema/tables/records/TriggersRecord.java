/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TriggersRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.TriggersRecord> implements org.jooq.Record14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -826083605;

	/**
	 * Setter for <code>information_schema.triggers.trigger_catalog</code>.
	 */
	public void setTriggerCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.trigger_catalog</code>.
	 */
	public java.lang.String getTriggerCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.triggers.trigger_schema</code>.
	 */
	public void setTriggerSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.trigger_schema</code>.
	 */
	public java.lang.String getTriggerSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.triggers.trigger_name</code>.
	 */
	public void setTriggerName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.trigger_name</code>.
	 */
	public java.lang.String getTriggerName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.triggers.trigger_type</code>.
	 */
	public void setTriggerType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.trigger_type</code>.
	 */
	public java.lang.String getTriggerType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.triggers.table_catalog</code>.
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.table_catalog</code>.
	 */
	public java.lang.String getTableCatalog() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.triggers.table_schema</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.table_schema</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.triggers.table_name</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.table_name</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.triggers.before</code>.
	 */
	public void setBefore(java.lang.Boolean value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.before</code>.
	 */
	public java.lang.Boolean getBefore() {
		return (java.lang.Boolean) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.triggers.java_class</code>.
	 */
	public void setJavaClass(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.java_class</code>.
	 */
	public java.lang.String getJavaClass() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.triggers.queue_size</code>.
	 */
	public void setQueueSize(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.queue_size</code>.
	 */
	public java.lang.Integer getQueueSize() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.triggers.no_wait</code>.
	 */
	public void setNoWait(java.lang.Boolean value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.no_wait</code>.
	 */
	public java.lang.Boolean getNoWait() {
		return (java.lang.Boolean) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.triggers.remarks</code>.
	 */
	public void setRemarks(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.remarks</code>.
	 */
	public java.lang.String getRemarks() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.triggers.sql</code>.
	 */
	public void setSql(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.sql</code>.
	 */
	public java.lang.String getSql() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.triggers.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.triggers.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.TRIGGER_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.TRIGGER_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.TRIGGER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.TRIGGER_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field8() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.BEFORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.JAVA_CLASS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.QUEUE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field11() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.NO_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.SQL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getTriggerCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTriggerSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTriggerName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTriggerType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value8() {
		return getBefore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getJavaClass();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getQueueSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value11() {
		return getNoWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getSql();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value1(java.lang.String value) {
		setTriggerCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value2(java.lang.String value) {
		setTriggerSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value3(java.lang.String value) {
		setTriggerName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value4(java.lang.String value) {
		setTriggerType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value5(java.lang.String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value6(java.lang.String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value7(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value8(java.lang.Boolean value) {
		setBefore(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value9(java.lang.String value) {
		setJavaClass(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value10(java.lang.Integer value) {
		setQueueSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value11(java.lang.Boolean value) {
		setNoWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value12(java.lang.String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value13(java.lang.String value) {
		setSql(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value14(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Boolean value8, java.lang.String value9, java.lang.Integer value10, java.lang.Boolean value11, java.lang.String value12, java.lang.String value13, java.lang.Integer value14) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TriggersRecord
	 */
	public TriggersRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS);
	}

	/**
	 * Create a detached, initialised TriggersRecord
	 */
	public TriggersRecord(java.lang.String triggerCatalog, java.lang.String triggerSchema, java.lang.String triggerName, java.lang.String triggerType, java.lang.String tableCatalog, java.lang.String tableSchema, java.lang.String tableName, java.lang.Boolean before, java.lang.String javaClass, java.lang.Integer queueSize, java.lang.Boolean noWait, java.lang.String remarks, java.lang.String sql, java.lang.Integer id) {
		super(org.plos.namedentity.persist.db.information_schema.tables.Triggers.TRIGGERS);

		setValue(0, triggerCatalog);
		setValue(1, triggerSchema);
		setValue(2, triggerName);
		setValue(3, triggerType);
		setValue(4, tableCatalog);
		setValue(5, tableSchema);
		setValue(6, tableName);
		setValue(7, before);
		setValue(8, javaClass);
		setValue(9, queueSize);
		setValue(10, noWait);
		setValue(11, remarks);
		setValue(12, sql);
		setValue(13, id);
	}
}
