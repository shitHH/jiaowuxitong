package com.etc.dao;

import com.etc.po.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 年级数据访问接口
 */
@Repository
public interface GradeDao {
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
    public int add(Grade grade);
    /**
     * @param gid 年级编号
     * @return 受影响行数
     * 删除年级
     */
    public int delete(int gid);
    /**
     * @param grade 年级对象
     * @return 受影响行数
     * 修改年级
     */
    public int update(Grade grade);
}
