package com.etc.service;

import com.etc.po.Photo;
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
public class PhotoServiceTest {
    Logger logger=Logger.getLogger(PhotoServiceTest.class);
    @Autowired
    PhotoService photoService;
    @Test
    public void finAll(){
    List<Photo> list=photoService.findAll();
        for (Photo photo:list) {
            System.out.println(photo);
        }
    }
    @Test
    public void findBypip(){
        Photo photo=new Photo();
        photo.setPip("上架");
        List<Photo> list=photoService.findBypip(photo);
        for (Photo photo1:list) {
            System.out.println(photo1);
        }
    }
    @Test
    public void photoinsert(){
        Photo photo=new Photo();
        photo.setPhotoname("javaEE");
        photo.setPhotosrc("");
        photo.setPhototype("计算机");
        photo.setPip("上架");
        photo.setPtname("王一超");
        boolean falg=photoService.photoinsert(photo);
        this.finAll();
    }
    @Test
    public void finBytype(){
        List<Photo> list=photoService.finBytype("计算机科学","下架");
        for (Photo photo:list) {
            System.out.println(photo);
        }
    }
    @Test
    public void  finname(){
        List<Photo> list=photoService.findByphotoname("向","上架");
        for (Photo photo:list) {
            System.out.println(photo);
        }
    }
}
