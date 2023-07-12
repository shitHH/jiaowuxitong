package com.etc.service.impl;

import com.etc.dao.HomeworkDao;
import com.etc.po.Homework;
import com.etc.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HomeWorkServiceImpl implements HomeworkService {
    @Resource
    HomeworkDao homeworkDao;
    @Override
    public List<Homework> selectAll() {
        return homeworkDao.selectAll();
    }

    @Override
    public Homework selectone(int homeid) {
        return homeworkDao.selectone(homeid);
    }

    @Override
    public Homework selectByCid(int cid) {
        return homeworkDao.selectByCid(cid);
    }

    @Override
    public Homework selectByTid(int tid) {
        return homeworkDao.selectByTid(tid);
    }

    @Override
    public boolean add(Homework homework) {
        return homeworkDao.add(homework)>0?true:false;
    }

    @Override
    public boolean delete(int[] homeid) {
        return homeworkDao.delete(homeid)>0?true:false;
    }

    @Override
    public boolean update(Homework homework) {
        return homeworkDao.update(homework)>0?true:false;
    }
}
