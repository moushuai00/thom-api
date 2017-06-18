package com.thom.vo;

import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

/**
 * Created by ThinkPad on 2017/4/16.
 */
public class ProjectAddVO {
    private String name;

    private String description;

    private String accessType;

    private String groupId;

    private List<String> members;

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    @NotBlank(message="项目名称不能为空")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message="项目描述不能为空")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotBlank(message="归属团队不能为空")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
