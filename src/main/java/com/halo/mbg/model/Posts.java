package com.halo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Posts implements Serializable {
    private Integer id;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Boolean disallowComment;

    private Date editTime;

    private Integer editorType;

    private Long likes;

    private String metaDescription;

    private String metaKeywords;

    private String password;

    private String slug;

    private Integer status;

    private String template;

    private String thumbnail;

    private String title;

    private Integer topPriority;

    private String url;

    private Long visits;

    private Long wordCount;

    private String formatContent;

    private String originalContent;

    private String summary;

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
    public Boolean getDisallowComment() {
        return disallowComment;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDisallowComment(Boolean disallowComment) {
        this.disallowComment = disallowComment;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getEditTime() {
        return editTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getEditorType() {
        return editorType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEditorType(Integer editorType) {
        this.editorType = editorType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getLikes() {
        return likes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLikes(Long likes) {
        this.likes = likes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMetaDescription() {
        return metaDescription;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMetaKeywords() {
        return metaKeywords;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPassword() {
        return password;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSlug() {
        return slug;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSlug(String slug) {
        this.slug = slug;
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
    public String getTemplate() {
        return template;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTemplate(String template) {
        this.template = template;
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
    public String getTitle() {
        return title;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTitle(String title) {
        this.title = title;
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
    public String getUrl() {
        return url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getVisits() {
        return visits;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVisits(Long visits) {
        this.visits = visits;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getWordCount() {
        return wordCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getFormatContent() {
        return formatContent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFormatContent(String formatContent) {
        this.formatContent = formatContent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOriginalContent() {
        return originalContent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSummary() {
        return summary;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSummary(String summary) {
        this.summary = summary;
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
        sb.append(", disallowComment=").append(disallowComment);
        sb.append(", editTime=").append(editTime);
        sb.append(", editorType=").append(editorType);
        sb.append(", likes=").append(likes);
        sb.append(", metaDescription=").append(metaDescription);
        sb.append(", metaKeywords=").append(metaKeywords);
        sb.append(", password=").append(password);
        sb.append(", slug=").append(slug);
        sb.append(", status=").append(status);
        sb.append(", template=").append(template);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", title=").append(title);
        sb.append(", topPriority=").append(topPriority);
        sb.append(", url=").append(url);
        sb.append(", visits=").append(visits);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", formatContent=").append(formatContent);
        sb.append(", originalContent=").append(originalContent);
        sb.append(", summary=").append(summary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}