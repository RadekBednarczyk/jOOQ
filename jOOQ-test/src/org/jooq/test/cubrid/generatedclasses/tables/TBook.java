/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 1893239715;

	/**
	 * The singleton instance of DBA.t_book
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.cubrid.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The table column <code>DBA.t_book.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>DBA.t_book.author_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>DBA.t_book.co_author_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>DBA.t_book.details_id</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>DBA.t_book.title</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK);

	/**
	 * The table column <code>DBA.t_book.published_in</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>DBA.t_book.language_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (language_id)
	 * REFERENCES DBA.t_language (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, org.jooq.test.cubrid.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.cubrid.generatedclasses.enums.TLanguage.class), T_BOOK);

	/**
	 * The table column <code>DBA.t_book.content_text</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.CLOB, T_BOOK);

	/**
	 * The table column <code>DBA.t_book.content_pdf</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.BLOB, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.cubrid.generatedclasses.Dba.DBA);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__FK_T_BOOK_AUTHOR_ID, org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__FK_T_BOOK_CO_AUTHOR_ID);
	}
}
