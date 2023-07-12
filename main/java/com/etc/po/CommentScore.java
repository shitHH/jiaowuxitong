package com.etc.po;

public class CommentScore {

    private int chooseId;

    private int score;

    public int getChooseId() {
        return chooseId;
    }

    public void setChooseId(int chooseId) {
        this.chooseId = chooseId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public CommentScore(int chooseId, int score) {
        this.chooseId = chooseId;
        this.score = score;
    }

    @Override
    public String toString() {
        return "CommentScore{" +
                "chooseId=" + chooseId +
                ", score=" + score +
                '}';
    }
}
