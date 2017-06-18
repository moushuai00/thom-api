package com.thom.dto;

import com.thom.vo.GroupAddVO;

/**
 * Created by ThinkPad on 2017/4/16.
 */
public class LuGroup {

    public LuGroup() {
    }

    public LuGroup(GroupAddVO groupAddVO) {
        this.name = groupAddVO.getName();
        this.description = groupAddVO.getDescription();
        if ("on".equals(groupAddVO.getIs_open())) {
            this.isOpen = true;
        } else {
            this.isOpen = false;
        }
    }

    private Long id;
    private String name;
    private String description;
    private boolean isOpen;

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

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
