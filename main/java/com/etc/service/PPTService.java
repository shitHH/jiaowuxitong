package com.etc.service;

import com.etc.po.PPT;
import com.etc.po.Photo;
import com.etc.vo.PPTVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author GX
 */
@Component
public interface PPTService {
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
    public boolean pptinsert(PPT ppt);

    /**
     * @return
     * 删除
     */
    public boolean pptdatele(int pptid);

    public PPT findBypid(int pptid);
}
