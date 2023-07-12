package com.etc.service;

import com.etc.po.Teacher;
import com.etc.vo.TeacherVO;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 10:59:37
 */
@RunWith(SpringRunner.class)
@MapperScan("com.etc.dao")
@SpringBootTest
public class TeacherServiceTest {
    @Autowired
    TeacherService teacherService;

    Logger logger = Logger.getLogger(TeacherServiceTest.class);

    @Test
    public void findall() {
        List<TeacherVO> all = teacherService.findAll();
        for (TeacherVO teacherVO : all) {
            System.out.println(teacherVO);
        }
    }

    @Test
    public void findbytid() {
        TeacherVO byTid = teacherService.findByTid(209);
        System.out.println(byTid);
    }

    @Test
    public void findByTidAndTpass(){
        TeacherVO byTidAndTpass = teacherService.findByTidAndTpass(1,"000");
        logger.info(byTidAndTpass);
    }

    @Test
    public void findbyroleid() {
        List<TeacherVO> list = teacherService.findByRoleid(2);
        for (TeacherVO teacherVO : list) {
            System.out.println(teacherVO);
        }
    }

    @Test
    public void findcollid() {
        List<TeacherVO> list = teacherService.findByCollid(1);
        for (TeacherVO teacherVO : list) {
            System.out.println(teacherVO);
        }
    }

    @Test
    public void addteacher() {
        Teacher teacher = new Teacher();
        teacher.setTaddress("address");
        teacher.setTname("name");
        teacher.setRoleid(2);
        teacher.setCollid(2);
        boolean addteacher = teacherService.addteacher(teacher);
        System.out.println(addteacher);
    }

    @Test
    public void editteacher() {
        Teacher teacher = new Teacher();
        teacher.setTid(1);
        teacher.setCollid(1);
        teacher.setRoleid(2);
        teacher.setTname("xiugai");
        boolean editteacher = teacherService.editteacher(teacher);
        System.out.println(editteacher);
    }
}
