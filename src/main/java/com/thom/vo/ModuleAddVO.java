package com.thom.vo;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by ThinkPad on 2017/4/16.
 */
public class ModuleAddVO {

    private String name;
    private String description;
    private String projectId;

    @NotBlank(message="模块名称不能为空")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message="模块描述不能为空")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotBlank(message="所属项目不能为空")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
