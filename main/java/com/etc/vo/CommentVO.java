package com.etc.vo;

/**
 * 教学评价VO实体类
 */
public class CommentVO {
    /**
     * 教评编号
     */
    private int comid;
    /**
     * 学生编号
     */
    private  int sid ;
    /**
     * 学生姓名
     */
    private String sName;
    /**
     * 老师姓名
     */
    private String tName;
    /**
     * 老师编号
     */
    private  int tid;
    /**
     * 选项编号
     */
    private  int chooseid;

    /**
     * 评价内容
     */
    private String content;
    /**
     * 评价分数
     */
    private  int comscore;

    public CommentVO() {
    }

    public CommentVO(int comid, int sid, String sName, String tName, int tid, int chooseid, String content, int comscore) {
        this.comid = comid;
        this.sid = sid;
        this.sName = sName;
        this.tName = tName;
        this.tid = tid;
        this.chooseid = chooseid;
        this.content = content;
        this.comscore = comscore;
    }

    @Override
    public String toString() {
        return "CommentVO{" +
                "comid=" + comid +
                ", sid=" + sid +
                ", sName='" + sName + '\'' +
                ", tName='" + tName + '\'' +
                ", tid=" + tid +
                ", chooseid=" + chooseid +
                ", content='" + content + '\'' +
                ", comscore=" + comscore +
                '}';
    }

    public int getComid() {
        return comid;
    }

    public void setComid(int comid) {
        this.comid = comid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getChooseid() {
        return chooseid;
    }

    public void setChooseid(int chooseid) {
        this.chooseid = chooseid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getComscore() {
        return comscore;
    }

    public void setComscore(int comscore) {
        this.comscore = comscore;
    }
}
