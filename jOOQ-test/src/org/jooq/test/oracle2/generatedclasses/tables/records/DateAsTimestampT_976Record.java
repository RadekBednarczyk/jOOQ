/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class DateAsTimestampT_976Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record> {

	private static final long serialVersionUID = -16734574;

	/**
	 * The table column <code>TEST.T_976.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_ID, value);
	}

	/**
	 * The table column <code>TEST.T_976.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_ID);
	}

	/**
	 * The table column <code>TEST.T_976.D</code>
	 */
	public void setD(java.sql.Timestamp value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_D, value);
	}

	/**
	 * The table column <code>TEST.T_976.D</code>
	 */
	public java.sql.Timestamp getD() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_D);
	}

	/**
	 * The table column <code>TEST.T_976.T</code>
	 */
	public void setT(org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_T, value);
	}

	/**
	 * The table column <code>TEST.T_976.T</code>
	 */
	public org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord getT() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_T);
	}

	/**
	 * The table column <code>TEST.T_976.O</code>
	 */
	public void setO(org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_O, value);
	}

	/**
	 * The table column <code>TEST.T_976.O</code>
	 */
	public org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord getO() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_O);
	}

	/**
	 * Create a detached DateAsTimestampT_976Record
	 */
	public DateAsTimestampT_976Record() {
		super(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976);
	}
}
