/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = 915914092;

	/**
	 * The singleton instance of PUBLIC.T_785
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.T_785 T_785 = new org.jooq.test.hsqldb.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record.class;
	}

	/**
	 * The table column <code>PUBLIC.T_785.ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>PUBLIC.T_785.NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>PUBLIC.T_785.VALUE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR, this);

	public T_785() {
		super("T_785", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	public T_785(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.T_785 as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.T_785(alias);
	}
}
