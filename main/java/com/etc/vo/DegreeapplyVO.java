package com.etc.vo;

import java.sql.Timestamp;

public class DegreeapplyVO {
    /**
     * 学位申请编号
     */
    private int did;
    /**
     * 学生编号
     */
    private int sid;
    private String sName;
    private int cid ;
    private String classname;
    private int gid;
    private String gname;
    private int mid;
    private String mname;
    private int collid;
    private String collname;
    /**
     * 学位编号
     */
    private int degreeid;
    private String degreeName;
    /**
     * 学位申请类型
     */
    private String dtype;
    /**
     * 学位申请时间
     */
    private Timestamp ddate;

    public DegreeapplyVO() {
    }

    public DegreeapplyVO(int did, int sid, String sName, int cid, String classname, int gid, String gname, int mid, String mname, int collid, String collname, int degreeid, String degreeName, String dtype, Timestamp ddate) {
        this.did = did;
        this.sid = sid;
        this.sName = sName;
        this.cid = cid;
        this.classname = classname;
        this.gid = gid;
        this.gname = gname;
        this.mid = mid;
        this.mname = mname;
        this.collid = collid;
        this.collname = collname;
        this.degreeid = degreeid;
        this.degreeName = degreeName;
        this.dtype = dtype;
        this.ddate = ddate;
    }

    public DegreeapplyVO(int sid, String sName, int cid, String classname, int gid, String gname, int mid, String mname, int collid, String collname, int degreeid, String degreeName, String dtype, Timestamp ddate) {
        this.sid = sid;
        this.sName = sName;
        this.cid = cid;
        this.classname = classname;
        this.gid = gid;
        this.gname = gname;
        this.mid = mid;
        this.mname = mname;
        this.collid = collid;
        this.collname = collname;
        this.degreeid = degreeid;
        this.degreeName = degreeName;
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

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
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

    public int getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(int degreeid) {
        this.degreeid = degreeid;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
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
