/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_959", schema = "public")
public class T_959Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> {

	private static final long serialVersionUID = -1360657599;

	/**
	 * The table column <code>public.t_959.java_keywords</code>
	 */
	public void setJavaKeywords(org.jooq.test.postgres.generatedclasses.enums.U_959 value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_959.T_959.JAVA_KEYWORDS, value);
	}

	/**
	 * The table column <code>public.t_959.java_keywords</code>
	 */
	@javax.persistence.Column(name = "java_keywords")
	public org.jooq.test.postgres.generatedclasses.enums.U_959 getJavaKeywords() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_959.T_959.JAVA_KEYWORDS);
	}

	/**
	 * Create a detached T_959Record
	 */
	public T_959Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_959.T_959);
	}
}
