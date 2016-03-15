/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.ringgold.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.plos.namedentity.persist.db.ringgold.tables.Taxonomy;


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
public class TaxonomyRecord extends UpdatableRecordImpl<TaxonomyRecord> implements Record5<Integer, String, String, String, Timestamp> {

	private static final long serialVersionUID = 1142509115;

	/**
	 * Setter for <code>ringgold.taxonomy.rec_id</code>.
	 */
	public void setRecId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ringgold.taxonomy.rec_id</code>.
	 */
	public Integer getRecId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ringgold.taxonomy.vocabulary</code>.
	 */
	public void setVocabulary(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ringgold.taxonomy.vocabulary</code>.
	 */
	public String getVocabulary() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>ringgold.taxonomy.name</code>.
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ringgold.taxonomy.name</code>.
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>ringgold.taxonomy.description</code>.
	 */
	public void setDescription(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ringgold.taxonomy.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>ringgold.taxonomy.timestamp</code>.
	 */
	public void setTimestamp(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ringgold.taxonomy.timestamp</code>.
	 */
	public Timestamp getTimestamp() {
		return (Timestamp) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, Timestamp> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, Timestamp> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Taxonomy.TAXONOMY.REC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Taxonomy.TAXONOMY.VOCABULARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Taxonomy.TAXONOMY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Taxonomy.TAXONOMY.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return Taxonomy.TAXONOMY.TIMESTAMP;
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
	public String value2() {
		return getVocabulary();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaxonomyRecord value1(Integer value) {
		setRecId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaxonomyRecord value2(String value) {
		setVocabulary(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaxonomyRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaxonomyRecord value4(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaxonomyRecord value5(Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaxonomyRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TaxonomyRecord
	 */
	public TaxonomyRecord() {
		super(Taxonomy.TAXONOMY);
	}

	/**
	 * Create a detached, initialised TaxonomyRecord
	 */
	public TaxonomyRecord(Integer recId, String vocabulary, String name, String description, Timestamp timestamp) {
		super(Taxonomy.TAXONOMY);

		setValue(0, recId);
		setValue(1, vocabulary);
		setValue(2, name);
		setValue(3, description);
		setValue(4, timestamp);
	}
}
