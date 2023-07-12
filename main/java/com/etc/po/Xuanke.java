package com.etc.po;

public class Xuanke {
    private int xuankeid;
    private int sid;
    private int photoid;

    public Xuanke() {
    }

    public Xuanke(int xuankeid, int sid, int photoid) {
        this.xuankeid = xuankeid;
        this.sid = sid;
        this.photoid = photoid;
    }

    @Override
    public String toString() {
        return "xuanke{" +
                "xuankeid=" + xuankeid +
                ", sid=" + sid +
                ", photoid=" + photoid +
                '}';
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
}
