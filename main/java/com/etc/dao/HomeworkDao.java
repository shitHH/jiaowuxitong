package com.etc.dao;

import com.etc.po.Homework;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作业数据访问接口
 */
@Repository
public interface HomeworkDao {
    /**
     * @return 作业集合
     * 查询所有作业
     */
    public List<Homework> selectAll();

    /**
     * @param homeid 作业编号
     * @return 作业对象
     * 查询单个作业
     */
    public Homework selectone(int homeid);

    /**
     * @param cid 班级编号
     * @return 作业对象
     * 根据班级编号查询作业
     */
    public Homework selectByCid(int cid);

    /**
     * @param tid 老师编号
     * @return 作业对象
     * 根据老师编号查询作业对象
     */
    public Homework selectByTid(int tid);

    /**
     * @param homework 作业对象
     * @return 受影响行数
     * 添加作业
     */
    public int add(Homework homework);

    /**
     * @param homeid 作业编号
     * @return 受影响行数
     * 删除作业
     */
    public int delete(int []homeid);

    /**
     * @param homework 作业对象
     * @return 受影响行数
     * 修改作业
     */
    public int update(Homework homework);

}
