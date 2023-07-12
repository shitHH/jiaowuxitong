package com.etc.service;

import com.etc.po.Course;
import com.etc.po.Time;
import com.etc.vo.CourseVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 21:58
 * 排课安排业务逻辑接口
 */
public interface CourseService {
    /**
     * @return 课程集合
     * 根据班级编号查找所有课程安排
     */
    public List<CourseVo> findClassAll(@Param("cid") int cId);

    /**
     * @param lid 教师编号
     * @return 课程vo集合
     * 根据教师编号查询所有课程安排
     */
    public List<CourseVo> findByLid(@Param("lid")int lid);

    /**
     * @return 课程集合
     * 查询所有课程安排
     */
    public List<CourseVo> findAll();

    /**
     * @param classroomId 教室编号
     * @return 课程集合
     * 根据教师编号查询所有课程安排
     */
    public List<CourseVo> findByClassroomId(@Param("id") int classroomId );

    /**
     * @param course 课程安排对象
     * @return 课程安排集合
     * 根据教室编号和星期查询教室使用情况
     */
    public List<Course> findByClassroomIdAndWeek(Course course);

    /**
     * @param course 课程安排对象
     * @return 受影响行数
     */
    public boolean addCourse(Course course);

    /**
     * @param courseId 课程安排编号数组
     * @return 受影响行数
     * 删除课程安排
     */
    public boolean deleteByCid(int [] courseId);

    /**
     * @param course 排课对象
     * @return 时间段集合
     * 查看教室使用情况
     */
    public List<Time> checkClassroom(Course course);

    /**
     * @param course 课程对象
     * @return 课程对象
     * 查询同一时间段是否有相同课程
     */
    public Course findSame(Course course);
}
