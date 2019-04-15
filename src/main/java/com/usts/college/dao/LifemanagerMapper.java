package com.usts.college.dao;

import com.usts.college.bean.Lifemanager;
import com.usts.college.bean.LifemanagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LifemanagerMapper {
    long countByExample(LifemanagerExample example);

    int deleteByExample(LifemanagerExample example);

    int deleteByPrimaryKey(Integer lifeId);

    int insert(Lifemanager record);

    int insertSelective(Lifemanager record);

    List<Lifemanager> selectByExample(LifemanagerExample example);

    Lifemanager selectByPrimaryKey(Integer lifeId);

    int updateByExampleSelective(@Param("record") Lifemanager record, @Param("example") LifemanagerExample example);

    int updateByExample(@Param("record") Lifemanager record, @Param("example") LifemanagerExample example);

    int updateByPrimaryKeySelective(Lifemanager record);

    int updateByPrimaryKey(Lifemanager record);
}