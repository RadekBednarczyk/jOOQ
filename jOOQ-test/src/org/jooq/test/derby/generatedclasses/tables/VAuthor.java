/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = 1856849290;

	/**
	 * The singleton instance of TEST.V_AUTHOR
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.derby.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.ID</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The table column <code>TEST.V_AUTHOR.FIRST_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * The table column <code>TEST.V_AUTHOR.LAST_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * The table column <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, V_AUTHOR);

	/**
	 * The table column <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The table column <code>TEST.V_AUTHOR.ADDRESS</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		super("V_AUTHOR", org.jooq.test.derby.generatedclasses.Test.TEST);
	}
}
