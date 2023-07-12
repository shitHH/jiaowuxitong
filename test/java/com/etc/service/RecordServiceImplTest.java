package com.etc.service;

import com.etc.dao.RecordDaoTest;
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
 * @category 学费记录业务逻辑实现类测试
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordServiceImplTest {

    @Autowired
    RecordService recordService;

    Logger logger = Logger.getLogger(RecordDaoTest.class);

    @Test
    public void findAll(){
        List<RecordVO> all = recordService.findAll();

        for (RecordVO recordVO : all) {
            logger.info(recordVO);
        }
    }

    @Test
    public void findByMonId(){
        RecordVO byMonId = recordService.findByMonId(1);
        logger.info(byMonId);
    }

    @Test
    public void findBySId(){
        List<RecordVO> bySId = recordService.findBySId(20220034);
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
    public void findBySName(){
        List<RecordVO> bySName = recordService.findBySName("李长安");
        for (RecordVO recordVO : bySName) {
            logger.info(recordVO);
        }
    }

    @Test
    public void findByMTime(){
//        List<RecordVO> byMTime = recordDao.findByMTime("2022-10-07 17:05:40");
//        for (RecordVO recordVO : byMTime) {
//            logger.info(byMTime);
//        }
    }

    @Test

    public void findByMYear(){
        List<RecordVO> byMYear = recordService.findByMYear("2019");
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
//        recordVO.setsName("王二小");
//        recordService.addRecord(recordVO);
//        logger.info(recordVO);
//    }

    @Test
    public void updateRecord(){
        RecordVO byMonId = recordService.findByMonId(1);
        byMonId.setmYear("2020");
        recordService.updateRecord(byMonId);
        logger.info(byMonId);
    }

    @Test
    public void deleteRecord(){
        boolean flag =recordService.deleteRecord(15);
        logger.info(flag);
    }
}
