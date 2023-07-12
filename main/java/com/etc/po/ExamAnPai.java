package com.etc.po;

import java.util.Date;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/4 23:09
 * 考试安排拍记录实体类
 */
public class ExamAnPai {

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
    private Date date;

    public ExamAnPai() {
    }

    public ExamAnPai(int timeId, int cId, int lId, int classroomId, int tId, Date date) {
        this.timeId = timeId;
        this.cId = cId;
        this.lId = lId;
        this.classroomId = classroomId;
        this.tId = tId;
        this.date = date;
    }

    public ExamAnPai(int timeId, int cId, int lId, int classroomId, int tId) {
        this.timeId = timeId;
        this.cId = cId;
        this.lId = lId;
        this.classroomId = classroomId;
        this.tId = tId;
    }

    public ExamAnPai(int eId, int timeId, int cId, int lId, int classroomId, int tId, Date date) {
        this.eId = eId;
        this.timeId = timeId;
        this.cId = cId;
        this.lId = lId;
        this.classroomId = classroomId;
        this.tId = tId;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExamAnPai{" +
                "eId=" + eId +
                ", timeId=" + timeId +
                ", cId=" + cId +
                ", lId=" + lId +
                ", classroomId=" + classroomId +
                ", tId=" + tId +
                ", date=" + date +
                '}';
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
