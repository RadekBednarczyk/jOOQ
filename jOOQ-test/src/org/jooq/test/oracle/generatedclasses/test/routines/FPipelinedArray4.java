/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FPipelinedArray4 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord> {

	private static final long serialVersionUID = -586221373;


	/**
	 * The procedure parameter <code>TEST.F_PIPELINED_ARRAY4.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FPipelinedArray4() {
		super("F_PIPELINED_ARRAY4", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
	}
}
