package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CommentsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Comments comments = new Comments();

    public static final SqlColumn<Long> id = comments.id;

    public static final SqlColumn<Integer> type = comments.type;

    public static final SqlColumn<Date> createTime = comments.createTime;

    public static final SqlColumn<Date> updateTime = comments.updateTime;

    public static final SqlColumn<Boolean> allowNotification = comments.allowNotification;

    public static final SqlColumn<String> author = comments.author;

    public static final SqlColumn<String> authorUrl = comments.authorUrl;

    public static final SqlColumn<String> content = comments.content;

    public static final SqlColumn<String> email = comments.email;

    public static final SqlColumn<String> gravatarMd5 = comments.gravatarMd5;

    public static final SqlColumn<String> ipAddress = comments.ipAddress;

    public static final SqlColumn<Boolean> isAdmin = comments.isAdmin;

    public static final SqlColumn<Long> parentId = comments.parentId;

    public static final SqlColumn<Integer> postId = comments.postId;

    public static final SqlColumn<Integer> status = comments.status;

    public static final SqlColumn<Integer> topPriority = comments.topPriority;

    public static final SqlColumn<String> userAgent = comments.userAgent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Comments extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> allowNotification = column("allow_notification", JDBCType.BIT);

        public final SqlColumn<String> author = column("author", JDBCType.VARCHAR);

        public final SqlColumn<String> authorUrl = column("author_url", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> gravatarMd5 = column("gravatar_md5", JDBCType.VARCHAR);

        public final SqlColumn<String> ipAddress = column("ip_address", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> isAdmin = column("is_admin", JDBCType.BIT);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> postId = column("post_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> topPriority = column("top_priority", JDBCType.INTEGER);

        public final SqlColumn<String> userAgent = column("user_agent", JDBCType.VARCHAR);

        public Comments() {
            super("comments");
        }
    }
}