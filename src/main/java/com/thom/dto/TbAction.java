package com.thom.dto;

public class TbAction {
    private Integer id;

    private String name;

    private Integer requestType;

    private Byte disableCache;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public Byte getDisableCache() {
        return disableCache;
    }

    public void setDisableCache(Byte disableCache) {
        this.disableCache = disableCache;
    }
}