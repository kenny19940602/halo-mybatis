package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LogsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Logs logs = new Logs();

    public static final SqlColumn<Long> id = logs.id;

    public static final SqlColumn<Date> createTime = logs.createTime;

    public static final SqlColumn<Date> updateTime = logs.updateTime;

    public static final SqlColumn<String> content = logs.content;

    public static final SqlColumn<String> ipAddress = logs.ipAddress;

    public static final SqlColumn<String> logKey = logs.logKey;

    public static final SqlColumn<Integer> type = logs.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Logs extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<String> ipAddress = column("ip_address", JDBCType.VARCHAR);

        public final SqlColumn<String> logKey = column("log_key", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public Logs() {
            super("logs");
        }
    }
}