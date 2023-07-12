package com.etc.dao;

import com.etc.po.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 16:29
 * 管理员数据访问测试类
 */
@SpringBootTest
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
public class AdminDaoTest {

    @Autowired
    AdminDao adminDao;

    @Test
    public void findAll(){

        List<Admin> all = adminDao.findAll();

        for (Admin admin : all) {
            System.out.println(admin);
        }
    }

    @Test
    public void addAdmin(){

        Admin admin = new Admin(3,"yyt","18329565763","123456","ceshi",1);

        adminDao.addAdmin(admin);

        this.findAll();
    }

    @Test
    public void findById(){

        Admin byId = adminDao.findById(20220931);

        System.out.println(byId);
    }

    @Test
    public void findByIdAndPass(){

        Admin byIdAndPass = adminDao.findByIdAndPass(new Admin(20220931, "123456"));

        System.out.println(byIdAndPass);
    }

    @Test
    public void updateAdminState(){

        Admin byId = adminDao.findById(20220931);
        byId.setState(2);
        adminDao.updateAdminState(byId);
        this.findAll();
    }

    @Test
    public void updateAdmin(){

        Admin byId = adminDao.findById(20220931);

        byId.setAdminName("zs");
        byId.setaPass("777");
        adminDao.updateAdmin(byId);
        this.findAll();
    }

    @Test
    public void updateAdminPass(){

        Admin byId = adminDao.findById(20220931);

        byId.setaPass("777");

        adminDao.updateAdminPass(byId);

        this.findAll();
    }
}
