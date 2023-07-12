package com.etc.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 教评表
 *
 * @author carl
 */
public class ApTchVO implements Serializable {
      private int  Apid;
      private int sid;//学生id
      private  int tid; //教师编号
      private  int comscore;//评价分数
      private int erstate;//评教分数状态
      private  String tname;//教师姓名
      private String tsex; //教师性别
      private Timestamp tbirthday;//教师出生年月日
      private String taddress ;// 教师家庭地址
      private int status;//邮政编码
      private String ttel;// 教师电话
      private String temail;//教师邮箱
      private String teducation;//教师学历
      private String profession;//教师职称
      private String tstate;//教师状态
      private Integer teid; //教师成绩编号
      private Integer pcount; //评教人数
      private Date tetime; //成绩时间
      private Integer semester; //学期

      private double exam; //总成绩

      public double getExam() {
            return exam;
      }

      public void setExam(double exam) {
            this.exam = exam;
      }

      public int getApid() {
            return Apid;
      }

      public void setApid(int apid) {
            Apid = apid;
      }

      public int getSid() {
            return sid;
      }

      public void setSid(int sid) {
            this.sid = sid;
      }

      public int getTid() {
            return tid;
      }

      public void setTid(int tid) {
            this.tid = tid;
      }

      public int getComscore() {
            return comscore;
      }

      public void setComscore(int comscore) {
            this.comscore = comscore;
      }

      public int getErstate() {
            return erstate;
      }

      public void setErstate(int erstate) {
            this.erstate = erstate;
      }

      public String getTname() {
            return tname;
      }

      public void setTname(String tname) {
            this.tname = tname;
      }

      public String getTsex() {
            return tsex;
      }

      public void setTsex(String tsex) {
            this.tsex = tsex;
      }

      public Timestamp getTbirthday() {
            return tbirthday;
      }

      public void setTbirthday(Timestamp tbirthday) {
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



      public Integer getTeid() {
            return teid;
      }

      public void setTeid(Integer teid) {
            this.teid = teid;
      }

      public Integer getPcount() {
            return pcount;
      }

      public void setPcount(Integer pcount) {
            this.pcount = pcount;
      }

      public Date getTetime() {
            return tetime;
      }

      public void setTetime(Date tetime) {
            this.tetime = tetime;
      }

      public Integer getSemester() {
            return semester;
      }

      public void setSemester(Integer semester) {
            this.semester = semester;
      }
}
