package com.thom.dto;

import com.thom.vo.ModuleAddVO;

/**
 * Created by ThinkPad on 2017/4/16.
 */
public class LuModule {

    public LuModule(){}

    public LuModule(ModuleAddVO moduleAddVO){
        this.name = moduleAddVO.getName();
        this.description = moduleAddVO.getDescription();
        this.projectId = Long.valueOf(moduleAddVO.getProjectId());
    }

    private Long id;
    private String name;
    private String description;
    private Long projectId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}
