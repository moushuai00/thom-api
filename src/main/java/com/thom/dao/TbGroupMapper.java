package com.thom.dao;

import com.thom.dto.TbGroup;
import com.thom.dto.TbGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGroupMapper {
    long countByExample(TbGroupExample example);

    int deleteByExample(TbGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGroup record);

    int insertSelective(TbGroup record);

    List<TbGroup> selectByExample(TbGroupExample example);

    TbGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGroup record, @Param("example") TbGroupExample example);

    int updateByExample(@Param("record") TbGroup record, @Param("example") TbGroupExample example);

    int updateByPrimaryKeySelective(TbGroup record);

    int updateByPrimaryKey(TbGroup record);
}