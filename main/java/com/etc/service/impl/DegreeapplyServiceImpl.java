package com.etc.service.impl;

import com.etc.dao.DegreeapplyDao;
import com.etc.po.Degreeapply;
import com.etc.service.DegreeapplyService;
import com.etc.vo.DegreeapplyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
@Service
public class DegreeapplyServiceImpl implements DegreeapplyService {
    @Autowired
    DegreeapplyDao degreeapplyDao;

    @Override
    public List<DegreeapplyVO> selectAll() {
        return degreeapplyDao.selectAll();
    }

    @Override
    public DegreeapplyVO selectone(int did) {
        return degreeapplyDao.selectone(did);
    }

    @Override
    public DegreeapplyVO selectBySid(int sid) {
        return degreeapplyDao.selectBySid(sid);
    }

    @Override
    public boolean add(Degreeapply degreeapply) {
        degreeapply.setDdate(new Timestamp(System.currentTimeMillis()));
        degreeapply.setDtype("未审核");
        return degreeapplyDao.add(degreeapply)>0?true:false;
    }

    @Override
    public boolean delete(int did) {
        return degreeapplyDao.delete(did)>0?true:false;
    }

    @Override
    public boolean update(Degreeapply degreeapply) {
        return degreeapplyDao.update(degreeapply)>0?true:false;
    }
}
