package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CategoriesDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Categories categories = new Categories();

    public static final SqlColumn<Integer> id = categories.id;

    public static final SqlColumn<Date> createTime = categories.createTime;

    public static final SqlColumn<Date> updateTime = categories.updateTime;

    public static final SqlColumn<String> description = categories.description;

    public static final SqlColumn<String> name = categories.name;

    public static final SqlColumn<Integer> parentId = categories.parentId;

    public static final SqlColumn<String> password = categories.password;

    public static final SqlColumn<String> slug = categories.slug;

    public static final SqlColumn<String> slugName = categories.slugName;

    public static final SqlColumn<String> thumbnail = categories.thumbnail;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Categories extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> parentId = column("parent_id", JDBCType.INTEGER);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> slug = column("slug", JDBCType.VARCHAR);

        public final SqlColumn<String> slugName = column("slug_name", JDBCType.VARCHAR);

        public final SqlColumn<String> thumbnail = column("thumbnail", JDBCType.VARCHAR);

        public Categories() {
            super("categories");
        }
    }
}