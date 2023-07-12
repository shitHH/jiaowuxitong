package com.etc.service;

import com.etc.po.YiQing;
import com.etc.vo.YiQingVo;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/12 10:03:17
 * 疫情业务逻辑接口
 */
@Component
public interface YiQingService {
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
     * @return 是否增加成功
     */
    public boolean addYiQing(YiQing yiQing);

    /**
     * 删除疫情记录
     * @param sid 学生学号
     * @return 是否删除成功
     */
    public boolean deleteYiQing(int sid);

    /**
     * @param yiQingVo 疫情对象
     * @return 是否修改成功
     */
    public boolean updateYiQing(YiQingVo yiQingVo);
}
