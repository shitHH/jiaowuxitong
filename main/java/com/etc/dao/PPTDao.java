package com.etc.dao;

import com.etc.po.PPT;
import com.etc.po.Photo;
import com.etc.vo.PPTVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author GX
 */
@Repository
public interface PPTDao {
    /**
     * @return
     * 通过课程查全部ppt
     */
    public List<PPTVO> findByid(int photoid);

    /**
     * @param ppt
     * @return
     * 添加
     */
    public int pptinsert(PPT ppt);

    /**
     * @return
     * 删除
     */
    public int pptdatele(int pptid);

    public PPT findBypid(int pptid);
}
