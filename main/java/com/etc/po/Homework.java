package com.etc.po;

/**
 * 作业表
 */
public class Homework {
    /**
     * 作业编号
     */
    private int homeid;
    /**
     * 班级编号
     */
    private int cid;
    /**
     * 教师公号
     */
    private int tid;
    /**
     * 作业内容
     */
    private String homename;

    public Homework() {
    }

    public Homework(int homeid, int cid, int tid, String homename) {
        this.homeid = homeid;
        this.cid = cid;
        this.tid = tid;
        this.homename = homename;
    }

    public int getHomeid() {
        return homeid;
    }

    public void setHomeid(int homeid) {
        this.homeid = homeid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getHomename() {
        return homename;
    }

    public void setHomename(String homename) {
        this.homename = homename;
    }
}
