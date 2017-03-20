package com.thom.dao;

import com.thom.dto.TbCheckIn;
import com.thom.dto.TbCheckInExample;
import com.thom.dto.TbCheckInWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCheckInMapper {
    long countByExample(TbCheckInExample example);

    int deleteByExample(TbCheckInExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCheckInWithBLOBs record);

    int insertSelective(TbCheckInWithBLOBs record);

    List<TbCheckInWithBLOBs> selectByExampleWithBLOBs(TbCheckInExample example);

    List<TbCheckIn> selectByExample(TbCheckInExample example);

    TbCheckInWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCheckInWithBLOBs record, @Param("example") TbCheckInExample example);

    int updateByExampleWithBLOBs(@Param("record") TbCheckInWithBLOBs record, @Param("example") TbCheckInExample example);

    int updateByExample(@Param("record") TbCheckIn record, @Param("example") TbCheckInExample example);

    int updateByPrimaryKeySelective(TbCheckInWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbCheckInWithBLOBs record);

    int updateByPrimaryKey(TbCheckIn record);
}