package com.etc.service.impl;

import com.etc.dao.MajorDao;
import com.etc.po.Major;
import com.etc.service.MajorService;
import com.etc.vo.MajorVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lyt
 * 专业业务逻辑实现类
 */
@Service
public class MajorServiceImpl implements MajorService {
    @Resource
    MajorDao majorDao;

    @Override
    public List<MajorVo> findAll() {
        return majorDao.findAll();
    }

    @Override
    public MajorVo findById(int mId) {
        return majorDao.findById(mId);
    }

    @Override
    public List<MajorVo> findByCollId(int collId) {
        return majorDao.findByCollId(collId);
    }

    @Override
    public boolean addMajor(Major major) {
        return majorDao.addMajor(major) > 0 ? true : false;
    }

    @Override
    public Major checkName(String name) {
        return majorDao.checkName(name);
    }

    @Override
    public boolean updateMajor(Major major) {
        return majorDao.updateMajor(major) > 0 ? true : false;
    }

    @Override
    public List<MajorVo> findByName(String name) {
        return majorDao.findByName(name);
    }
}
