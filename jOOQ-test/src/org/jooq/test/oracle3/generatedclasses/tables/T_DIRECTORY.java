/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_DIRECTORY extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> implements java.lang.Cloneable {

	private static final long serialVersionUID = 305611316;

	/**
	 * The singleton instance of TEST.T_DIRECTORY
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY T_DIRECTORY = new org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY.class;
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.T_DIRECTORY.PARENT_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, java.lang.Integer> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.T_DIRECTORY.IS_DIRECTORY</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, java.lang.Integer> IS_DIRECTORY = createField("IS_DIRECTORY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.T_DIRECTORY.name</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public T_DIRECTORY() {
		super("T_DIRECTORY", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public T_DIRECTORY(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DIRECTORY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DIRECTORY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DIRECTORY_SELF);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY(alias);
	}
}
