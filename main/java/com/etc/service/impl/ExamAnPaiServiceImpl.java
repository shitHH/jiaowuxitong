package com.etc.service.impl;

import com.etc.dao.ExamAnPaiDao;
import com.etc.po.Course;
import com.etc.po.ExamAnPai;
import com.etc.po.Time;
import com.etc.service.ExamAnPaiService;
import com.etc.service.TimeService;
import com.etc.vo.ExamAnPaiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/7 21:05
 * 考试安排业务逻辑实现类
 */
@Service
public class ExamAnPaiServiceImpl implements ExamAnPaiService {

    @Autowired
    ExamAnPaiDao examAnPaiDao;

    @Autowired
    TimeService timeService;

    @Override
    public List<ExamAnPaiVo> findAll() {
        return examAnPaiDao.findAll();
    }

    @Override
    public List<ExamAnPaiVo> findClassAll(int cId) {
        return examAnPaiDao.findClassAll(cId);
    }

    @Override
    public List<ExamAnPaiVo> findByTid(int tid) {
        return examAnPaiDao.findByTid(tid);
    }

    @Override
    public boolean addExamAnPai(ExamAnPai examAnPai) {
        return examAnPaiDao.addExamAnPai(examAnPai) > 0 ? true : false;
    }

    @Override
    public boolean deleteByeId(int[] eId) {
        return examAnPaiDao.deleteByeId(eId) > 0 ? true : false;
    }

    @Override
    public List<ExamAnPaiVo> findByClassroomId(int classroomId) {
        return examAnPaiDao.findByClassroomId(classroomId);
    }

    @Override
    public ExamAnPai findSame(ExamAnPai examAnPai) {
        return examAnPaiDao.findSame(examAnPai);
    }

    @Override
    public List<Time> checkClassroom(ExamAnPai examAnPai) {
        List<Time> list = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<ExamAnPai> byClassroomIdAndDate = examAnPaiDao.findByClassroomIdAndDate(examAnPai);
        for (ExamAnPai examAnPai1 : byClassroomIdAndDate) {
            for (int i = 1; i <= 5; i++) {
                if (examAnPai1.getTimeId() == i) {
                    integers.add(i);
                    break;
                }
            }
        }
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        integerList.removeAll(integers);
        for (Integer integer : integerList) {
            Time byId = timeService.findById(integer);
            list.add(byId);
        }
        return list;
    }

    @Override
    public List<ExamAnPai> findByClassroomIdAndDate(ExamAnPai examAnPai) {
        return examAnPaiDao.findByClassroomIdAndDate(examAnPai);
    }

    @Override
    public ExamAnPai findByLidAndcid(ExamAnPai examAnPai) {
        return examAnPaiDao.findByLidAndcid(examAnPai);
    }
}
