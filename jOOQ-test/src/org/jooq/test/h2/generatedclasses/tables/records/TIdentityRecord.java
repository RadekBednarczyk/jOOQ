/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TIdentityRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord> implements org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentity {

	private static final long serialVersionUID = -533569610;

	/**
	 * The table column <code>PUBLIC.T_IDENTITY.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TIdentity.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_IDENTITY.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TIdentity.ID);
	}

	/**
	 * The table column <code>PUBLIC.T_IDENTITY.VAL</code>
	 */
	@Override
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TIdentity.VAL, value);
	}

	/**
	 * The table column <code>PUBLIC.T_IDENTITY.VAL</code>
	 */
	@Override
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TIdentity.VAL);
	}

	/**
	 * Create a detached TIdentityRecord
	 */
	public TIdentityRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TIdentity.T_IDENTITY);
	}
}
