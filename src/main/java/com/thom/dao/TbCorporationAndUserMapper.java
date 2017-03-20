package com.thom.dao;

import com.thom.dto.TbCorporationAndUser;
import com.thom.dto.TbCorporationAndUserExample;
import com.thom.dto.TbCorporationAndUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCorporationAndUserMapper {
    long countByExample(TbCorporationAndUserExample example);

    int deleteByExample(TbCorporationAndUserExample example);

    int deleteByPrimaryKey(TbCorporationAndUserKey key);

    int insert(TbCorporationAndUser record);

    int insertSelective(TbCorporationAndUser record);

    List<TbCorporationAndUser> selectByExample(TbCorporationAndUserExample example);

    TbCorporationAndUser selectByPrimaryKey(TbCorporationAndUserKey key);

    int updateByExampleSelective(@Param("record") TbCorporationAndUser record, @Param("example") TbCorporationAndUserExample example);

    int updateByExample(@Param("record") TbCorporationAndUser record, @Param("example") TbCorporationAndUserExample example);

    int updateByPrimaryKeySelective(TbCorporationAndUser record);

    int updateByPrimaryKey(TbCorporationAndUser record);
}