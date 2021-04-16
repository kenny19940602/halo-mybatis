package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PhotosDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Photos photos = new Photos();

    public static final SqlColumn<Integer> id = photos.id;

    public static final SqlColumn<Date> createTime = photos.createTime;

    public static final SqlColumn<Date> updateTime = photos.updateTime;

    public static final SqlColumn<String> description = photos.description;

    public static final SqlColumn<String> location = photos.location;

    public static final SqlColumn<String> name = photos.name;

    public static final SqlColumn<Date> takeTime = photos.takeTime;

    public static final SqlColumn<String> team = photos.team;

    public static final SqlColumn<String> thumbnail = photos.thumbnail;

    public static final SqlColumn<String> url = photos.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Photos extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> location = column("location", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Date> takeTime = column("take_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> team = column("team", JDBCType.VARCHAR);

        public final SqlColumn<String> thumbnail = column("thumbnail", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public Photos() {
            super("photos");
        }
    }
}