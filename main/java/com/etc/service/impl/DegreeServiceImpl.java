package com.etc.service.impl;

import com.etc.dao.DegreeDao;
import com.etc.po.Degree;
import com.etc.service.DegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DegreeServiceImpl implements DegreeService {
    @Autowired
    DegreeDao degreeDao;
    @Override
    public List<Degree> selectAll() {
        return degreeDao.selectAll();
    }

    @Override
    public Degree selectOne(int degreeid) {
        return degreeDao.selectOne(degreeid);
    }

    @Override
    public boolean add(Degree degree) {
        return degreeDao.add(degree)>0?true:false;
    }

    @Override
    public boolean delete(int[] degreeId) {
        return degreeDao.delete(degreeId)>0?true:false;
    }

    @Override
    public boolean update(Degree degree) {
        return degreeDao.update(degree)>0?true:false;
    }
}
