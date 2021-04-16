package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TagsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Tags tags = new Tags();

    public static final SqlColumn<Integer> id = tags.id;

    public static final SqlColumn<Date> createTime = tags.createTime;

    public static final SqlColumn<Date> updateTime = tags.updateTime;

    public static final SqlColumn<String> name = tags.name;

    public static final SqlColumn<String> slug = tags.slug;

    public static final SqlColumn<String> slugName = tags.slugName;

    public static final SqlColumn<String> thumbnail = tags.thumbnail;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Tags extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> slug = column("slug", JDBCType.VARCHAR);

        public final SqlColumn<String> slugName = column("slug_name", JDBCType.VARCHAR);

        public final SqlColumn<String> thumbnail = column("thumbnail", JDBCType.VARCHAR);

        public Tags() {
            super("tags");
        }
    }
}