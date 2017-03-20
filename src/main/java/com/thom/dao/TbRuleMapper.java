package com.thom.dao;

import com.thom.dto.TbRule;
import com.thom.dto.TbRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRuleMapper {
    long countByExample(TbRuleExample example);

    int deleteByExample(TbRuleExample example);

    int deleteByPrimaryKey(Integer actionId);

    int insert(TbRule record);

    int insertSelective(TbRule record);

    List<TbRule> selectByExampleWithBLOBs(TbRuleExample example);

    List<TbRule> selectByExample(TbRuleExample example);

    TbRule selectByPrimaryKey(Integer actionId);

    int updateByExampleSelective(@Param("record") TbRule record, @Param("example") TbRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") TbRule record, @Param("example") TbRuleExample example);

    int updateByExample(@Param("record") TbRule record, @Param("example") TbRuleExample example);

    int updateByPrimaryKeySelective(TbRule record);

    int updateByPrimaryKeyWithBLOBs(TbRule record);

    int updateByPrimaryKey(TbRule record);
}