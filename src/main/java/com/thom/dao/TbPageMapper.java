package com.thom.dao;

import com.thom.dto.TbPage;
import com.thom.dto.TbPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPageMapper {
    long countByExample(TbPageExample example);

    int deleteByExample(TbPageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPage record);

    int insertSelective(TbPage record);

    List<TbPage> selectByExampleWithBLOBs(TbPageExample example);

    List<TbPage> selectByExample(TbPageExample example);

    TbPage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPage record, @Param("example") TbPageExample example);

    int updateByExampleWithBLOBs(@Param("record") TbPage record, @Param("example") TbPageExample example);

    int updateByExample(@Param("record") TbPage record, @Param("example") TbPageExample example);

    int updateByPrimaryKeySelective(TbPage record);

    int updateByPrimaryKeyWithBLOBs(TbPage record);

    int updateByPrimaryKey(TbPage record);
}