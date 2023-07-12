package com.etc.dao;

import com.etc.po.Grade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class GradeDaoTest {
    @Autowired
    GradeDao gradeDao;
    @Test
    public void findOne(){
        Grade grade = gradeDao.findOne(1);
        System.out.println(grade.getGname());
    }
    @Test
    public void findAll(){
        List<Grade> list = gradeDao.findAll();
        System.out.println(list);
    }
    @Test
    public void update(){
        Grade grade = gradeDao.findOne(1);
        grade.setGname("2019及");
        gradeDao.update(grade);
    }
}
