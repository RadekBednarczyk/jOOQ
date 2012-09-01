/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_639NumbersTable extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = -1684284814;

	/**
	 * The singleton instance of test2.t_639_numbers_table
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.mysql2.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord.class;
	}

	/**
	 * The table column <code>test2.t_639_numbers_table.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.BYTE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.SHORT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.INTEGER</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.LONG</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.BYTE_DECIMAL</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.SHORT_DECIMAL</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.INTEGER_DECIMAL</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.LONG_DECIMAL</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.BIG_INTEGER</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.BIG_DECIMAL</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.FLOAT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> FLOAT = createField("FLOAT", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The table column <code>test2.t_639_numbers_table.DOUBLE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> DOUBLE = createField("DOUBLE", org.jooq.impl.SQLDataType.DOUBLE, this);

	public T_639NumbersTable() {
		super("t_639_numbers_table", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	public T_639NumbersTable(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_639_NUMBERS_TABLE_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_639_NUMBERS_TABLE_PRIMARY);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.T_639NumbersTable as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.T_639NumbersTable(alias);
	}
}
