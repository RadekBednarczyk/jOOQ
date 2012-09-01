/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TTriggers extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = 433320984;

	/**
	 * The singleton instance of LUKAS.T_TRIGGERS
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.db2.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord.class;
	}

	/**
	 * The table column <code>LUKAS.T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("ID_GENERATED", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * The table column <code>LUKAS.T_TRIGGERS.ID</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * The table column <code>LUKAS.T_TRIGGERS.COUNTER</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("COUNTER", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * No further instances allowed
	 */
	private TTriggers() {
		super("T_TRIGGERS", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_TRIGGERS__PK_T_TRIGGERS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_TRIGGERS__PK_T_TRIGGERS);
	}
}
