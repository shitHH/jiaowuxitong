package com.etc.po;

/**
 * 教室表
 */
public class Classroom {
    /**
     * 教室编号
     */
    private int classroomid;
    /**
     * 教室名称
     */
    private String cName;

    public Classroom() {
    }

    public Classroom(int classroomid, String cName) {
        this.classroomid = classroomid;
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomid=" + classroomid +
                ", cName='" + cName + '\'' +
                '}';
    }

    public int getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(int classroomid) {
        this.classroomid = classroomid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
