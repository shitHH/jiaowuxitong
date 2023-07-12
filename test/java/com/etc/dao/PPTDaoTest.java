package com.etc.dao;

import com.etc.vo.PPTVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author GX
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class PPTDaoTest {
    @Autowired
    PPTDao pptDao;
    @Test
    public void findByid(){
        List<PPTVO> list=pptDao.findByid(1);
        for (PPTVO pptvo:list) {
            System.out.println(pptvo);
        }
    }

}
