package com.halo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ThemeSettings implements Serializable {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String settingKey;

    private String themeId;

    private String settingValue;

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
    public String getSettingKey() {
        return settingKey;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getThemeId() {
        return themeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSettingValue() {
        return settingValue;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
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
        sb.append(", settingKey=").append(settingKey);
        sb.append(", themeId=").append(themeId);
        sb.append(", settingValue=").append(settingValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}