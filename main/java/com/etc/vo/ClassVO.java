package com.etc.vo;

/**
 * @author:yjt
 * @category 班级实体类
 */
public class ClassVO {

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
    private int gId;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 班级状态
     */
    private String cState;

    /**
     * 专业名称
     */
    private String mName;

    /**
     * 年级名称
     */
    private String gName;

    public ClassVO() {
    }

    public ClassVO(int cId, int mId, int gId, String className, String cState, String mName, String gName) {
        this.cId = cId;
        this.mId = mId;
        this.gId = gId;
        this.className = className;
        this.cState = cState;
        this.mName = mName;
        this.gName = gName;
    }

    @Override
    public String toString() {
        return "ClassVO{" +
                "cId=" + cId +
                ", mId=" + mId +
                ", gId=" + gId +
                ", className='" + className + '\'' +
                ", cState='" + cState + '\'' +
                ", mName='" + mName + '\'' +
                ", gName='" + gName + '\'' +
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
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }
}
