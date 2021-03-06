package com.usts.college.dao;

import com.usts.college.bean.Apart;
import com.usts.college.bean.ApartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApartMapper {
    long countByExample(ApartExample example);

    int deleteByExample(ApartExample example);

    int deleteByPrimaryKey(Integer apartId);

    int insert(Apart record);

    int insertSelective(Apart record);

    List<Apart> selectByExample(ApartExample example);

    //查询一个楼栋含有多少个房间
    List<Apart> selectByExampleWithAparts(ApartExample example);

    //查询一个楼栋含有多少个房间,一个房间多少个人
    List<Apart> selectByExampleWithApartsAndStudents(ApartExample example);

    Apart selectByPrimaryKey(Integer apartId);

    int updateByExampleSelective(@Param("record") Apart record, @Param("example") ApartExample example);

    int updateByExample(@Param("record") Apart record, @Param("example") ApartExample example);

    int updateByPrimaryKeySelective(Apart record);

    int updateByPrimaryKey(Apart record);
}