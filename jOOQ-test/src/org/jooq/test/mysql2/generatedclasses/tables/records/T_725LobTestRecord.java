/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_725_lob_test", schema = "test2")
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 1759183929;

	/**
	 * The table column <code>test2.t_725_lob_test.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID, value);
	}

	/**
	 * The table column <code>test2.t_725_lob_test.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	}

	/**
	 * The table column <code>test2.t_725_lob_test.LOB</code>
	 */
	public void setLob(byte[] value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB, value);
	}

	/**
	 * The table column <code>test2.t_725_lob_test.LOB</code>
	 */
	@javax.persistence.Column(name = "LOB")
	public byte[] getLob() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB);
	}

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}
}
