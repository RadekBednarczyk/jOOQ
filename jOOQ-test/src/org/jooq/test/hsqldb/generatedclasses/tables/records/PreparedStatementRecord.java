/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PreparedStatementRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.PreparedStatementRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IPreparedStatement {

	private static final long serialVersionUID = -435317898;

	/**
	 * The table column <code>PUBLIC.PREPARED_STATEMENT.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.PREPARED_STATEMENT.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT.ID);
	}

	/**
	 * Create a detached PreparedStatementRecord
	 */
	public PreparedStatementRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT);
	}
}
