/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -140811606;

	/**
	 * The singleton instance of public
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(org.jooq.test.postgres.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.postgres.generatedclasses.tables.T_658Ref.T_658_REF,
			org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.postgres.generatedclasses.tables.T_785.T_785,
			org.jooq.test.postgres.generatedclasses.tables.T_959.T_959,
			org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1,
			org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2,
			org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS,
			org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.postgres.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.postgres.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.postgres.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED);
	}

	@Override
	public final java.util.List<org.jooq.UDT<?>> getUDTs() {
		return java.util.Arrays.<org.jooq.UDT<?>>asList(
			org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE,
			org.jooq.test.postgres.generatedclasses.udt.UStreetType.U_STREET_TYPE);
	}
}
