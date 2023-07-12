package com.etc.service.impl;

import com.etc.dao.TeacherDao;
import com.etc.po.Teacher;
import com.etc.service.TeacherService;
import com.etc.util.MD5Util;
import com.etc.vo.TeacherVO;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 10:23:37
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    TeacherDao teacherDao;

    @Override
    public List<TeacherVO> findAll() {
        return teacherDao.findAll();
    }

    @Override
    public TeacherVO findByTid(int tid) {
        return teacherDao.findByTid(tid);
    }

    @Override
    public TeacherVO findByTidAndTpass(int tid, String tpass) {
        String s = MD5Util.md5(tpass);
        return teacherDao.findByTidAndTpass(tid, tpass);
    }

    @Override
    public List<TeacherVO> findByRoleid(int roleid) {
        return teacherDao.findByRoleid(roleid);
    }

    @Override
    public List<TeacherVO> findByCollid(int collid) {
        return teacherDao.findByCollid(collid);
    }

    @Override
    public boolean addteacher(Teacher teacher) {
        String s = MD5Util.md5(teacher.getTpass());
        teacher.setTpass(s);
        return teacherDao.addteacher(teacher)>0?true:false;
    }

    @Override
    public boolean editteacher(Teacher teacher) {
        String s = MD5Util.md5(teacher.getTpass());
        teacher.setTpass(s);
        return teacherDao.editteacher(teacher)>0?true:false;
    }

    @Override
    public boolean updateState(TeacherVO teacher) {
        return teacherDao.updateState(teacher)>0?true:false;
    }

    @Override
    public List<TeacherVO> findByName(String tName) {
        return teacherDao.findByName(tName);
    }

    @Override
    public TeacherVO findByTtel(String ttel) {
        return teacherDao.findByTtel(ttel);
    }

    @Override
    public TeacherVO findByTemail(String temail) {
        return teacherDao.findByTemail(temail);
    }
}
