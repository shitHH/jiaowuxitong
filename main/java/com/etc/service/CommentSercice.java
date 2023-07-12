package com.etc.service;

import com.etc.po.Comment;
import com.etc.vo.CommentVO;

import java.util.List;

public interface CommentSercice {
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
    public boolean pingjiao(Comment comment);

    /**
     * @param comment 教评对象
     * @return  受影响行数
     */
    public boolean update(Comment comment);

    /**
     * @param comid 教评编号
     * @return 受影响行数
     */
    public boolean delete(int comid);
    public List<CommentVO> findBySidAndTid(int sid,int tid);

}
