package com.usts.college.dao;

import com.usts.college.bean.Student;
import com.usts.college.bean.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer stuId);
    //学生查询，连接宿舍和楼栋
    List<Student> selectByExampleWithRoomAndApart(StudentExample example);

    Student selectByPrimaryKeyWithRoomAndApart(Integer stuId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}