package com.halo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Photos implements Serializable {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String description;

    private String location;

    private String name;

    private Date takeTime;

    private String team;

    private String thumbnail;

    private String url;

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
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLocation() {
        return location;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLocation(String location) {
        this.location = location;
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
    public Date getTakeTime() {
        return takeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTakeTime(Date takeTime) {
        this.takeTime = takeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTeam() {
        return team;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTeam(String team) {
        this.team = team;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getThumbnail() {
        return thumbnail;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUrl() {
        return url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUrl(String url) {
        this.url = url;
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
        sb.append(", description=").append(description);
        sb.append(", location=").append(location);
        sb.append(", name=").append(name);
        sb.append(", takeTime=").append(takeTime);
        sb.append(", team=").append(team);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}