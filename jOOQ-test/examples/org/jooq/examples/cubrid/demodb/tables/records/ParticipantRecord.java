/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "participant", schema = "PUBLIC", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"host_year", "nation_code"})
})
public class ParticipantRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.cubrid.demodb.tables.records.ParticipantRecord> {

	private static final long serialVersionUID = 338767319;

	/**
	 * The table column <code>PUBLIC.participant.host_year</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT participant__fk_participant_host_year
	 * FOREIGN KEY (host_year)
	 * REFERENCES PUBLIC.olympic (host_year)
	 * </pre></code>
	 */
	public void setHostYear(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.HOST_YEAR, value);
	}

	/**
	 * The table column <code>PUBLIC.participant.host_year</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT participant__fk_participant_host_year
	 * FOREIGN KEY (host_year)
	 * REFERENCES PUBLIC.olympic (host_year)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "host_year", nullable = false)
	public java.lang.Integer getHostYear() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.HOST_YEAR);
	}

	/**
	 * Link this record to a given {@link org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord 
	 * OlympicRecord}
	 */
	public void setHostYear(org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord value) {
		if (value == null) {
			setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.HOST_YEAR, null);
		}
		else {
			setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.HOST_YEAR, value.getValue(org.jooq.examples.cubrid.demodb.tables.Olympic.OLYMPIC.HOST_YEAR));
		}
	}

	/**
	 * The table column <code>PUBLIC.participant.host_year</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT participant__fk_participant_host_year
	 * FOREIGN KEY (host_year)
	 * REFERENCES PUBLIC.olympic (host_year)
	 * </pre></code>
	 */
	public org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord fetchOlympic() {
		return create()
			.selectFrom(org.jooq.examples.cubrid.demodb.tables.Olympic.OLYMPIC)
			.where(org.jooq.examples.cubrid.demodb.tables.Olympic.OLYMPIC.HOST_YEAR.equal(getValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.HOST_YEAR)))
			.fetchOne();
	}

	/**
	 * The table column <code>PUBLIC.participant.nation_code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT participant__fk_participant_nation_code
	 * FOREIGN KEY (nation_code)
	 * REFERENCES PUBLIC.nation (code)
	 * </pre></code>
	 */
	public void setNationCode(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.NATION_CODE, value);
	}

	/**
	 * The table column <code>PUBLIC.participant.nation_code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT participant__fk_participant_nation_code
	 * FOREIGN KEY (nation_code)
	 * REFERENCES PUBLIC.nation (code)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "nation_code", nullable = false, length = 3)
	public java.lang.String getNationCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.NATION_CODE);
	}

	/**
	 * Link this record to a given {@link org.jooq.examples.cubrid.demodb.tables.records.NationRecord 
	 * NationRecord}
	 */
	public void setNationCode(org.jooq.examples.cubrid.demodb.tables.records.NationRecord value) {
		if (value == null) {
			setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.NATION_CODE, null);
		}
		else {
			setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.NATION_CODE, value.getValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CODE));
		}
	}

	/**
	 * The table column <code>PUBLIC.participant.nation_code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT participant__fk_participant_nation_code
	 * FOREIGN KEY (nation_code)
	 * REFERENCES PUBLIC.nation (code)
	 * </pre></code>
	 */
	public org.jooq.examples.cubrid.demodb.tables.records.NationRecord fetchNation() {
		return create()
			.selectFrom(org.jooq.examples.cubrid.demodb.tables.Nation.NATION)
			.where(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CODE.equal(getValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.NATION_CODE)))
			.fetchOne();
	}

	/**
	 * The table column <code>PUBLIC.participant.gold</code>
	 */
	public void setGold(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.GOLD, value);
	}

	/**
	 * The table column <code>PUBLIC.participant.gold</code>
	 */
	@javax.persistence.Column(name = "gold")
	public java.lang.Integer getGold() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.GOLD);
	}

	/**
	 * The table column <code>PUBLIC.participant.silver</code>
	 */
	public void setSilver(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.SILVER, value);
	}

	/**
	 * The table column <code>PUBLIC.participant.silver</code>
	 */
	@javax.persistence.Column(name = "silver")
	public java.lang.Integer getSilver() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.SILVER);
	}

	/**
	 * The table column <code>PUBLIC.participant.bronze</code>
	 */
	public void setBronze(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.BRONZE, value);
	}

	/**
	 * The table column <code>PUBLIC.participant.bronze</code>
	 */
	@javax.persistence.Column(name = "bronze")
	public java.lang.Integer getBronze() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.BRONZE);
	}

	/**
	 * Create a detached ParticipantRecord
	 */
	public ParticipantRecord() {
		super(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT);
	}
}
