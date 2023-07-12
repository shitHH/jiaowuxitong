package com.etc.dao;

import com.etc.po.YiQing;
import com.etc.service.YiQingService;
import com.etc.vo.YiQingVo;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/12 10:08:40
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class YiQingDaoTest {
    @Autowired
    YiQingService yiQingService;
    Logger logger = Logger.getLogger(StudentDaoTest.class);

    @Test
    public void findAll() {
        List<YiQingVo> list = yiQingService.findAll();
        for (YiQingVo yiQingVo : list) {
            logger.info(yiQingVo);
        }
    }

    @Test
    public void findBySid() {
        YiQingVo bySid = yiQingService.findBySid(1);
        logger.info(bySid);
    }

    @Test
    public void addYiQing() {
        YiQing yiQing = new YiQing();
        yiQing.setSid(20220095);
        yiQing.setDATE(new Date());
        yiQing.setTiwen(38.0);
        yiQingService.addYiQing(yiQing);
    }
}
