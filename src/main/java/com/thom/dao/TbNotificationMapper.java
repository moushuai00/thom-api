package com.thom.dao;

import com.thom.dto.TbNotification;
import com.thom.dto.TbNotificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNotificationMapper {
    long countByExample(TbNotificationExample example);

    int deleteByExample(TbNotificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbNotification record);

    int insertSelective(TbNotification record);

    List<TbNotification> selectByExampleWithBLOBs(TbNotificationExample example);

    List<TbNotification> selectByExample(TbNotificationExample example);

    TbNotification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);

    int updateByExampleWithBLOBs(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);

    int updateByExample(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);

    int updateByPrimaryKeySelective(TbNotification record);

    int updateByPrimaryKeyWithBLOBs(TbNotification record);

    int updateByPrimaryKey(TbNotification record);
}