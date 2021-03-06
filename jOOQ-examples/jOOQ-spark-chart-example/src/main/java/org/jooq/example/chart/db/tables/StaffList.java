/**
 * This class is generated by jOOQ
 */
package org.jooq.example.chart.db.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.StaffListRecord;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0",
        "schema version:public_2",
    },
    date = "2016-06-30T15:44:15.143Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffList extends TableImpl<StaffListRecord> {

    private static final long serialVersionUID = 939902205;

    /**
     * The reference instance of <code>public.staff_list</code>
     */
    public static final StaffList STAFF_LIST = new StaffList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffListRecord> getRecordType() {
        return StaffListRecord.class;
    }

    /**
     * The column <code>public.staff_list.id</code>.
     */
    public final TableField<StaffListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.staff_list.name</code>.
     */
    public final TableField<StaffListRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.staff_list.address</code>.
     */
    public final TableField<StaffListRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>public.staff_list.zip code</code>.
     */
    public final TableField<StaffListRecord, String> ZIP_CODE = createField("zip code", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>public.staff_list.phone</code>.
     */
    public final TableField<StaffListRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>public.staff_list.city</code>.
     */
    public final TableField<StaffListRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>public.staff_list.country</code>.
     */
    public final TableField<StaffListRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>public.staff_list.sid</code>.
     */
    public final TableField<StaffListRecord, Integer> SID = createField("sid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.staff_list</code> table reference
     */
    public StaffList() {
        this("staff_list", null);
    }

    /**
     * Create an aliased <code>public.staff_list</code> table reference
     */
    public StaffList(String alias) {
        this(alias, STAFF_LIST);
    }

    private StaffList(String alias, Table<StaffListRecord> aliased) {
        this(alias, aliased, null);
    }

    private StaffList(String alias, Table<StaffListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaffList as(String alias) {
        return new StaffList(alias, this);
    }

    /**
     * Rename this table
     */
    public StaffList rename(String name) {
        return new StaffList(name, null);
    }
}
