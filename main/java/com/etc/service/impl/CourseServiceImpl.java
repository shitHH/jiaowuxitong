package com.etc.service.impl;

import com.etc.dao.CourseDao;
import com.etc.po.Course;
import com.etc.po.Time;
import com.etc.service.CourseService;
import com.etc.service.TimeService;
import com.etc.vo.CourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 21:59
 * 排课业务逻辑实现类
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    @Autowired
    TimeService timeService;

    @Override
    public List<CourseVo> findClassAll(int cId) {
        return courseDao.findClassAll(cId);
    }

    @Override
    public List<CourseVo> findByLid(int lid) {
        return courseDao.findByLid(lid);
    }

    @Override
    public List<Course> findByClassroomIdAndWeek(Course course) {
        return courseDao.findByClassroomIdAndWeek(course);
    }

    @Override
    public boolean addCourse(Course course) {
        return courseDao.addCourse(course) > 0 ? true : false;
    }

    @Override
    public boolean deleteByCid(int[] courseId) {
        return courseDao.deleteByCid(courseId) > 0 ? true : false;
    }

    @Override
    public List<CourseVo> findAll() {
        return courseDao.findAll();
    }

    @Override
    public List<CourseVo> findByClassroomId(int classroomId) {
        return courseDao.findByClassroomId(classroomId);
    }

    @Override
    public List<Time> checkClassroom(Course course) {
        List<Time> list = new ArrayList<>();
        List<Integer> integeres = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        List<Course> byClassroomIdAndWeek = courseDao.findByClassroomIdAndWeek(course);
        for (Course course1 : byClassroomIdAndWeek) {
            integeres.add(course1.getTimeId());
        }
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        integerList.removeAll(integeres);
        for (Integer integer : integerList) {
            Time byId = timeService.findById(integer);
            list.add(byId);
        }
        return list;
    }

    @Override
    public Course findSame(Course course) {
        return courseDao.findSame(course);
    }
}
