package com.etc.dao;

import com.etc.po.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.PortUnreachableException;
import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/4 23:26
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoTest {

    @Autowired
    RoleDao roleDao;

    @Test
    public void findAll(){
        List<Role> all = roleDao.findAll();

        for (Role role : all) {
            System.out.println(role);
        }
    }

    @Test
    public void findById(){
        Role byId = roleDao.findById(1);
        System.out.println(byId);
    }

    @Test
    public void addRole(){

        Role role = new Role();
        role.setRoleName("测试");

        roleDao.addRole(role);

        this.findAll();
    }

    @Test
    public void deleteRole(){

        roleDao.deleteRole(2);

        this.findAll();

    }

    @Test
    public void updateRole(){

        this.addRole();

        Role byId = roleDao.findById(3);

        byId.setRoleName("教师");

        roleDao.updateRole(byId);

        this.findAll();
    }
}
