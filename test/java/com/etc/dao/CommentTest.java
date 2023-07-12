package com.etc.dao;

import com.etc.vo.CommentVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentTest {
    @Autowired
    CommentDao commentDao;
    @Test
    public void findBysidAndTid(){
        List<CommentVO> list = commentDao.findBySidAndTid(20220034,20180003);
        System.out.println(list);
    }
}
