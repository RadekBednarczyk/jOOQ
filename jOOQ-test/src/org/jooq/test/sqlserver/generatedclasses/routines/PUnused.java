/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PUnused extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -706723531;


	/**
	 * The procedure parameter <code>dbo.p_unused.in1</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> IN1 = createParameter("in1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The procedure parameter <code>dbo.p_unused.out1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT1 = createParameter("out1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>dbo.p_unused.out2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT2 = createParameter("out2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super("p_unused", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(IN1);
		addInOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>in1</code> parameter IN value to the routine
	 */
	public void setIn1(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PUnused.IN1, value);
	}

	/**
	 * Set the <code>out1</code> parameter IN value to the routine
	 */
	public void setOut1(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PUnused.OUT1, value);
	}

	/**
	 * Set the <code>out2</code> parameter IN value to the routine
	 */
	public void setOut2(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PUnused.OUT2, value);
	}

	/**
	 * Get the <code>out1</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getOut1() {
		return getValue(OUT1);
	}

	/**
	 * Get the <code>out2</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getOut2() {
		return getValue(OUT2);
	}
}
