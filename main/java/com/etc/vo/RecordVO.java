package com.etc.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author:yjt
 * @category 学费记录实体类
 */
public class RecordVO {

    /**
     * 学费记录编号
     */
    private int monId;

    /**
     * 学生编号
     */
    private int sId;

    /**
     * 学生名称
     */
    private String sName;
    /**
     * 专业编号
     */
    private int mId;
    /**
     * 专业名称
     */
    private String mName;
    /**
     * 学院编号
     */
    private int collid;
    /**
     * 学院名称
     */
    private String collname;
    /**
     * 教室编号
     */
    private int cId;
    /**
     * 教室名
     */
    private String className;
    /**
     * 年级编号
     */
    private int gid;
    /**
     * 年级名称
     */
    private String gname;

    /**
     * 缴费时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date mTime;

    /**
     * 缴费年度
     */
    private String mYear;
    /**
     * 专业学费
     */
    private Double mMoney;
    /**
     * 头像
     */
    private String sPhoto;

    /**
     * 缴费状态
     */
    private String rState;

    public RecordVO() {
    }

    public RecordVO(int monId, int sId, String sName, int mId, String mName, int collid, String collname, int cId, String className, int gid, String gname, Date mTime, String mYear, Double mMoney, String sPhoto, String rState) {
        this.monId = monId;
        this.sId = sId;
        this.sName = sName;
        this.mId = mId;
        this.mName = mName;
        this.collid = collid;
        this.collname = collname;
        this.cId = cId;
        this.className = className;
        this.gid = gid;
        this.gname = gname;
        this.mTime = mTime;
        this.mYear = mYear;
        this.mMoney = mMoney;
        this.sPhoto = sPhoto;
        this.rState = rState;
    }

    @Override
    public String toString() {
        return "RecordVO{" +
                "monId=" + monId +
                ", sId=" + sId +
                ", sName='" + sName + '\'' +
                ", mId=" + mId +
                ", mName='" + mName + '\'' +
                ", collid=" + collid +
                ", collname='" + collname + '\'' +
                ", cId=" + cId +
                ", className='" + className + '\'' +
                ", gid=" + gid +
                ", gname='" + gname + '\'' +
                ", mTime=" + mTime +
                ", mYear='" + mYear + '\'' +
                ", mMoney=" + mMoney +
                ", sPhoto='" + sPhoto + '\'' +
                ", rState='" + rState + '\'' +
                '}';
    }

    public int getMonId() {
        return monId;
    }

    public void setMonId(int monId) {
        this.monId = monId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
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

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public Double getmMoney() {
        return mMoney;
    }

    public void setmMoney(Double mMoney) {
        this.mMoney = mMoney;
    }

    public String getsPhoto() {
        return sPhoto;
    }

    public void setsPhoto(String sPhoto) {
        this.sPhoto = sPhoto;
    }

    public String getrState() {
        return rState;
    }

    public void setrState(String rState) {
        this.rState = rState;
    }
}
