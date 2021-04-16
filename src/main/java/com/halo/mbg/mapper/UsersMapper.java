package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.UsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Users;
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
public interface UsersMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, createTime, updateTime, avatar, description, email, expireTime, mfaKey, mfaType, nickname, password, username);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Users> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UsersResult")
    Optional<Users> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UsersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="mfa_key", property="mfaKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="mfa_type", property="mfaType", jdbcType=JdbcType.INTEGER),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<Users> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, users, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, users, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Users record) {
        return MyBatis3Utils.insert(this::insert, record, users, c ->
            c.map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(avatar).toProperty("avatar")
            .map(description).toProperty("description")
            .map(email).toProperty("email")
            .map(expireTime).toProperty("expireTime")
            .map(mfaKey).toProperty("mfaKey")
            .map(mfaType).toProperty("mfaType")
            .map(nickname).toProperty("nickname")
            .map(password).toProperty("password")
            .map(username).toProperty("username")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Users record) {
        return MyBatis3Utils.insert(this::insert, record, users, c ->
            c.map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(avatar).toPropertyWhenPresent("avatar", record::getAvatar)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(expireTime).toPropertyWhenPresent("expireTime", record::getExpireTime)
            .map(mfaKey).toPropertyWhenPresent("mfaKey", record::getMfaKey)
            .map(mfaType).toPropertyWhenPresent("mfaType", record::getMfaType)
            .map(nickname).toPropertyWhenPresent("nickname", record::getNickname)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Users> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, users, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Users> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, users, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Users> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, users, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Users> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, users, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Users record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(avatar).equalTo(record::getAvatar)
                .set(description).equalTo(record::getDescription)
                .set(email).equalTo(record::getEmail)
                .set(expireTime).equalTo(record::getExpireTime)
                .set(mfaKey).equalTo(record::getMfaKey)
                .set(mfaType).equalTo(record::getMfaType)
                .set(nickname).equalTo(record::getNickname)
                .set(password).equalTo(record::getPassword)
                .set(username).equalTo(record::getUsername);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Users record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(avatar).equalToWhenPresent(record::getAvatar)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(expireTime).equalToWhenPresent(record::getExpireTime)
                .set(mfaKey).equalToWhenPresent(record::getMfaKey)
                .set(mfaType).equalToWhenPresent(record::getMfaType)
                .set(nickname).equalToWhenPresent(record::getNickname)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(username).equalToWhenPresent(record::getUsername);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Users record) {
        return update(c ->
            c.set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(avatar).equalTo(record::getAvatar)
            .set(description).equalTo(record::getDescription)
            .set(email).equalTo(record::getEmail)
            .set(expireTime).equalTo(record::getExpireTime)
            .set(mfaKey).equalTo(record::getMfaKey)
            .set(mfaType).equalTo(record::getMfaType)
            .set(nickname).equalTo(record::getNickname)
            .set(password).equalTo(record::getPassword)
            .set(username).equalTo(record::getUsername)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Users record) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(avatar).equalToWhenPresent(record::getAvatar)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(expireTime).equalToWhenPresent(record::getExpireTime)
            .set(mfaKey).equalToWhenPresent(record::getMfaKey)
            .set(mfaType).equalToWhenPresent(record::getMfaType)
            .set(nickname).equalToWhenPresent(record::getNickname)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(username).equalToWhenPresent(record::getUsername)
            .where(id, isEqualTo(record::getId))
        );
    }
}