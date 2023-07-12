package com.etc.controller;

import com.etc.po.Class;
import com.etc.po.Grade;
import com.etc.po.Score;
import com.etc.service.*;
import com.etc.vo.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.w3c.dom.ls.LSException;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ClassController {
    Logger logger = Logger.getLogger(ClassController.class);
    @Autowired
    ClassService classService;
    @Autowired
    MajorService majorService;
    @Autowired
    GradeService gradeService;

    @Autowired
    LessionService lessionService;

    @Autowired
    CourseService courseService;

    @Autowired
    StudentService studentService;
    @Autowired
    ScoreService scoreService;

    @GetMapping("/classlist")
    public String classlist(Model model) {
        logger.info("进入到班级列表控制器");
        List<ClassVO> list = classService.findAll();
        model.addAttribute("list", list);
        return "classlist";
    }

    @GetMapping("/toaddclass")
    public String toaddclass(Model model) {
        logger.info("去添加班级控制器");
        List<MajorVo> list = majorService.findAll();
        model.addAttribute("list", list);
        List<Grade> grades = gradeService.findAll();
        model.addAttribute("grades", grades);
        System.out.println(grades);
        return "add-class";
    }

    @PostMapping("/addclass")
    public String addclass(Class c, Model model) {
        logger.info("进入添加班级！");
        logger.info(c);
        classService.addClass(c);
        List<MajorVo> list = majorService.findAll();
        model.addAttribute("c", c);
        model.addAttribute("list", list);
        return "redirect:classlist";
    }

    @GetMapping("/toupdateClass")
    public String toupdateClass(int cId, Model model) {
        logger.info("进入去修改班级控制器");
        Class aClass = classService.findByCid(cId);
        logger.info(aClass);
        model.addAttribute("aClass", aClass);
        List<MajorVo> list = majorService.findAll();
        model.addAttribute("list", list);
        List<Grade> grades = gradeService.findAll();
        model.addAttribute("grades", grades);
        return "edit-class";
    }

    @PostMapping("/updateClass")
    public String updateGrade(Class aclass) {
        logger.info("修改班级");
        classService.updateClass(aclass);
        return "redirect:/classlist.action";
    }

    @PostMapping("/findByclassName")
    public String selectByCname(String className, Model model) {
        List<ClassVO> list = classService.findByClassName(className);
        model.addAttribute("list", list);
        return "classlist";
    }

    @PostMapping("/findByMname")
    public String selectByMname(String mName, Model model) {
        List<ClassVO> list = classService.findByMName(mName);
        model.addAttribute("list", list);
        return "classlist";
    }

    @RequestMapping("/teacherselectclass")
    public String teacherSelectClass(HttpSession session, Model model) {
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser != null) {
            TeacherVO teacherVO = (TeacherVO) currentUser;
            List<LessionTeacherVo> byTid = lessionService.findByTid(teacherVO.getTid());
            List<CourseVo> byLid = new ArrayList<>();
            List<ClassVO> classes = new ArrayList<>();
            List<Integer> integers = new ArrayList<>();
            int lId = 0;
            for (LessionTeacherVo lessionTeacherVo : byTid) {
                byLid = courseService.findByLid(lessionTeacherVo.getlId());
                lId = lessionTeacherVo.getlId();
            }
            for (CourseVo courseVo : byLid) {
                integers.add(courseVo.getcId());
            }
            for (Integer integer : integers) {
                classes.add(classService.findByCId(integer));
            }
            model.addAttribute("lId", lId);
            model.addAttribute("list", classes);
            return "teacherselectclass";
        } else {
            return "redirect:/tologin";
        }
    }

    @RequestMapping("/classstudent")
    public String classStudent(int cId, Model model, int lId) {

        List<Integer> list = new ArrayList<>();

        List<StudentVO> byCId = studentService.findByCId(cId);

        for (StudentVO studentVO : byCId) {
            Score score = new Score();
            score.setlId(lId);
            score.setsId(studentVO.getsId());
            Score same = scoreService.findSame(score);
            if (same == null) {
                list.add(1);
            } else {
                double i = same.getScore();
                int o = (int) i;
                list.add(o);

            }
        }
        model.addAttribute("lists", list);
        model.addAttribute("lId", lId);
        model.addAttribute("list", byCId);
        return "classstudent";
    }

    @RequestMapping("/luruscore")
    public String luruscore(Score score, int cId, RedirectAttributes redirectAttributes) {
        logger.info(score);
        scoreService.addScore(score);
        redirectAttributes.addAttribute("lId", score.getlId());
        redirectAttributes.addAttribute("cId", cId);
        return "redirect:/classstudent";
    }

    @RequestMapping("/updateclassstate")
    public String updateClassState(Class cs) {
        ClassVO byCId = classService.findByCId(cs.getcId());
        Class aClass = new Class(cs.getcId(), byCId.getmId(), byCId.getgId(), byCId.getClassName(), cs.getcState());
        classService.updateClass(aClass);
        return "redirect:/classlist";
    }
}
