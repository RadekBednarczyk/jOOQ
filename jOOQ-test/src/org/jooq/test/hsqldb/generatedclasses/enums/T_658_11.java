/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public enum T_658_11 implements org.jooq.MasterDataType<java.lang.String> {

	/**
	 * A  
	 */
	A__("A  "),

	/**
	 * B  
	 */
	B__("B  "),

	/**
	 * C  
	 */
	C__("C  "),
	;

	private final java.lang.String id;

	private T_658_11(java.lang.String id) {
		this.id = id;
	}

	@Override
	public java.lang.String getPrimaryKey() {
		return id;
	}

	/**
	 * The table column <code>PUBLIC.T_658_11.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final java.lang.String getId() {
		return id;
	}
}
