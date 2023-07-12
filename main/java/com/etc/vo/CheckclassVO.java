package com.etc.vo;

public class CheckclassVO {
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
    /**
     * 学生姓名
     */
    private String sName;
    /**
     * 课程名称
     */
    private String lName;

    public CheckclassVO() {
    }


    public CheckclassVO(int choid, int sid, int lid, String sName, String lName) {
        this.choid = choid;
        this.sid = sid;
        this.lid = lid;
        this.sName = sName;
        this.lName = lName;
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

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
