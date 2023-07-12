package com.etc.dao;

import com.etc.po.Time;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/9/30 22:59
 * 时间段测试类
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeDaoTest {

    @Autowired
    TimeDao timeDao;

    @Test
    public void findAll(){
        List<Time> all = timeDao.findAll();

        for (Time time : all) {
            System.out.println(time);
        }
    }

    @Test
    public void findById(){

        Time byId = timeDao.findById(1);

        System.out.println(byId);
    }

    @Test
    public void addTime(){

        Time time = new Time();

        time.setTimeName("16:00-18:00");

        timeDao.addTime(time);

        this.findAll();
    }

    @Test
    public void deleteTime(){

        int i = timeDao.deleteTime(3);

        this.findAll();
    }

    @Test
    public void updateTime(){

        timeDao.updateTime(new Time(4,"14:00-16:00"));

        this.findAll();
    }

}
