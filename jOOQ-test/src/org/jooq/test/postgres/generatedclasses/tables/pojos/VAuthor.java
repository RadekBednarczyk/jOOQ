/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "v_author", schema = "public")
public class VAuthor implements java.io.Serializable {

	private static final long serialVersionUID = -419305836;

	private final java.lang.Integer                                                      id;
	private final java.lang.String                                                       firstName;
	private final java.lang.String                                                       lastName;
	private final java.sql.Date                                                          dateOfBirth;
	private final java.lang.Integer                                                      yearOfBirth;
	private final org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord address;

	public VAuthor(
		java.lang.Integer                                                      id,
		java.lang.String                                                       firstName,
		java.lang.String                                                       lastName,
		java.sql.Date                                                          dateOfBirth,
		java.lang.Integer                                                      yearOfBirth,
		org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	@javax.persistence.Column(name = "id", precision = 32)
	public java.lang.Integer getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "first_name", length = 50)
	public java.lang.String getFirstName() {
		return this.firstName;
	}

	@javax.persistence.Column(name = "last_name", length = 50)
	public java.lang.String getLastName() {
		return this.lastName;
	}

	@javax.persistence.Column(name = "date_of_birth")
	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	@javax.persistence.Column(name = "year_of_birth", precision = 32)
	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	@javax.persistence.Column(name = "address")
	public org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return this.address;
	}
}
