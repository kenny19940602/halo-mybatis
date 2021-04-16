package com.halo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Comments implements Serializable {
    private Long id;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Boolean allowNotification;

    private String author;

    private String authorUrl;

    private String content;

    private String email;

    private String gravatarMd5;

    private String ipAddress;

    private Boolean isAdmin;

    private Long parentId;

    private Integer postId;

    private Integer status;

    private Integer topPriority;

    private String userAgent;

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
    public Boolean getAllowNotification() {
        return allowNotification;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAllowNotification(Boolean allowNotification) {
        this.allowNotification = allowNotification;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAuthor() {
        return author;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAuthor(String author) {
        this.author = author;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAuthorUrl() {
        return authorUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContent() {
        return content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContent(String content) {
        this.content = content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmail() {
        return email;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGravatarMd5() {
        return gravatarMd5;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGravatarMd5(String gravatarMd5) {
        this.gravatarMd5 = gravatarMd5;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIpAddress() {
        return ipAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getParentId() {
        return parentId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getTopPriority() {
        return topPriority;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTopPriority(Integer topPriority) {
        this.topPriority = topPriority;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserAgent() {
        return userAgent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
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
        sb.append(", allowNotification=").append(allowNotification);
        sb.append(", author=").append(author);
        sb.append(", authorUrl=").append(authorUrl);
        sb.append(", content=").append(content);
        sb.append(", email=").append(email);
        sb.append(", gravatarMd5=").append(gravatarMd5);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", parentId=").append(parentId);
        sb.append(", postId=").append(postId);
        sb.append(", status=").append(status);
        sb.append(", topPriority=").append(topPriority);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}