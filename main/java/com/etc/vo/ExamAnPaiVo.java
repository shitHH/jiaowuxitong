package com.etc.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/6 15:17
 * 考试安排vo
 */
public class ExamAnPaiVo {

    /**
     * 考试安排编号
     */
    private int eId;

    /**
     *时间段编号
     */
    private int timeId;

    /**
     * 班级编号
     */
    private int cId;

    /**
     * 课程编号
     */
    private int lId;

    /**
     * 教室编号
     */
    private int classroomId;

    /**
     *监考老师编号
     */
    private int tId;

    /**
     * 考试日期
     */

    private String date;

    private String tName;

    private String lName;

    private String timeName;

    private String cName;

    private String className;

    public ExamAnPaiVo() {
    }

    @Override
    public String toString() {
        return "ExamAnPaiVo{" +
                "eId=" + eId +
                ", timeId=" + timeId +
                ", cId=" + cId +
                ", lId=" + lId +
                ", classroomId=" + classroomId +
                ", tId=" + tId +
                ", date='" + date + '\'' +
                ", tName='" + tName + '\'' +
                ", lName='" + lName + '\'' +
                ", timeName='" + timeName + '\'' +
                ", cName='" + cName + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ExamAnPaiVo(int eId, int timeId, int cId, int lId, int classroomId, int tId, String date, String tName, String lName, String timeName, String cName, String className) {
        this.eId = eId;
        this.timeId = timeId;
        this.cId = cId;
        this.lId = lId;
        this.classroomId = classroomId;
        this.tId = tId;
        this.date = date;
        this.tName = tName;
        this.lName = lName;
        this.timeName = timeName;
        this.cName = cName;
        this.className = className;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
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

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getDate() {
        return date;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
