package com.etc.service;

import com.etc.po.ChooseClass;
import com.etc.vo.ChooseClassVO;

import java.util.List;

/**
 * 选课业务逻辑接口
 */
public interface ChooseclassService {
    /**
     * @param chooseClass 课程编号
     * @return 是否成功
     * 选课
     */
    public boolean chooseClass(ChooseClass chooseClass);

    /**
     * @param choid 选课编号
     * @return 是否成功
     * 删除选课
     */
    public boolean delete(int[] choid);

    /**
     * @return 是否成功
     * 修改选课
     */
    public boolean update(ChooseClass chooseClass);

    /**
     * @return 选课
     * 查询所有选课
     */
    public List<ChooseClassVO> selectAll();

    /**
     * @param sid 学生编号
     * @return 选课
     * 查询单个学生选课
     */
    public List<ChooseClassVO> selectBysid(int sid);

    /**
     * @param choid 选课编号
     * @return 根据选课编号查询选课
     */
    public ChooseClassVO selectOne(int choid);
}
