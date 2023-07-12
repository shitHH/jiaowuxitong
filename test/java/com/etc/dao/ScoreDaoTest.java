package com.etc.dao;

import com.etc.po.Score;
import com.etc.vo.ScoreVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lyt
 * 成绩测试类
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScoreDaoTest {
    @Autowired
    ScoreDao scoreDao;
    @Test
    public void findAll(){
        List<ScoreVO> list = scoreDao.findAll();
        for (ScoreVO score : list) {
            System.out.println(score);
        }
    }
    @Test
    public void findBysid(){
        List<ScoreVO> list = scoreDao.findBySid(2);
        for (ScoreVO score : list) {
            System.out.println(score);
        }
    }
    @Test
    public void findByLid(){
        List<ScoreVO> list = scoreDao.findByLid(1);
        for (ScoreVO score : list) {
            System.out.println(score);
        }
    }
    @Test
    public void addScore(){
        Score score = new Score();
        score.setlId(2);
        score.setsId(2);
        score.setScore(90.0);
        scoreDao.addScore(score);
        System.out.println(score);
    }

}
