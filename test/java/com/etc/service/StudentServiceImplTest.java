package com.etc.service;

import com.etc.dao.StudentDaoTest;
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
 * @category 学生业务逻辑实现类测试
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    StudentService studentService;

    Logger logger = Logger.getLogger(StudentServiceImplTest.class);

    @Test
    public void findAll(){
        List<StudentVO> all = studentService.findAll();
        for (StudentVO studentVO : all) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findBySId(){
        StudentVO bySId = studentService.findBySId(2);
        logger.info(bySId);

    }

    @Test
    public void findBySName(){
        List<StudentVO> bySName = studentService.findBySName("李长安");
        for (StudentVO studentVO : bySName) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findByCId(){

        List<StudentVO> byCId = studentService.findByCId(1);
        for (StudentVO studentVO : byCId) {
            logger.info(studentVO);
        }
    }

    @Test
    public void byTel(){
        Student bySTel = studentService.findBySTel("15996369265");
        logger.info(bySTel);
    }


    @Test
    public void findByClassName(){
        List<StudentVO> list = studentService.findByClassName("旅游管理2201");
        for (StudentVO studentVO : list) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findByGId(){
        List<StudentVO> byGId = studentService.findByGId(1);
        for (StudentVO studentVO : byGId) {
            logger.info(studentVO);
        }

    }

    @Test
    public void findByGName(){
        List<StudentVO> byGName = studentService.findByGName("2019级");
        for (StudentVO studentVO : byGName) {
            logger.info(studentVO);
        }
    }

    @Test
    public void findByTelAndPass(){
        StudentVO byTelAndPass = studentService.findByTelAndPass("123456789","2123");
        logger.info(byTelAndPass);
    }

    @Test
    public void findBySIdAndPass(){
        StudentVO bySIdAndPass = studentService.findBySIdAndPass(183, "000000");
        logger.info(bySIdAndPass);
    }

    @Test
    public void findByEmail() {
        Student byEmail = studentService.findByEmail("136131111@qq.com");
        logger.info(byEmail);
    }
    @Test
    public void findBySId2(){
        StudentVO studentVO = studentService.findBySId2(2);
        logger.info(studentVO);
    }

    @Test
    public void addStudent(){
        StudentVO student = new StudentVO();
        student.setcId(1);
        student.setgId(1);
        student.setsName("张明名");
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
        student.setsPass("123456");
//        student.setclassName("旅游管理2201");
        student.setgName("2019级");
        studentService.addStudent(student);
        logger.info(student);
    }

    @Test
    public void add(){
        Student student = new Student();
        student.setsName("张三");
        student.setSex("男");
        student.setBirthday(new Date(System.currentTimeMillis()));
        student.setAddress("陕西西安");
        student.setStatus("共青团员");
        student.setsTel("12312312312");
        boolean b = studentService.add(student);
        logger.info(b);
    }

    @Test
    public void updateStudent(){
        StudentVO bySId = studentService.findBySId(20220027);
        bySId.setsPass("111111");
        studentService.updateStudent(bySId);
        logger.info(bySId);
    }

    @Test
    public void updateSState(){
        StudentVO bySId = studentService.findBySId(183);
        bySId.setsState("2");
        studentService.updateStudent(bySId);
        logger.info(bySId);
    }

    @Test
    public void updatesPass(){
        StudentVO bySId = studentService.findBySId(183);
        bySId.setsPass("000000");
        studentService.updateSPass(bySId);
        logger.info(bySId);
    }

    @Test
    public void deleteStudent(){
        boolean flag = studentService.deleteStudent(184);
        logger.info(flag);
    }

}
