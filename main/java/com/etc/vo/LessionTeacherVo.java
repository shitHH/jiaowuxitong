package com.etc.vo;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 09:28:20
 * 课程教师类
 */
public class LessionTeacherVo {

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

    private String tName;

    public LessionTeacherVo(int lId, int tId, String lName, String lType, Double credit, String tName) {
        this.lId = lId;
        this.tId = tId;
        this.lName = lName;
        this.lType = lType;
        this.credit = credit;
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "LessionTeacherVo{" +
                "lId=" + lId +
                ", tId=" + tId +
                ", lName='" + lName + '\'' +
                ", lType='" + lType + '\'' +
                ", credit=" + credit +
                ", tName='" + tName + '\'' +
                '}';
    }

    public LessionTeacherVo() {
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

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
