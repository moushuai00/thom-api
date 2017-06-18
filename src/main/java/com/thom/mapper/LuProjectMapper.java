package com.thom.mapper;

import com.thom.dto.LuGroup;
import com.thom.dto.LuProject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LuProjectMapper {

    /**
     * 新增一条项目信息
     *
     * @param luProject
     * @return
     */
    int insertProject(LuProject luProject);

    /**
     * 获取所有项目
     * @return
     */
    List<LuProject> queryProjects(@Param("name") String name);

}