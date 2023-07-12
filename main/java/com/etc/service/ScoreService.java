package com.etc.service;

import com.etc.po.Score;
import com.etc.vo.ScoreVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lyt
 * 分数业务逻辑接口
 */
@Component
public interface ScoreService {
    /**
     * @return 成绩集合
     */
    public List<ScoreVO> findAll();

    /**
     * 根据学生学号查询成绩
     * @param sId 学生学号
     * @return 成绩集合
     */
    public List<ScoreVO> findBySid(int sId);

    /**
     * 根据课程编号查询成绩
     * @param lId 课程编号
     * @return 成绩集合
     */
    public List<ScoreVO> findByLid(int lId);

    /**
     * 上传成绩
     * @param score 成绩对象
     * @return 是否增加成功
     */
    public boolean addScore(Score score);

    /**
     * 修改成绩
     * @param score 成绩对象
     * @return 是否修改成功
     */
    public boolean updateScore(Score score);

    public Score findSame(Score score);

}
