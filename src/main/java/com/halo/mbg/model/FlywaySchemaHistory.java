package com.halo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class FlywaySchemaHistory implements Serializable {
    private Integer installedRank;

    private String version;

    private String description;

    private String type;

    private String script;

    private Integer checksum;

    private String installedBy;

    private Date installedOn;

    private Integer executionTime;

    private Boolean success;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getInstalledRank() {
        return installedRank;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVersion() {
        return version;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVersion(String version) {
        this.version = version;
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
    public String getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(String type) {
        this.type = type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getScript() {
        return script;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setScript(String script) {
        this.script = script;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getChecksum() {
        return checksum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getInstalledBy() {
        return installedBy;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getInstalledOn() {
        return installedOn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInstalledOn(Date installedOn) {
        this.installedOn = installedOn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getExecutionTime() {
        return executionTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Boolean getSuccess() {
        return success;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", installedRank=").append(installedRank);
        sb.append(", version=").append(version);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", script=").append(script);
        sb.append(", checksum=").append(checksum);
        sb.append(", installedBy=").append(installedBy);
        sb.append(", installedOn=").append(installedOn);
        sb.append(", executionTime=").append(executionTime);
        sb.append(", success=").append(success);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}