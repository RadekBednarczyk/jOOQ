/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord> implements org.jooq.test.h2.generatedclasses.tables.interfaces.IVAuthor {

	private static final long serialVersionUID = -1044570965;

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.ID);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.FIRST_NAME</code>
	 */
	@Override
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.FIRST_NAME, value);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.FIRST_NAME</code>
	 */
	@Override
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.FIRST_NAME);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.LAST_NAME</code>
	 */
	@Override
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.LAST_NAME, value);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.LAST_NAME</code>
	 */
	@Override
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.LAST_NAME);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.DATE_OF_BIRTH</code>
	 */
	@Override
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.DATE_OF_BIRTH</code>
	 */
	@Override
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.DATE_OF_BIRTH);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	@Override
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	@Override
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.ADDRESS</code>
	 */
	@Override
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.ADDRESS, value);
	}

	/**
	 * The table column <code>PUBLIC.V_AUTHOR.ADDRESS</code>
	 */
	@Override
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VAuthor.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.VAuthor.V_AUTHOR);
	}
}
