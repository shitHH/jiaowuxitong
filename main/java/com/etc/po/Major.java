package com.etc.po;

import org.springframework.stereotype.Component;

/**
 * @author lyt
 * 专业实体类
 */
@Component
public class Major {
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

    @Override
    public String toString() {
        return "Major{" +
                "mId=" + mId +
                ", collId=" + collId +
                ", mName='" + mName + '\'' +
                ", mMoney=" + mMoney +
                '}';
    }

    public Major() {
    }

    public Major(int mId, int collId, String mName, Double mMoney) {
        this.mId = mId;
        this.collId = collId;
        this.mName = mName;
        this.mMoney = mMoney;
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
}
