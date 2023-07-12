package com.etc.service;

import com.etc.po.PPT;
import com.etc.vo.PPTVO;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author GX
 */
@RunWith(SpringRunner.class)
@MapperScan("com.etc.dao")
@SpringBootTest
public class PPTServiceTest {
    Logger logger=Logger.getLogger(PPTServiceTest.class);
    @Autowired
    PPTService pptService;
    @Test
    public void  findByid(){
        List<PPTVO> list=pptService.findByid(1);
        for (PPTVO pptvo:list) {
            System.out.println(pptvo);
        }
    }
    @Test
    public void pptinsert(){
        PPT ppt=new PPT();
        ppt.setMid(21);
        ppt.setPhotoid(1);
        ppt.setPptname("线程");
        ppt.setPptsrc("D:\\dir\\15第九章——线程.pdf");
        boolean falg=pptService.pptinsert(ppt);
        this.findByid();
    }
    @Test
    public void pptdatele(){
        boolean falg=pptService.pptdatele(5);
        this.findByid();
    }
}
