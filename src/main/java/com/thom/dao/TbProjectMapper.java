package com.thom.dao;

import com.thom.dto.TbProject;
import com.thom.dto.TbProjectExample;
import com.thom.dto.TbProjectWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectMapper {
    long countByExample(TbProjectExample example);

    int deleteByExample(TbProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProjectWithBLOBs record);

    int insertSelective(TbProjectWithBLOBs record);

    List<TbProjectWithBLOBs> selectByExampleWithBLOBs(TbProjectExample example);

    List<TbProject> selectByExample(TbProjectExample example);

    TbProjectWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbProjectWithBLOBs record, @Param("example") TbProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") TbProjectWithBLOBs record, @Param("example") TbProjectExample example);

    int updateByExample(@Param("record") TbProject record, @Param("example") TbProjectExample example);

    int updateByPrimaryKeySelective(TbProjectWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbProjectWithBLOBs record);

    int updateByPrimaryKey(TbProject record);
}