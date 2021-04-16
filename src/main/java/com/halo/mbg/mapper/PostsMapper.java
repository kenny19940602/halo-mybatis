package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.PostsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Posts;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PostsMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, type, createTime, updateTime, disallowComment, editTime, editorType, likes, metaDescription, metaKeywords, password, slug, status, template, thumbnail, title, topPriority, url, visits, wordCount, formatContent, originalContent, summary);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Posts> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PostsResult")
    Optional<Posts> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PostsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="disallow_comment", property="disallowComment", jdbcType=JdbcType.BIT),
        @Result(column="edit_time", property="editTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="editor_type", property="editorType", jdbcType=JdbcType.INTEGER),
        @Result(column="likes", property="likes", jdbcType=JdbcType.BIGINT),
        @Result(column="meta_description", property="metaDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="meta_keywords", property="metaKeywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="slug", property="slug", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="template", property="template", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumbnail", property="thumbnail", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="top_priority", property="topPriority", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="visits", property="visits", jdbcType=JdbcType.BIGINT),
        @Result(column="word_count", property="wordCount", jdbcType=JdbcType.BIGINT),
        @Result(column="format_content", property="formatContent", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="original_content", property="originalContent", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="summary", property="summary", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Posts> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, posts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, posts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Posts record) {
        return MyBatis3Utils.insert(this::insert, record, posts, c ->
            c.map(type).toProperty("type")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(disallowComment).toProperty("disallowComment")
            .map(editTime).toProperty("editTime")
            .map(editorType).toProperty("editorType")
            .map(likes).toProperty("likes")
            .map(metaDescription).toProperty("metaDescription")
            .map(metaKeywords).toProperty("metaKeywords")
            .map(password).toProperty("password")
            .map(slug).toProperty("slug")
            .map(status).toProperty("status")
            .map(template).toProperty("template")
            .map(thumbnail).toProperty("thumbnail")
            .map(title).toProperty("title")
            .map(topPriority).toProperty("topPriority")
            .map(url).toProperty("url")
            .map(visits).toProperty("visits")
            .map(wordCount).toProperty("wordCount")
            .map(formatContent).toProperty("formatContent")
            .map(originalContent).toProperty("originalContent")
            .map(summary).toProperty("summary")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Posts record) {
        return MyBatis3Utils.insert(this::insert, record, posts, c ->
            c.map(type).toPropertyWhenPresent("type", record::getType)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(disallowComment).toPropertyWhenPresent("disallowComment", record::getDisallowComment)
            .map(editTime).toPropertyWhenPresent("editTime", record::getEditTime)
            .map(editorType).toPropertyWhenPresent("editorType", record::getEditorType)
            .map(likes).toPropertyWhenPresent("likes", record::getLikes)
            .map(metaDescription).toPropertyWhenPresent("metaDescription", record::getMetaDescription)
            .map(metaKeywords).toPropertyWhenPresent("metaKeywords", record::getMetaKeywords)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(slug).toPropertyWhenPresent("slug", record::getSlug)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(template).toPropertyWhenPresent("template", record::getTemplate)
            .map(thumbnail).toPropertyWhenPresent("thumbnail", record::getThumbnail)
            .map(title).toPropertyWhenPresent("title", record::getTitle)
            .map(topPriority).toPropertyWhenPresent("topPriority", record::getTopPriority)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(visits).toPropertyWhenPresent("visits", record::getVisits)
            .map(wordCount).toPropertyWhenPresent("wordCount", record::getWordCount)
            .map(formatContent).toPropertyWhenPresent("formatContent", record::getFormatContent)
            .map(originalContent).toPropertyWhenPresent("originalContent", record::getOriginalContent)
            .map(summary).toPropertyWhenPresent("summary", record::getSummary)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Posts> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, posts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Posts> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, posts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Posts> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, posts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Posts> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, posts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Posts record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(type).equalTo(record::getType)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(disallowComment).equalTo(record::getDisallowComment)
                .set(editTime).equalTo(record::getEditTime)
                .set(editorType).equalTo(record::getEditorType)
                .set(likes).equalTo(record::getLikes)
                .set(metaDescription).equalTo(record::getMetaDescription)
                .set(metaKeywords).equalTo(record::getMetaKeywords)
                .set(password).equalTo(record::getPassword)
                .set(slug).equalTo(record::getSlug)
                .set(status).equalTo(record::getStatus)
                .set(template).equalTo(record::getTemplate)
                .set(thumbnail).equalTo(record::getThumbnail)
                .set(title).equalTo(record::getTitle)
                .set(topPriority).equalTo(record::getTopPriority)
                .set(url).equalTo(record::getUrl)
                .set(visits).equalTo(record::getVisits)
                .set(wordCount).equalTo(record::getWordCount)
                .set(formatContent).equalTo(record::getFormatContent)
                .set(originalContent).equalTo(record::getOriginalContent)
                .set(summary).equalTo(record::getSummary);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Posts record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(type).equalToWhenPresent(record::getType)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(disallowComment).equalToWhenPresent(record::getDisallowComment)
                .set(editTime).equalToWhenPresent(record::getEditTime)
                .set(editorType).equalToWhenPresent(record::getEditorType)
                .set(likes).equalToWhenPresent(record::getLikes)
                .set(metaDescription).equalToWhenPresent(record::getMetaDescription)
                .set(metaKeywords).equalToWhenPresent(record::getMetaKeywords)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(slug).equalToWhenPresent(record::getSlug)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(template).equalToWhenPresent(record::getTemplate)
                .set(thumbnail).equalToWhenPresent(record::getThumbnail)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(topPriority).equalToWhenPresent(record::getTopPriority)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(visits).equalToWhenPresent(record::getVisits)
                .set(wordCount).equalToWhenPresent(record::getWordCount)
                .set(formatContent).equalToWhenPresent(record::getFormatContent)
                .set(originalContent).equalToWhenPresent(record::getOriginalContent)
                .set(summary).equalToWhenPresent(record::getSummary);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Posts record) {
        return update(c ->
            c.set(type).equalTo(record::getType)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(disallowComment).equalTo(record::getDisallowComment)
            .set(editTime).equalTo(record::getEditTime)
            .set(editorType).equalTo(record::getEditorType)
            .set(likes).equalTo(record::getLikes)
            .set(metaDescription).equalTo(record::getMetaDescription)
            .set(metaKeywords).equalTo(record::getMetaKeywords)
            .set(password).equalTo(record::getPassword)
            .set(slug).equalTo(record::getSlug)
            .set(status).equalTo(record::getStatus)
            .set(template).equalTo(record::getTemplate)
            .set(thumbnail).equalTo(record::getThumbnail)
            .set(title).equalTo(record::getTitle)
            .set(topPriority).equalTo(record::getTopPriority)
            .set(url).equalTo(record::getUrl)
            .set(visits).equalTo(record::getVisits)
            .set(wordCount).equalTo(record::getWordCount)
            .set(formatContent).equalTo(record::getFormatContent)
            .set(originalContent).equalTo(record::getOriginalContent)
            .set(summary).equalTo(record::getSummary)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Posts record) {
        return update(c ->
            c.set(type).equalToWhenPresent(record::getType)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(disallowComment).equalToWhenPresent(record::getDisallowComment)
            .set(editTime).equalToWhenPresent(record::getEditTime)
            .set(editorType).equalToWhenPresent(record::getEditorType)
            .set(likes).equalToWhenPresent(record::getLikes)
            .set(metaDescription).equalToWhenPresent(record::getMetaDescription)
            .set(metaKeywords).equalToWhenPresent(record::getMetaKeywords)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(slug).equalToWhenPresent(record::getSlug)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(template).equalToWhenPresent(record::getTemplate)
            .set(thumbnail).equalToWhenPresent(record::getThumbnail)
            .set(title).equalToWhenPresent(record::getTitle)
            .set(topPriority).equalToWhenPresent(record::getTopPriority)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(visits).equalToWhenPresent(record::getVisits)
            .set(wordCount).equalToWhenPresent(record::getWordCount)
            .set(formatContent).equalToWhenPresent(record::getFormatContent)
            .set(originalContent).equalToWhenPresent(record::getOriginalContent)
            .set(summary).equalToWhenPresent(record::getSummary)
            .where(id, isEqualTo(record::getId))
        );
    }
}