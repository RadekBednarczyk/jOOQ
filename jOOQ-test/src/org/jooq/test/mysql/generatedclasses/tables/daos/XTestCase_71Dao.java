/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71Dao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_71, java.lang.Integer> {

	/**
	 * Create a new XTestCase_71Dao without any factory
	 */
	public XTestCase_71Dao() {
		super(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_71.class);
	}

	/**
	 * Create a new XTestCase_71Dao with an attached factory
	 */
	public XTestCase_71Dao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_71.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_71 object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_71> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.ID, values);
	}

	/**
	 * Fetch a unique that has <code>ID = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_71 fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.ID, value);
	}

	/**
	 * Fetch records that have <code>TEST_CASE_64_69_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_71> fetchByTestCase_64_69Id(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, values);
	}
}
