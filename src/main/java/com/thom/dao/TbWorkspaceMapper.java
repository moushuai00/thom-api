package com.thom.dao;

import com.thom.dto.TbWorkspace;
import com.thom.dto.TbWorkspaceExample;
import com.thom.dto.TbWorkspaceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWorkspaceMapper {
    long countByExample(TbWorkspaceExample example);

    int deleteByExample(TbWorkspaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbWorkspaceWithBLOBs record);

    int insertSelective(TbWorkspaceWithBLOBs record);

    List<TbWorkspaceWithBLOBs> selectByExampleWithBLOBs(TbWorkspaceExample example);

    List<TbWorkspace> selectByExample(TbWorkspaceExample example);

    TbWorkspaceWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbWorkspaceWithBLOBs record, @Param("example") TbWorkspaceExample example);

    int updateByExampleWithBLOBs(@Param("record") TbWorkspaceWithBLOBs record, @Param("example") TbWorkspaceExample example);

    int updateByExample(@Param("record") TbWorkspace record, @Param("example") TbWorkspaceExample example);

    int updateByPrimaryKeySelective(TbWorkspaceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbWorkspaceWithBLOBs record);

    int updateByPrimaryKey(TbWorkspace record);
}