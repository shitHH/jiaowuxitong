package com.etc.po;

/**
 * 年级表
 */
public class Grade {
    /**
     * 年级编号
     */
    private int gid;
    /**
     * 年级名称
     */
    private String gname;

    public Grade() {
    }

    public Grade(int gid, String gname) {
        this.gid = gid;
        this.gname = gname;
    }

    public Grade(String gname) {
        this.gname = gname;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }
}
