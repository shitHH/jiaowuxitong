package com.etc.po;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/4 23:02
 * 排课实体类
 */
public class Course {

    /**
     * 课程安排编号
     */
    private int courseId;

    /**
     * 班级编号
     */
    private int cId;
    /**
     *课程编号
     */
    private int lId;
    /**
     *时间编号
     */
    private int timeId;
    /**
     *教室编号
     */
    private int classroomId;

    /**
     * 周几
     */
    private String week;

    public Course() {
    }

    public Course(int cId, int lId, int timeId, int classroomId, String week) {
        this.cId = cId;
        this.lId = lId;
        this.timeId = timeId;
        this.classroomId = classroomId;
        this.week = week;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", cId=" + cId +
                ", lId=" + lId +
                ", timeId=" + timeId +
                ", classroomId=" + classroomId +
                ", week='" + week + '\'' +
                '}';
    }

    public Course(int courseId, int cId, int lId, int timeId, int classroomId, String week) {
        this.courseId = courseId;
        this.cId = cId;
        this.lId = lId;
        this.timeId = timeId;
        this.classroomId = classroomId;
        this.week = week;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
}
