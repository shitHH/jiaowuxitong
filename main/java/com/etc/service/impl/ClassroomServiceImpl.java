package com.etc.service.impl;

import com.etc.dao.ClassroomDao;
import com.etc.po.Classroom;
import com.etc.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    ClassroomDao classroomDao;

    @Override
    public List<Classroom> selectAll() {
        return classroomDao.selectAll();
    }

    @Override
    public Classroom selectByid(int classroomid) {
        return classroomDao.selectByid(classroomid);
    }

    @Override
    public boolean add(Classroom classroom) {
        return classroomDao.add(classroom) > 0 ? true : false;
    }

    @Override
    public boolean delete(int[] classroomid) {
        return classroomDao.delete(classroomid) > 0 ? true : false;
    }

    @Override
    public boolean update(Classroom classroom) {
        return classroomDao.update(classroom) > 0 ? true : false;
    }

    @Override
    public Classroom checkClassroomName(String name) {
        return classroomDao.checkClassroomName(name);
    }

    @Override
    public List<Classroom> findByName(String name) {
        return classroomDao.findByName(name);
    }
}
