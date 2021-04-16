package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.CategoriesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Categories;
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
public interface CategoriesMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, createTime, updateTime, description, name, parentId, password, slug, slugName, thumbnail);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Categories> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CategoriesResult")
    Optional<Categories> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CategoriesResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="slug", property="slug", jdbcType=JdbcType.VARCHAR),
        @Result(column="slug_name", property="slugName", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumbnail", property="thumbnail", jdbcType=JdbcType.VARCHAR)
    })
    List<Categories> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, categories, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, categories, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Categories record) {
        return MyBatis3Utils.insert(this::insert, record, categories, c ->
            c.map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(description).toProperty("description")
            .map(name).toProperty("name")
            .map(parentId).toProperty("parentId")
            .map(password).toProperty("password")
            .map(slug).toProperty("slug")
            .map(slugName).toProperty("slugName")
            .map(thumbnail).toProperty("thumbnail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Categories record) {
        return MyBatis3Utils.insert(this::insert, record, categories, c ->
            c.map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(slug).toPropertyWhenPresent("slug", record::getSlug)
            .map(slugName).toPropertyWhenPresent("slugName", record::getSlugName)
            .map(thumbnail).toPropertyWhenPresent("thumbnail", record::getThumbnail)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Categories> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, categories, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Categories> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, categories, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Categories> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, categories, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Categories> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, categories, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Categories record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(description).equalTo(record::getDescription)
                .set(name).equalTo(record::getName)
                .set(parentId).equalTo(record::getParentId)
                .set(password).equalTo(record::getPassword)
                .set(slug).equalTo(record::getSlug)
                .set(slugName).equalTo(record::getSlugName)
                .set(thumbnail).equalTo(record::getThumbnail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Categories record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(slug).equalToWhenPresent(record::getSlug)
                .set(slugName).equalToWhenPresent(record::getSlugName)
                .set(thumbnail).equalToWhenPresent(record::getThumbnail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Categories record) {
        return update(c ->
            c.set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(description).equalTo(record::getDescription)
            .set(name).equalTo(record::getName)
            .set(parentId).equalTo(record::getParentId)
            .set(password).equalTo(record::getPassword)
            .set(slug).equalTo(record::getSlug)
            .set(slugName).equalTo(record::getSlugName)
            .set(thumbnail).equalTo(record::getThumbnail)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Categories record) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(name).equalToWhenPresent(record::getName)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(slug).equalToWhenPresent(record::getSlug)
            .set(slugName).equalToWhenPresent(record::getSlugName)
            .set(thumbnail).equalToWhenPresent(record::getThumbnail)
            .where(id, isEqualTo(record::getId))
        );
    }
}