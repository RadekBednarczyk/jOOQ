/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "vEmployeeDepartmentHistory", schema = "HumanResources")
public class vEmployeeDepartmentHistory implements java.io.Serializable {

	private static final long serialVersionUID = 1571190602;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  EmployeeID;

	@javax.validation.constraints.Size(max = 8)
	private java.lang.String   Title;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   FirstName;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   MiddleName;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   LastName;

	@javax.validation.constraints.Size(max = 10)
	private java.lang.String   Suffix;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   Shift;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   Department;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   GroupName;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp StartDate;
	private java.sql.Timestamp EndDate;

	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return this.EmployeeID;
	}

	public void setEmployeeID(java.lang.Integer EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return this.Title;
	}

	public void setTitle(java.lang.String Title) {
		this.Title = Title;
	}

	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(java.lang.String FirstName) {
		this.FirstName = FirstName;
	}

	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return this.MiddleName;
	}

	public void setMiddleName(java.lang.String MiddleName) {
		this.MiddleName = MiddleName;
	}

	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return this.LastName;
	}

	public void setLastName(java.lang.String LastName) {
		this.LastName = LastName;
	}

	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return this.Suffix;
	}

	public void setSuffix(java.lang.String Suffix) {
		this.Suffix = Suffix;
	}

	@javax.persistence.Column(name = "Shift", nullable = false, length = 50)
	public java.lang.String getShift() {
		return this.Shift;
	}

	public void setShift(java.lang.String Shift) {
		this.Shift = Shift;
	}

	@javax.persistence.Column(name = "Department", nullable = false, length = 50)
	public java.lang.String getDepartment() {
		return this.Department;
	}

	public void setDepartment(java.lang.String Department) {
		this.Department = Department;
	}

	@javax.persistence.Column(name = "GroupName", nullable = false, length = 50)
	public java.lang.String getGroupName() {
		return this.GroupName;
	}

	public void setGroupName(java.lang.String GroupName) {
		this.GroupName = GroupName;
	}

	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return this.StartDate;
	}

	public void setStartDate(java.sql.Timestamp StartDate) {
		this.StartDate = StartDate;
	}

	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return this.EndDate;
	}

	public void setEndDate(java.sql.Timestamp EndDate) {
		this.EndDate = EndDate;
	}
}
