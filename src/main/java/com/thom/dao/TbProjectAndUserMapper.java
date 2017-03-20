package com.thom.dao;

import com.thom.dto.TbProjectAndUser;
import com.thom.dto.TbProjectAndUserExample;
import com.thom.dto.TbProjectAndUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectAndUserMapper {
    long countByExample(TbProjectAndUserExample example);

    int deleteByExample(TbProjectAndUserExample example);

    int deleteByPrimaryKey(TbProjectAndUserKey key);

    int insert(TbProjectAndUser record);

    int insertSelective(TbProjectAndUser record);

    List<TbProjectAndUser> selectByExample(TbProjectAndUserExample example);

    TbProjectAndUser selectByPrimaryKey(TbProjectAndUserKey key);

    int updateByExampleSelective(@Param("record") TbProjectAndUser record, @Param("example") TbProjectAndUserExample example);

    int updateByExample(@Param("record") TbProjectAndUser record, @Param("example") TbProjectAndUserExample example);

    int updateByPrimaryKeySelective(TbProjectAndUser record);

    int updateByPrimaryKey(TbProjectAndUser record);
}