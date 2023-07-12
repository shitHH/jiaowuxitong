package com.etc.po;

import org.springframework.stereotype.Component;

/**
 * @author lyt
 * 课程实体类
 */
@Component
public class Lession {
    /**
     * 课程编号
     */
    private int lId;
    /**
     * 老师编号
     */
    private int tId;
    /**
     * 课程名称
     */
    private String lName;
    /**
     * 课程类型
     */
    private String lType;
    /**
     * 学分
     */
    private Double credit;

    @Override
    public String toString() {
        return "Lession{" +
                "lId=" + lId +
                ", tId=" + tId +
                ", lName='" + lName + '\'' +
                ", lType='" + lType + '\'' +
                ", credit=" + credit +
                '}';
    }

    public Lession() {
    }

    public Lession(int lId, int tId, String lName, String lType, Double credit) {
        this.lId = lId;
        this.tId = tId;
        this.lName = lName;
        this.lType = lType;
        this.credit = credit;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlType() {
        return lType;
    }

    public void setlType(String lType) {
        this.lType = lType;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }
}
