package com.etc.vo;

public class XuankeVO {
    private int xuankeid;
    private int sid;
    private int photoid;
    private String sname;
    private String photoname;
    private String phototype;
    private String ptname;

    public XuankeVO() {
    }

    public XuankeVO(int xuankeid, int sid, int photoid, String sname, String photoname, String phototype, String ptname) {
        this.xuankeid = xuankeid;
        this.sid = sid;
        this.photoid = photoid;
        this.sname = sname;
        this.photoname = photoname;
        this.phototype = phototype;
        this.ptname = ptname;
    }

    public XuankeVO(int sid, int photoid, String sname,  String photoname, String phototype, String ptname) {
        this.sid = sid;
        this.photoid = photoid;
        this.sname = sname;
        this.photoname = photoname;
        this.phototype = phototype;
        this.ptname = ptname;
    }

    public int getXuankeid() {
        return xuankeid;
    }

    public void setXuankeid(int xuankeid) {
        this.xuankeid = xuankeid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getPhotoid() {
        return photoid;
    }

    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype;
    }

    public String getPname() {
        return ptname;
    }

    public void setPname(String ptname) {
        this.ptname = ptname;
    }
}
