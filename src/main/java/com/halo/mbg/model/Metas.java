package com.halo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Metas implements Serializable {
    private Long id;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private String metaKey;

    private Integer postId;

    private String metaValue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
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
    public String getMetaKey() {
        return metaKey;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPostId() {
        return postId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMetaValue() {
        return metaValue;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", metaKey=").append(metaKey);
        sb.append(", postId=").append(postId);
        sb.append(", metaValue=").append(metaValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}