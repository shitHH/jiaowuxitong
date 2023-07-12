package com.etc.service;

import com.etc.po.Lession;
import com.etc.vo.LessionTeacherVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lyt
 * 课程业务逻辑测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class LessionServiceTest {
    @Autowired
    LessionService lessionService;
    @Test
    public void findAll(){
        List<LessionTeacherVo> list = lessionService.findAll();
        for (LessionTeacherVo lession : list) {
            System.out.println(lession);
        }
    }
    @Test
    public void findByid(){
        Lession lession = lessionService.findByid(1);
        System.out.println(lession);

    }
    @Test
    public void findByTid(){
        List<LessionTeacherVo>list = lessionService.findByTid(1);
        for (LessionTeacherVo lession : list) {
            System.out.println(lession);
        }

    }

    @Test
    public void addLession(){
        Lession lession = new Lession();
        lession.settId(1);
        lession.setlName("测试名字");
        lession.setlType("测试1");
        lession.setCredit(4.0);
        lessionService.addLession(lession);
        System.out.println(lession);
    }
    @Test
    public void delete(){
        lessionService.findAll();
        int []  arrays={1,2};
        System.out.println(arrays);
    }
    @Test
    public void update(){
        this.findAll();
        Lession lession = lessionService.findByid(1);
        lession.setCredit(6.0);
        lessionService.updateLession(lession);
        this.findAll();

    }
}
