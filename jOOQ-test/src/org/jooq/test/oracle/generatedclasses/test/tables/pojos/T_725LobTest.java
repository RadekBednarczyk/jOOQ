/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_725_LOB_TEST", schema = "TEST")
public class T_725LobTest implements java.io.Serializable {

	private static final long serialVersionUID = -417902875;


	@javax.validation.constraints.NotNull
	private java.lang.Integer id;
	private byte[]            lob;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "LOB")
	public byte[] getLob() {
		return this.lob;
	}

	public void setLob(byte[] lob) {
		this.lob = lob;
	}
}
