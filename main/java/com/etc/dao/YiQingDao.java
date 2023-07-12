package com.etc.dao;

import com.etc.po.YiQing;
import com.etc.vo.YiQingVo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author lyt
 * 疫情数据接口
 */
@Repository
public interface YiQingDao {
    /**
     * 查询所有疫情记录
     * @return 疫情记录集合
     */
    public List<YiQingVo> findAll();

    /**
     * 根据学生学号查询疫情记录
     * @param sid 学生学号
     * @return 疫情记录集合
     */
    public YiQingVo findBySid(int sid);

    /**
     * 根据时间查询疫情记录
     * @param Date 疫情记录上传时间
     * @return 疫情记录对象
     */
    public YiQingVo findByDate(Date Date);

    /**
     * 上传疫情记录
     * @param yiQing 疫情记录对象
     * @return 受影响行数
     */
    public int addYiQing(YiQing yiQing);

    /**
     * 删除疫情记录
     * @param sid 学生学号
     * @return 受影响行数
     */
    public int deleteYiQing(int sid);

    /**
     * @param yiQingVo 疫情对象
     * @return 受影响行数
     */
    public int updateYiQing(YiQingVo yiQingVo);
}
