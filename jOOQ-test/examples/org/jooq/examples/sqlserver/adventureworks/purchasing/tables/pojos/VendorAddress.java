/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "VendorAddress", schema = "Purchasing", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"VendorID", "AddressID"})
})
public class VendorAddress implements java.io.Serializable {

	private static final long serialVersionUID = 948308642;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  VendorID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  AddressID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  AddressTypeID;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "VendorID", nullable = false, precision = 10)
	public java.lang.Integer getVendorID() {
		return this.VendorID;
	}

	public void setVendorID(java.lang.Integer VendorID) {
		this.VendorID = VendorID;
	}

	@javax.persistence.Column(name = "AddressID", nullable = false, precision = 10)
	public java.lang.Integer getAddressID() {
		return this.AddressID;
	}

	public void setAddressID(java.lang.Integer AddressID) {
		this.AddressID = AddressID;
	}

	@javax.persistence.Column(name = "AddressTypeID", nullable = false, precision = 10)
	public java.lang.Integer getAddressTypeID() {
		return this.AddressTypeID;
	}

	public void setAddressTypeID(java.lang.Integer AddressTypeID) {
		this.AddressTypeID = AddressTypeID;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
