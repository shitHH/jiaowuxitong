package com.etc.vo;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 14:32:18
 */
public class MajorVo {

    /**
     * 专业编码
     */
    private int mId;
    /**
     * 学院编号
     */
    private int collId;
    /**
     * 专业名称
     */
    private String mName;
    /**
     * 专业学费
     */
    private Double mMoney;

    /**
     * 学院名称
     */
    private String collName;



    public MajorVo(int mId, int collId, String mName, Double mMoney, String collName) {
        this.mId = mId;
        this.collId = collId;
        this.mName = mName;
        this.mMoney = mMoney;
        this.collName = collName;
    }

    public MajorVo() {
    }

    @Override
    public String toString() {
        return "MajorVo{" +
                "mId=" + mId +
                ", collId=" + collId +
                ", mName='" + mName + '\'' +
                ", mMoney=" + mMoney +
                ", collName='" + collName + '\'' +
                '}';
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getCollId() {
        return collId;
    }

    public void setCollId(int collId) {
        this.collId = collId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Double getmMoney() {
        return mMoney;
    }

    public void setmMoney(Double mMoney) {
        this.mMoney = mMoney;
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

}
