package com.etc.service.impl;

import com.etc.dao.PhotoDao;
import com.etc.po.Photo;
import com.etc.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GX
 */
@Service
public class PhotoServiceImpl implements PhotoService {
    @Resource
    PhotoDao photoDao;

    @Override
    public List<Photo> findAll() {
        return photoDao.findAll();
    }

    @Override
    public List<Photo> findBypip(Photo photo) {
        photo.setPip("上架");
        return photoDao.findBypip(photo);
    }

    @Override
    public boolean photoinsert(Photo photo) {
        return photoDao.photoinsert(photo)>0?true:false;
    }

    @Override
    public boolean photoupdate(Photo photo) {
        return photoDao.photoupdate(photo)>0?true:false;
    }

    @Override
    public List<Photo> finBytype(String phototype,String pip) {
        return photoDao.finBytype(phototype,pip);
    }

    @Override
    public List<Photo> findByPtname(String ptname) {
        return photoDao.findByPtname(ptname);
    }

    @Override
    public List<Photo> findBynameandpip(String ptname, String pip) {
        return photoDao.findBynameandpip(ptname,pip);
    }

    @Override
    public List<Photo> findByphotoname(String photoname,String pip) {
        return photoDao.findByphotoname(photoname,pip);
    }

    @Override
    public boolean photoupdate1(int photoid, String pip) {
        return photoDao.photoupdate1(photoid,pip)>0?true:false;
    }

}
