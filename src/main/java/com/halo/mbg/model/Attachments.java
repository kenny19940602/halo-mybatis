package com.halo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Attachments implements Serializable {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String fileKey;

    private Integer height;

    private String mediaType;

    private String name;

    private String path;

    private Long size;

    private String suffix;

    private String thumbPath;

    private Integer type;

    private Integer width;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getFileKey() {
        return fileKey;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHeight() {
        return height;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMediaType() {
        return mediaType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPath() {
        return path;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getSize() {
        return size;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSize(Long size) {
        this.size = size;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSuffix() {
        return suffix;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getThumbPath() {
        return thumbPath;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setThumbPath(String thumbPath) {
        this.thumbPath = thumbPath;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getWidth() {
        return width;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", fileKey=").append(fileKey);
        sb.append(", height=").append(height);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", size=").append(size);
        sb.append(", suffix=").append(suffix);
        sb.append(", thumbPath=").append(thumbPath);
        sb.append(", type=").append(type);
        sb.append(", width=").append(width);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}