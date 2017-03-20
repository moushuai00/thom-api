package com.thom.dao;

import com.thom.dto.TbProductionLine;
import com.thom.dto.TbProductionLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductionLineMapper {
    long countByExample(TbProductionLineExample example);

    int deleteByExample(TbProductionLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProductionLine record);

    int insertSelective(TbProductionLine record);

    List<TbProductionLine> selectByExample(TbProductionLineExample example);

    TbProductionLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbProductionLine record, @Param("example") TbProductionLineExample example);

    int updateByExample(@Param("record") TbProductionLine record, @Param("example") TbProductionLineExample example);

    int updateByPrimaryKeySelective(TbProductionLine record);

    int updateByPrimaryKey(TbProductionLine record);
}