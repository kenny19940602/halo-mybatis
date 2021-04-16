package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PostsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Posts posts = new Posts();

    public static final SqlColumn<Integer> id = posts.id;

    public static final SqlColumn<Integer> type = posts.type;

    public static final SqlColumn<Date> createTime = posts.createTime;

    public static final SqlColumn<Date> updateTime = posts.updateTime;

    public static final SqlColumn<Boolean> disallowComment = posts.disallowComment;

    public static final SqlColumn<Date> editTime = posts.editTime;

    public static final SqlColumn<Integer> editorType = posts.editorType;

    public static final SqlColumn<Long> likes = posts.likes;

    public static final SqlColumn<String> metaDescription = posts.metaDescription;

    public static final SqlColumn<String> metaKeywords = posts.metaKeywords;

    public static final SqlColumn<String> password = posts.password;

    public static final SqlColumn<String> slug = posts.slug;

    public static final SqlColumn<Integer> status = posts.status;

    public static final SqlColumn<String> template = posts.template;

    public static final SqlColumn<String> thumbnail = posts.thumbnail;

    public static final SqlColumn<String> title = posts.title;

    public static final SqlColumn<Integer> topPriority = posts.topPriority;

    public static final SqlColumn<String> url = posts.url;

    public static final SqlColumn<Long> visits = posts.visits;

    public static final SqlColumn<Long> wordCount = posts.wordCount;

    public static final SqlColumn<String> formatContent = posts.formatContent;

    public static final SqlColumn<String> originalContent = posts.originalContent;

    public static final SqlColumn<String> summary = posts.summary;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Posts extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> disallowComment = column("disallow_comment", JDBCType.BIT);

        public final SqlColumn<Date> editTime = column("edit_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> editorType = column("editor_type", JDBCType.INTEGER);

        public final SqlColumn<Long> likes = column("likes", JDBCType.BIGINT);

        public final SqlColumn<String> metaDescription = column("meta_description", JDBCType.VARCHAR);

        public final SqlColumn<String> metaKeywords = column("meta_keywords", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> slug = column("slug", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<String> template = column("template", JDBCType.VARCHAR);

        public final SqlColumn<String> thumbnail = column("thumbnail", JDBCType.VARCHAR);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> topPriority = column("top_priority", JDBCType.INTEGER);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<Long> visits = column("visits", JDBCType.BIGINT);

        public final SqlColumn<Long> wordCount = column("word_count", JDBCType.BIGINT);

        public final SqlColumn<String> formatContent = column("format_content", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> originalContent = column("original_content", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> summary = column("summary", JDBCType.LONGVARCHAR);

        public Posts() {
            super("posts");
        }
    }
}