package com.etc.po;

/**
 * 学位表
 */
public class Degree {
    /**
     * 学位编号
     */
    private int degreeid;
    /**
     * 学位名称
     */
    private String degreename;
    /**
     * 学位学分
     */
    private int dscore;

    public Degree() {
    }

    public Degree(int degreeid, String degreename, int dscore) {
        this.degreeid = degreeid;
        this.degreename = degreename;
        this.dscore = dscore;
    }

    public int getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(int degreeid) {
        this.degreeid = degreeid;
    }

    public String getDegreename() {
        return degreename;
    }

    public void setDegreename(String degreename) {
        this.degreename = degreename;
    }

    public int getDscore() {
        return dscore;
    }

    public void setDscore(int dscore) {
        this.dscore = dscore;
    }
}
