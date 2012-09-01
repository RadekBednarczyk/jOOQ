/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS", schema = "TEST")
public class TTriggers implements java.io.Serializable {

	private static final long serialVersionUID = 989622586;


	@javax.validation.constraints.NotNull
	private java.lang.Integer idGenerated;

	@javax.validation.constraints.NotNull
	private java.lang.Integer id;

	@javax.validation.constraints.NotNull
	private java.lang.Integer counter;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getIdGenerated() {
		return this.idGenerated;
	}

	public void setIdGenerated(java.lang.Integer idGenerated) {
		this.idGenerated = idGenerated;
	}

	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "COUNTER", nullable = false, precision = 7)
	public java.lang.Integer getCounter() {
		return this.counter;
	}

	public void setCounter(java.lang.Integer counter) {
		this.counter = counter;
	}
}
