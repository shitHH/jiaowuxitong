package com.etc.po;



/**
 * @author GX
 * ppt
 */
public class PPT {
    /**
     * 专业
     */
    private int mid;
    private int pptid;
    private String pptsrc;
    private int photoid;
    private String pptname;
    private String vsrc;

    public PPT(int mid, int pptid, String pptsrc, int photoid, String pptname, String vsrc) {
        this.mid = mid;
        this.pptid = pptid;
        this.pptsrc = pptsrc;
        this.photoid = photoid;
        this.pptname = pptname;
        this.vsrc = vsrc;
    }

    public PPT() {
    }

    @Override
    public String toString() {
        return "PPT{" +
                "mid=" + mid +
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
