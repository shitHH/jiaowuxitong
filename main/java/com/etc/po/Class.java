package com.etc.po;

/**
 * @author:yjt
 * @category 班级实体类
 */
public class Class {

    /**
     * 班级编号
     */
    private int cId;

    /**
     * 专业编号
     */
    private int mId;

    /**
     * 年级编号
     */
    private int gid;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 班级状态
     */
    private String cState;

    public Class() {
    }

    public Class(int cId, int mId, int gId, String className, String cState) {
        this.cId = cId;
        this.mId = mId;
        this.gid = gId;
        this.className = className;
        this.cState = cState;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cId=" + cId +
                ", mId=" + mId +
                ", gId=" + gid +
                ", className='" + className + '\'' +
                ", cState='" + cState + '\'' +
                '}';
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getgId() {
        return gid;
    }

    public void setgId(int gId) {
        this.gid = gId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getcState() {
        return cState;
    }

    public void setcState(String cState) {
        this.cState = cState;
    }
}
