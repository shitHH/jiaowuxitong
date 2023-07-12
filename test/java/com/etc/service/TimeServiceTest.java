package com.etc.service;

import com.etc.po.Time;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/1 22:18
 * 时间段业务逻辑测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class TimeServiceTest {

    @Autowired
    TimeService timeService;

    @Test
    public void findAll() {
        List<Time> all = timeService.findAll();
        for (Time time : all) {
            System.out.println(time);
        }
    }

    @Test
    public void findById() {

        Time byId = timeService.findById(1);

        System.out.println(byId);
    }

    @Test
    public void addTime() {

        Time time = new Time();

        time.setTimeName("测试");

        timeService.addTime(time);

        this.findAll();
    }

    @Test
    public void updateTime() {

        Time byId = timeService.findById(6);

        byId.setTimeName("111");

        boolean b = timeService.updateTime(byId);

        this.findAll();
    }

    @Test
    public void deleteTime() {

        Time byId = timeService.findById(1);

        List<Time> list = new ArrayList<>();
        list.add(byId);
        List<Integer> list1 = null;
        List<Time> all = timeService.findAll();

        for (Time time1 : all) {
            System.out.println(time1);
        }
    }

    @Test
    public void test(){

        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
