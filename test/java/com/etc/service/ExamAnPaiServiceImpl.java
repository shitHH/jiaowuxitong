package com.etc.service;

import com.etc.po.Course;
import com.etc.po.ExamAnPai;
import com.etc.po.Time;
import com.etc.vo.ExamAnPaiVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/7 21:10
 * 考试安排业务逻辑测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.etc.dao")
public class ExamAnPaiServiceImpl {
    
    @Autowired
    ExamAnPaiService examAnPaiService;

    @Test
    public void findAll() {

        List<ExamAnPaiVo> all = examAnPaiService.findAll();

        for (ExamAnPaiVo examAnPaiVo : all) {
            System.out.println(examAnPaiVo);
        }
    }

    @Test
    public void findClassAll() {
        List<ExamAnPaiVo> classAll = examAnPaiService.findClassAll(1);

        for (ExamAnPaiVo examAnPaiVo : classAll) {
            System.out.println(examAnPaiVo);
        }
    }

    @Test
    public void findByTid() {
        List<ExamAnPaiVo> classAll = examAnPaiService.findByTid(1);

        for (ExamAnPaiVo examAnPaiVo : classAll) {
            System.out.println(examAnPaiVo);
        }
    }

    @Test
    public void addExamAnPai() {

        String date = "2000-10-23";
        Date parse = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(parse);

        ExamAnPai examAnPai = new ExamAnPai(1, 7, 6, 1, 5, parse);

        examAnPaiService.addExamAnPai(examAnPai);

        this.findAll();

    }

    @Test
    public void deleteByeId(){

        int [] array  = {6};

        examAnPaiService.deleteByeId(array);
    }

    @Test
    public void findByClassroomId(){

        List<ExamAnPaiVo> byClassroomId = examAnPaiService.findByClassroomId(5);
        for (ExamAnPaiVo examAnPaiVo : byClassroomId) {
            System.out.println(examAnPaiVo);
        }
    }


    @Test
    public void findSame(){
        ExamAnPai examAnPai = new ExamAnPai();
        examAnPai.settId(1);
        examAnPai.setTimeId(2);
        ExamAnPai same = examAnPaiService.findSame(examAnPai);
        System.out.println(same);
    }

    @Test
    public void checkClassroom(){
        String date = "2022-09-23";
        Date parse = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ExamAnPai examAnPai = new ExamAnPai();
        examAnPai.setClassroomId(1);
        examAnPai.setDate(parse);
        List<Time> list = examAnPaiService.checkClassroom(examAnPai);
        for (Time time : list) {
            System.out.println(time);
        }
    }
}
