/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "CountryRegionCurrency", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CountryRegionCode", "CurrencyCode"})
})
public class CountryRegionCurrency extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> {

	private static final long serialVersionUID = 1709022058;

	/**
	 * The table column <code>Sales.CountryRegionCurrency.CountryRegionCode</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	public void setCountryRegionCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CountryRegionCode, value);
	}

	/**
	 * The table column <code>Sales.CountryRegionCurrency.CountryRegionCode</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CountryRegionCode", nullable = false, length = 3)
	public java.lang.String getCountryRegionCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CountryRegionCode);
	}

	/**
	 * The table column <code>Sales.CountryRegionCurrency.CurrencyCode</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_Currency_CurrencyCode
	 * FOREIGN KEY (CurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	public void setCurrencyCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CurrencyCode, value);
	}

	/**
	 * The table column <code>Sales.CountryRegionCurrency.CurrencyCode</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_Currency_CurrencyCode
	 * FOREIGN KEY (CurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CurrencyCode", nullable = false, length = 3)
	public java.lang.String getCurrencyCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CurrencyCode);
	}

	/**
	 * The table column <code>Sales.CountryRegionCurrency.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.CountryRegionCurrency.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.ModifiedDate);
	}

	/**
	 * Create a detached CountryRegionCurrency
	 */
	public CountryRegionCurrency() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency);
	}
}
