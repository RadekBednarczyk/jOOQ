/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "ContactCreditCard", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ContactID", "CreditCardID"})
})
public class ContactCreditCard implements java.io.Serializable {

	private static final long serialVersionUID = -892639727;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  ContactID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  CreditCardID;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "ContactID", nullable = false, precision = 10)
	public java.lang.Integer getContactID() {
		return this.ContactID;
	}

	public void setContactID(java.lang.Integer ContactID) {
		this.ContactID = ContactID;
	}

	@javax.persistence.Column(name = "CreditCardID", nullable = false, precision = 10)
	public java.lang.Integer getCreditCardID() {
		return this.CreditCardID;
	}

	public void setCreditCardID(java.lang.Integer CreditCardID) {
		this.CreditCardID = CreditCardID;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
