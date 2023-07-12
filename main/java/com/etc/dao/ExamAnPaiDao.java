package com.etc.dao;

import com.etc.po.Course;
import com.etc.po.ExamAnPai;
import com.etc.vo.CourseVo;
import com.etc.vo.ExamAnPaiVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/6 15:14
 * 考试安排数据访问接口
 */
@Repository
public interface ExamAnPaiDao {

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
    public List<ExamAnPaiVo> findByTid(@Param("tid") int tid);

    /**
     * @param examAnPai 考试安排对象
     * @return 受影响行数
     */
    public int addExamAnPai(ExamAnPai examAnPai);

    /**
     * @param eId 考试安排编号数组
     * @return 受影响行数
     * 删除考试安排
     */
    public int deleteByeId(int[] eId);

    /**
     * @param classroomId 教室编号
     * @return 课程集合
     * 根据教室编号查询所有考试安排
     */
    public List<ExamAnPaiVo> findByClassroomId(@Param("id") int classroomId);

    /**
     * @param examAnPai 考试安排对象
     * @return 考试安排对象
     * 查询是否有考试安排
     */
    public ExamAnPai findSame(ExamAnPai examAnPai);

    /**
     * @param examAnPai 考试安排对象
     * @return 考试安排集合
     * 根据教室编号和日期查询考试实际情况
     */
    public List<ExamAnPai> findByClassroomIdAndDate(ExamAnPai examAnPai);

    public ExamAnPai findByLidAndcid(ExamAnPai examAnPai);
}
