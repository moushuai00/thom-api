package com.thom.mapper;

import com.thom.dto.LuGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LuGroupUserMapper {

    /**
     * 新增一条团队-人员信息
     *
     * @return
     */
    int insertGroupUser(@Param("groupId") long groupId, @Param("userIds") List<String> userIds);

}