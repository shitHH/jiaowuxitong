package com.etc.dao;

import com.etc.po.ChooseClass;
import com.etc.vo.ChooseClassVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class ChooseclassDaoTest {
    @Autowired
    ChooseclassDao chooseclassDao;
    @Test
    public void chooseClass(){
        ChooseClass chooseClass = new ChooseClass(2,1);
        chooseclassDao.chooseClass(chooseClass);
    }
    @Test
    public void findAll(){
        List<ChooseClassVO> list = chooseclassDao.selectAll();
        System.out.println(list);
    }
    @Test
    public void  findBySid(){
        List<ChooseClassVO> list = chooseclassDao.selectBysid(2);
        for (ChooseClassVO chooseClassVO:list){
            System.out.println(chooseClassVO.getlName());
        }
    }
}
