/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public interface IT_725LobTest extends java.io.Serializable {

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId();

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.LOB</code>
	 */
	public void setLob(byte[] value);

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.LOB</code>
	 */
	public byte[] getLob();
}
