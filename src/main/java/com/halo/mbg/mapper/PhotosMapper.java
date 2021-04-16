package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.PhotosDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Photos;
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
public interface PhotosMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, createTime, updateTime, description, location, name, takeTime, team, thumbnail, url);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Photos> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PhotosResult")
    Optional<Photos> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PhotosResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="take_time", property="takeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="team", property="team", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumbnail", property="thumbnail", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    List<Photos> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, photos, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, photos, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Photos record) {
        return MyBatis3Utils.insert(this::insert, record, photos, c ->
            c.map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(description).toProperty("description")
            .map(location).toProperty("location")
            .map(name).toProperty("name")
            .map(takeTime).toProperty("takeTime")
            .map(team).toProperty("team")
            .map(thumbnail).toProperty("thumbnail")
            .map(url).toProperty("url")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Photos record) {
        return MyBatis3Utils.insert(this::insert, record, photos, c ->
            c.map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(location).toPropertyWhenPresent("location", record::getLocation)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(takeTime).toPropertyWhenPresent("takeTime", record::getTakeTime)
            .map(team).toPropertyWhenPresent("team", record::getTeam)
            .map(thumbnail).toPropertyWhenPresent("thumbnail", record::getThumbnail)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Photos> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, photos, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Photos> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, photos, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Photos> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, photos, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Photos> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, photos, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Photos record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(description).equalTo(record::getDescription)
                .set(location).equalTo(record::getLocation)
                .set(name).equalTo(record::getName)
                .set(takeTime).equalTo(record::getTakeTime)
                .set(team).equalTo(record::getTeam)
                .set(thumbnail).equalTo(record::getThumbnail)
                .set(url).equalTo(record::getUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Photos record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(location).equalToWhenPresent(record::getLocation)
                .set(name).equalToWhenPresent(record::getName)
                .set(takeTime).equalToWhenPresent(record::getTakeTime)
                .set(team).equalToWhenPresent(record::getTeam)
                .set(thumbnail).equalToWhenPresent(record::getThumbnail)
                .set(url).equalToWhenPresent(record::getUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Photos record) {
        return update(c ->
            c.set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(description).equalTo(record::getDescription)
            .set(location).equalTo(record::getLocation)
            .set(name).equalTo(record::getName)
            .set(takeTime).equalTo(record::getTakeTime)
            .set(team).equalTo(record::getTeam)
            .set(thumbnail).equalTo(record::getThumbnail)
            .set(url).equalTo(record::getUrl)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Photos record) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(location).equalToWhenPresent(record::getLocation)
            .set(name).equalToWhenPresent(record::getName)
            .set(takeTime).equalToWhenPresent(record::getTakeTime)
            .set(team).equalToWhenPresent(record::getTeam)
            .set(thumbnail).equalToWhenPresent(record::getThumbnail)
            .set(url).equalToWhenPresent(record::getUrl)
            .where(id, isEqualTo(record::getId))
        );
    }
}