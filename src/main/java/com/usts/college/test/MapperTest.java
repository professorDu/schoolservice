package com.usts.college.test;

import com.usts.college.bean.Apart;
import com.usts.college.dao.ApartMapper;
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

    @Test
    public void test() {
//        List<Apart> list = apartMapper.selectByExample(null);
    }
}
