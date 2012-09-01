/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class F317 extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 2049985679;


	/**
	 * The procedure parameter <code>LUKAS.F317.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>LUKAS.F317.P1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P1 = createParameter("P1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>LUKAS.F317.P2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P2 = createParameter("P2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>LUKAS.F317.P3</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P3 = createParameter("P3", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>LUKAS.F317.P4</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P4 = createParameter("P4", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public F317() {
		super("F317", org.jooq.test.db2.generatedclasses.Lukas.LUKAS, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	public void setP1(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.F317.P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP1(org.jooq.Field<java.lang.Integer> field) {
		setField(P1, field);
	}

	/**
	 * Set the <code>P2</code> parameter IN value to the routine
	 */
	public void setP2(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.F317.P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP2(org.jooq.Field<java.lang.Integer> field) {
		setField(P2, field);
	}

	/**
	 * Set the <code>P3</code> parameter IN value to the routine
	 */
	public void setP3(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.F317.P3, value);
	}

	/**
	 * Set the <code>P3</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP3(org.jooq.Field<java.lang.Integer> field) {
		setField(P3, field);
	}

	/**
	 * Set the <code>P4</code> parameter IN value to the routine
	 */
	public void setP4(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.F317.P4, value);
	}

	/**
	 * Set the <code>P4</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP4(org.jooq.Field<java.lang.Integer> field) {
		setField(P4, field);
	}
}
