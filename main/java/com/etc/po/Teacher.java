package com.etc.po;


import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 教师实体类
 * @author  Jxx
 */
@ToString
public class Teacher implements Serializable {

    private  int tid ; //教师编号
    private  int  collid;//学院编号
    private  String tName;//教师姓名
    private String tsex; //教师性别
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tbirthday;//教师出生年月日
    private String taddress ;// 教师家庭地址
    private int status;//邮政编码
    private String ttel;// 教师电话
    private String temail;//教师邮箱
    private String teducation;//教师学历
    private String profession;//教师职称
    private String tstate;//教师状态
    private  String  tphoto;//教师图片链接
    private  int roleid;//教师职称id
    private  String tpass;//登录密码

    public Teacher() {
    }

    public Teacher(int tid, int collid, String tName, String tsex, Date tbirthday, String taddress, int status, String ttel, String temail, String teducation, String profession, String tstate, String tphoto, int roleid, String tpass) {
        this.tid = tid;
        this.collid = collid;
        this.tName = tName;
        this.tsex = tsex;
        this.tbirthday = tbirthday;
        this.taddress = taddress;
        this.status = status;
        this.ttel = ttel;
        this.temail = temail;
        this.teducation = teducation;
        this.profession = profession;
        this.tstate = tstate;
        this.tphoto = tphoto;
        this.roleid = roleid;
        this.tpass = tpass;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", collid=" + collid +
                ", tName='" + tName + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tbirthday=" + tbirthday +
                ", taddress='" + taddress + '\'' +
                ", status=" + status +
                ", ttel='" + ttel + '\'' +
                ", temail='" + temail + '\'' +
                ", teducation='" + teducation + '\'' +
                ", profession='" + profession + '\'' +
                ", tstate='" + tstate + '\'' +
                ", tphoto='" + tphoto + '\'' +
                ", roleid=" + roleid +
                ", tpass='" + tpass + '\'' +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getCollid() {
        return collid;
    }

    public void setCollid(int collid) {
        this.collid = collid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getTname() {
        return tName;
    }

    public void setTname(String tname) {
        this.tName = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }


    public Date getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(Date tbirthday) {
        this.tbirthday = tbirthday;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTtel() {
        return ttel;
    }

    public void setTtel(String ttel) {
        this.ttel = ttel;
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }

    public String getTeducation() {
        return teducation;
    }

    public void setTeducation(String teducation) {
        this.teducation = teducation;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTstate() {
        return tstate;
    }

    public void setTstate(String tstate) {
        this.tstate = tstate;
    }

    public String getTphoto() {
        return tphoto;
    }

    public void setTphoto(String tphoto) {
        this.tphoto = tphoto;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getTpass() {
        return tpass;
    }

    public void setTpass(String tpass) {
        this.tpass = tpass;
    }
}
