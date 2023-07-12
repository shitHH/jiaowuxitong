package com.etc.service;

import com.etc.po.Course;
import com.etc.po.ExamAnPai;
import com.etc.po.Time;
import com.etc.vo.ExamAnPaiVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/7 21:03
 * 考试安排业务逻辑接口
 */
public interface ExamAnPaiService {


    /**
     * @return 考试集合
     * 查询所有考试安排
     */
    public List<ExamAnPaiVo> findAll();

    /**
     * @return 考试集合
     * 根据班级编号查找所有考试安排
     */
    public List<ExamAnPaiVo> findClassAll(@Param("cid") int cId);

    /**
     * @param tid 监考教师编号
     * @return 考试vo集合
     * 根据监考教师编号查询所有考试安排
     */
    public List<ExamAnPaiVo> findByTid(@Param("tid")int tid);

    /**
     * @param examAnPai 考试安排对象
     * @return 受影响行数
     */
    public boolean addExamAnPai(ExamAnPai examAnPai);

    /**
     * @param eId 考试安排编号数组
     * @return 受影响行数
     * 删除考试安排
     */
    public boolean deleteByeId(int [] eId);

    /**
     * @param classroomId 教室编号
     * @return 课程集合
     * 根据教室编号查询所有考试安排
     */
    public List<ExamAnPaiVo> findByClassroomId(@Param("id") int classroomId );

    /**
     * @param examAnPai 考试安排对象
     * @return 考试安排对象
     * 查询是否有考试安排
     */
    public ExamAnPai findSame(ExamAnPai examAnPai);

    /**
     * @param examAnPai 排课对象
     * @return 时间段集合
     * 查看教室使用情况
     */
    public List<Time> checkClassroom(ExamAnPai examAnPai);

    /**
     * @param examAnPai 考试安排对象
     * @return 考试安排集合
     * 根据教室编号和日期查询考试实际情况
     */
    public List<ExamAnPai> findByClassroomIdAndDate(ExamAnPai examAnPai);

    public ExamAnPai findByLidAndcid(ExamAnPai examAnPai);

}
