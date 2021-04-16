package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MetasDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Metas metas = new Metas();

    public static final SqlColumn<Long> id = metas.id;

    public static final SqlColumn<Integer> type = metas.type;

    public static final SqlColumn<Date> createTime = metas.createTime;

    public static final SqlColumn<Date> updateTime = metas.updateTime;

    public static final SqlColumn<String> metaKey = metas.metaKey;

    public static final SqlColumn<Integer> postId = metas.postId;

    public static final SqlColumn<String> metaValue = metas.metaValue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Metas extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> metaKey = column("meta_key", JDBCType.VARCHAR);

        public final SqlColumn<Integer> postId = column("post_id", JDBCType.INTEGER);

        public final SqlColumn<String> metaValue = column("meta_value", JDBCType.VARCHAR);

        public Metas() {
            super("metas");
        }
    }
}