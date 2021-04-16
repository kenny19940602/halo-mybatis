package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AttachmentsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Attachments attachments = new Attachments();

    public static final SqlColumn<Integer> id = attachments.id;

    public static final SqlColumn<Date> createTime = attachments.createTime;

    public static final SqlColumn<Date> updateTime = attachments.updateTime;

    public static final SqlColumn<String> fileKey = attachments.fileKey;

    public static final SqlColumn<Integer> height = attachments.height;

    public static final SqlColumn<String> mediaType = attachments.mediaType;

    public static final SqlColumn<String> name = attachments.name;

    public static final SqlColumn<String> path = attachments.path;

    public static final SqlColumn<Long> size = attachments.size;

    public static final SqlColumn<String> suffix = attachments.suffix;

    public static final SqlColumn<String> thumbPath = attachments.thumbPath;

    public static final SqlColumn<Integer> type = attachments.type;

    public static final SqlColumn<Integer> width = attachments.width;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Attachments extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> fileKey = column("file_key", JDBCType.VARCHAR);

        public final SqlColumn<Integer> height = column("height", JDBCType.INTEGER);

        public final SqlColumn<String> mediaType = column("media_type", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);

        public final SqlColumn<Long> size = column("size", JDBCType.BIGINT);

        public final SqlColumn<String> suffix = column("suffix", JDBCType.VARCHAR);

        public final SqlColumn<String> thumbPath = column("thumb_path", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<Integer> width = column("width", JDBCType.INTEGER);

        public Attachments() {
            super("attachments");
        }
    }
}