package com.etc.po;

import java.sql.Timestamp;

/**
 * 学位申请表
 */
public class Degreeapply {
    /**
     * 学位申请编号
     */
    private int did;
    /**
     * 学生编号
     */
    private int sid;
    /**
     * 学位编号
     */
    private int degreeid;
    /**
     * 学位申请类型
     */
    private String dtype;
    /**
     * 学位申请时间
     */
    private Timestamp ddate;

    public Degreeapply() {
    }

    public Degreeapply(int did, int sid, int degreeid, String dtype, Timestamp ddate) {
        this.did = did;
        this.sid = sid;
        this.degreeid = degreeid;
        this.dtype = dtype;
        this.ddate = ddate;
    }

    public Degreeapply(int sid, int degreeid, String dtype, Timestamp ddate) {
        this.sid = sid;
        this.degreeid = degreeid;
        this.dtype = dtype;
        this.ddate = ddate;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(int degreeid) {
        this.degreeid = degreeid;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public Timestamp getDdate() {
        return ddate;
    }

    public void setDdate(Timestamp ddate) {
        this.ddate = ddate;
    }
}
