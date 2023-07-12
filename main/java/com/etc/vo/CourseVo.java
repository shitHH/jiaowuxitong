package com.etc.vo;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 20:20
 * 课程安排表VO
 */
public class CourseVo {
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
    private int tid;

    /**
     * 周几
     */
    private String week;

    private String tName;

    private String lName;

    private String timeName;

    private String cName;

    private String className;

    public CourseVo(int courseId, int cId, int lId, int timeId, int classroomId, String week, String tName, String lName, String timeName, String cName, String className,int tid) {
        this.courseId = courseId;
        this.cId = cId;
        this.lId = lId;
        this.timeId = timeId;
        this.classroomId = classroomId;
        this.week = week;
        this.tName = tName;
        this.lName = lName;
        this.timeName = timeName;
        this.cName = cName;
        this.className = className;
        this.tid = tid;
    }

    public CourseVo(int courseId, int cId, int lId, int timeId, int classroomId, String week, String tName, String lName, String timeName, String cName,int tid) {
        this.courseId = courseId;
        this.cId = cId;
        this.lId = lId;
        this.timeId = timeId;
        this.classroomId = classroomId;
        this.week = week;
        this.tName = tName;
        this.lName = lName;
        this.timeName = timeName;
        this.cName = cName;
        this.tid = tid;
    }

    public CourseVo(int courseId, int cId, int lId, int timeId, int classroomId, String week, String lName, String timeName, String cName,int tid) {
        this.courseId = courseId;
        this.cId = cId;
        this.lId = lId;
        this.timeId = timeId;
        this.classroomId = classroomId;
        this.week = week;
        this.lName = lName;
        this.timeName = timeName;
        this.cName = cName;
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "CourseVo{" +
                "courseId=" + courseId +
                ", cId=" + cId +
                ", lId=" + lId +
                ", timeId=" + timeId +
                ", classroomId=" + classroomId +
                ", week='" + week + '\'' +
                ", tName='" + tName + '\'' +
                ", lName='" + lName + '\'' +
                ", timeName='" + timeName + '\'' +
                ", cName='" + cName + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public CourseVo() {
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
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

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
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

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
