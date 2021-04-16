package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LinksDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Links links = new Links();

    public static final SqlColumn<Integer> id = links.id;

    public static final SqlColumn<Date> createTime = links.createTime;

    public static final SqlColumn<Date> updateTime = links.updateTime;

    public static final SqlColumn<String> description = links.description;

    public static final SqlColumn<String> logo = links.logo;

    public static final SqlColumn<String> name = links.name;

    public static final SqlColumn<Integer> priority = links.priority;

    public static final SqlColumn<String> team = links.team;

    public static final SqlColumn<String> url = links.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Links extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> logo = column("logo", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> priority = column("priority", JDBCType.INTEGER);

        public final SqlColumn<String> team = column("team", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public Links() {
            super("links");
        }
    }
}