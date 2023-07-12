package com.etc.service;

import com.etc.po.Grade;

import java.util.List;

public interface GradeService {
    /**
     * @return 年级对象集合
     * 查询所有年级
     */
    public List<Grade> findAll();

    /**
     * @param gid 年级编号
     * @return 年级对象
     * 查询单个年级
     */
    public Grade findOne(int gid);

    /**
     * @param grade 年级对象
     * @return 受影响行数
     * 添加年级
     */
    public boolean add(Grade grade);
    /**
     * @param gid 年级编号
     * @return 受影响行数
     * 删除年级
     */
    public boolean delete(int gid);
    /**
     * @param grade 年级对象
     * @return 受影响行数
     * 修改年级
     */
    public boolean update(Grade grade);
}
