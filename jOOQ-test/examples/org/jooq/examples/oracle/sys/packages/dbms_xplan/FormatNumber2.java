/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FormatNumber2 extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = -80265655;


	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.FORMAT_NUMBER2.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.FORMAT_NUMBER2.NUM</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> NUM = createParameter("NUM", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public FormatNumber2() {
		super("FORMAT_NUMBER2", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(NUM);
	}

	/**
	 * Set the <code>NUM</code> parameter IN value to the routine
	 */
	public void setNum(java.lang.Number value) {
		setNumber(org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatNumber2.NUM, value);
	}

	/**
	 * Set the <code>NUM</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setNum(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(NUM, field);
	}
}
