package com.thom.dao;

import com.thom.dto.TbParameter;
import com.thom.dto.TbParameterExample;
import com.thom.dto.TbParameterWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbParameterMapper {
    long countByExample(TbParameterExample example);

    int deleteByExample(TbParameterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbParameterWithBLOBs record);

    int insertSelective(TbParameterWithBLOBs record);

    List<TbParameterWithBLOBs> selectByExampleWithBLOBs(TbParameterExample example);

    List<TbParameter> selectByExample(TbParameterExample example);

    TbParameterWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbParameterWithBLOBs record, @Param("example") TbParameterExample example);

    int updateByExampleWithBLOBs(@Param("record") TbParameterWithBLOBs record, @Param("example") TbParameterExample example);

    int updateByExample(@Param("record") TbParameter record, @Param("example") TbParameterExample example);

    int updateByPrimaryKeySelective(TbParameterWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbParameterWithBLOBs record);

    int updateByPrimaryKey(TbParameter record);
}