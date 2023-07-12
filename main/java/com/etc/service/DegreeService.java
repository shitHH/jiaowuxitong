package com.etc.service;

import com.etc.po.Degree;

import java.util.List;

/**
 * 学位业务逻辑接口
 */
public interface DegreeService {
    /**
     * @return 学位集合
     * 查询所有学位
     */
    public List<Degree> selectAll();

    /**
     * @param degreeid 学位编号
     * @return 学位对象
     * 根据学位编号查询学位
     */
    public Degree selectOne(int degreeid);

    /**
     * @param degree 学位对象
     * @return 是否成功
     * 增加学位
     */
    public boolean add(Degree degree);

    /**
     * @param degreeId 学位对象
     * @return 是否成功
     * 删除学位
     */
    public boolean delete(int []degreeId);

    /**
     * @param degree 学位对象
     * @return 是否成功
     * 修改学位
     */
    public boolean update(Degree degree);
}
