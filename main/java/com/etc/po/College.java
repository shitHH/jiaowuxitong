package com.etc.po;



import java.io.Serializable;

/**
 * 学院实体类
 * @author JIA
 */

public class College implements Serializable {

    private int collid;//学院编号
    private  String  collname; //学院名称

    public College(int collid, String collname) {
        this.collid = collid;
        this.collname = collname;
    }

    public College() {
    }

    public int getCollid() {

        return collid;
    }

    public void setCollid(int collid) {
        this.collid = collid;
    }

    public String getCollname() {
        return collname;
    }

    public void setCollname(String collname) {
        this.collname = collname;
    }
}
