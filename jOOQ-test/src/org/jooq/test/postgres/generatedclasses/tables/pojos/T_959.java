/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_959", schema = "public")
public class T_959 implements java.io.Serializable {

	private static final long serialVersionUID = 380392706;

	private final org.jooq.test.postgres.generatedclasses.enums.U_959 javaKeywords;

	public T_959(
		org.jooq.test.postgres.generatedclasses.enums.U_959 javaKeywords
	) {
		this.javaKeywords = javaKeywords;
	}

	@javax.persistence.Column(name = "java_keywords")
	public org.jooq.test.postgres.generatedclasses.enums.U_959 getJavaKeywords() {
		return this.javaKeywords;
	}
}
