package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.MetasDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Metas;
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
public interface MetasMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, type, createTime, updateTime, metaKey, postId, metaValue);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<Metas> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MetasResult")
    Optional<Metas> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MetasResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meta_key", property="metaKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.INTEGER),
        @Result(column="meta_value", property="metaValue", jdbcType=JdbcType.VARCHAR)
    })
    List<Metas> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, metas, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, metas, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Metas record) {
        return MyBatis3Utils.insert(this::insert, record, metas, c ->
            c.map(type).toProperty("type")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(metaKey).toProperty("metaKey")
            .map(postId).toProperty("postId")
            .map(metaValue).toProperty("metaValue")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Metas record) {
        return MyBatis3Utils.insert(this::insert, record, metas, c ->
            c.map(type).toPropertyWhenPresent("type", record::getType)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(metaKey).toPropertyWhenPresent("metaKey", record::getMetaKey)
            .map(postId).toPropertyWhenPresent("postId", record::getPostId)
            .map(metaValue).toPropertyWhenPresent("metaValue", record::getMetaValue)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Metas> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, metas, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Metas> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, metas, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Metas> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, metas, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Metas> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, metas, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Metas record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(type).equalTo(record::getType)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(metaKey).equalTo(record::getMetaKey)
                .set(postId).equalTo(record::getPostId)
                .set(metaValue).equalTo(record::getMetaValue);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Metas record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(type).equalToWhenPresent(record::getType)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(metaKey).equalToWhenPresent(record::getMetaKey)
                .set(postId).equalToWhenPresent(record::getPostId)
                .set(metaValue).equalToWhenPresent(record::getMetaValue);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Metas record) {
        return update(c ->
            c.set(type).equalTo(record::getType)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(metaKey).equalTo(record::getMetaKey)
            .set(postId).equalTo(record::getPostId)
            .set(metaValue).equalTo(record::getMetaValue)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Metas record) {
        return update(c ->
            c.set(type).equalToWhenPresent(record::getType)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(metaKey).equalToWhenPresent(record::getMetaKey)
            .set(postId).equalToWhenPresent(record::getPostId)
            .set(metaValue).equalToWhenPresent(record::getMetaValue)
            .where(id, isEqualTo(record::getId))
        );
    }
}