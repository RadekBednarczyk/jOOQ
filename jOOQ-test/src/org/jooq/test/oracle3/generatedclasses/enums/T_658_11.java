/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public enum T_658_11 implements java.lang.Cloneable, org.jooq.MasterDataType<java.lang.String> {

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

	private final java.lang.String ID;

	private T_658_11(java.lang.String ID) {
		this.ID = ID;
	}

	@Override
	public java.lang.String getPrimaryKey() {
		return ID;
	}

	/**
	 * The table column <code>TEST.T_658_11.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final java.lang.String getID() {
		return ID;
	}
}
