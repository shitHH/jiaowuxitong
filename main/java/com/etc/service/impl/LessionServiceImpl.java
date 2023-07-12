package com.etc.service.impl;

import com.etc.dao.LessionDao;
import com.etc.po.Lession;
import com.etc.service.LessionService;
import com.etc.vo.LessionTeacherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lyt
 * 课程业务逻辑接口实现类
 */
@Service
public class LessionServiceImpl implements LessionService {
    @Resource
    LessionDao lessionDao;

    @Override
    public LessionTeacherVo findBylid(int lid) {
        return lessionDao.findBylid(lid);
    }

    @Override
    public List<LessionTeacherVo> findAll() {
        return lessionDao.findAll();
    }

    @Override
    public Lession findByid(int lId) {
        return lessionDao.findByid(lId);
    }

    @Override
    public List<LessionTeacherVo> findByTid(int tId) {
        return lessionDao.findByTid(tId);
    }

    @Override
    public boolean addLession(Lession lession) {
        return lessionDao.addLession(lession) > 0 ? true : false;
    }

    @Override
    public boolean deleteLession(int lId) {
        return lessionDao.deleteLession(lId) > 0 ? true : false;
    }

    @Override
    public boolean updateLession(Lession lession) {
        return lessionDao.updateLession(lession) > 0 ? true : false;
    }

    @Override
    public Lession checkName(String name) {
        return lessionDao.checkName(name);
    }

    @Override
    public List<LessionTeacherVo> findByName(String name) {
        return lessionDao.findByName(name);
    }

    @Override
    public List<LessionTeacherVo> findByLtype(String ltype) {
        return lessionDao.findByLtype(ltype);
    }
}
