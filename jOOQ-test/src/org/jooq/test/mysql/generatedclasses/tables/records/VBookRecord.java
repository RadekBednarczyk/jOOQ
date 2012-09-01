/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = 744342201;

	/**
	 * The book ID
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.ID, value);
	}

	/**
	 * The book ID
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.ID);
	}

	/**
	 * The author ID in entity 'author'
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.AUTHOR_ID);
	}

	/**
	 * The table column <code>test.v_book.co_author_id</code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>test.v_book.co_author_id</code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.CO_AUTHOR_ID);
	}

	/**
	 * Some more details about the book
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.DETAILS_ID, value);
	}

	/**
	 * Some more details about the book
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.DETAILS_ID);
	}

	/**
	 * The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.PUBLISHED_IN);
	}

	/**
	 * The language of the book
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.LANGUAGE_ID, value);
	}

	/**
	 * The language of the book
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.LANGUAGE_ID);
	}

	/**
	 * Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.CONTENT_TEXT, value);
	}

	/**
	 * Some textual content of the book
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.CONTENT_TEXT);
	}

	/**
	 * Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.CONTENT_PDF, value);
	}

	/**
	 * Some binary content of the book
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.CONTENT_PDF);
	}

	/**
	 * The book's stock status
	 */
	public void setStatus(org.jooq.test.mysql.generatedclasses.enums.VBookStatus value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VBook.STATUS, value);
	}

	/**
	 * The book's stock status
	 */
	public org.jooq.test.mysql.generatedclasses.enums.VBookStatus getStatus() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VBook.STATUS);
	}

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.mysql.generatedclasses.tables.VBook.V_BOOK);
	}
}
