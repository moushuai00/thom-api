package com.thom.dto;

public class TbUserSettings extends TbUserSettingsKey {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}