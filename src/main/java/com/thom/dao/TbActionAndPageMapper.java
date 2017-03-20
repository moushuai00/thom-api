package com.thom.dao;

import com.thom.dto.TbActionAndPageExample;
import com.thom.dto.TbActionAndPageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbActionAndPageMapper {
    long countByExample(TbActionAndPageExample example);

    int deleteByExample(TbActionAndPageExample example);

    int deleteByPrimaryKey(TbActionAndPageKey key);

    int insert(TbActionAndPageKey record);

    int insertSelective(TbActionAndPageKey record);

    List<TbActionAndPageKey> selectByExample(TbActionAndPageExample example);

    int updateByExampleSelective(@Param("record") TbActionAndPageKey record, @Param("example") TbActionAndPageExample example);

    int updateByExample(@Param("record") TbActionAndPageKey record, @Param("example") TbActionAndPageExample example);
}