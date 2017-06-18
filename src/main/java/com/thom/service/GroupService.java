package com.thom.service;

import com.thom.dto.LuGroup;
import com.thom.mapper.LuGroupMapper;
import com.thom.mapper.LuGroupUserMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ThinkPad on 2017/4/16.
 */
@Service
public class GroupService {

    @Resource
    private LuGroupMapper luGroupMapper;

    @Resource
    private LuGroupUserMapper luGroupUserMapper;

    public boolean insertGroup(LuGroup luGroup, List<String> members) {
        int count = luGroupMapper.insertGroup(luGroup);

        if (count > 0 && luGroup.getId() != null) {
            if (CollectionUtils.isNotEmpty(members)) {
                if (luGroupUserMapper.insertGroupUser(luGroup.getId(), members) > 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
