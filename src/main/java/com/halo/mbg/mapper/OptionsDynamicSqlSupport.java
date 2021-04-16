package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Options options = new Options();

    public static final SqlColumn<Integer> id = options.id;

    public static final SqlColumn<Date> createTime = options.createTime;

    public static final SqlColumn<Date> updateTime = options.updateTime;

    public static final SqlColumn<String> optionKey = options.optionKey;

    public static final SqlColumn<Integer> type = options.type;

    public static final SqlColumn<String> optionValue = options.optionValue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Options extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> optionKey = column("option_key", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> optionValue = column("option_value", JDBCType.LONGVARCHAR);

        public Options() {
            super("options");
        }
    }
}