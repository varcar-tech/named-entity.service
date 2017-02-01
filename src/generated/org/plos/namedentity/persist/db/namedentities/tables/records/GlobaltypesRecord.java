/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.plos.namedentity.persist.db.namedentities.tables.Globaltypes;


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
public class GlobaltypesRecord extends UpdatableRecordImpl<GlobaltypesRecord> implements Record9<Integer, Integer, String, String, String, Timestamp, Timestamp, Integer, Integer> {

	private static final long serialVersionUID = -1605114310;

	/**
	 * Setter for <code>namedEntities.globalTypes.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.typeId</code>.
	 */
	public void setTypeid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.typeId</code>.
	 */
	public Integer getTypeid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.shortDescription</code>.
	 */
	public void setShortdescription(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.shortDescription</code>.
	 */
	public String getShortdescription() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.longDescription</code>.
	 */
	public void setLongdescription(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.longDescription</code>.
	 */
	public String getLongdescription() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.typeCode</code>.
	 */
	public void setTypecode(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.typeCode</code>.
	 */
	public String getTypecode() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.created</code>.
	 */
	public void setCreated(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.created</code>.
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.lastModified</code>.
	 */
	public void setLastmodified(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.lastModified</code>.
	 */
	public Timestamp getLastmodified() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.createdBy</code>.
	 */
	public void setCreatedby(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.createdBy</code>.
	 */
	public Integer getCreatedby() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>namedEntities.globalTypes.lastModifiedBy</code>.
	 */
	public void setLastmodifiedby(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>namedEntities.globalTypes.lastModifiedBy</code>.
	 */
	public Integer getLastmodifiedby() {
		return (Integer) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, String, String, String, Timestamp, Timestamp, Integer, Integer> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, String, String, String, Timestamp, Timestamp, Integer, Integer> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Globaltypes.GLOBALTYPES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Globaltypes.GLOBALTYPES.TYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Globaltypes.GLOBALTYPES.SHORTDESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Globaltypes.GLOBALTYPES.LONGDESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Globaltypes.GLOBALTYPES.TYPECODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return Globaltypes.GLOBALTYPES.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return Globaltypes.GLOBALTYPES.LASTMODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Globaltypes.GLOBALTYPES.CREATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Globaltypes.GLOBALTYPES.LASTMODIFIEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getTypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getShortdescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLongdescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTypecode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getLastmodified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getCreatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getLastmodifiedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value2(Integer value) {
		setTypeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value3(String value) {
		setShortdescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value4(String value) {
		setLongdescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value5(String value) {
		setTypecode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value6(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value7(Timestamp value) {
		setLastmodified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value8(Integer value) {
		setCreatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord value9(Integer value) {
		setLastmodifiedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobaltypesRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Integer value8, Integer value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GlobaltypesRecord
	 */
	public GlobaltypesRecord() {
		super(Globaltypes.GLOBALTYPES);
	}

	/**
	 * Create a detached, initialised GlobaltypesRecord
	 */
	public GlobaltypesRecord(Integer id, Integer typeid, String shortdescription, String longdescription, String typecode, Timestamp created, Timestamp lastmodified, Integer createdby, Integer lastmodifiedby) {
		super(Globaltypes.GLOBALTYPES);

		setValue(0, id);
		setValue(1, typeid);
		setValue(2, shortdescription);
		setValue(3, longdescription);
		setValue(4, typecode);
		setValue(5, created);
		setValue(6, lastmodified);
		setValue(7, createdby);
		setValue(8, lastmodifiedby);
	}
}
