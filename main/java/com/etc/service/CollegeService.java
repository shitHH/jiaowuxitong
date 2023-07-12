package com.etc.service;

import com.etc.po.College;

import java.util.List;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 15:16:39
 */
public interface CollegeService {
    /**
     * @return 查询所有学院
     */
    List<College> findAll();

    /**
     * 通过学院编号查找学院
     * @return
     */
    College findbycollid(int collid);

    /**
     * @param college 添加学院
     * @return
     */
    boolean addcollege(College college);

    /**
     * @param college 更新学院
     * @return
     */
    boolean update(College  college);

    /**
     * @param collid 根据学院id删除学院
     * @return
     */
    boolean delete(int collid);
}
