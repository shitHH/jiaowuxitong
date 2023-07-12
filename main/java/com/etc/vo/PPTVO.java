package com.etc.vo;

import java.lang.ref.PhantomReference;

/**
 * @author GX
 */
public class PPTVO {
    private int mid;
    private String mname;
    private int pptid;
    private String pptsrc;
    private int photoid;
    private String pptname;
    private String vsrc;

    public PPTVO(int mid, String mname, int pptid, String pptsrc, int photoid, String pptname, String vsrc) {
        this.mid = mid;
        this.mname = mname;
        this.pptid = pptid;
        this.pptsrc = pptsrc;
        this.photoid = photoid;
        this.pptname = pptname;
        this.vsrc = vsrc;
    }

    public PPTVO() {
    }

    @Override
    public String toString() {
        return "PPTVO{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", pptid=" + pptid +
                ", pptsrc='" + pptsrc + '\'' +
                ", photoid=" + photoid +
                ", pptname='" + pptname + '\'' +
                ", vsrc='" + vsrc + '\'' +
                '}';
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getPptid() {
        return pptid;
    }

    public void setPptid(int pptid) {
        this.pptid = pptid;
    }

    public String getPptsrc() {
        return pptsrc;
    }

    public void setPptsrc(String pptsrc) {
        this.pptsrc = pptsrc;
    }

    public int getPhotoid() {
        return photoid;
    }

    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    public String getPptname() {
        return pptname;
    }

    public void setPptname(String pptname) {
        this.pptname = pptname;
    }

    public String getVsrc() {
        return vsrc;
    }

    public void setVsrc(String vsrc) {
        this.vsrc = vsrc;
    }
}
