package com.thom.service;

import com.thom.dto.LuGroup;
import com.thom.dto.LuProject;
import com.thom.mapper.LuGroupMapper;
import com.thom.mapper.LuGroupUserMapper;
import com.thom.mapper.LuProjectMapper;
import com.thom.mapper.LuProjectUserMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ThinkPad on 2017/4/16.
 */
@Service
public class ProjectService {

    @Resource
    private LuProjectMapper luProjectMapper;

    @Resource
    private LuProjectUserMapper luProjectUserMapper;

    public boolean insertProject(LuProject luProject, List<String> members) {
        int count = luProjectMapper.insertProject(luProject);

        if (count > 0 && luProject.getId() != null) {
            if (CollectionUtils.isNotEmpty(members)) {
                if (luProjectUserMapper.insertProjectUser(luProject.getId(), members) > 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
