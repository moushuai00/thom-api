package com.thom.dto;

import java.util.Date;

public class TbProject {
    private Integer id;

    private String version;

    private String name;

    private Date createDate;

    private Integer userId;

    private Integer workspaceMode;

    private Integer stage;

    private Integer groupId;

    private String relatedIds;

    private Date updateTime;

    private Integer mockNum;

    private Byte accessType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWorkspaceMode() {
        return workspaceMode;
    }

    public void setWorkspaceMode(Integer workspaceMode) {
        this.workspaceMode = workspaceMode;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getRelatedIds() {
        return relatedIds;
    }

    public void setRelatedIds(String relatedIds) {
        this.relatedIds = relatedIds == null ? null : relatedIds.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getMockNum() {
        return mockNum;
    }

    public void setMockNum(Integer mockNum) {
        this.mockNum = mockNum;
    }

    public Byte getAccessType() {
        return accessType;
    }

    public void setAccessType(Byte accessType) {
        this.accessType = accessType;
    }
}