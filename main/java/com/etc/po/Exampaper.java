package com.etc.po;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author GX
 * 试卷
 */
@Document(collection = "exampaper")
public class Exampaper {
    @Id
    private ObjectId _id;
    /**
     * 专业编号
     */
    @Indexed
    private int photoid;
    private String tname;
    private String exampapername;
    private Date starttime;
    private String endtime;
    private String exampapertype;
    private String i;

    public Exampaper() {
    }

    @Override
    public String toString() {
        return "Exampaper{" +
                "_id=" + _id +
                ", photoid=" + photoid +
                ", tname='" + tname + '\'' +
                ", exampapername='" + exampapername + '\'' +
                ", starttime=" + starttime +
                ", endtime='" + endtime + '\'' +
                ", exampapertype='" + exampapertype + '\'' +
                ", i='" + i + '\'' +
                '}';
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public int getPhotoid() {
        return photoid;
    }

    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getExampapername() {
        return exampapername;
    }

    public void setExampapername(String exampapername) {
        this.exampapername = exampapername;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getExampapertype() {
        return exampapertype;
    }

    public void setExampapertype(String exampapertype) {
        this.exampapertype = exampapertype;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public Exampaper(ObjectId _id, int photoid, String tname, String exampapername, Date starttime, String endtime, String exampapertype, String i) {
        this._id = _id;
        this.photoid = photoid;
        this.tname = tname;
        this.exampapername = exampapername;
        this.starttime = starttime;
        this.endtime = endtime;
        this.exampapertype = exampapertype;
        this.i = i;
    }
}
