/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_986_1 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = -1056772966;

	/**
	 * The singleton instance of public.t_986_1
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_986_1 T_986_1 = new org.jooq.test.postgres.generatedclasses.tables.T_986_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record.class;
	}

	/**
	 * The table column <code>public.t_986_1.ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_986_1__fk_986
	 * FOREIGN KEY (ref, ref)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record, java.lang.Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER, this);

	public T_986_1() {
		super("t_986_1", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public T_986_1(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.T_986_1__FK_986);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_986_1 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_986_1(alias);
	}
}
