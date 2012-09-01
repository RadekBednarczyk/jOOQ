/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "VendorContact", schema = "Purchasing", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"VendorID", "ContactID"})
})
public class VendorContact implements java.io.Serializable {

	private static final long serialVersionUID = 1682960342;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  VendorID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  ContactID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  ContactTypeID;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "VendorID", nullable = false, precision = 10)
	public java.lang.Integer getVendorID() {
		return this.VendorID;
	}

	public void setVendorID(java.lang.Integer VendorID) {
		this.VendorID = VendorID;
	}

	@javax.persistence.Column(name = "ContactID", nullable = false, precision = 10)
	public java.lang.Integer getContactID() {
		return this.ContactID;
	}

	public void setContactID(java.lang.Integer ContactID) {
		this.ContactID = ContactID;
	}

	@javax.persistence.Column(name = "ContactTypeID", nullable = false, precision = 10)
	public java.lang.Integer getContactTypeID() {
		return this.ContactTypeID;
	}

	public void setContactTypeID(java.lang.Integer ContactTypeID) {
		this.ContactTypeID = ContactTypeID;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
