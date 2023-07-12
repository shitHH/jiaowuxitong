package com.etc.dao;

import com.etc.po.Student;
import com.etc.vo.StudentVO;
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
 * @category 学生数据访问测试类
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    Logger logger = Logger.getLogger(StudentDaoTest.class);

    @Test
    public void findAll() {
        List<StudentVO> all = studentDao.findAll();
        for (StudentVO studentVO : all) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findBySId() {
        StudentVO bySId = studentDao.findBySId(2);
        logger.info(bySId);

    }

    @Test
    public void byTel(){
        Student bySTel = studentDao.findBySTel("15996369265");
        logger.info(bySTel);
    }

    @Test
    public void findBySName() {
        List<StudentVO> bySName = studentDao.findBySName("李长安");
        for (StudentVO studentVO : bySName) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findByCId() {

        List<StudentVO> byCId = studentDao.findByCId(1);
        for (StudentVO studentVO : byCId) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findByClassName() {
        List<StudentVO> list = studentDao.findByClassName("旅游管理2201");
        for (StudentVO studentVO : list) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findByGId() {
        List<StudentVO> byGId = studentDao.findByGId(1);
        for (StudentVO studentVO : byGId) {
            logger.info(studentVO);
        }

    }

    @Test
    public void findByGName() {
        List<StudentVO> byGName = studentDao.findByGName("2019级");
        for (StudentVO studentVO : byGName) {
            logger.info(studentVO);
        }

    }

    @Test
    public void findByTelAndPass() {
        StudentVO byTelAndPass = studentDao.findByTelAndPass("123456789", "2123");
        logger.info(byTelAndPass);
    }

    @Test
    public void findBySIdAndPass() {
        StudentVO bySIdAndPass = studentDao.findBySIdAndPass(183, "123321");
        logger.info(bySIdAndPass);
    }


    @Test
    public void addStudent() {
        StudentVO student = new StudentVO();
        student.setcId(1);
        student.setgId(1);
        student.setsName("张超");
        student.setSex("男");
        student.setBirthday(new Date(System.currentTimeMillis()));
        student.setAddress("山东");
        student.setScode(1);
        student.setsTel("15996369636");
        student.setsEmail("25123@qq.com");
        student.setStatus("共青团员");
        student.setsState("1");
        student.setsPhoto("暂无");
        student.setRoleId(1);
        student.setsPass("212112");
        studentDao.addStudent(student);
        logger.info(student);
    }

    @Test
    public void updateStudent() {
        StudentVO bySId = studentDao.findBySId(184);
        bySId.setsPass("000122");
        studentDao.updateStudent(bySId);
        logger.info(bySId);
    }

    @Test
    public void updateSState() {
        StudentVO bySId = studentDao.findBySId(183);
        bySId.setsState("2");
        studentDao.updateStudent(bySId);
        logger.info(bySId);
    }

    @Test
    public void updatesPass() {
        StudentVO bySId = studentDao.findBySId(183);
        bySId.setsPass("000");
        studentDao.updateSPass(bySId);
        logger.info(bySId);
    }

    @Test
    public void deleteStudent() {

        int i = studentDao.deleteStudent(184);
        logger.info(i);
    }


}
