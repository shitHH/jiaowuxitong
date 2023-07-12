package com.etc.service.impl;

import com.etc.dao.AdminDao;
import com.etc.po.Admin;
import com.etc.service.AdminService;
import com.etc.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/5 16:46
 * 管理员业务逻辑实现类
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;

    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    @Override
    public Admin findById(int id) {
        return adminDao.findById(id);
    }

    @Override
    public Admin findByIdAndPass(Admin admin) {
        String s = MD5Util.md5(admin.getaPass());
        admin.setaPass(s);
        return adminDao.findByIdAndPass(admin);
    }

    @Override
    public boolean addAdmin(Admin admin) {
        admin.setRoleId(3);
        admin.setState(1);
        String s = MD5Util.md5(admin.getaPass());
        admin.setaPass(s);
        return adminDao.addAdmin(admin)>0?true:false;
    }

    @Override
    public boolean updateAdminState(Admin admin) {
        return adminDao.updateAdminState(admin)>0?true:false;
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin)>0?true:false;
    }

    @Override
    public boolean updateAdminPass(Admin admin) {
        String s = MD5Util.md5(admin.getaPass());
        admin.setaPass(s);
        return adminDao.updateAdminPass(admin)>0?true:false;
    }
}
