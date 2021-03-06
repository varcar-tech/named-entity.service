/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.ringgold.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.plos.namedentity.persist.db.ringgold.Keys;
import org.plos.namedentity.persist.db.ringgold.Ringgold;
import org.plos.namedentity.persist.db.ringgold.tables.records.ConsortiaRecord;


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
public class Consortia extends TableImpl<ConsortiaRecord> {

	private static final long serialVersionUID = 1296620576;

	/**
	 * The reference instance of <code>ringgold.consortia</code>
	 */
	public static final Consortia CONSORTIA = new Consortia();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ConsortiaRecord> getRecordType() {
		return ConsortiaRecord.class;
	}

	/**
	 * The column <code>ringgold.consortia.rec_id</code>.
	 */
	public final TableField<ConsortiaRecord, Integer> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ringgold.consortia.consortia_ringgold_id</code>.
	 */
	public final TableField<ConsortiaRecord, Integer> CONSORTIA_RINGGOLD_ID = createField("consortia_ringgold_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ringgold.consortia.member_ringgold_id</code>.
	 */
	public final TableField<ConsortiaRecord, Integer> MEMBER_RINGGOLD_ID = createField("member_ringgold_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ringgold.consortia.name</code>.
	 */
	public final TableField<ConsortiaRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>ringgold.consortia.timestamp</code>.
	 */
	public final TableField<ConsortiaRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>ringgold.consortia</code> table reference
	 */
	public Consortia() {
		this("consortia", null);
	}

	/**
	 * Create an aliased <code>ringgold.consortia</code> table reference
	 */
	public Consortia(String alias) {
		this(alias, CONSORTIA);
	}

	private Consortia(String alias, Table<ConsortiaRecord> aliased) {
		this(alias, aliased, null);
	}

	private Consortia(String alias, Table<ConsortiaRecord> aliased, Field<?>[] parameters) {
		super(alias, Ringgold.RINGGOLD, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ConsortiaRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CONSORTIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ConsortiaRecord> getPrimaryKey() {
		return Keys.KEY_CONSORTIA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ConsortiaRecord>> getKeys() {
		return Arrays.<UniqueKey<ConsortiaRecord>>asList(Keys.KEY_CONSORTIA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Consortia as(String alias) {
		return new Consortia(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Consortia rename(String name) {
		return new Consortia(name, null);
	}
}
