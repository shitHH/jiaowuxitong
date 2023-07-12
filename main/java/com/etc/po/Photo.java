package com.etc.po;

import com.sun.xml.internal.ws.server.ServerRtException;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @author GX
 * 图片
 */
public class Photo {
   private int photoid;
   private String photosrc;
   private String photoname;
   private String phototype;
   private String ptname;
   private Timestamp ptime;
   private String pip;

    public Photo() {
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photoid=" + photoid +
                ", photosrc='" + photosrc + '\'' +
                ", photoname='" + photoname + '\'' +
                ", phototype='" + phototype + '\'' +
                ", ptname='" + ptname + '\'' +
                ", ptime=" + ptime +
                ", pip='" + pip + '\'' +
                '}';
    }

    public int getPhotoid() {
        return photoid;
    }

    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    public String getPhotosrc() {
        return photosrc;
    }

    public void setPhotosrc(String photosrc) {
        this.photosrc = photosrc;
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

    public String getPtname() {
        return ptname;
    }

    public void setPtname(String ptname) {
        this.ptname = ptname;
    }

    public Timestamp getPtime() {
        return ptime;
    }

    public void setPtime(Timestamp ptime) {
        this.ptime = ptime;
    }

    public String getPip() {
        return pip;
    }

    public void setPip(String pip) {
        this.pip = pip;
    }

    public Photo(int photoid, String photosrc, String photoname, String phototype, String ptname, Timestamp ptime, String pip) {
        this.photoid = photoid;
        this.photosrc = photosrc;
        this.photoname = photoname;
        this.phototype = phototype;
        this.ptname = ptname;
        this.ptime = ptime;
        this.pip = pip;
    }
}
