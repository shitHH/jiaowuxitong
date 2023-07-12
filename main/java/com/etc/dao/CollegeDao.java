package com.etc.dao;

import com.etc.po.College;
import com.etc.po.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 14:45:56
 */

/**
 * 学院数据访问接口
 */
@Repository
public interface CollegeDao {

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
     * 通过学院名称查询学院对象
     * @param collName 学院名称
     * @return 学院对象
     */
      public College findByCollName(String collName);

    /**
     * @param college 添加学院
     * @return
     */
      int addcollege(College college);

    /**
     * @param college 更新学院
     * @return
     */
    int update(College  college);

    /**
     * @param
     * @return
     */
    int delete(int collid);
}
