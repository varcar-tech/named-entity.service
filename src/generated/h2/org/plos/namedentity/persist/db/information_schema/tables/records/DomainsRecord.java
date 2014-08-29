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
public class DomainsRecord extends org.jooq.impl.TableRecordImpl<org.plos.namedentity.persist.db.information_schema.tables.records.DomainsRecord> implements org.jooq.Record14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 19046208;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_CATALOG</code>.
	 */
	public void setDomainCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_CATALOG</code>.
	 */
	public java.lang.String getDomainCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_SCHEMA</code>.
	 */
	public void setDomainSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_SCHEMA</code>.
	 */
	public java.lang.String getDomainSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_NAME</code>.
	 */
	public void setDomainName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_NAME</code>.
	 */
	public java.lang.String getDomainName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.COLUMN_DEFAULT</code>.
	 */
	public void setColumnDefault(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.COLUMN_DEFAULT</code>.
	 */
	public java.lang.String getColumnDefault() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.IS_NULLABLE</code>.
	 */
	public void setIsNullable(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.IS_NULLABLE</code>.
	 */
	public java.lang.String getIsNullable() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.DATA_TYPE</code>.
	 */
	public void setDataType(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DATA_TYPE</code>.
	 */
	public java.lang.Integer getDataType() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.PRECISION</code>.
	 */
	public void setPrecision(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.PRECISION</code>.
	 */
	public java.lang.Integer getPrecision() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.SCALE</code>.
	 */
	public void setScale(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.SCALE</code>.
	 */
	public java.lang.Integer getScale() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.TYPE_NAME</code>.
	 */
	public void setTypeName(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.TYPE_NAME</code>.
	 */
	public java.lang.String getTypeName() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.SELECTIVITY</code>.
	 */
	public void setSelectivity(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.SELECTIVITY</code>.
	 */
	public java.lang.Integer getSelectivity() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.CHECK_CONSTRAINT</code>.
	 */
	public void setCheckConstraint(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.CHECK_CONSTRAINT</code>.
	 */
	public java.lang.String getCheckConstraint() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.REMARKS</code>.
	 */
	public void setRemarks(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.REMARKS</code>.
	 */
	public java.lang.String getRemarks() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.SQL</code>.
	 */
	public void setSql(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.SQL</code>.
	 */
	public java.lang.String getSql() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.DOMAINS.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.DOMAINS.ID</code>.
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
	public org.jooq.Row14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.DOMAIN_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.DOMAIN_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.DOMAIN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.COLUMN_DEFAULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.IS_NULLABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.PRECISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.SCALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.TYPE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.SELECTIVITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.CHECK_CONSTRAINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.SQL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getDomainCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDomainSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDomainName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getColumnDefault();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getIsNullable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getPrecision();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getScale();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getTypeName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getSelectivity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getCheckConstraint();
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
	public DomainsRecord value1(java.lang.String value) {
		setDomainCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value2(java.lang.String value) {
		setDomainSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value3(java.lang.String value) {
		setDomainName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value4(java.lang.String value) {
		setColumnDefault(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value5(java.lang.String value) {
		setIsNullable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value6(java.lang.Integer value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value7(java.lang.Integer value) {
		setPrecision(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value8(java.lang.Integer value) {
		setScale(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value9(java.lang.String value) {
		setTypeName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value10(java.lang.Integer value) {
		setSelectivity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value11(java.lang.String value) {
		setCheckConstraint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value12(java.lang.String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value13(java.lang.String value) {
		setSql(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord value14(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DomainsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.Integer value8, java.lang.String value9, java.lang.Integer value10, java.lang.String value11, java.lang.String value12, java.lang.String value13, java.lang.Integer value14) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DomainsRecord
	 */
	public DomainsRecord() {
		super(org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS);
	}

	/**
	 * Create a detached, initialised DomainsRecord
	 */
	public DomainsRecord(java.lang.String domainCatalog, java.lang.String domainSchema, java.lang.String domainName, java.lang.String columnDefault, java.lang.String isNullable, java.lang.Integer dataType, java.lang.Integer precision, java.lang.Integer scale, java.lang.String typeName, java.lang.Integer selectivity, java.lang.String checkConstraint, java.lang.String remarks, java.lang.String sql, java.lang.Integer id) {
		super(org.plos.namedentity.persist.db.information_schema.tables.Domains.DOMAINS);

		setValue(0, domainCatalog);
		setValue(1, domainSchema);
		setValue(2, domainName);
		setValue(3, columnDefault);
		setValue(4, isNullable);
		setValue(5, dataType);
		setValue(6, precision);
		setValue(7, scale);
		setValue(8, typeName);
		setValue(9, selectivity);
		setValue(10, checkConstraint);
		setValue(11, remarks);
		setValue(12, sql);
		setValue(13, id);
	}
}
