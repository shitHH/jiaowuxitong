package com.etc.service.impl;

import com.etc.dao.StudentDao;
import com.etc.po.Student;
import com.etc.service.StudentService;
import com.etc.util.MD5Util;
import com.etc.vo.StudentVO;
import com.etc.vo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:yjt
 * @category
 * 学生业务逻辑实现类
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<StudentVO> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findBySTel(String sTel) {
        return studentDao.findBySTel(sTel);
    }

    @Override
    public StudentVO findBySId(int sId) {
        return studentDao.findBySId(sId);
    }

    @Override
    public List<StudentVO> findBySName(String sName) {
        return studentDao.findBySName(sName);
    }

    @Override
    public List<StudentVO> findByCId(int cId) {
        return studentDao.findByCId(cId);
    }

    @Override
    public List<StudentVO> findByClassName(String className) {
        return studentDao.findByClassName(className);
    }

    @Override
    public List<StudentVO> findByGId(int gId) {
        return studentDao.findByGId(gId);
    }

    @Override
    public List<StudentVO> findByGName(String gName) {
        return studentDao.findByGName(gName);
    }

    @Override
    public StudentVO findByTelAndPass(String sTel, String sPass) {
        return studentDao.findByTelAndPass(sTel, sPass);
    }

    @Override
    public StudentVO findBySIdAndPass(int sId, String sPass) {
        String s = MD5Util.md5(sPass);
        return studentDao.findBySIdAndPass(sId,s);
    }


    @Override
    public Student findByEmail(String sEmail) {
        return studentDao.findByEmail(sEmail);
    }

    @Override
    public StudentVO findBySId2(int sId) {
        return studentDao.findBySId2(sId);
    }

    @Override
    public boolean addStudent(StudentVO studentVO) {
        String s = MD5Util.md5(studentVO.getsPass());
        studentVO.setsPass(s);
        return studentDao.addStudent(studentVO)>0?true:false;
    }

    @Override
    public boolean add(Student studentVO) {
        return studentDao.add(studentVO)>0?true:false;
    }

    @Override
    public boolean updateStudent(StudentVO studentVO) {
        String s = MD5Util.md5(studentVO.getsPass());
        studentVO.setsPass(s);
        return studentDao.updateStudent(studentVO)>0?true:false;
    }

    @Override
    public boolean editStudent(StudentVO studentVO) {
        return studentDao.editStudent(studentVO)>0?true:false;
    }

    @Override
    public boolean updateSState(StudentVO studentVO) {
        return studentDao.updateSState(studentVO)>0?true:false;
    }

    @Override
    public boolean updateSPass(StudentVO studentVO) {
        String s = MD5Util.md5(studentVO.getsPass());
        studentVO.setsPass(s);
        return studentDao.updateSPass(studentVO)>0?true:false;
    }

    @Override
    public boolean deleteStudent(int cId) {
        return studentDao.deleteStudent(cId)>0?true:false;
    }


}
