package com.etc.service;

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
 * Create by 2022/10/5 17:02
 * 管理员业务逻辑测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class AdminServiceTest {

    @Autowired
    AdminService adminService;

    @Test
    public void findAll(){

        List<Admin> all = adminService.findAll();
        for (Admin admin : all) {
            System.out.println(admin);
        }
    }

    @Test
    public void findById(){

        Admin byId = adminService.findById(20220931);
        System.out.println(byId);
    }

    @Test
    public void findByIdAndPass(){

        Admin admin = new Admin(20220933, "666");
        Admin byIdAndPass = adminService.findByIdAndPass(admin);
        System.out.println(byIdAndPass);
    }

    @Test
    public void addAdmin(){
        Admin admin = new Admin(3,"张三","15694516789","666","wu",1);
        adminService.addAdmin(admin);
        this.findByIdAndPass();
    }

    @Test
    public void updateAdminState(){
        Admin admin = new Admin(20220933, "666");
        Admin byIdAndPass = adminService.findByIdAndPass(admin);
        byIdAndPass.setState(2);
        boolean b = adminService.updateAdminState(byIdAndPass);
        System.out.println(b);
        this.findAll();
    }

    @Test
    public void updateAdmin(){
        Admin byId = adminService.findById(20220931);
        byId.setAdminName("李四");
        byId.setAdminTel("18329655678");
        adminService.updateAdmin(byId);

        this.findAll();
    }

    @Test
    public void updateAdminPass(){
        Admin byId = adminService.findById(20220933);

        byId.setaPass("666");
        adminService.updateAdminPass(byId);
        this.findAll();
    }
}
