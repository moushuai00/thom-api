package com.thom.dao;

import com.thom.dto.TbResponseParameterListMappingExample;
import com.thom.dto.TbResponseParameterListMappingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbResponseParameterListMappingMapper {
    long countByExample(TbResponseParameterListMappingExample example);

    int deleteByExample(TbResponseParameterListMappingExample example);

    int deleteByPrimaryKey(TbResponseParameterListMappingKey key);

    int insert(TbResponseParameterListMappingKey record);

    int insertSelective(TbResponseParameterListMappingKey record);

    List<TbResponseParameterListMappingKey> selectByExample(TbResponseParameterListMappingExample example);

    int updateByExampleSelective(@Param("record") TbResponseParameterListMappingKey record, @Param("example") TbResponseParameterListMappingExample example);

    int updateByExample(@Param("record") TbResponseParameterListMappingKey record, @Param("example") TbResponseParameterListMappingExample example);
}