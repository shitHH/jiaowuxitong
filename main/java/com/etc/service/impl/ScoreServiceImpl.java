package com.etc.service.impl;

import com.etc.dao.ScoreDao;
import com.etc.po.Score;
import com.etc.service.ScoreService;
import com.etc.vo.ScoreVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lyt
 * 成绩业务逻辑实现类
 */
@Service
public class ScoreServiceImpl implements ScoreService {
    @Resource
    ScoreDao scoreDao;

    @Override
    public List<ScoreVO> findAll() {
        return scoreDao.findAll();
    }

    @Override
    public List<ScoreVO> findBySid(int sId) {
        return scoreDao.findBySid(sId);
    }

    @Override
    public List<ScoreVO> findByLid(int lId) {
        return scoreDao.findByLid(lId);
    }

    @Override
    public boolean addScore(Score score) {
        return scoreDao.addScore(score) > 0 ? true : false;
    }

    @Override
    public boolean updateScore(Score score) {
        return scoreDao.updateScore(score) > 0 ? true : false;
    }

    @Override
    public Score findSame(Score score) {
        return scoreDao.findSame(score);
    }
}
