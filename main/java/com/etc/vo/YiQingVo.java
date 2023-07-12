package com.etc.vo;

import java.util.Date;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/12 09:44:38
 * 疫情实体类
 */
public class YiQingVo {
    /**
     * 学生编号
     */
    private int sId;
    /**
     * 日期
     */
    private Date DATE;
    /**
     * 体温
     */
    private Double tiwen;
    /**
     * 班级编号
     */
    private int cId;

    /**
     * 年级编号
     */
    private int gId;

    /**
     * 学生姓名
     */
    private String sName;

    /**
     * 学生性别
     */
    private String sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 地址
     */
    private String address;

    /**
     * 分数
     */
    private int scode;

    /**
     * 电话
     */
    private String sTel;

    /**
     * 邮箱
     */
    private String sEmail;

    /**
     * 政治面貌
     */
    private String status;

    /**
     * 状态
     */
    private String sState;

    /**
     * 头像
     */
    private String sPhoto;

    /**
     * 角色编号
     */
    private int roleId;

    /**
     * 学生密码
     */
    private String sPass;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 年级名称
     */
    private String gName;
    /**
     * 学院编号
     */
    private int collId;
    /**
     * 学院名称
     */
    private String collname;
    /**
     * 专业编号
     */
    private int mId;
    /**
     * 专业名称
     */
    private String mName;

    public YiQingVo() {
    }

    @Override
    public String toString() {
        return "YiQingVo{" +
                "sId=" + sId +
                ", DATE=" + DATE +
                ", tiwen=" + tiwen +
                ", cId=" + cId +
                ", gId=" + gId +
                ", sName='" + sName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", scode=" + scode +
                ", sTel='" + sTel + '\'' +
                ", sEmail='" + sEmail + '\'' +
                ", status='" + status + '\'' +
                ", sState='" + sState + '\'' +
                ", sPhoto='" + sPhoto + '\'' +
                ", roleId=" + roleId +
                ", sPass='" + sPass + '\'' +
                ", className='" + className + '\'' +
                ", gName='" + gName + '\'' +
                ", collId=" + collId +
                ", collname='" + collname + '\'' +
                ", mId=" + mId +
                ", mName='" + mName + '\'' +
                '}';
    }

    public YiQingVo(int sId, Date DATE, Double tiwen, int cId, int gId, String sName, String sex, Date birthday, String address, int scode, String sTel, String sEmail, String status, String sState, String sPhoto, int roleId, String sPass, String className, String gName, int collId, String collname, int mId, String mName) {
        this.sId = sId;
        this.DATE = DATE;
        this.tiwen = tiwen;
        this.cId = cId;
        this.gId = gId;
        this.sName = sName;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.scode = scode;
        this.sTel = sTel;
        this.sEmail = sEmail;
        this.status = status;
        this.sState = sState;
        this.sPhoto = sPhoto;
        this.roleId = roleId;
        this.sPass = sPass;
        this.className = className;
        this.gName = gName;
        this.collId = collId;
        this.collname = collname;
        this.mId = mId;
        this.mName = mName;
    }

    public int getSid() {
        return sId;
    }

    public void setSid(int sid) {
        this.sId = sid;
    }

    public Date getDATE() {
        return DATE;
    }

    public void setDATE(Date DATE) {
        this.DATE = DATE;
    }

    public Double getTiwen() {
        return tiwen;
    }

    public void setTiwen(Double tiwen) {
        this.tiwen = tiwen;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScode() {
        return scode;
    }

    public void setScode(int scode) {
        this.scode = scode;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getsState() {
        return sState;
    }

    public void setsState(String sState) {
        this.sState = sState;
    }

    public String getsPhoto() {
        return sPhoto;
    }

    public void setsPhoto(String sPhoto) {
        this.sPhoto = sPhoto;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public int getCollId() {
        return collId;
    }

    public void setCollId(int collId) {
        this.collId = collId;
    }

    public String getCollname() {
        return collname;
    }

    public void setCollname(String collname) {
        this.collname = collname;
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
}
