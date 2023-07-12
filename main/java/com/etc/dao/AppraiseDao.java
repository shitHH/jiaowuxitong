package com.etc.dao;

import com.etc.po.Appraiseoption;
import com.etc.vo.ApTchVO;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 教学评价接口
 */
@Repository
public interface AppraiseDao {

    //查询全部教评问题
    List<Appraiseoption> findAllAp();

    //删除问题
    int deleteOneAp(int chooseid);

    //编辑问题
    int editOneAp(Appraiseoption appraiseoption);

    //添加问题
    int addOneAp(Appraiseoption appraiseoption);
    ///////////////////////////////////////////////////////////////////

    //查询教评状态
    int selOneState(Appraiseoption appraiseoption);

    //添加教评记录
    int addOneAppraise(ApTchVO apTchVO);


    //判断是否有教师成绩记录
    int selTchExamState(ApTchVO apTchVO);

    //添加教师分数及教评人数
    int addOneTchExam(ApTchVO apTchVO);

    //更新教师分数及教评人数
    int upOneTchExam(ApTchVO apTchVO);

    //根据教评id查询教评
    Appraiseoption findbyId(int chooseid);

}
