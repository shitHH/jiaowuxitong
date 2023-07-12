package com.etc.dao;

import com.etc.po.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 15:55
 * 管理员数据访问接口
 */
@Repository
public interface AdminDao {

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
    public Admin findById(@Param("id") int id);

    /**
     * @param admin 管理员对象
     * @return 管理员对象
     * 通过账号和密码查找对象
     */
    public Admin findByIdAndPass(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 受影响行数
     * 添加管理员
     */
    public int addAdmin(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 受影响行数
     * 更新管理员账号状态
     */
    public int updateAdminState(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 受影响行数
     * 更新管理员信息
     */
    public int updateAdmin(Admin admin);

    /**
     * @param admin 管理员对象
     * @return 受影响行数
     * 更新管理员密码
     */
    public int updateAdminPass(Admin admin);

}
