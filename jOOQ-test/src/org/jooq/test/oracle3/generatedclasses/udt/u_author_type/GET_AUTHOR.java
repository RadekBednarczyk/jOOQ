/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class GET_AUTHOR extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1650932148;


	/**
	 * The procedure parameter <code>TEST.U_AUTHOR_TYPE.GET_AUTHOR.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE.getDataType());

	/**
	 * The procedure parameter <code>TEST.U_AUTHOR_TYPE.GET_AUTHOR.P_ID</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P_ID = createParameter("P_ID", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public GET_AUTHOR() {
		super("GET_AUTHOR", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE, org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_ID);
	}

	/**
	 * Set the <code>P_ID</code> parameter IN value to the routine
	 */
	public void setP_ID(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_AUTHOR.P_ID, value);
	}

	/**
	 * Set the <code>P_ID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP_ID(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(P_ID, field);
	}
}
