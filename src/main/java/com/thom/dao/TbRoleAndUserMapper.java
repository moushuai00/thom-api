package com.thom.dao;

import com.thom.dto.TbRoleAndUserExample;
import com.thom.dto.TbRoleAndUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRoleAndUserMapper {
    long countByExample(TbRoleAndUserExample example);

    int deleteByExample(TbRoleAndUserExample example);

    int deleteByPrimaryKey(TbRoleAndUserKey key);

    int insert(TbRoleAndUserKey record);

    int insertSelective(TbRoleAndUserKey record);

    List<TbRoleAndUserKey> selectByExample(TbRoleAndUserExample example);

    int updateByExampleSelective(@Param("record") TbRoleAndUserKey record, @Param("example") TbRoleAndUserExample example);

    int updateByExample(@Param("record") TbRoleAndUserKey record, @Param("example") TbRoleAndUserExample example);
}