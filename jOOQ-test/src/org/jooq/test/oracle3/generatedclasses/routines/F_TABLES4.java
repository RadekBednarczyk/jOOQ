/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class F_TABLES4 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -415732229;


	/**
	 * The procedure parameter <code>TEST.F_TABLES4.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE.class));

	/**
	 * The procedure parameter <code>TEST.F_TABLES4.IN_TABLE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE> IN_TABLE = createParameter("IN_TABLE", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public F_TABLES4() {
		super("F_TABLES4", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter IN value to the routine
	 */
	public void setIN_TABLE(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.F_TABLES4.IN_TABLE, value);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setIN_TABLE(org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE> field) {
		setField(IN_TABLE, field);
	}
}
