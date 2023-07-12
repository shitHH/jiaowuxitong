package com.etc.service;

import com.etc.po.Appraiseoption;
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
 * @date 2022/10/8 16:58:03
 */
@RunWith(SpringRunner.class)
@MapperScan("com.etc.dao")
@SpringBootTest
public class AppriaiseServiceImplTest {
    @Autowired
    AppraiseService appraiseService;
    @Test
    public void  findAllAp(){
        List<Appraiseoption> list = appraiseService.findAllAp();
        for (Appraiseoption appraiseoption:list){
            System.out.println(appraiseoption);
        }
    }
    @Test
    public void addOneAp(){
        Appraiseoption appraiseoption = new Appraiseoption();
        appraiseoption.setContent("测试");
        boolean i = appraiseService.addOneAp(appraiseoption);
        System.out.println(i);
    }
    @Test
    public void editOneAp(){
        Appraiseoption appraiseoption = appraiseService.findbyId(15);
        appraiseoption.setContent("测试3");
        boolean i = appraiseService.editOneAp(appraiseoption);
        System.out.println(i);
    }
    @Test
    public void findbyid(){
        Appraiseoption appraiseoption = appraiseService.findbyId(10);
        System.out.println(appraiseoption);
    }
    @Test
    public void delete(){
        boolean i = appraiseService.deleteOneAp(15);
        System.out.println(i);
    }

}
