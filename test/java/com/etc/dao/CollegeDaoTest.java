package com.etc.dao;

import com.etc.po.College;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 15:20:23
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class CollegeDaoTest {
    @Autowired
    CollegeDao collegeDao;

    @Test
    public void a() {
        List<College> all = collegeDao.findAll();
        for (College college : all) {
            System.out.println(college);
        }
    }

    @Test
    public void b() {
        College findbycollid = collegeDao.findbycollid(1);
        System.out.println(findbycollid);
    }

    @Test
    public void c() {
        College college = new College();
        college.setCollname("新增");
        int addcollege = collegeDao.addcollege(college);
        System.out.println(addcollege);
    }

    @Test
    public void d() {
        College findbycollid = collegeDao.findbycollid(10);
        findbycollid.setCollname("xiugai");
        int update = collegeDao.update(findbycollid);
        System.out.println(update);
    }

    @Test
    public void e() {
        int delete = collegeDao.delete(10);
        System.out.println(delete);
    }
}
