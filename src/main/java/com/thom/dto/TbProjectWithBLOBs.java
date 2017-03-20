package com.thom.dto;

public class TbProjectWithBLOBs extends TbProject {
    private String introduction;

    private String projectData;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getProjectData() {
        return projectData;
    }

    public void setProjectData(String projectData) {
        this.projectData = projectData == null ? null : projectData.trim();
    }
}