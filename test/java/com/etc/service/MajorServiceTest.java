package com.etc.service;

import com.etc.po.Major;
import com.etc.vo.MajorVo;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lyt
 * 专业测试类
 */
@RunWith(SpringRunner.class)
@MapperScan("com.etc.dao")
@SpringBootTest
public class MajorServiceTest {
    Logger logger = Logger.getLogger(MajorServiceTest.class);
    @Autowired
    MajorService majorService;
    @Test
    public void findAll(){
        logger.info("开始测试");
        List<MajorVo> list = majorService.findAll();
        for (MajorVo major : list) {
            System.out.println(major);
        }

    }
    @Test
    public void findById(){
        MajorVo major =majorService.findById(1);
        System.out.println(major);
    }
    @Test
    public void findByCollid(){
        List<MajorVo> list = majorService.findByCollId(1);
        for (MajorVo major : list) {
            System.out.println(major);
        }
    }
    @Test
    public void addMajor(){
        Major major = new Major();
        major.setCollId(1);
        major.setmName("测试1");
        major.setmMoney(2000.0);
       boolean flag =  majorService.addMajor(major);
        System.out.println(flag);
    }
}
