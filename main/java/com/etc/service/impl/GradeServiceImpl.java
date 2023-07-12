package com.etc.service.impl;

import com.etc.dao.GradeDao;
import com.etc.po.Grade;
import com.etc.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    GradeDao gradeDao;
    @Override
    public List<Grade> findAll() {
        return gradeDao.findAll();
    }

    @Override
    public Grade findOne(int gid) {
        return gradeDao.findOne(gid);
    }

    @Override
    public boolean add(Grade grade) {
        return gradeDao.add(grade)>0?true:false;
    }

    @Override
    public boolean delete(int gid) {
        return gradeDao.delete(gid)>0?true:false;
    }

    @Override
    public boolean update(Grade grade) {
        return gradeDao.update(grade)>0?true:false;
    }
}
