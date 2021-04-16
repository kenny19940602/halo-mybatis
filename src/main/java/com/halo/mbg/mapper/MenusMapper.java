package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.MenusDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Menus;
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
public interface MenusMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, createTime, updateTime, icon, name, parentId, priority, target, team, url);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Menus> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MenusResult")
    Optional<Menus> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MenusResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="target", property="target", jdbcType=JdbcType.VARCHAR),
        @Result(column="team", property="team", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    List<Menus> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, menus, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, menus, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Menus record) {
        return MyBatis3Utils.insert(this::insert, record, menus, c ->
            c.map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(icon).toProperty("icon")
            .map(name).toProperty("name")
            .map(parentId).toProperty("parentId")
            .map(priority).toProperty("priority")
            .map(target).toProperty("target")
            .map(team).toProperty("team")
            .map(url).toProperty("url")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Menus record) {
        return MyBatis3Utils.insert(this::insert, record, menus, c ->
            c.map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(icon).toPropertyWhenPresent("icon", record::getIcon)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(priority).toPropertyWhenPresent("priority", record::getPriority)
            .map(target).toPropertyWhenPresent("target", record::getTarget)
            .map(team).toPropertyWhenPresent("team", record::getTeam)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Menus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, menus, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Menus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, menus, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Menus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, menus, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Menus> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, menus, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Menus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(icon).equalTo(record::getIcon)
                .set(name).equalTo(record::getName)
                .set(parentId).equalTo(record::getParentId)
                .set(priority).equalTo(record::getPriority)
                .set(target).equalTo(record::getTarget)
                .set(team).equalTo(record::getTeam)
                .set(url).equalTo(record::getUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Menus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(priority).equalToWhenPresent(record::getPriority)
                .set(target).equalToWhenPresent(record::getTarget)
                .set(team).equalToWhenPresent(record::getTeam)
                .set(url).equalToWhenPresent(record::getUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Menus record) {
        return update(c ->
            c.set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(icon).equalTo(record::getIcon)
            .set(name).equalTo(record::getName)
            .set(parentId).equalTo(record::getParentId)
            .set(priority).equalTo(record::getPriority)
            .set(target).equalTo(record::getTarget)
            .set(team).equalTo(record::getTeam)
            .set(url).equalTo(record::getUrl)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Menus record) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(icon).equalToWhenPresent(record::getIcon)
            .set(name).equalToWhenPresent(record::getName)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(priority).equalToWhenPresent(record::getPriority)
            .set(target).equalToWhenPresent(record::getTarget)
            .set(team).equalToWhenPresent(record::getTeam)
            .set(url).equalToWhenPresent(record::getUrl)
            .where(id, isEqualTo(record::getId))
        );
    }
}