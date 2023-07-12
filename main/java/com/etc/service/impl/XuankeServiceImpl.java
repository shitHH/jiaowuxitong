package com.etc.service.impl;

import com.etc.dao.XuankeDao;
import com.etc.po.Xuanke;
import com.etc.service.XuankeService;
import com.etc.vo.XuankeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class XuankeServiceImpl implements XuankeService {
    @Autowired
    XuankeDao xuankeDao;
    @Override
    public boolean choosesubject(Xuanke xuanke) {
        return xuankeDao.choosesubject(xuanke)>0?true:false;
    }

    @Override
    public boolean delete(int[] xuankeid) {
        return xuankeDao.delete(xuankeid)>0?true:false;
    }

    @Override
    public boolean update(Xuanke xuanke) {
        return xuankeDao.update(xuanke)>0?true:false;
    }

    @Override
    public List<XuankeVO> selectAll() {
        return xuankeDao.selectAll();
    }

    @Override
    public List<XuankeVO> selectBysid(int sid) {
        return xuankeDao.selectBysid(sid);
    }

    @Override
    public XuankeVO selectOne(int xuankeid) {
        return selectOne(xuankeid);
    }
}
