/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TTriggers extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = 1119598077;

	/**
	 * The singleton instance of DBA.t_triggers
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.sybase.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord.class;
	}

	/**
	 * The table column <code>DBA.t_triggers.id_generated</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.t_triggers.id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.t_triggers.counter</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, this);

	public TTriggers() {
		super("t_triggers", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	public TTriggers(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.sybase.generatedclasses.Keys.IDENTITY_T_TRIGGERS;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_TRIGGERS__PK_T_TRIGGERS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_TRIGGERS__PK_T_TRIGGERS);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TTriggers as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TTriggers(alias);
	}
}
