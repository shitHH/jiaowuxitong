package com.etc.service;

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
 * @date 2022/10/8 15:39:04
 */

@RunWith(SpringRunner.class)
@MapperScan("com.etc.dao")
@SpringBootTest
public class CollegeServiceImplTest {
    @Autowired
    CollegeService collegeService;
    @Test
    public void a(){
        List<College> all = collegeService.findAll();
        for (College college:all){
            System.out.println(college.getCollname());
        }
    }
    @Test
    public void b(){
        College findbycollid = collegeService.findbycollid(1);
        System.out.println(findbycollid);
    }
    @Test
    public void c(){
        College college = new College();
        college.setCollname("新增");
        boolean addcollege = collegeService.addcollege(college);
        System.out.println(addcollege);
    }

    @Test
    public void d(){
        College findbycollid = collegeService.findbycollid(11);
        findbycollid.setCollname("xiugai");
        boolean update = collegeService.update(findbycollid);
        System.out.println(update);
    }
    @Test
    public void e(){
        boolean delete = collegeService.delete(10);
        System.out.println(delete);
    }
}
