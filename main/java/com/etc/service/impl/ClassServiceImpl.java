package com.etc.service.impl;

import com.etc.dao.ClassDao;
import com.etc.po.Class;
import com.etc.service.ClassService;
import com.etc.vo.ClassVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:yjt
 * @category 班级业务逻辑实现类
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassDao classDao;

    @Override
    public List<ClassVO> findAll() {
        return classDao.findAll();
    }

    @Override
    public ClassVO findByCId(int cId) {
        return classDao.findByCId(cId);
    }

    @Override
    public List<ClassVO> findByClassName(String className) {
        return classDao.findByClassName(className);
    }

    @Override
    public List<ClassVO> findByMId(int mId) {
        return classDao.findByMId(mId);
    }

    @Override
    public List<ClassVO> findByMName(String mName) {
        return classDao.findByMName(mName);
    }

    @Override
    public List<ClassVO> findByGId(int gId) {
        return classDao.findByGId(gId);
    }

    @Override
    public List<ClassVO> findByGName(String gName) {
        return classDao.findByGName(gName);
    }

    @Override
    public List<ClassVO> findByCState(String cState) {
        return classDao.findByCState(cState);
    }

    @Override
    public boolean addClass(Class c) {
        return classDao.addClass(c)>0?true:false;
    }

    @Override
    public Class findByCid(int cId) {
        return classDao.findByCid(cId);
    }

    @Override
    public boolean updateClass(Class c) {
        return classDao.updateClass(c)>0?true:false;
    }

    @Override
    public boolean deleteClass(int cId) {
        return classDao.deleteClass(cId)>0?true:false;
    }
}
