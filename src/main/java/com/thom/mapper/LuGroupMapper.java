package com.thom.mapper;

import com.thom.dto.LuGroup;
import com.thom.dto.LuUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LuGroupMapper {

    /**
     * 新增一条团队信息
     *
     * @param luGroup
     * @return
     */
    int insertGroup(LuGroup luGroup);

    /**
     * 获取所有组
     * @return
     */
    List<LuGroup> queryGroups(@Param("name") String name);

}