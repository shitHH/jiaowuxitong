package com.etc.po;


import java.util.Date;

/**
 * @author lyt
 * 疫情实体类
 */
public class YiQing {
    /**
     * 学生编号
     */
    private int sId;
    /**
     * 日期
     */
    private Date DATE;
    /**
     * 体温
     */
    private Double tiwen;

    @Override
    public String toString() {
        return "YiQing{" +
                "sId=" + sId +
                ", DATE=" + DATE +
                ", tiwen=" + tiwen +
                '}';
    }

    public YiQing() {
    }

    public YiQing(int sId, Date DATE, Double tiwen) {
        this.sId = sId;
        this.DATE = DATE;
        this.tiwen = tiwen;
    }

    public int getSid() {
        return sId;
    }

    public void setSid(int sid) {
        this.sId = sid;
    }

    public Date getDATE() {
        return DATE;
    }

    public void setDATE(Date DATE) {
        this.DATE = DATE;
    }

    public Double getTiwen() {
        return tiwen;
    }

    public void setTiwen(Double tiwen) {
        this.tiwen = tiwen;
    }
}
