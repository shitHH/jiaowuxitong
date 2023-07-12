package com.etc.po;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/9/30 22:51
 * 时间段实体类
 */
public class Time {

    /**
     * 时间段编号
     */
    private int timeId;

    /**
     * 时间段
     */
    private String timeName;

    public Time() {
    }

    public Time(int timeId, String timeName) {
        this.timeId = timeId;
        this.timeName = timeName;
    }

    @Override
    public String toString() {
        return "Time{" +
                "timeId=" + timeId +
                ", timeName='" + timeName + '\'' +
                '}';
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName;
    }
}
