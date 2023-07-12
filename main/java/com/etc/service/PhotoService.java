package com.etc.service;

import com.etc.po.Photo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author GX
 */
@Component
public interface PhotoService {
    public List<Photo> findAll();
    /**
     * @return
     * 查全部
     */
    public List<Photo> findBypip(Photo photo);

    /**
     * @param photo
     * @return
     * 添加
     */
    public boolean photoinsert(Photo photo);

    /**
     * @param photo
     * @return
     * 更新
     */
    public boolean photoupdate(Photo photo);

    /**
     * @param
     * @return
     * 查询
     */
    public List<Photo> finBytype(String phototype,String pip);

    public List<Photo> findByPtname(String ptname);

    public List<Photo> findBynameandpip(String ptname,String pip);

    public List<Photo> findByphotoname(String photoname,String pip);

    public boolean photoupdate1(int photoid,String pip);


}
