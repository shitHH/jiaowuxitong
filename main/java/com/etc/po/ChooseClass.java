package com.etc.po;

/**
 * 选课表
 */
public class ChooseClass {
    /**
     * 选课编号
     */
    private int choid;
    /**
     * 学生编号
     */
    private int sid;
    /**
     * 课程编号
     */
    private int lid;

    public ChooseClass() {
    }

    public ChooseClass(int choid, int sid, int lid) {
        this.choid = choid;
        this.sid = sid;
        this.lid = lid;
    }

    public ChooseClass(int sid, int lid) {
        this.sid = sid;
        this.lid = lid;
    }

    public int getChoid() {
        return choid;
    }

    public void setChoid(int choid) {
        this.choid = choid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }
}
