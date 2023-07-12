package com.etc.po;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author:yjt
 * @category 学费记录实体类
 */
public class Record {

    /**
     * 学费记录编号
     */
    private int monId;

    /**
     * 学生编号
     */
    private int sId;

    /**
     * 缴费时间
     */
    private Timestamp mTime;

    /**
     * 缴费年度
     */
    private String mYear;

    /**
     * 缴费状态
     */
    private String rState;

    public Record() {
    }


    public Record(int monId, int sId, Timestamp mTime, String mYear, String rState) {
        this.monId = monId;
        this.sId = sId;
        this.mTime = mTime;
        this.mYear = mYear;
        this.rState = rState;
    }

    @Override
    public String toString() {
        return "Record{" +
                "monId=" + monId +
                ", sId=" + sId +
                ", mTime=" + mTime +
                ", mYear='" + mYear + '\'' +
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

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Timestamp mTime) {
        this.mTime = mTime;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public String getrState() {
        return rState;
    }

    public void setrState(String rState) {
        this.rState = rState;
    }
}
