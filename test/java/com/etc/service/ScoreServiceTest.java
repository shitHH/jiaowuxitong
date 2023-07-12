package com.etc.service;

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
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class ScoreServiceTest {
    @Autowired
    ScoreService scoreService;
    @Test
    public void findAll(){
        List<ScoreVO> list = scoreService.findAll();
        for (ScoreVO score : list) {
            System.out.println(score);
        }
    }
    @Test
    public void findBysid(){
        List<ScoreVO> list = scoreService.findBySid(1);
        for (ScoreVO score : list) {
            System.out.println(score);
        }
    }
    @Test
    public void findByLid(){
        List<ScoreVO> list = scoreService.findByLid(1);
        for (ScoreVO score : list) {
            System.out.println(score);
        }
    }
    @Test
    public void addScore(){
        Score score = new Score();
        score.setlId(1);
        score.setsId(2);
        score.setScore(90.0);
       boolean i =  scoreService.addScore(score);
        System.out.println(i);
    }

}
