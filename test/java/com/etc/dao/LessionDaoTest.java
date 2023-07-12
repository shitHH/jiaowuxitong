package com.etc.dao;

import com.etc.po.Lession;
import com.etc.vo.LessionTeacherVo;
import jdk.nashorn.internal.ir.CallNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lyt
 * 课程测试类
 */
@RunWith(SpringRunner.class)
@MapperScan("com.etc.dao")
@SpringBootTest
public class LessionDaoTest {
    @Autowired
    LessionDao lessionDao;

    @Test
    public void findAll() {
        List<LessionTeacherVo> list = lessionDao.findAll();
        for (LessionTeacherVo lession : list) {
            System.out.println(lession);
        }

    }

    @Test
    public void findByid() {
        Lession LessionTeacherVo = lessionDao.findByid(1);
        System.out.println(LessionTeacherVo);

    }

    @Test
    public void findByTid() {
        List<LessionTeacherVo> list = lessionDao.findByTid(1);
        for (LessionTeacherVo lession : list) {
            System.out.println(lession);
        }

    }

    @Test
    public void addLession() {
        Lession lession = new Lession();
        lession.settId(1);
        lession.setlName("测试名字");
        lession.setlType("测试1");
        lession.setCredit(4.0);
        lessionDao.addLession(lession);
        System.out.println(lession);
    }

    @Test
    public void delete() {
        lessionDao.findAll();
        int i = lessionDao.deleteLession(171);
        System.out.println(i);
    }

    @Test
    public void update() {
        this.findAll();
        Lession lession = lessionDao.findByid(1);
        lession.setCredit(6.0);
        lessionDao.updateLession(lession);
        this.findAll();
    }

    @Test
    public void checkName() {

        Lession lession = lessionDao.checkName("旅游经济学");
        System.out.println(lession);

    }

    @Test
    public void findName() {
        String name = "旅游";
        List<LessionTeacherVo> byName = lessionDao.findByName(name);
        for (LessionTeacherVo lessionTeacherVo : byName) {
            System.out.println(lessionTeacherVo);
        }
    }
    @Test
    public void findByltype(){
        List<LessionTeacherVo> list = lessionDao.findByLtype("选修");
        System.out.println(list);
    }
}
