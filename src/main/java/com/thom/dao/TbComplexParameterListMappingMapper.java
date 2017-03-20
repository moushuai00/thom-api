package com.thom.dao;

import com.thom.dto.TbComplexParameterListMappingExample;
import com.thom.dto.TbComplexParameterListMappingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbComplexParameterListMappingMapper {
    long countByExample(TbComplexParameterListMappingExample example);

    int deleteByExample(TbComplexParameterListMappingExample example);

    int deleteByPrimaryKey(TbComplexParameterListMappingKey key);

    int insert(TbComplexParameterListMappingKey record);

    int insertSelective(TbComplexParameterListMappingKey record);

    List<TbComplexParameterListMappingKey> selectByExample(TbComplexParameterListMappingExample example);

    int updateByExampleSelective(@Param("record") TbComplexParameterListMappingKey record, @Param("example") TbComplexParameterListMappingExample example);

    int updateByExample(@Param("record") TbComplexParameterListMappingKey record, @Param("example") TbComplexParameterListMappingExample example);
}