package com.etc.dao;

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
 * @date 2022/10/8 10:41:04
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherDaoTest {
    @Autowired
    TeacherDao teacherDao;

    Logger logger = Logger.getLogger(TeacherDaoTest.class);
    @Test
    public void findall(){
        List<TeacherVO> list = teacherDao.findAll();
        for (TeacherVO teacherVO:list){
            System.out.println(teacherVO);
        }
    }

    @Test
    public void findbytid(){
        TeacherVO byTid = teacherDao.findByTid(209);
        System.out.println(byTid);
    }

    @Test
    public void findByTidAndTpass(){
        TeacherVO byTidAndTpass = teacherDao.findByTidAndTpass(1,"000");
        logger.info(byTidAndTpass);
    }

    @Test
    public void findbyroleid(){
        List<TeacherVO> list=teacherDao.findByRoleid(2);
        for (TeacherVO teacherVO:list){
            System.out.println(teacherVO);
        }
    }
    @Test
    public void findcollid(){
        List<TeacherVO> list = teacherDao.findByCollid(1);
        for (TeacherVO teacherVO:list){
            System.out.println(teacherVO);
        }
    }
    @Test
    public void addteacher(){
        Teacher teacher=new Teacher();
        teacher.setTaddress("address");
        teacher.setTname("name");
        teacher.setRoleid(2);
        teacher.setCollid(2);
        teacher.setTpass("123");
        int addteacher = teacherDao.addteacher(teacher);
        System.out.println(addteacher);
    }
    @Test
    public void editteacher(){
        Teacher teacher = new Teacher();
        teacher.setTid(1);
        teacher.setCollid(1);
        teacher.setRoleid(2);
        teacher.setTname("xiugai");
        int editteacher = teacherDao.editteacher(teacher);
        System.out.println(editteacher);
    }

}
