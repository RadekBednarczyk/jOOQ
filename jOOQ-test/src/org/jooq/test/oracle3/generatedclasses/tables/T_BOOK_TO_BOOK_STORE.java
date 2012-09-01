/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings("all")
public class T_BOOK_TO_BOOK_STORE extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1773847075;

	/**
	 * The singleton instance of TEST.T_BOOK_TO_BOOK_STORE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE T_BOOK_TO_BOOK_STORE = new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE.class;
	}

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The number of books on stock
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this);

	public T_BOOK_TO_BOOK_STORE() {
		super("T_BOOK_TO_BOOK_STORE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public T_BOOK_TO_BOOK_STORE(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_B2BS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_B2BS);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_B2BS_BS_NAME, org.jooq.test.oracle3.generatedclasses.Keys.FK_B2BS_B_ID);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE(alias);
	}
}
