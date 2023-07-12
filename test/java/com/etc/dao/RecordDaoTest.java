package com.etc.dao;

import com.etc.vo.RecordVO;
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
 * @author:yjt
 * @category 学费记录数据访问测试类
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordDaoTest {

    @Autowired
    RecordDao recordDao;

    Logger logger = Logger.getLogger(RecordDaoTest.class);

    @Test
    public void findAll() {
        List<RecordVO> all = recordDao.findAll();
        for (RecordVO recordVO : all) {
            logger.info(recordVO);
        }
    }

    @Test
    public void findByMonId() {
        RecordVO byMonId = recordDao.findByMonId(1);
        logger.info(byMonId);
    }

    @Test
    public void findBySId() {
        List<RecordVO> bySId = recordDao.findBySId(20220034);
        if (bySId == null) {
            System.out.println(666);
        }
        if (bySId.size() == 0) {
            System.out.println(777);
        }
        for (RecordVO recordVO : bySId) {
            logger.info(recordVO);
        }
    }

    @Test
    public void findBySName() {
        List<RecordVO> bySName = recordDao.findBySName("李长安");
        for (RecordVO recordVO : bySName) {
            logger.info(recordVO);
        }
    }

    @Test
    public void findByMTime() {
//        List<RecordVO> byMTime = recordDao.findByMTime("2022-10-07 17:05:40");
//        for (RecordVO recordVO : byMTime) {
//            logger.info(byMTime);
//        }
    }

    @Test
    public void findByMYear() {
        List<RecordVO> byMYear = recordDao.findByMYear("2019");
        for (RecordVO recordVO : byMYear) {
            logger.info(recordVO);
        }
    }

//    @Test
//    public void addRecord(){
//        RecordVO recordVO = new RecordVO();
//        recordVO.setsId(44);
//        recordVO.setmTime(new Date(System.currentTimeMillis()));
//        recordVO.setmYear("2021");
//        recordDao.addRecord(recordVO);
//        logger.info(recordVO);
//    }

    @Test
    public void updateRecord() {
        RecordVO byMonId = recordDao.findByMonId(1);
        byMonId.setmYear("2020");
        recordDao.updateRecord(byMonId);
        logger.info(byMonId);
    }

    @Test
    public void deleteRecord() {
        int i = recordDao.deleteRecord(15);
        logger.info(i);
    }
}
