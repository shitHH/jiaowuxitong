package com.etc.service;

import com.etc.po.Appraiseoption;
import com.etc.vo.ApTchVO;

import java.util.List;

public interface AppraiseService {
    //查询全部教评题
    List<Appraiseoption> findAllAp();

    //根据教评id查询教评
    Appraiseoption findbyId(int chooseid);

    //删除问题
    boolean deleteOneAp(int chooseid);

    //编辑问题
    boolean editOneAp(Appraiseoption appraiseoption);

    //添加问题
    boolean addOneAp(Appraiseoption appraiseoption);
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



}
