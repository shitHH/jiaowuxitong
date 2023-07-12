package com.etc.service;

import com.etc.po.Admin;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 16:43
 * 管理员业务逻辑接口
 */
public interface AdminService {

    /**
     * @return 管理员对象集合
     * 查找所有管理员
     */
    public List<Admin> findAll();

    /**
     * @param id 管理员编号
     * @return 管理员对象
     * 通过编号查找管理员对象
     */
    public Admin findById(int id);

    /**
     * @param admin 管理员对象
     * @return 管理员对象
     * 通过账号和密码查找对象
     */
    public Admin findByIdAndPass(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 是否成功
     * 添加管理员
     */
    public boolean addAdmin(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 是否成功
     * 更新管理员账号状态
     */
    public boolean updateAdminState(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 是否成功
     * 更新管理员信息
     */
    public boolean updateAdmin(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 是否成功
     * 更新管理员密码
     */
    public boolean updateAdminPass(Admin admin);
}
