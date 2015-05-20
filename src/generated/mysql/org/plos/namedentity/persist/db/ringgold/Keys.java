/**
 * This class is generated by jOOQ
 */
package org.plos.namedentity.persist.db.ringgold;

/**
 * A class modelling foreign key relationships between tables of the <code>ringgold</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.AltNameRecord, java.lang.Long> IDENTITY_ALT_NAME = Identities0.IDENTITY_ALT_NAME;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.ConsortiaRecord, java.lang.Long> IDENTITY_CONSORTIA = Identities0.IDENTITY_CONSORTIA;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.lang.Long> IDENTITY_DELETED_ID = Identities0.IDENTITY_DELETED_ID;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.IdentifiersRecord, java.lang.Long> IDENTITY_IDENTIFIERS = Identities0.IDENTITY_IDENTIFIERS;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.MultiRecord, java.lang.Integer> IDENTITY_MULTI = Identities0.IDENTITY_MULTI;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.NotesRecord, java.lang.Integer> IDENTITY_NOTES = Identities0.IDENTITY_NOTES;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.Long> IDENTITY_PARENTS = Identities0.IDENTITY_PARENTS;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.RgTiersRecord, java.lang.Integer> IDENTITY_RG_TIERS = Identities0.IDENTITY_RG_TIERS;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.SizesRecord, java.lang.Long> IDENTITY_SIZES = Identities0.IDENTITY_SIZES;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.TiersRecord, java.lang.Integer> IDENTITY_TIERS = Identities0.IDENTITY_TIERS;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.TypesRecord, java.lang.Integer> IDENTITY_TYPES = Identities0.IDENTITY_TYPES;
	public static final org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.UrlRecord, java.lang.Integer> IDENTITY_URL = Identities0.IDENTITY_URL;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.AltNameRecord> KEY_ALT_NAME_PRIMARY = UniqueKeys0.KEY_ALT_NAME_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ConsortiaRecord> KEY_CONSORTIA_PRIMARY = UniqueKeys0.KEY_CONSORTIA_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord> KEY_DELETED_ID_PRIMARY = UniqueKeys0.KEY_DELETED_ID_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.IdentifiersRecord> KEY_IDENTIFIERS_PRIMARY = UniqueKeys0.KEY_IDENTIFIERS_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.MultiRecord> KEY_MULTI_PRIMARY = UniqueKeys0.KEY_MULTI_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.NotesRecord> KEY_NOTES_PRIMARY = UniqueKeys0.KEY_NOTES_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.NotesRecord> KEY_NOTES_P_CODE = UniqueKeys0.KEY_NOTES_P_CODE;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> KEY_PARENTS_PRIMARY = UniqueKeys0.KEY_PARENTS_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> KEY_PARENTS_P_CODE = UniqueKeys0.KEY_PARENTS_P_CODE;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.RgTiersRecord> KEY_RG_TIERS_PRIMARY = UniqueKeys0.KEY_RG_TIERS_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.SizesRecord> KEY_SIZES_PRIMARY = UniqueKeys0.KEY_SIZES_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.TiersRecord> KEY_TIERS_PRIMARY = UniqueKeys0.KEY_TIERS_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.TypesRecord> KEY_TYPES_PRIMARY = UniqueKeys0.KEY_TYPES_PRIMARY;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.TypesRecord> KEY_TYPES_DEMO = UniqueKeys0.KEY_TYPES_DEMO;
	public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.UrlRecord> KEY_URL_PRIMARY = UniqueKeys0.KEY_URL_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.AltNameRecord, java.lang.Long> IDENTITY_ALT_NAME = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME, org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.ConsortiaRecord, java.lang.Long> IDENTITY_CONSORTIA = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Consortia.CONSORTIA, org.plos.namedentity.persist.db.ringgold.tables.Consortia.CONSORTIA.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord, java.lang.Long> IDENTITY_DELETED_ID = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.DeletedId.DELETED_ID, org.plos.namedentity.persist.db.ringgold.tables.DeletedId.DELETED_ID.ID__NO);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.IdentifiersRecord, java.lang.Long> IDENTITY_IDENTIFIERS = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Identifiers.IDENTIFIERS, org.plos.namedentity.persist.db.ringgold.tables.Identifiers.IDENTIFIERS.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.MultiRecord, java.lang.Integer> IDENTITY_MULTI = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Multi.MULTI, org.plos.namedentity.persist.db.ringgold.tables.Multi.MULTI.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.NotesRecord, java.lang.Integer> IDENTITY_NOTES = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Notes.NOTES, org.plos.namedentity.persist.db.ringgold.tables.Notes.NOTES.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord, java.lang.Long> IDENTITY_PARENTS = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Parents.PARENTS, org.plos.namedentity.persist.db.ringgold.tables.Parents.PARENTS.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.RgTiersRecord, java.lang.Integer> IDENTITY_RG_TIERS = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.RgTiers.RG_TIERS, org.plos.namedentity.persist.db.ringgold.tables.RgTiers.RG_TIERS.ID_NO);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.SizesRecord, java.lang.Long> IDENTITY_SIZES = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Sizes.SIZES, org.plos.namedentity.persist.db.ringgold.tables.Sizes.SIZES.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.TiersRecord, java.lang.Integer> IDENTITY_TIERS = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS, org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS.REC_ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.TypesRecord, java.lang.Integer> IDENTITY_TYPES = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Types.TYPES, org.plos.namedentity.persist.db.ringgold.tables.Types.TYPES.ID);
		public static org.jooq.Identity<org.plos.namedentity.persist.db.ringgold.tables.records.UrlRecord, java.lang.Integer> IDENTITY_URL = createIdentity(org.plos.namedentity.persist.db.ringgold.tables.Url.URL, org.plos.namedentity.persist.db.ringgold.tables.Url.URL.REC_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.AltNameRecord> KEY_ALT_NAME_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME, org.plos.namedentity.persist.db.ringgold.tables.AltName.ALT_NAME.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ConsortiaRecord> KEY_CONSORTIA_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Consortia.CONSORTIA, org.plos.namedentity.persist.db.ringgold.tables.Consortia.CONSORTIA.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.DeletedIdRecord> KEY_DELETED_ID_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.DeletedId.DELETED_ID, org.plos.namedentity.persist.db.ringgold.tables.DeletedId.DELETED_ID.ID__NO);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.IdentifiersRecord> KEY_IDENTIFIERS_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Identifiers.IDENTIFIERS, org.plos.namedentity.persist.db.ringgold.tables.Identifiers.IDENTIFIERS.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.MultiRecord> KEY_MULTI_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Multi.MULTI, org.plos.namedentity.persist.db.ringgold.tables.Multi.MULTI.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.NotesRecord> KEY_NOTES_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Notes.NOTES, org.plos.namedentity.persist.db.ringgold.tables.Notes.NOTES.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.NotesRecord> KEY_NOTES_P_CODE = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Notes.NOTES, org.plos.namedentity.persist.db.ringgold.tables.Notes.NOTES.P_CODE);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> KEY_PARENTS_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Parents.PARENTS, org.plos.namedentity.persist.db.ringgold.tables.Parents.PARENTS.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.ParentsRecord> KEY_PARENTS_P_CODE = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Parents.PARENTS, org.plos.namedentity.persist.db.ringgold.tables.Parents.PARENTS.P_CODE);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.RgTiersRecord> KEY_RG_TIERS_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.RgTiers.RG_TIERS, org.plos.namedentity.persist.db.ringgold.tables.RgTiers.RG_TIERS.ID_NO);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.SizesRecord> KEY_SIZES_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Sizes.SIZES, org.plos.namedentity.persist.db.ringgold.tables.Sizes.SIZES.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.TiersRecord> KEY_TIERS_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS, org.plos.namedentity.persist.db.ringgold.tables.Tiers.TIERS.REC_ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.TypesRecord> KEY_TYPES_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Types.TYPES, org.plos.namedentity.persist.db.ringgold.tables.Types.TYPES.ID);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.TypesRecord> KEY_TYPES_DEMO = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Types.TYPES, org.plos.namedentity.persist.db.ringgold.tables.Types.TYPES.TYPE);
		public static final org.jooq.UniqueKey<org.plos.namedentity.persist.db.ringgold.tables.records.UrlRecord> KEY_URL_PRIMARY = createUniqueKey(org.plos.namedentity.persist.db.ringgold.tables.Url.URL, org.plos.namedentity.persist.db.ringgold.tables.Url.URL.REC_ID);
	}
}