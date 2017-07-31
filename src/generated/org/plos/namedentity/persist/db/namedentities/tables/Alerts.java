/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.namedentities.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.plos.namedentity.persist.db.namedentities.Keys;
import org.plos.namedentity.persist.db.namedentities.Namedentities;
import org.plos.namedentity.persist.db.namedentities.tables.records.AlertsRecord;


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
public class Alerts extends TableImpl<AlertsRecord> {

	private static final long serialVersionUID = -170348447;

	/**
	 * The reference instance of <code>namedEntities.alerts</code>
	 */
	public static final Alerts ALERTS = new Alerts();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AlertsRecord> getRecordType() {
		return AlertsRecord.class;
	}

	/**
	 * The column <code>namedEntities.alerts.id</code>.
	 */
	public final TableField<AlertsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.alerts.nedId</code>.
	 */
	public final TableField<AlertsRecord, Integer> NEDID = createField("nedId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.alerts.frequencyTypeId</code>.
	 */
	public final TableField<AlertsRecord, Integer> FREQUENCYTYPEID = createField("frequencyTypeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>namedEntities.alerts.name</code>.
	 */
	public final TableField<AlertsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>namedEntities.alerts.query</code>.
	 */
	public final TableField<AlertsRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>namedEntities.alerts.sourceTypeId</code>.
	 */
	public final TableField<AlertsRecord, Integer> SOURCETYPEID = createField("sourceTypeId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.alerts.created</code>.
	 */
	public final TableField<AlertsRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.alerts.createdBy</code>.
	 */
	public final TableField<AlertsRecord, Integer> CREATEDBY = createField("createdBy", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.alerts.lastModified</code>.
	 */
	public final TableField<AlertsRecord, Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.alerts.lastModifiedBy</code>.
	 */
	public final TableField<AlertsRecord, Integer> LASTMODIFIEDBY = createField("lastModifiedBy", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.alerts.typeId</code>.
	 */
	public final TableField<AlertsRecord, Integer> TYPEID = createField("typeId", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>namedEntities.alerts</code> table reference
	 */
	public Alerts() {
		this("alerts", null);
	}

	/**
	 * Create an aliased <code>namedEntities.alerts</code> table reference
	 */
	public Alerts(String alias) {
		this(alias, ALERTS);
	}

	private Alerts(String alias, Table<AlertsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Alerts(String alias, Table<AlertsRecord> aliased, Field<?>[] parameters) {
		super(alias, Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AlertsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ALERTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AlertsRecord> getPrimaryKey() {
		return Keys.KEY_ALERTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AlertsRecord>> getKeys() {
		return Arrays.<UniqueKey<AlertsRecord>>asList(Keys.KEY_ALERTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<AlertsRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<AlertsRecord, ?>>asList(Keys.ALERTS_IBFK_1, Keys.ALERTS_IBFK_4, Keys.ALERTS_IBFK_3, Keys.FK_ALERT_TYPE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Alerts as(String alias) {
		return new Alerts(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Alerts rename(String name) {
		return new Alerts(name, null);
	}
}
