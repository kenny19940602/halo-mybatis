package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PostCategoriesDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PostCategories postCategories = new PostCategories();

    public static final SqlColumn<Integer> id = postCategories.id;

    public static final SqlColumn<Date> createTime = postCategories.createTime;

    public static final SqlColumn<Date> updateTime = postCategories.updateTime;

    public static final SqlColumn<Integer> categoryId = postCategories.categoryId;

    public static final SqlColumn<Integer> postId = postCategories.postId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PostCategories extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> categoryId = column("category_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> postId = column("post_id", JDBCType.INTEGER);

        public PostCategories() {
            super("post_categories");
        }
    }
}