package com.etc.dao;

import com.etc.po.Comment;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    CommentDao commentDao;

    @org.junit.Test
    public void add(){

        commentDao.pingjiao(new Comment(1,1,1,1));

    }

}
