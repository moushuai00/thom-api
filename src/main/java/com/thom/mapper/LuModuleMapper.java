package com.thom.mapper;

import com.thom.dto.LuModule;
import com.thom.dto.LuProject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LuModuleMapper {

    /**
     * 新增一条模块信息
     *
     * @param luProject
     * @return
     */
    int insertModule(LuModule luModule);

    /**
     * 获取所有模块
     * @return
     */
    List<LuModule> queryModules(@Param("name") String name);
}