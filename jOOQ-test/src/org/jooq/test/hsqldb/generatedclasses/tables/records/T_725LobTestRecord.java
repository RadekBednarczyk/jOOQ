/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IT_725LobTest {

	private static final long serialVersionUID = -349464603;

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	}

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.LOB</code>
	 */
	@Override
	public void setLob(byte[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB, value);
	}

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.LOB</code>
	 */
	@Override
	public byte[] getLob() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB);
	}

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}
}
