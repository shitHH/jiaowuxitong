package com.etc.dao;

import com.etc.po.Photo;
import com.sun.xml.internal.ws.server.ServerRtException;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author GX
 */
@Repository
public interface PhotoDao {
    public List<Photo> findAll();
    /**
     * @return
     * 通过状态查
     */
    public List<Photo> findBypip(Photo photo);

    /**
     * @param photo
     * @return
     * 添加
     */
    public int photoinsert(Photo photo);

    /**
     * @param photo
     * @return
     * 更新
     */
    public int photoupdate(Photo photo);

    public int photoupdate1(int photoid,String pip);


    /**
     * @param
     * @return
     * 查询
     */
    public List<Photo> finBytype(String phototype,String pip);

    public List<Photo> findByPtname(String ptname);

    public List<Photo> findBynameandpip(String ptname,String pip);

    public List<Photo> findByphotoname(String photoname,String pip);

}
