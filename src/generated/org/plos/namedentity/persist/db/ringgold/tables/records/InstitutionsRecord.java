/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.ringgold.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.plos.namedentity.persist.db.ringgold.tables.Institutions;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InstitutionsRecord extends UpdatableRecordImpl<InstitutionsRecord> implements Record11<Integer, Integer, Integer, Integer, String, String, String, String, String, String, Timestamp> {

	private static final long serialVersionUID = -1033620065;

	/**
	 * Setter for <code>ringgold.institutions.rec_id</code>.
	 */
	public void setRecId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.rec_id</code>.
	 */
	public Integer getRecId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ringgold.institutions.parent_ringgold_id</code>.
	 */
	public void setParentRinggoldId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.parent_ringgold_id</code>.
	 */
	public Integer getParentRinggoldId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>ringgold.institutions.ringgold_id</code>.
	 */
	public void setRinggoldId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.ringgold_id</code>.
	 */
	public Integer getRinggoldId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>ringgold.institutions.top_ringgold_id</code>.
	 */
	public void setTopRinggoldId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.top_ringgold_id</code>.
	 */
	public Integer getTopRinggoldId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>ringgold.institutions.name</code>.
	 */
	public void setName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.name</code>.
	 */
	public String getName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>ringgold.institutions.city</code>.
	 */
	public void setCity(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.city</code>.
	 */
	public String getCity() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>ringgold.institutions.post_code</code>.
	 */
	public void setPostCode(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.post_code</code>.
	 */
	public String getPostCode() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>ringgold.institutions.country</code>.
	 */
	public void setCountry(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.country</code>.
	 */
	public String getCountry() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>ringgold.institutions.state</code>.
	 */
	public void setState(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.state</code>.
	 */
	public String getState() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>ringgold.institutions.type</code>.
	 */
	public void setType(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.type</code>.
	 */
	public String getType() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>ringgold.institutions.timestamp</code>.
	 */
	public void setTimestamp(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>ringgold.institutions.timestamp</code>.
	 */
	public Timestamp getTimestamp() {
		return (Timestamp) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, String, String, String, String, String, String, Timestamp> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, String, String, String, String, String, String, Timestamp> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Institutions.INSTITUTIONS.REC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Institutions.INSTITUTIONS.PARENT_RINGGOLD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Institutions.INSTITUTIONS.RINGGOLD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Institutions.INSTITUTIONS.TOP_RINGGOLD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Institutions.INSTITUTIONS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Institutions.INSTITUTIONS.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Institutions.INSTITUTIONS.POST_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Institutions.INSTITUTIONS.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Institutions.INSTITUTIONS.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return Institutions.INSTITUTIONS.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return Institutions.INSTITUTIONS.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getRecId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getParentRinggoldId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getRinggoldId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getTopRinggoldId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getPostCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value1(Integer value) {
		setRecId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value2(Integer value) {
		setParentRinggoldId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value3(Integer value) {
		setRinggoldId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value4(Integer value) {
		setTopRinggoldId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value5(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value6(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value7(String value) {
		setPostCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value8(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value9(String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value10(String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord value11(Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstitutionsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, String value7, String value8, String value9, String value10, Timestamp value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InstitutionsRecord
	 */
	public InstitutionsRecord() {
		super(Institutions.INSTITUTIONS);
	}

	/**
	 * Create a detached, initialised InstitutionsRecord
	 */
	public InstitutionsRecord(Integer recId, Integer parentRinggoldId, Integer ringgoldId, Integer topRinggoldId, String name, String city, String postCode, String country, String state, String type, Timestamp timestamp) {
		super(Institutions.INSTITUTIONS);

		setValue(0, recId);
		setValue(1, parentRinggoldId);
		setValue(2, ringgoldId);
		setValue(3, topRinggoldId);
		setValue(4, name);
		setValue(5, city);
		setValue(6, postCode);
		setValue(7, country);
		setValue(8, state);
		setValue(9, type);
		setValue(10, timestamp);
	}
}
