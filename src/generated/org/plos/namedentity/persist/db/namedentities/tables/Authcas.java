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
import org.plos.namedentity.persist.db.namedentities.tables.records.AuthcasRecord;


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
public class Authcas extends TableImpl<AuthcasRecord> {

	private static final long serialVersionUID = -1885762700;

	/**
	 * The reference instance of <code>namedEntities.authCas</code>
	 */
	public static final Authcas AUTHCAS = new Authcas();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AuthcasRecord> getRecordType() {
		return AuthcasRecord.class;
	}

	/**
	 * The column <code>namedEntities.authCas.id</code>.
	 */
	public final TableField<AuthcasRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.nedId</code>.
	 */
	public final TableField<AuthcasRecord, Integer> NEDID = createField("nedId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.emailId</code>.
	 */
	public final TableField<AuthcasRecord, Integer> EMAILID = createField("emailId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.authId</code>.
	 */
	public final TableField<AuthcasRecord, String> AUTHID = createField("authId", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.password</code>.
	 */
	public final TableField<AuthcasRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.passwordReset</code>.
	 */
	public final TableField<AuthcasRecord, Byte> PASSWORDRESET = createField("passwordReset", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.verificationToken</code>.
	 */
	public final TableField<AuthcasRecord, String> VERIFICATIONTOKEN = createField("verificationToken", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>namedEntities.authCas.verified</code>.
	 */
	public final TableField<AuthcasRecord, Byte> VERIFIED = createField("verified", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.isActive</code>.
	 */
	public final TableField<AuthcasRecord, Byte> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.created</code>.
	 */
	public final TableField<AuthcasRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.createdBy</code>.
	 */
	public final TableField<AuthcasRecord, Integer> CREATEDBY = createField("createdBy", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>namedEntities.authCas.lastModified</code>.
	 */
	public final TableField<AuthcasRecord, Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>namedEntities.authCas.lastModifiedBy</code>.
	 */
	public final TableField<AuthcasRecord, Integer> LASTMODIFIEDBY = createField("lastModifiedBy", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>namedEntities.authCas</code> table reference
	 */
	public Authcas() {
		this("authCas", null);
	}

	/**
	 * Create an aliased <code>namedEntities.authCas</code> table reference
	 */
	public Authcas(String alias) {
		this(alias, AUTHCAS);
	}

	private Authcas(String alias, Table<AuthcasRecord> aliased) {
		this(alias, aliased, null);
	}

	private Authcas(String alias, Table<AuthcasRecord> aliased, Field<?>[] parameters) {
		super(alias, Namedentities.NAMEDENTITIES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AuthcasRecord, Integer> getIdentity() {
		return Keys.IDENTITY_AUTHCAS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AuthcasRecord> getPrimaryKey() {
		return Keys.KEY_AUTHCAS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AuthcasRecord>> getKeys() {
		return Arrays.<UniqueKey<AuthcasRecord>>asList(Keys.KEY_AUTHCAS_PRIMARY, Keys.KEY_AUTHCAS_AUTHID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<AuthcasRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<AuthcasRecord, ?>>asList(Keys.AUTHCAS_IBFK_1, Keys.AUTHCAS_IBFK_2, Keys.AUTHCAS_IBFK_3, Keys.AUTHCAS_IBFK_4);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Authcas as(String alias) {
		return new Authcas(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Authcas rename(String name) {
		return new Authcas(name, null);
	}
}
