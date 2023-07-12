package com.etc.po;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author GX
 * 试题
 */

@Document(collection = "examcontant")
public class Examcontant {
    @Id
    private ObjectId _id;
    /**
     * 专业编号
     */
    private String id;
    private String exampapername;
    private String num;
    private String itemcontant;
    private String answer;
    private String a;
    private String acontant;
    private String b;
    private String bcontant;
    private String c;
    private String ccontant;
    private String d;
    private String dcontant;
    private String sanswer;
    @Indexed
    private int score;

    public Examcontant() {
    }

    @Override
    public String toString() {
        return "Examcontant{" +
                "_id=" + _id +
                ", id='" + id + '\'' +
                ", exampapername='" + exampapername + '\'' +
                ", num='" + num + '\'' +
                ", itemcontant='" + itemcontant + '\'' +
                ", answer='" + answer + '\'' +
                ", a='" + a + '\'' +
                ", acontant='" + acontant + '\'' +
                ", b='" + b + '\'' +
                ", bcontant='" + bcontant + '\'' +
                ", c='" + c + '\'' +
                ", ccontant='" + ccontant + '\'' +
                ", d='" + d + '\'' +
                ", dcontant='" + dcontant + '\'' +
                ", sanswer='" + sanswer + '\'' +
                ", score=" + score +
                '}';
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExampapername() {
        return exampapername;
    }

    public void setExampapername(String exampapername) {
        this.exampapername = exampapername;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getItemcontant() {
        return itemcontant;
    }

    public void setItemcontant(String itemcontant) {
        this.itemcontant = itemcontant;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getAcontant() {
        return acontant;
    }

    public void setAcontant(String acontant) {
        this.acontant = acontant;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getBcontant() {
        return bcontant;
    }

    public void setBcontant(String bcontant) {
        this.bcontant = bcontant;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getCcontant() {
        return ccontant;
    }

    public void setCcontant(String ccontant) {
        this.ccontant = ccontant;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getDcontant() {
        return dcontant;
    }

    public void setDcontant(String dcontant) {
        this.dcontant = dcontant;
    }

    public String getSanswer() {
        return sanswer;
    }

    public void setSanswer(String sanswer) {
        this.sanswer = sanswer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public Examcontant(ObjectId _id, String id, String exampapername, String num, String itemcontant, String answer, String a, String acontant, String b, String bcontant, String c, String ccontant, String d, String dcontant, String sanswer, int score) {
        this._id = _id;
        this.id = id;
        this.exampapername = exampapername;
        this.num = num;
        this.itemcontant = itemcontant;
        this.answer = answer;
        this.a = a;
        this.acontant = acontant;
        this.b = b;
        this.bcontant = bcontant;
        this.c = c;
        this.ccontant = ccontant;
        this.d = d;
        this.dcontant = dcontant;
        this.sanswer = sanswer;
        this.score = score;
    }
}
