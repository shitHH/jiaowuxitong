package com.etc.service.impl;

import com.etc.dao.TimeDao;
import com.etc.po.Time;
import com.etc.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/1 22:15
 * 时间段业务逻辑实现类
 */
@Service
public class TimeServiceImpl implements TimeService {

    @Autowired
    TimeDao timeDao;

    @Override
    public List<Time> findAll() {
        return timeDao.findAll();
    }

    @Override
    public Time findById(int id) {
        return timeDao.findById(id);
    }

    @Override
    public boolean addTime(Time time) {
        return timeDao.addTime(time) > 0 ? true : false;
    }

    @Override
    public boolean deleteTime(int id) {
        return timeDao.deleteTime(id) > 0 ? true : false;
    }

    @Override
    public boolean updateTime(Time time) {
        return timeDao.updateTime(time) > 0 ? true : false;
    }
}
