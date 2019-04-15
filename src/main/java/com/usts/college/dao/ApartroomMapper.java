package com.usts.college.dao;

import com.usts.college.bean.Apartroom;
import com.usts.college.bean.ApartroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApartroomMapper {
    long countByExample(ApartroomExample example);

    int deleteByExample(ApartroomExample example);

    int deleteByPrimaryKey(Integer apartroomId);

    int insert(Apartroom record);

    int insertSelective(Apartroom record);

    List<Apartroom> selectByExample(ApartroomExample example);

    Apartroom selectByPrimaryKey(Integer apartroomId);

    int updateByExampleSelective(@Param("record") Apartroom record, @Param("example") ApartroomExample example);

    int updateByExample(@Param("record") Apartroom record, @Param("example") ApartroomExample example);

    int updateByPrimaryKeySelective(Apartroom record);

    int updateByPrimaryKey(Apartroom record);
}