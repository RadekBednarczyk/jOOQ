/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FNumber extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = 999693907;


	/**
	 * The procedure parameter <code>TEST.F_NUMBER.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The procedure parameter <code>TEST.F_NUMBER.N</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> N = createParameter("N", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public FNumber() {
		super("F_NUMBER", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(N);
	}

	/**
	 * Set the <code>N</code> parameter IN value to the routine
	 */
	public void setN(java.lang.Number value) {
		setNumber(org.jooq.test.oracle.generatedclasses.test.routines.FNumber.N, value);
	}

	/**
	 * Set the <code>N</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setN(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(N, field);
	}
}
