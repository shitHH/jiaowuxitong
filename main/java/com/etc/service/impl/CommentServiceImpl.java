package com.etc.service.impl;

import com.etc.dao.CommentDao;
import com.etc.po.Comment;
import com.etc.service.CommentSercice;
import com.etc.vo.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentSercice {
    @Autowired
    CommentDao commentDao;
    @Override
    public List<CommentVO> findAll() {
        return commentDao.findAll();
    }

    @Override
    public List<CommentVO> findBySid(int sid) {
        return commentDao.findBySid(sid);
    }

    @Override
    public List<CommentVO> findByTid(int tid) {
        return commentDao.findByTid(tid);
    }

    @Override
    public List<CommentVO> findBycomscore(int comscore) {
        return commentDao.findBycomscore(comscore);
    }

    @Override
    public CommentVO findBycomid(int comid) {
        return commentDao.findBycomid(comid);
    }

    @Override
    public boolean pingjiao(Comment comment) {
        return commentDao.pingjiao(comment)>0?true:false;
    }

    @Override
    public boolean update(Comment comment) {
        return commentDao.update(comment)>0?true:false;
    }

    @Override
    public boolean delete(int comid) {
        return commentDao.delete(comid)>0?true:false;
    }

    @Override
    public List<CommentVO> findBySidAndTid(int sid, int tid) {
        return commentDao.findBySidAndTid(sid,tid);

    }
}
