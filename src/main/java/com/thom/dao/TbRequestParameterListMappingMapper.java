package com.thom.dao;

import com.thom.dto.TbRequestParameterListMappingExample;
import com.thom.dto.TbRequestParameterListMappingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRequestParameterListMappingMapper {
    long countByExample(TbRequestParameterListMappingExample example);

    int deleteByExample(TbRequestParameterListMappingExample example);

    int deleteByPrimaryKey(TbRequestParameterListMappingKey key);

    int insert(TbRequestParameterListMappingKey record);

    int insertSelective(TbRequestParameterListMappingKey record);

    List<TbRequestParameterListMappingKey> selectByExample(TbRequestParameterListMappingExample example);

    int updateByExampleSelective(@Param("record") TbRequestParameterListMappingKey record, @Param("example") TbRequestParameterListMappingExample example);

    int updateByExample(@Param("record") TbRequestParameterListMappingKey record, @Param("example") TbRequestParameterListMappingExample example);
}