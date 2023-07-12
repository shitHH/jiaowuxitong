package com.etc.dao;

import com.etc.po.Score;
import com.etc.vo.ScoreVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lyt
 * 分数数据接口
 */
@Repository
public interface ScoreDao {
    /**
     * @return 成绩集合
     */
    public List<ScoreVO> findAll();

    /**
     * 根据学生学号查询成绩
     *
     * @param sId 学生学号
     * @return 成绩集合
     */
    public List<ScoreVO> findBySid(int sId);

    /**
     * 根据课程编号查询成绩
     *
     * @param lId 课程编号
     * @return 成绩集合
     */
    public List<ScoreVO> findByLid(int lId);

    /**
     * 上传成绩
     *
     * @param score 成绩对象
     * @return 受影响行数
     */
    public int addScore(Score score);

    /**
     * 修改成绩
     *
     * @param score 成绩对象
     * @return 受影响行数
     */
    public int updateScore(Score score);

    public Score findSame(Score score);
}
