package com.etc.service.impl;

import com.etc.dao.PPTDao;
import com.etc.po.PPT;
import com.etc.po.Photo;
import com.etc.service.PPTService;
import com.etc.vo.PPTVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GX
 */
@Service
public class PPTServiceImpl implements PPTService {
    @Resource
    PPTDao pptDao;

    @Override
    public List<PPTVO> findByid(int photoid) {
        return pptDao.findByid(photoid);
    }

    @Override
    public boolean pptinsert(PPT ppt) {
        return pptDao.pptinsert(ppt)>0?true:false;
    }

    @Override
    public boolean pptdatele(int pptid) {
        return pptDao.pptdatele(pptid)>0?true:false;
    }

    @Override
    public PPT findBypid(int pptid) {
        return pptDao.findBypid(pptid);
    }
}
