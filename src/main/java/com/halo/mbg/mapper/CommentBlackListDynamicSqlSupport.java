package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CommentBlackListDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CommentBlackList commentBlackList = new CommentBlackList();

    public static final SqlColumn<Long> id = commentBlackList.id;

    public static final SqlColumn<Date> createTime = commentBlackList.createTime;

    public static final SqlColumn<Date> updateTime = commentBlackList.updateTime;

    public static final SqlColumn<Date> banTime = commentBlackList.banTime;

    public static final SqlColumn<String> ipAddress = commentBlackList.ipAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CommentBlackList extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> banTime = column("ban_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ipAddress = column("ip_address", JDBCType.VARCHAR);

        public CommentBlackList() {
            super("comment_black_list");
        }
    }
}