package com.thom.dao;

import com.thom.dto.TbModule;
import com.thom.dto.TbModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbModuleMapper {
    long countByExample(TbModuleExample example);

    int deleteByExample(TbModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbModule record);

    int insertSelective(TbModule record);

    List<TbModule> selectByExample(TbModuleExample example);

    TbModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbModule record, @Param("example") TbModuleExample example);

    int updateByExample(@Param("record") TbModule record, @Param("example") TbModuleExample example);

    int updateByPrimaryKeySelective(TbModule record);

    int updateByPrimaryKey(TbModule record);
}