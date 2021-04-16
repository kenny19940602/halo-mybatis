package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MenusDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Menus menus = new Menus();

    public static final SqlColumn<Integer> id = menus.id;

    public static final SqlColumn<Date> createTime = menus.createTime;

    public static final SqlColumn<Date> updateTime = menus.updateTime;

    public static final SqlColumn<String> icon = menus.icon;

    public static final SqlColumn<String> name = menus.name;

    public static final SqlColumn<Integer> parentId = menus.parentId;

    public static final SqlColumn<Integer> priority = menus.priority;

    public static final SqlColumn<String> target = menus.target;

    public static final SqlColumn<String> team = menus.team;

    public static final SqlColumn<String> url = menus.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Menus extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> parentId = column("parent_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> priority = column("priority", JDBCType.INTEGER);

        public final SqlColumn<String> target = column("target", JDBCType.VARCHAR);

        public final SqlColumn<String> team = column("team", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public Menus() {
            super("menus");
        }
    }
}