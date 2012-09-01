/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings("all")
public class XUnusedRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -1899866253;

	/**
	 * The table column <code>test.x_unused.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID, value);
	}

	/**
	 * The table column <code>test.x_unused.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID);
	}

	/**
	 * The table column <code>test.x_unused.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record> fetchXTestCase_85List() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85)
			.where(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID)))
			.and(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME)))
			.fetch();
	}

	/**
	 * The table column <code>test.x_unused.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> fetchXUnusedList() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID_REF.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID)))
			.and(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME_REF.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME)))
			.fetch();
	}

	/**
	 * The table column <code>test.x_unused.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record> fetchXTestCase_64_69List() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.UNUSED_ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID)))
			.fetch();
	}

	/**
	 * The table column <code>test.x_unused.name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME, value);
	}

	/**
	 * The table column <code>test.x_unused.name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME);
	}

	/**
	 * The table column <code>test.x_unused.big_integer</code>
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.BIG_INTEGER, value);
	}

	/**
	 * The table column <code>test.x_unused.big_integer</code>
	 */
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.BIG_INTEGER);
	}

	/**
	 * The table column <code>test.x_unused.id_ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_self
	 * FOREIGN KEY (id_ref, name_ref)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID_REF, value);
	}

	/**
	 * The table column <code>test.x_unused.id_ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_self
	 * FOREIGN KEY (id_ref, name_ref)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID_REF);
	}

	/**
	 * The table column <code>test.x_unused.id_ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_self
	 * FOREIGN KEY (id_ref, name_ref)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID_REF)))
			.and(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME_REF)))
			.fetchOne();
	}

	/**
	 * The table column <code>test.x_unused.class</code>
	 */
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.CLASS, value);
	}

	/**
	 * The table column <code>test.x_unused.class</code>
	 */
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.CLASS);
	}

	/**
	 * The table column <code>test.x_unused.fields</code>
	 */
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.FIELDS, value);
	}

	/**
	 * The table column <code>test.x_unused.fields</code>
	 */
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.FIELDS);
	}

	/**
	 * The table column <code>test.x_unused.configuration</code>
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.CONFIGURATION, value);
	}

	/**
	 * The table column <code>test.x_unused.configuration</code>
	 */
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.CONFIGURATION);
	}

	/**
	 * The table column <code>test.x_unused.u_d_t</code>
	 */
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.U_D_T, value);
	}

	/**
	 * The table column <code>test.x_unused.u_d_t</code>
	 */
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.U_D_T);
	}

	/**
	 * The table column <code>test.x_unused.meta_data</code>
	 */
	public void setMetaData(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.META_DATA, value);
	}

	/**
	 * The table column <code>test.x_unused.meta_data</code>
	 */
	public java.lang.Integer getMetaData() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.META_DATA);
	}

	/**
	 * The table column <code>test.x_unused.type0</code>
	 */
	public void setType0(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.TYPE0, value);
	}

	/**
	 * The table column <code>test.x_unused.type0</code>
	 */
	public java.lang.Integer getType0() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.TYPE0);
	}

	/**
	 * The table column <code>test.x_unused.primary_key</code>
	 */
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.PRIMARY_KEY, value);
	}

	/**
	 * The table column <code>test.x_unused.primary_key</code>
	 */
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.PRIMARY_KEY);
	}

	/**
	 * The table column <code>test.x_unused.primarykey</code>
	 */
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.PRIMARYKEY, value);
	}

	/**
	 * The table column <code>test.x_unused.primarykey</code>
	 */
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.PRIMARYKEY);
	}

	/**
	 * The table column <code>test.x_unused.name_ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_self
	 * FOREIGN KEY (id_ref, name_ref)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public void setNameRef(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME_REF, value);
	}

	/**
	 * The table column <code>test.x_unused.name_ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_self
	 * FOREIGN KEY (id_ref, name_ref)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public java.lang.String getNameRef() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME_REF);
	}

	/**
	 * The table column <code>test.x_unused.field 737</code>
	 */
	public void setField_737(java.math.BigDecimal value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.FIELD_737, value);
	}

	/**
	 * The table column <code>test.x_unused.field 737</code>
	 */
	public java.math.BigDecimal getField_737() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XUnused.FIELD_737);
	}

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
