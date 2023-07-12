package com.etc.dao;

import com.etc.po.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/4 23:20
 */
@Repository
public interface RoleDao {
    /**
     * @return 角色集合
     *  查询所有角色
     */
    public List<Role> findAll();

    /**
     * @return 角色
     * 通过ID查询角色
     */
    public Role findById(@Param("id") int roleId);

    /**
     * @param Role 角色对象
     * @return 受影响行数
     * 添加角色
     */
    public int addRole(Role Role);

    /**
     * @param roleId 角色编号
     * @return 受影响行数
     * 删除角色
     */
    public int deleteRole(@Param("id") int roleId);

    /**
     * @param Role 角色对象
     * @return 受影响行数
     * 更新角色对象
     */
    public int updateRole(Role Role);
}
