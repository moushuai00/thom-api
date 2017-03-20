package com.thom.dao;

import com.thom.dto.TbUserSettings;
import com.thom.dto.TbUserSettingsExample;
import com.thom.dto.TbUserSettingsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserSettingsMapper {
    long countByExample(TbUserSettingsExample example);

    int deleteByExample(TbUserSettingsExample example);

    int deleteByPrimaryKey(TbUserSettingsKey key);

    int insert(TbUserSettings record);

    int insertSelective(TbUserSettings record);

    List<TbUserSettings> selectByExample(TbUserSettingsExample example);

    TbUserSettings selectByPrimaryKey(TbUserSettingsKey key);

    int updateByExampleSelective(@Param("record") TbUserSettings record, @Param("example") TbUserSettingsExample example);

    int updateByExample(@Param("record") TbUserSettings record, @Param("example") TbUserSettingsExample example);

    int updateByPrimaryKeySelective(TbUserSettings record);

    int updateByPrimaryKey(TbUserSettings record);
}