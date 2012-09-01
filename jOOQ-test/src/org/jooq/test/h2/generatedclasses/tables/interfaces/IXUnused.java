/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public interface IXUnused extends java.io.Serializable {

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setName(java.lang.String value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.String getName();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.BIG_INTEGER</code>
	 */
	public void setBigInteger(java.math.BigInteger value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.BIG_INTEGER</code>
	 */
	public java.math.BigInteger getBigInteger();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setIdRef(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.Integer getIdRef();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setNameRef(java.lang.String value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.String getNameRef();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CLASS</code>
	 */
	public void setClass_(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CLASS</code>
	 */
	public java.lang.Integer getClass_();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELDS</code>
	 */
	public void setFields_(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELDS</code>
	 */
	public java.lang.Integer getFields_();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TABLE</code>
	 */
	public void setTable_(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TABLE</code>
	 */
	public java.lang.Integer getTable_();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CONFIGURATION</code>
	 */
	public void setConfiguration_(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CONFIGURATION</code>
	 */
	public java.lang.Integer getConfiguration_();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.U_D_T</code>
	 */
	public void setUDT(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.U_D_T</code>
	 */
	public java.lang.Integer getUDT();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.META_DATA</code>
	 */
	public void setMetaData(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.META_DATA</code>
	 */
	public java.lang.Integer getMetaData();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.VALUES</code>
	 */
	public void setValues_(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.VALUES</code>
	 */
	public java.lang.Integer getValues_();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TYPE0</code>
	 */
	public void setType0(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TYPE0</code>
	 */
	public java.lang.Integer getType0();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARY_KEY</code>
	 */
	public void setPrimaryKey(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARY_KEY</code>
	 */
	public java.lang.Integer getPrimaryKey();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARYKEY</code>
	 */
	public void setPrimarykey(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARYKEY</code>
	 */
	public java.lang.Integer getPrimarykey();

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELD 737</code>
	 */
	public void setField_737(java.math.BigDecimal value);

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELD 737</code>
	 */
	public java.math.BigDecimal getField_737();
}
