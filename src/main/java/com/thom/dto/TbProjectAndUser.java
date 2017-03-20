package com.thom.dto;

public class TbProjectAndUser extends TbProjectAndUserKey {
    private Integer accessLevel;

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }
}