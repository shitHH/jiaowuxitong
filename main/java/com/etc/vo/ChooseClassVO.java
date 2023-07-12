package com.etc.vo;

/**
 * 选课VO
 */
public class ChooseClassVO {
    private int choid;
    private int sid;
    private int lid;
    private String sname;
    private String lName;

    public ChooseClassVO() {
    }

    public ChooseClassVO(int choid, int sid, int lid, String sname, String lName) {
        this.choid = choid;
        this.sid = sid;
        this.lid = lid;
        this.sname = sname;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "ChooseClassVO{" +
                "choid=" + choid +
                ", sid=" + sid +
                ", lid=" + lid +
                ", sname='" + sname + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public int getChoid() {
        return choid;
    }

    public void setChoid(int choid) {
        this.choid = choid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
