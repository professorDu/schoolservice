package com.usts.college.dao;

import com.usts.college.bean.Supermanager;
import com.usts.college.bean.SupermanagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupermanagerMapper {
    long countByExample(SupermanagerExample example);

    int deleteByExample(SupermanagerExample example);

    int deleteByPrimaryKey(Integer superId);

    int insert(Supermanager record);

    int insertSelective(Supermanager record);

    List<Supermanager> selectByExample(SupermanagerExample example);

    Supermanager selectByPrimaryKey(Integer superId);

    int updateByExampleSelective(@Param("record") Supermanager record, @Param("example") SupermanagerExample example);

    int updateByExample(@Param("record") Supermanager record, @Param("example") SupermanagerExample example);

    int updateByPrimaryKeySelective(Supermanager record);

    int updateByPrimaryKey(Supermanager record);
}