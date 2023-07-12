package com.etc.dao;

import com.etc.po.Comment;
import com.etc.vo.CommentVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 教学评价数据访问接口
 */
@Repository
public interface CommentDao {
    /**
     * @return 教评集合
     * 查询所有教评
     */
    public List<CommentVO> findAll();

    /**
     * @return 教评集合
     * 根据学生编号查询教评集合
     */
    public List<CommentVO> findBySid(int sid);

    /**
     * @return 教评集合
     * 根据老师编号查询教评集合
     */
    public List<CommentVO> findByTid(int tid);

    /**
     * @return 教评集合
     * 根据分数查询教评集合
     */
    public List<CommentVO> findBycomscore(int comscore);

    /**
     * @return 教评
     * 查询单个教学评价
     */
    public CommentVO findBycomid(int comid);

    /**
     * @param comment 教评对象
     * @return 受影响行数
     */
    public int pingjiao(Comment comment);

    /**
     * @param comment 教评对象
     * @return  受影响行数
     */
    public int update(Comment comment);

    /**
     * @param comid 教评编号
     * @return 受影响行数
     */
    public int delete(int comid);

    public List<CommentVO> findBySidAndTid(int sid,int tid);
}
