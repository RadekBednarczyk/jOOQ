/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class vVendor extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor> {

	private static final long serialVersionUID = -1635222341;

	/**
	 * The singleton instance of Purchasing.vVendor
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.vVendor vVendor = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.vVendor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor.class;
	}

	/**
	 * The table column <code>Purchasing.vVendor.VendorID</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.Integer> VendorID = createField("VendorID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Purchasing.vVendor.Name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.ContactType</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> ContactType = createField("ContactType", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.Title</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> Title = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.FirstName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> FirstName = createField("FirstName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.MiddleName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> MiddleName = createField("MiddleName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.LastName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> LastName = createField("LastName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.Suffix</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> Suffix = createField("Suffix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.Phone</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> Phone = createField("Phone", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.EmailAddress</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> EmailAddress = createField("EmailAddress", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.EmailPromotion</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.Integer> EmailPromotion = createField("EmailPromotion", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Purchasing.vVendor.AddressLine1</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> AddressLine1 = createField("AddressLine1", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.AddressLine2</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> AddressLine2 = createField("AddressLine2", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.City</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> City = createField("City", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.StateProvinceName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> StateProvinceName = createField("StateProvinceName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.PostalCode</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> PostalCode = createField("PostalCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.vVendor.CountryRegionName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.vVendor, java.lang.String> CountryRegionName = createField("CountryRegionName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	public vVendor() {
		super("vVendor", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing);
	}

	public vVendor(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.vVendor.vVendor);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.vVendor as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.vVendor(alias);
	}
}
