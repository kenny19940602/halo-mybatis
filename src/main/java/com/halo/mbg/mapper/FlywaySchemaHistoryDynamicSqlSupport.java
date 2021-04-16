package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FlywaySchemaHistoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final FlywaySchemaHistory flywaySchemaHistory = new FlywaySchemaHistory();

    public static final SqlColumn<Integer> installedRank = flywaySchemaHistory.installedRank;

    public static final SqlColumn<String> version = flywaySchemaHistory.version;

    public static final SqlColumn<String> description = flywaySchemaHistory.description;

    public static final SqlColumn<String> type = flywaySchemaHistory.type;

    public static final SqlColumn<String> script = flywaySchemaHistory.script;

    public static final SqlColumn<Integer> checksum = flywaySchemaHistory.checksum;

    public static final SqlColumn<String> installedBy = flywaySchemaHistory.installedBy;

    public static final SqlColumn<Date> installedOn = flywaySchemaHistory.installedOn;

    public static final SqlColumn<Integer> executionTime = flywaySchemaHistory.executionTime;

    public static final SqlColumn<Boolean> success = flywaySchemaHistory.success;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class FlywaySchemaHistory extends SqlTable {
        public final SqlColumn<Integer> installedRank = column("installed_rank", JDBCType.INTEGER);

        public final SqlColumn<String> version = column("version", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<String> script = column("script", JDBCType.VARCHAR);

        public final SqlColumn<Integer> checksum = column("checksum", JDBCType.INTEGER);

        public final SqlColumn<String> installedBy = column("installed_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> installedOn = column("installed_on", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> executionTime = column("execution_time", JDBCType.INTEGER);

        public final SqlColumn<Boolean> success = column("success", JDBCType.BIT);

        public FlywaySchemaHistory() {
            super("flyway_schema_history");
        }
    }
}