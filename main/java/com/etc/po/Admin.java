package com.etc.po;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/4 22:57
 * 管理员实体类
 */
public class Admin {

    /**
     * 管理员编号
     */
    private int adminId;

    /**
     * 角色编号
     */
    private int roleId;

    /**
     * 管理员姓名
     */
    private String adminName;

    /**
     * 管理员电话
     */
    private String adminTel;

    /**
     * 管理员密码
     */
    private String aPass;

    /**
     * 管理员头像
     */
    private String adminHead;

    /**
     * 管理员账号状态（1：启用；2禁用）
     */
    private int state;

    public Admin() {
    }

    public Admin(int adminId, int roleId, String adminName, String adminTel, String aPass, String adminHead, int state) {
        this.adminId = adminId;
        this.roleId = roleId;
        this.adminName = adminName;
        this.adminTel = adminTel;
        this.aPass = aPass;
        this.adminHead = adminHead;
        this.state = state;
    }

    public Admin(int roleId, String adminName, String adminTel, String aPass, String adminHead, int state) {
        this.roleId = roleId;
        this.adminName = adminName;
        this.adminTel = adminTel;
        this.aPass = aPass;
        this.adminHead = adminHead;
        this.state = state;
    }

    public Admin(int adminId, String aPass) {
        this.adminId = adminId;
        this.aPass = aPass;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", roleId=" + roleId +
                ", adminName='" + adminName + '\'' +
                ", adminTel='" + adminTel + '\'' +
                ", aPass='" + aPass + '\'' +
                ", adminHead='" + adminHead + '\'' +
                ", state=" + state +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminTel() {
        return adminTel;
    }

    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel;
    }

    public String getaPass() {
        return aPass;
    }

    public void setaPass(String aPass) {
        this.aPass = aPass;
    }

    public String getAdminHead() {
        return adminHead;
    }

    public void setAdminHead(String adminHead) {
        this.adminHead = adminHead;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
