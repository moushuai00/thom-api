package com.thom.dao;

import com.thom.dto.TbWorkspaceSave;
import com.thom.dto.TbWorkspaceSaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWorkspaceSaveMapper {
    long countByExample(TbWorkspaceSaveExample example);

    int deleteByExample(TbWorkspaceSaveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbWorkspaceSave record);

    int insertSelective(TbWorkspaceSave record);

    List<TbWorkspaceSave> selectByExampleWithBLOBs(TbWorkspaceSaveExample example);

    List<TbWorkspaceSave> selectByExample(TbWorkspaceSaveExample example);

    TbWorkspaceSave selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbWorkspaceSave record, @Param("example") TbWorkspaceSaveExample example);

    int updateByExampleWithBLOBs(@Param("record") TbWorkspaceSave record, @Param("example") TbWorkspaceSaveExample example);

    int updateByExample(@Param("record") TbWorkspaceSave record, @Param("example") TbWorkspaceSaveExample example);

    int updateByPrimaryKeySelective(TbWorkspaceSave record);

    int updateByPrimaryKeyWithBLOBs(TbWorkspaceSave record);

    int updateByPrimaryKey(TbWorkspaceSave record);
}