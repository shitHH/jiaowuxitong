package com.etc.po;

import org.springframework.stereotype.Component;

/**
 * @author lyt
 * 分数实体类
 */
@Component
public class Score {
    /**
     * 成绩编号
     */
    private int scoreId;
    /**
     * 学生学号
     */
    private int sId;
    /**
     * 课程编号
     */
    private int lId;
    /**
     * 成绩
     */
    private Double score;

    @Override
    public String toString() {
        return "Score{" +
                "scoreId=" + scoreId +
                ", sId=" + sId +
                ", lId=" + lId +
                ", score=" + score +
                '}';
    }

    public Score() {
    }

    public Score(int scoreId, int sId, int lId, Double score) {
        this.scoreId = scoreId;
        this.sId = sId;
        this.lId = lId;
        this.score = score;
    }

    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
