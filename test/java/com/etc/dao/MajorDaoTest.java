package com.etc.dao;

import com.etc.po.Major;
import com.etc.vo.MajorVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lyt
 * 专业测试类
 */
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class MajorDaoTest {
    @Autowired
    MajorDao majorDao;
    @Test
    public void findAll(){
        List<MajorVo>list = majorDao.findAll();
        for (MajorVo major : list) {
            System.out.println(major);
        }

    }
    @Test
    public void findById(){
        MajorVo major = majorDao.findById(1);
        System.out.println(major);
    }

    @Test
    public void findByCollName(){
        List<MajorVo> byCollName = majorDao.findByCollName("经济管理学院");
        for (MajorVo majorVo : byCollName) {
            System.out.println(majorVo);
        }
    }
    
    @Test
    public void findByCollid(){
        List<MajorVo> list = majorDao.findByCollId(1);
        for (MajorVo major : list) {
            System.out.println(major);
        }
    }
    @Test
    public void addMajor(){
        Major major = new Major();
        major.setCollId(2);
        major.setmName("测试1");
        major.setmMoney(2000.0);
        majorDao.addMajor(major);
        System.out.println(major);
    }
}
