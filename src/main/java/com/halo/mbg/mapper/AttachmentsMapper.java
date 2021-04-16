package com.halo.mbg.mapper;

import static com.halo.mbg.mapper.AttachmentsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.halo.mbg.model.Attachments;
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
public interface AttachmentsMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, createTime, updateTime, fileKey, height, mediaType, name, path, size, suffix, thumbPath, type, width);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Attachments> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AttachmentsResult")
    Optional<Attachments> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AttachmentsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="file_key", property="fileKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="height", property="height", jdbcType=JdbcType.INTEGER),
        @Result(column="media_type", property="mediaType", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.BIGINT),
        @Result(column="suffix", property="suffix", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumb_path", property="thumbPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="width", property="width", jdbcType=JdbcType.INTEGER)
    })
    List<Attachments> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, attachments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, attachments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Attachments record) {
        return MyBatis3Utils.insert(this::insert, record, attachments, c ->
            c.map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(fileKey).toProperty("fileKey")
            .map(height).toProperty("height")
            .map(mediaType).toProperty("mediaType")
            .map(name).toProperty("name")
            .map(path).toProperty("path")
            .map(size).toProperty("size")
            .map(suffix).toProperty("suffix")
            .map(thumbPath).toProperty("thumbPath")
            .map(type).toProperty("type")
            .map(width).toProperty("width")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Attachments record) {
        return MyBatis3Utils.insert(this::insert, record, attachments, c ->
            c.map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(fileKey).toPropertyWhenPresent("fileKey", record::getFileKey)
            .map(height).toPropertyWhenPresent("height", record::getHeight)
            .map(mediaType).toPropertyWhenPresent("mediaType", record::getMediaType)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(path).toPropertyWhenPresent("path", record::getPath)
            .map(size).toPropertyWhenPresent("size", record::getSize)
            .map(suffix).toPropertyWhenPresent("suffix", record::getSuffix)
            .map(thumbPath).toPropertyWhenPresent("thumbPath", record::getThumbPath)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(width).toPropertyWhenPresent("width", record::getWidth)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Attachments> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, attachments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Attachments> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, attachments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Attachments> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, attachments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Attachments> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, attachments, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Attachments record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(fileKey).equalTo(record::getFileKey)
                .set(height).equalTo(record::getHeight)
                .set(mediaType).equalTo(record::getMediaType)
                .set(name).equalTo(record::getName)
                .set(path).equalTo(record::getPath)
                .set(size).equalTo(record::getSize)
                .set(suffix).equalTo(record::getSuffix)
                .set(thumbPath).equalTo(record::getThumbPath)
                .set(type).equalTo(record::getType)
                .set(width).equalTo(record::getWidth);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Attachments record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(fileKey).equalToWhenPresent(record::getFileKey)
                .set(height).equalToWhenPresent(record::getHeight)
                .set(mediaType).equalToWhenPresent(record::getMediaType)
                .set(name).equalToWhenPresent(record::getName)
                .set(path).equalToWhenPresent(record::getPath)
                .set(size).equalToWhenPresent(record::getSize)
                .set(suffix).equalToWhenPresent(record::getSuffix)
                .set(thumbPath).equalToWhenPresent(record::getThumbPath)
                .set(type).equalToWhenPresent(record::getType)
                .set(width).equalToWhenPresent(record::getWidth);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Attachments record) {
        return update(c ->
            c.set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(fileKey).equalTo(record::getFileKey)
            .set(height).equalTo(record::getHeight)
            .set(mediaType).equalTo(record::getMediaType)
            .set(name).equalTo(record::getName)
            .set(path).equalTo(record::getPath)
            .set(size).equalTo(record::getSize)
            .set(suffix).equalTo(record::getSuffix)
            .set(thumbPath).equalTo(record::getThumbPath)
            .set(type).equalTo(record::getType)
            .set(width).equalTo(record::getWidth)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Attachments record) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(fileKey).equalToWhenPresent(record::getFileKey)
            .set(height).equalToWhenPresent(record::getHeight)
            .set(mediaType).equalToWhenPresent(record::getMediaType)
            .set(name).equalToWhenPresent(record::getName)
            .set(path).equalToWhenPresent(record::getPath)
            .set(size).equalToWhenPresent(record::getSize)
            .set(suffix).equalToWhenPresent(record::getSuffix)
            .set(thumbPath).equalToWhenPresent(record::getThumbPath)
            .set(type).equalToWhenPresent(record::getType)
            .set(width).equalToWhenPresent(record::getWidth)
            .where(id, isEqualTo(record::getId))
        );
    }
}