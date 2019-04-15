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

    Apart selectByPrimaryKey(Integer apartId);

    int updateByExampleSelective(@Param("record") Apart record, @Param("example") ApartExample example);

    int updateByExample(@Param("record") Apart record, @Param("example") ApartExample example);

    int updateByPrimaryKeySelective(Apart record);

    int updateByPrimaryKey(Apart record);
}