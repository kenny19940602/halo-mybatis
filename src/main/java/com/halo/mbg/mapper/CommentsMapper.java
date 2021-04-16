package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.CommentsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Comments;
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
public interface CommentsMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, type, createTime, updateTime, allowNotification, author, authorUrl, content, email, gravatarMd5, ipAddress, isAdmin, parentId, postId, status, topPriority, userAgent);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<Comments> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CommentsResult")
    Optional<Comments> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CommentsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="allow_notification", property="allowNotification", jdbcType=JdbcType.BIT),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="author_url", property="authorUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="gravatar_md5", property="gravatarMd5", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip_address", property="ipAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_admin", property="isAdmin", jdbcType=JdbcType.BIT),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="top_priority", property="topPriority", jdbcType=JdbcType.INTEGER),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR)
    })
    List<Comments> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, comments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, comments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Comments record) {
        return MyBatis3Utils.insert(this::insert, record, comments, c ->
            c.map(type).toProperty("type")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(allowNotification).toProperty("allowNotification")
            .map(author).toProperty("author")
            .map(authorUrl).toProperty("authorUrl")
            .map(content).toProperty("content")
            .map(email).toProperty("email")
            .map(gravatarMd5).toProperty("gravatarMd5")
            .map(ipAddress).toProperty("ipAddress")
            .map(isAdmin).toProperty("isAdmin")
            .map(parentId).toProperty("parentId")
            .map(postId).toProperty("postId")
            .map(status).toProperty("status")
            .map(topPriority).toProperty("topPriority")
            .map(userAgent).toProperty("userAgent")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Comments record) {
        return MyBatis3Utils.insert(this::insert, record, comments, c ->
            c.map(type).toPropertyWhenPresent("type", record::getType)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(allowNotification).toPropertyWhenPresent("allowNotification", record::getAllowNotification)
            .map(author).toPropertyWhenPresent("author", record::getAuthor)
            .map(authorUrl).toPropertyWhenPresent("authorUrl", record::getAuthorUrl)
            .map(content).toPropertyWhenPresent("content", record::getContent)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(gravatarMd5).toPropertyWhenPresent("gravatarMd5", record::getGravatarMd5)
            .map(ipAddress).toPropertyWhenPresent("ipAddress", record::getIpAddress)
            .map(isAdmin).toPropertyWhenPresent("isAdmin", record::getIsAdmin)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(postId).toPropertyWhenPresent("postId", record::getPostId)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(topPriority).toPropertyWhenPresent("topPriority", record::getTopPriority)
            .map(userAgent).toPropertyWhenPresent("userAgent", record::getUserAgent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Comments> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, comments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Comments> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, comments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Comments> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, comments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Comments> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, comments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Comments record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(type).equalTo(record::getType)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(allowNotification).equalTo(record::getAllowNotification)
                .set(author).equalTo(record::getAuthor)
                .set(authorUrl).equalTo(record::getAuthorUrl)
                .set(content).equalTo(record::getContent)
                .set(email).equalTo(record::getEmail)
                .set(gravatarMd5).equalTo(record::getGravatarMd5)
                .set(ipAddress).equalTo(record::getIpAddress)
                .set(isAdmin).equalTo(record::getIsAdmin)
                .set(parentId).equalTo(record::getParentId)
                .set(postId).equalTo(record::getPostId)
                .set(status).equalTo(record::getStatus)
                .set(topPriority).equalTo(record::getTopPriority)
                .set(userAgent).equalTo(record::getUserAgent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Comments record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(type).equalToWhenPresent(record::getType)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(allowNotification).equalToWhenPresent(record::getAllowNotification)
                .set(author).equalToWhenPresent(record::getAuthor)
                .set(authorUrl).equalToWhenPresent(record::getAuthorUrl)
                .set(content).equalToWhenPresent(record::getContent)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(gravatarMd5).equalToWhenPresent(record::getGravatarMd5)
                .set(ipAddress).equalToWhenPresent(record::getIpAddress)
                .set(isAdmin).equalToWhenPresent(record::getIsAdmin)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(postId).equalToWhenPresent(record::getPostId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(topPriority).equalToWhenPresent(record::getTopPriority)
                .set(userAgent).equalToWhenPresent(record::getUserAgent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Comments record) {
        return update(c ->
            c.set(type).equalTo(record::getType)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(allowNotification).equalTo(record::getAllowNotification)
            .set(author).equalTo(record::getAuthor)
            .set(authorUrl).equalTo(record::getAuthorUrl)
            .set(content).equalTo(record::getContent)
            .set(email).equalTo(record::getEmail)
            .set(gravatarMd5).equalTo(record::getGravatarMd5)
            .set(ipAddress).equalTo(record::getIpAddress)
            .set(isAdmin).equalTo(record::getIsAdmin)
            .set(parentId).equalTo(record::getParentId)
            .set(postId).equalTo(record::getPostId)
            .set(status).equalTo(record::getStatus)
            .set(topPriority).equalTo(record::getTopPriority)
            .set(userAgent).equalTo(record::getUserAgent)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Comments record) {
        return update(c ->
            c.set(type).equalToWhenPresent(record::getType)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(allowNotification).equalToWhenPresent(record::getAllowNotification)
            .set(author).equalToWhenPresent(record::getAuthor)
            .set(authorUrl).equalToWhenPresent(record::getAuthorUrl)
            .set(content).equalToWhenPresent(record::getContent)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(gravatarMd5).equalToWhenPresent(record::getGravatarMd5)
            .set(ipAddress).equalToWhenPresent(record::getIpAddress)
            .set(isAdmin).equalToWhenPresent(record::getIsAdmin)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(postId).equalToWhenPresent(record::getPostId)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(topPriority).equalToWhenPresent(record::getTopPriority)
            .set(userAgent).equalToWhenPresent(record::getUserAgent)
            .where(id, isEqualTo(record::getId))
        );
    }
}