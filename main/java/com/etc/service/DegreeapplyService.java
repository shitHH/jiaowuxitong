package com.etc.service;

import com.etc.po.Degreeapply;
import com.etc.vo.DegreeapplyVO;

import java.util.List;

/**
 * 学位申请数据访问接口
 */
public interface DegreeapplyService {
    /**
     * @return 学位申请对象集合
     * 查询所有的学位申请
     */
    public List<DegreeapplyVO> selectAll();

    /**
     * @param did 学位申请编号
     * @return 学位申请对象
     * 查询单个学位申请对象
     */
    public DegreeapplyVO selectone(int did);

    /**
     * @param sid 学生编号
     * @return 学位申请对象
     * 查询单个学生的申请
     */
    public DegreeapplyVO selectBySid(int sid);

    /**
     * @param degreeapply 学位申请对象
     * @return 受影响行数
     * 添加对象
     */
    public boolean add(Degreeapply degreeapply);

    /**
     * @param did 学位申请编号
     * @return 受影响行数
     * 删除对象
     */
    public boolean delete(int did);

    /**
     * @param degreeapply 学位申请对象
     * @return 受影响行数
     * 修改学位申请
     */
    public boolean update(Degreeapply degreeapply);
}
