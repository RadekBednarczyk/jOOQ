/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord> {

	private static final long serialVersionUID = -1831176505;

	/**
	 * The singleton instance of TEST.V_BOOK
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.VBook V_BOOK = new org.jooq.test.oracle.generatedclasses.test.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord.class;
	}

	/**
	 * The table column <code>TEST.V_BOOK.ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.V_BOOK.AUTHOR_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.V_BOOK.CO_AUTHOR_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.V_BOOK.DETAILS_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.V_BOOK.TITLE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>TEST.V_BOOK.PUBLISHED_IN</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.V_BOOK.LANGUAGE_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.V_BOOK.CONTENT_TEXT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>TEST.V_BOOK.CONTENT_PDF</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	public VBook() {
		super("V_BOOK", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	public VBook(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.VBook as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VBook(alias);
	}
}
