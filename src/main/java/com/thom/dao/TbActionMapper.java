package com.thom.dao;

import com.thom.dto.TbAction;
import com.thom.dto.TbActionExample;
import com.thom.dto.TbActionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbActionMapper {
    long countByExample(TbActionExample example);

    int deleteByExample(TbActionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbActionWithBLOBs record);

    int insertSelective(TbActionWithBLOBs record);

    List<TbActionWithBLOBs> selectByExampleWithBLOBs(TbActionExample example);

    List<TbAction> selectByExample(TbActionExample example);

    TbActionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbActionWithBLOBs record, @Param("example") TbActionExample example);

    int updateByExampleWithBLOBs(@Param("record") TbActionWithBLOBs record, @Param("example") TbActionExample example);

    int updateByExample(@Param("record") TbAction record, @Param("example") TbActionExample example);

    int updateByPrimaryKeySelective(TbActionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbActionWithBLOBs record);

    int updateByPrimaryKey(TbAction record);
}