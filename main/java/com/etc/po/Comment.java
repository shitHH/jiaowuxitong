package com.etc.po;


import ch.qos.logback.core.net.server.ServerListener;
import lombok.ToString;

import java.io.Serializable;

/**
 * 教学评价实体类
 * @author JIA
 */
@ToString
public class Comment implements Serializable {
    private int comid;//评价id
    private  int sid ;//学生编号
    private  int tid;//教师编号
    private  int chooseid;//题目编号
    private  int comscore;//评价分数


    public Comment() {
    }

    public Comment(int comid, int sid, int tid, int chooseid, int comscore) {
        this.comid = comid;
        this.sid = sid;
        this.tid = tid;
        this.chooseid = chooseid;
        this.comscore = comscore;

    }

    public Comment(int sid, int tid, int chooseid, int comscore) {
        this.sid = sid;
        this.tid = tid;
        this.chooseid = chooseid;
        this.comscore = comscore;
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

    public int getComscore() {
        return comscore;
    }

    public void setComscore(int comscore) {
        this.comscore = comscore;
    }


}
