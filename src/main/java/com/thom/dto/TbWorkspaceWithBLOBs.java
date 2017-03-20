package com.thom.dto;

public class TbWorkspaceWithBLOBs extends TbWorkspace {
    private String projectData;

    private String projectDataOriginal;

    public String getProjectData() {
        return projectData;
    }

    public void setProjectData(String projectData) {
        this.projectData = projectData == null ? null : projectData.trim();
    }

    public String getProjectDataOriginal() {
        return projectDataOriginal;
    }

    public void setProjectDataOriginal(String projectDataOriginal) {
        this.projectDataOriginal = projectDataOriginal == null ? null : projectDataOriginal.trim();
    }
}