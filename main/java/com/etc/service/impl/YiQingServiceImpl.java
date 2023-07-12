package com.etc.service.impl;

import com.etc.dao.YiQingDao;
import com.etc.po.YiQing;
import com.etc.service.YiQingService;
import com.etc.vo.YiQingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/12 10:05:19
 * 疫情业务逻辑接口实现类
 */
@Service
public class YiQingServiceImpl implements YiQingService {
    @Autowired
    YiQingDao yiQingDao;


    @Override
    public List<YiQingVo> findAll() {
        return yiQingDao.findAll();
    }

    @Override
    public YiQingVo findBySid(int sid) {
        return yiQingDao.findBySid(sid);
    }

    @Override
    public YiQingVo findByDate(Date Date) {
        return yiQingDao.findByDate(Date);
    }

    @Override
    public boolean addYiQing(YiQing yiQing) {
        return yiQingDao.addYiQing(yiQing)>0?true:false;
    }

    @Override
    public boolean deleteYiQing(int sid) {
        return yiQingDao.deleteYiQing(sid)>0?true:false;
    }

    @Override
    public boolean updateYiQing(YiQingVo yiQingVo) {
        return yiQingDao.updateYiQing(yiQingVo)>0?true:false;
    }
}
