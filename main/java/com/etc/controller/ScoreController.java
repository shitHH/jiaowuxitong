package com.etc.controller;

import com.etc.po.Lession;
import com.etc.po.Score;
import com.etc.service.CourseService;
import com.etc.service.LessionService;
import com.etc.service.ScoreService;
import com.etc.service.StudentService;
import com.etc.vo.CourseVo;
import com.etc.vo.LessionTeacherVo;
import com.etc.vo.ScoreVO;
import com.etc.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ScoreController {
    @Autowired
    ScoreService scoreService;
    @Autowired
    LessionService lessionService;
    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;
    @GetMapping("scorelist")
    public String scoreList(Model model) {
        List<ScoreVO> list = scoreService.findAll();
        model.addAttribute("list", list);
        return "score";
    }

    @GetMapping("myscore")
    public String myScore(int sid, Model model) {
        //获取总成绩
        List<ScoreVO> list = scoreService.findBySid(sid);
        List<Double> list1 = new ArrayList<>();
        for (ScoreVO scoreVO:list){
            list1.add(scoreVO.getScore());
        }
        Double[] scores = new Double[list1.size()];
        list1.toArray(scores);
        double zongscore = 0;
        for (int i=0;i<scores.length;i++){
            zongscore += scores[i];
        }
        //获取学生对应的课程
        //获取学生信息
        StudentVO studentVO = studentService.findBySId(sid);
        //获取当前人的班级
        int cid = studentVO.getcId();
        List<CourseVo> courseVos = courseService.findClassAll(cid);
        List<Integer> lids = new ArrayList<>();
        for (CourseVo courseVo : courseVos){
            lids.add(courseVo.getlId());
        }
        List<Double> credits = new ArrayList<>();
        for (int lid:lids){
            LessionTeacherVo lessionTeacherVos = lessionService.findBylid(lid);
            credits.add(lessionTeacherVos.getCredit());
        }
        Double credit[] = new Double[credits.size()];
        credits.toArray(credit);
                double zongcredit = 0;
        for (int i1 = 0; i1<credit.length;i1++){
            zongcredit += credit[i1];
        }
        model.addAttribute("zongcredit",zongcredit);
        model.addAttribute("zongscore",zongscore);
        model.addAttribute("list", list);
        return "myscore";
    }

}
