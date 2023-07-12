package com.etc.service.impl;

import com.etc.dao.AppraiseDao;
import com.etc.po.Appraiseoption;
import com.etc.service.AppraiseService;
import com.etc.vo.ApTchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseServiceImpl implements AppraiseService {

   @Autowired
   private AppraiseDao appraiseDao;
    @Override
    //查询全部评教的题目
    public List<Appraiseoption> findAllAp() {
        return appraiseDao.findAllAp();
    }
    //删除问题
    @Override
    public boolean deleteOneAp(int chooseid) {
        return appraiseDao.deleteOneAp(chooseid)>0?true:false;
    }
   //编辑问题
    @Override
    public boolean editOneAp(Appraiseoption appraiseoption) {
        return appraiseDao.editOneAp(appraiseoption)>0?true:false;
    }
    //添加问题
    @Override
    public boolean addOneAp(Appraiseoption appraiseoption) {
        return appraiseDao.addOneAp(appraiseoption)>0?true:false;
    }
    //查询教评状态
    @Override
    public int selOneState(Appraiseoption appraiseoption) {
        return appraiseDao.selOneState(appraiseoption);
    }
    //添加教评
    @Override
    public int addOneAppraise(ApTchVO apTchVO) {
        return appraiseDao.addOneAppraise(apTchVO);
    }
    //判断是否有教师成绩记录
    @Override
    public int selTchExamState(ApTchVO apTchVO) {
        return appraiseDao.selTchExamState(apTchVO);
    }

    //添加教师分数及教评人数
    @Override
    public int addOneTchExam(ApTchVO apTchVO) {
        return appraiseDao.addOneTchExam(apTchVO);
    }
    //更新教师分数及教评人数
    @Override
    public int upOneTchExam(ApTchVO apTchVO) {
        return appraiseDao.upOneTchExam(apTchVO);
    }

    @Override
    public Appraiseoption findbyId(int chooseid) {
        return appraiseDao.findbyId(chooseid);
    }
}
