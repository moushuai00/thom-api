package com.thom.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LuProjectUserMapper {

    /**
     * 新增一条项目-人员信息
     *
     * @return
     */
    int insertProjectUser(@Param("projectId") long projectId, @Param("userIds") List<String> userIds);

}