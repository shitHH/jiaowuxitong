package com.etc.service;

import com.etc.dao.ClassDao;
import com.etc.vo.ClassVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class ClassServiceTest {
    @Autowired
    ClassDao classService;
    @Test
    public void  findByClassName(){
        List<ClassVO> list = classService.findByClassName("计科");
        System.out.println(list);
    }

    @Test
    public void  find(){
        List<ClassVO> byMId = classService.findByMId(1);
        for (ClassVO classVO : byMId) {
            System.out.println(classVO);
        }
    }
}
