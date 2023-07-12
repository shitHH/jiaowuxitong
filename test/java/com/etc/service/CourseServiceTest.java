package com.etc.service;

import com.etc.po.Course;
import com.etc.po.Time;
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
 * Create by 2022/10/5 22:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class CourseServiceTest {

    @Autowired
    CourseService courseService;
    
    @Test
    public void checkClassroom(){
        Course course = new Course();
        course.setWeek("周二");
        course.setClassroomId(1);
        List<Time> list = courseService.checkClassroom(course);
        for (Time time : list) {
            System.out.println(time);
        }
    }


    @Test
    public void findClassAll(){

        List<CourseVo> classAll = courseService.findClassAll(1);

        for (CourseVo course : classAll) {
            System.out.println(course);
        }
    }

    @Test
    public void addCourse(){

        Course course = new Course(1,4,4,2,"周四");

        courseService.addCourse(course);

        this.findClassAll();
    }

    @Test
    public void deleteCourse(){

        int[]array = {7,9};

        courseService.deleteByCid(array);

        this.findClassAll();

    }

    @Test
    public void findByLid(){
        List<CourseVo> byTid = courseService.findByLid(1);
        for (CourseVo courseVo : byTid) {
            System.out.println(courseVo);
        }
    }

    @Test
    public void findByClassroomIdAndWeek(){
        Course course = new Course();
        course.setWeek("周二");
        course.setClassroomId(1);
        List<Course> byClassroomIdAndWeek = courseService.findByClassroomIdAndWeek(course);
        for (Course course1 : byClassroomIdAndWeek) {
            System.out.println(course1);
        }
    }

    @Test
    public void findAll(){

        List<CourseVo> all = courseService.findAll();
        for (CourseVo courseVo : all) {
            System.out.println(courseVo);
        }
    }

    @Test
    public void findByClassroomId(){
        List<CourseVo> byClassroomId = courseService.findByClassroomId(1);
        for (CourseVo courseVo : byClassroomId) {
            System.out.println(courseVo);
        }
    }

    @Test
    public void findSame(){
        Course course = new Course();
        course.setlId(1);
        course.setTimeId(1);
        Course same = courseService.findSame(course);
        System.out.println(same);
    }
}
