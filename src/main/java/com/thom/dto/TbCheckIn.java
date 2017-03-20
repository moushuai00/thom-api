package com.thom.dto;

import java.util.Date;

public class TbCheckIn {
    private Integer id;

    private Date createDate;

    private String tag;

    private Integer userId;

    private Integer projectId;

    private String version;

    private Integer workspaceMode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getWorkspaceMode() {
        return workspaceMode;
    }

    public void setWorkspaceMode(Integer workspaceMode) {
        this.workspaceMode = workspaceMode;
    }
}