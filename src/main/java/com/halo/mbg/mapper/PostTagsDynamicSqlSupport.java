package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PostTagsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PostTags postTags = new PostTags();

    public static final SqlColumn<Integer> id = postTags.id;

    public static final SqlColumn<Date> createTime = postTags.createTime;

    public static final SqlColumn<Date> updateTime = postTags.updateTime;

    public static final SqlColumn<Integer> postId = postTags.postId;

    public static final SqlColumn<Integer> tagId = postTags.tagId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PostTags extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> postId = column("post_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> tagId = column("tag_id", JDBCType.INTEGER);

        public PostTags() {
            super("post_tags");
        }
    }
}