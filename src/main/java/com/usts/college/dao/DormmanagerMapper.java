package com.usts.college.dao;

import com.usts.college.bean.Dormmanager;
import com.usts.college.bean.DormmanagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DormmanagerMapper {
    long countByExample(DormmanagerExample example);

    int deleteByExample(DormmanagerExample example);

    int deleteByPrimaryKey(Integer dormId);

    int insert(Dormmanager record);

    int insertSelective(Dormmanager record);

    List<Dormmanager> selectByExample(DormmanagerExample example);

    Dormmanager selectByPrimaryKey(Integer dormId);
    //新增的查询，和apart表连接查询
    List<Dormmanager> selectByExampleWithApart(DormmanagerExample example);

    Dormmanager selectByPrimaryKeyWithApart(Integer dormId);

    int updateByExampleSelective(@Param("record") Dormmanager record, @Param("example") DormmanagerExample example);

    int updateByExample(@Param("record") Dormmanager record, @Param("example") DormmanagerExample example);

    int updateByPrimaryKeySelective(Dormmanager record);

    int updateByPrimaryKey(Dormmanager record);
}