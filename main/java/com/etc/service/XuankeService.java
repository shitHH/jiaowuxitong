package com.etc.service;

import com.etc.po.Xuanke;
import com.etc.vo.ChooseClassVO;
import com.etc.vo.XuankeVO;

import java.util.List;

public interface XuankeService {
    /**
     *
     * @return 受影响行数
     * 选课
     */
    public boolean choosesubject(Xuanke xuanke);

    /**
     * @param xuankeid 选课编号
     * @return 受影响行数
     * 删除选课
     */
    public boolean delete(int []xuankeid);

    /**
     * @return 受影响行数
     * 修改选课
     */
    public boolean update(Xuanke xuanke);

    /**
     * @return 选课
     * 查询所有选课
     */
    public List<XuankeVO> selectAll();

    /**
     * @param sid 学生编号
     * @return 选课
     * 查询单个学生选课
     */
    public List<XuankeVO> selectBysid(int sid);

    /**
     * @param xuankeid 选课编号
     * @return 根据选课编号查询选课
     */
    public XuankeVO selectOne(int xuankeid);
}
