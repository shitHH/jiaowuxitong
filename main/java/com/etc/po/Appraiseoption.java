package com.etc.po;
import java.io.Serializable;

/**
 *教评题目表
 * @author  JIA
 */

public class Appraiseoption implements Serializable {

    private int  chooseid; //题目编号
    private String content; //题目内容

    public Appraiseoption() {
    }

    public Appraiseoption(int chooseid, String content) {
        this.chooseid = chooseid;
        this.content = content;
    }

    public int getChooseid() {
        return chooseid;
    }

    public void setChooseid(int chooseid) {
        this.chooseid = chooseid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Appraiseoption{" +
                "chooseid=" + chooseid +
                ", content='" + content + '\'' +
                '}';
    }
}
