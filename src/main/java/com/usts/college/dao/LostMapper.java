package com.usts.college.dao;

import com.usts.college.bean.Lost;
import com.usts.college.bean.LostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LostMapper {
    long countByExample(LostExample example);

    int deleteByExample(LostExample example);

    int deleteByPrimaryKey(Integer lostId);

    int insert(Lost record);

    int insertSelective(Lost record);

    List<Lost> selectByExample(LostExample example);

    Lost selectByPrimaryKey(Integer lostId);

    int updateByExampleSelective(@Param("record") Lost record, @Param("example") LostExample example);

    int updateByExample(@Param("record") Lost record, @Param("example") LostExample example);

    int updateByPrimaryKeySelective(Lost record);

    int updateByPrimaryKey(Lost record);
}