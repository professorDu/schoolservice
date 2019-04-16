package com.usts.college.test;

import com.usts.college.bean.*;
import com.usts.college.dao.ApartMapper;
import com.usts.college.dao.DormcheckMapper;
import com.usts.college.dao.DormmanagerMapper;
import com.usts.college.dao.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    ApartMapper apartMapper;
    @Autowired
    StudentMapper studentmapper;
    @Autowired
    DormmanagerMapper dormmanagermapper;
    @Autowired
    DormcheckMapper dormcheckmapper;

    @Test
    public void testCRUD() {
//        List<Student> list = studentmapper.selectByExampleWithRoomAndApart(null);
//        list.forEach(student->{
//            System.out.println("姓名："+student.getStuName());
//            System.out.println("楼："+student.getApartroom().getApart().getApartApa());
//            System.out.println("编号："+student.getApartroom().getApartroomAbc());
//        });
//        Student listq = studentmapper.selectByPrimaryKeyWithRoomAndApart(1);
//        System.out.println(listq.getApartroom().getApartroomAbc());
//        Dormmanager dorm = dormmanagermapper.selectByPrimaryKeyWithApart(1);
//        System.out.println(dorm.getDormName());
        List<Dormcheck> dormchecks = dormcheckmapper.selectByExampleWithCheckRAndA(null);
        dormchecks.forEach(dorm->{
            System.out.println("组团："+dorm.getApartroom().getApart().getApartApa());
            System.out.println("编号："+dorm.getApartroom().getApartroomAbc());
            System.out.println("成绩："+dorm.getDormcheckMessage());
        });

        ApartExample example =new ApartExample();
        ApartExample.Criteria criteria = example.createCriteria();
        criteria.andApartApaEqualTo("二组团");
       // apartMapper.selectByExample(example);

        System.out.println( apartMapper.selectByExampleWithApartsAndStudents(null));


    }
}
