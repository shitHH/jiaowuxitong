package com.etc.vo;

public class ScoreVO {
    /**
     * 成绩编号
     */
    private int scoreId;
    /**
     * 学生学号
     */
    private int sId;
    /**
     * 课程编号
     */
    private int lId;
    /**
     * 成绩
     */
    private Double score;
    /**
     * 学生姓名
     */
    private String sname;
    /**
     * 课程名称
     */
    private String lname;
    private int cid ;
    private String classname;
    private int gid;
    private String gname;
    private int mid;
    private String mname;
    private int collid;
    private String collname;
    private double credit;

    public ScoreVO() {
    }

    public ScoreVO(int scoreId, int sId, int lId, Double score, String sname, String lname, int cid, String classname, int gid, String gname, int mid, String mname, int collid, String collname,double credit) {
        this.scoreId = scoreId;
        this.sId = sId;
        this.lId = lId;
        this.score = score;
        this.sname = sname;
        this.lname = lname;
        this.cid = cid;
        this.classname = classname;
        this.gid = gid;
        this.gname = gname;
        this.mid = mid;
        this.mname = mname;
        this.collid = collid;
        this.collname = collname;
        this.credit = credit;
    }

    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getCollid() {
        return collid;
    }

    public void setCollid(int collid) {
        this.collid = collid;
    }

    public String getCollname() {
        return collname;
    }

    public void setCollname(String collname) {
        this.collname = collname;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
