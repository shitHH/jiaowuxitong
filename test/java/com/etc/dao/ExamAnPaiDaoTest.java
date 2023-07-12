package com.etc.dao;

import com.etc.po.Course;
import com.etc.po.ExamAnPai;
import com.etc.vo.ExamAnPaiVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.CORBA.PUBLIC_MEMBER;
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
 * Create by 2022/10/7 15:06
 */
@SpringBootTest
@MapperScan("com.etc.dao")
@RunWith(SpringRunner.class)
public class ExamAnPaiDaoTest {

    @Autowired
    ExamAnPaiDao examAnPaiDao;

    @Test
    public void findAll() {

        List<ExamAnPaiVo> all = examAnPaiDao.findAll();

        for (ExamAnPaiVo examAnPaiVo : all) {
            System.out.println(examAnPaiVo);
        }
    }

    @Test
    public void findClassAll() {
        List<ExamAnPaiVo> classAll = examAnPaiDao.findClassAll(1);

        for (ExamAnPaiVo examAnPaiVo : classAll) {
            System.out.println(examAnPaiVo);
        }
    }

    @Test
    public void findByTid() {
        List<ExamAnPaiVo> classAll = examAnPaiDao.findByTid(1);

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

        examAnPaiDao.addExamAnPai(examAnPai);

        this.findAll();

    }

    @Test
    public void deleteByeId(){

        int [] array  = {6};

        int i = examAnPaiDao.deleteByeId(array);
        System.out.println(i);
    }

    @Test
    public void findByClassroomId(){

        List<ExamAnPaiVo> byClassroomId = examAnPaiDao.findByClassroomId(5);
        for (ExamAnPaiVo examAnPaiVo : byClassroomId) {
            System.out.println(examAnPaiVo);
        }
    }

    @Test
    public void findByClassroomIdAndDate(){
        String date = "2022-10-07";
        Date parse = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ExamAnPai examAnPai = new ExamAnPai();
        examAnPai.setDate(parse);
        examAnPai.setClassroomId(5);
        List<ExamAnPai> byClassroomIdAndDate = examAnPaiDao.findByClassroomIdAndDate(examAnPai);
        for (ExamAnPai anPai : byClassroomIdAndDate) {
            System.out.println(anPai);
        }

    }

    @Test
    public void findSame(){
        ExamAnPai examAnPai = new ExamAnPai();
        examAnPai.settId(3);
        examAnPai.setTimeId(4);
        ExamAnPai same = examAnPaiDao.findSame(examAnPai);
        System.out.println(same);
    }

    @Test
    public void findByLidAndcid(){
        ExamAnPai examAnPai = new ExamAnPai();
        examAnPai.setcId(2);
        examAnPai.setlId(4);
        ExamAnPai byLidAndcid = examAnPaiDao.findByLidAndcid(examAnPai);
        System.out.println(byLidAndcid);
    }
}
