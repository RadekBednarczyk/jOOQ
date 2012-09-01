/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBookStore {

	private static final long serialVersionUID = 33149879;

	/**
	 * The table column <code>PUBLIC.T_BOOK_STORE.NAME</code>
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME, value);
	}

	/**
	 * The table column <code>PUBLIC.T_BOOK_STORE.NAME</code>
	 */
	@Override
	public java.lang.String getName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME);
	}

	/**
	 * The table column <code>PUBLIC.T_BOOK_STORE.NAME</code>
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME)))
			.fetch();
	}

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}
