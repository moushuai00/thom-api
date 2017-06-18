package com.thom.dto;

import com.thom.vo.GroupAddVO;
import com.thom.vo.ProjectAddVO;

import java.time.LocalDateTime;

/**
 * Created by ThinkPad on 2017/4/16.
 */
public class LuProject {

    public LuProject() {
    }

    public LuProject(ProjectAddVO projectAddVO) {
        this.name = projectAddVO.getName();
        this.description = projectAddVO.getDescription();
        this.groupId = Long.valueOf(projectAddVO.getGroupId());

        if ("on".equals(projectAddVO.getAccessType())) {
            this.accessType = "10"; //公开
        } else {
            this.accessType = "0"; //私有
        }
    }

    private Long id;
    private String version;
    private String name;
    private String description;
    private String accessType;
    private LocalDateTime createDate;
    private LocalDateTime updateTime;
    private Long userId;
    private String userName;
    private Long groupId;
    private String groupName;
    private Long mockNum;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getMockNum() {
        return mockNum;
    }

    public void setMockNum(Long mockNum) {
        this.mockNum = mockNum;
    }
}
