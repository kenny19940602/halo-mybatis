package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JournalsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Journals journals = new Journals();

    public static final SqlColumn<Integer> id = journals.id;

    public static final SqlColumn<Date> createTime = journals.createTime;

    public static final SqlColumn<Date> updateTime = journals.updateTime;

    public static final SqlColumn<Long> likes = journals.likes;

    public static final SqlColumn<Integer> type = journals.type;

    public static final SqlColumn<String> content = journals.content;

    public static final SqlColumn<String> sourceContent = journals.sourceContent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Journals extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> likes = column("likes", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sourceContent = column("source_content", JDBCType.LONGVARCHAR);

        public Journals() {
            super("journals");
        }
    }
}