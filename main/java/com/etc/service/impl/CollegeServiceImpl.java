package com.etc.service.impl;

import com.etc.dao.CollegeDao;
import com.etc.po.College;
import com.etc.service.CollegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 15:16:24
 */
@Service
public class CollegeServiceImpl implements CollegeService {
    @Resource
    CollegeDao collegeDao;
    @Override
    public List<College> findAll() {
        return collegeDao.findAll();
    }

    @Override
    public College findbycollid(int collid) {
        return collegeDao.findbycollid(collid);
    }

    @Override
    public boolean addcollege(College college) {
        return collegeDao.addcollege(college)>0?true:false;
    }

    @Override
    public boolean update(College college) {
        return collegeDao.update(college)>0?true:false;
    }

    @Override
    public boolean delete(int collid) {
        return collegeDao.delete(collid)>0?true:false;
    }
}
