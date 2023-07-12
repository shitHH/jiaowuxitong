package com.etc.dao;

import com.etc.po.Course;
import com.etc.vo.CourseVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 20:15
 * 课程安排数据访问测试类
 */
@SpringBootTest
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
public class CourseDaoTest {

    @Autowired
    CourseDao courseDao;

    @Test
    public void findClassAll() {


        List<CourseVo> classAll = courseDao.findClassAll(1);
        if (classAll.size() == 0) {
            System.out.println(666);
        }
        for (CourseVo course : classAll) {
            System.out.println(course);
        }
    }

    @Test
    public void addCourse() {

        Course course = new Course(1, 4, 4, 2, "周四");

        courseDao.addCourse(course);

        this.findClassAll();
    }

    @Test
    public void deleteCourse() {

        int[] array = {8, 3};

        courseDao.deleteByCid(array);

        this.findClassAll();

    }

    @Test
    public void findByLid() {
        List<CourseVo> byTid = courseDao.findByLid(1);
        for (CourseVo courseVo : byTid) {
            System.out.println(courseVo);
        }
    }

    @Test
    public void findByClassroomIdAndWeek() {
        Course course = new Course();
        course.setWeek("周一");
        course.setClassroomId(1);
        List<Course> byClassroomIdAndWeek = courseDao.findByClassroomIdAndWeek(course);
        for (Course course1 : byClassroomIdAndWeek) {
            System.out.println(course1);
        }
    }

    @Test
    public void findAll() {

        List<CourseVo> all = courseDao.findAll();
        for (CourseVo courseVo : all) {
            System.out.println(courseVo);
        }
    }

    @Test
    public void findByClassroomId() {
        List<CourseVo> byClassroomId = courseDao.findByClassroomId(1);
        for (CourseVo courseVo : byClassroomId) {
            System.out.println(courseVo);
        }
    }

    @Test
    public void findSame() {
        Course course = new Course();
        course.setlId(4);
        course.setTimeId(2);
        Course same = courseDao.findSame(course);
        System.out.println(same);
    }
}
