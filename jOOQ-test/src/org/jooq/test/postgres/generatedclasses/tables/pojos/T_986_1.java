/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_986_1", schema = "public")
public class T_986_1 implements java.io.Serializable {

	private static final long serialVersionUID = -768306838;

	private final java.lang.Integer ref;

	public T_986_1(
		java.lang.Integer ref
	) {
		this.ref = ref;
	}

	@javax.persistence.Column(name = "ref", precision = 32)
	public java.lang.Integer getRef() {
		return this.ref;
	}
}
