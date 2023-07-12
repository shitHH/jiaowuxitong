package com.etc.controller;

import com.etc.po.Classroom;
import com.etc.po.ExamAnPai;
import com.etc.po.Time;
import com.etc.service.*;
import com.etc.vo.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/10 15:04:17
 * 考试控制器
 */
@Controller
public class ExamContorller {

    Logger logger = Logger.getLogger(ExamAnPai.class);

    @Autowired
    ExamAnPaiService examAnPaiService;

    @Autowired
    CollegeService collegeService;

    @Autowired
    TimeService timeService;

    @Autowired
    ClassService classService;

    @Autowired
    MajorService majorService;

    @Autowired
    ClassroomService classroomService;

    @Autowired
    LessionService lessionService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @RequestMapping("/toexamlist")
    public String toExamList(int cId, Model model) {
        List<ExamAnPaiVo> classAll = examAnPaiService.findClassAll(cId);
        model.addAttribute("cId", cId);
        model.addAttribute("exam", classAll);
        return "examlist";
    }

    @RequestMapping("/findeclass")
    public String findEClass(int collId, Model model) {
        List<MajorVo> byCollId = majorService.findByCollId(collId);
        List<ClassVO> classVos = new ArrayList<>();
        for (MajorVo majorVo : byCollId) {
            List<ClassVO> byMId = classService.findByMId(majorVo.getmId());
            for (ClassVO classVO : byMId) {
                classVos.add(classVO);
            }
        }
        model.addAttribute("cclass", classVos);
        return "eclass";
    }

    @RequestMapping("/deleteexam")
    public String deleteExam(RedirectAttributes redirectAttributes, int cId, int eId) {
        int[] array = {eId};
        examAnPaiService.deleteByeId(array);
        redirectAttributes.addAttribute("cId", cId);
        return "redirect:/toexamlist";
    }

    @RequestMapping("/toexamplan")
    public String toExamPlan(int cId, Model model) {
        ClassVO byCId = classService.findByCId(cId);
        List<CourseVo> classAll = courseService.findClassAll(cId);
        List<TeacherVO> all = teacherService.findAll();
        List<Classroom> classrooms = classroomService.selectAll();
        model.addAttribute("teacher", all);
        model.addAttribute("classroom", classrooms);
        model.addAttribute("lession", classAll);
        model.addAttribute("classs", byCId);
        return "examplan";
    }

    @RequestMapping("/checksamelession")
    @ResponseBody
    public boolean checkSameLession(ExamAnPai examAnPai) {
        ExamAnPai byLidAndcid = examAnPaiService.findByLidAndcid(examAnPai);
        if (byLidAndcid == null) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/checkclassroomc")
    @ResponseBody
    public List<Time> checkClassroomC(ExamAnPai examAnPai) {
        logger.info(examAnPai);
        List<Time> times = examAnPaiService.checkClassroom(examAnPai);
        return times;
    }

    @RequestMapping("/checkteacherstate")
    @ResponseBody
    public boolean checkTeacherState(ExamAnPai examAnPai) {
        logger.info(examAnPai);
        ExamAnPai same = examAnPaiService.findSame(examAnPai);
        if (same == null) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/addexam")
    public String addExam(ExamAnPai examAnPai, RedirectAttributes redirectAttributes) {
        logger.info(examAnPai);
        examAnPaiService.addExamAnPai(examAnPai);
        redirectAttributes.addAttribute("cId", examAnPai.getcId());
        return "redirect:/toexamlist";
    }

    @RequestMapping("/studentexamselect")
    public String studentExamSelect(HttpSession session, Model model) {
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser != null) {
            StudentVO studentVO = (StudentVO) currentUser;
            List<ExamAnPaiVo> classAll = examAnPaiService.findClassAll(studentVO.getcId());
            model.addAttribute("exam", classAll);
            return "studentexamlist";
        } else {
            return "redirect:/tologin";
        }
    }

    @RequestMapping("/teacherexamlist")
    public String teacherExamList(HttpSession session, Model model) {
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser != null) {
            TeacherVO teacherVO = (TeacherVO) currentUser;
            List<ExamAnPaiVo> byTid = examAnPaiService.findByTid(teacherVO.getTid());
            model.addAttribute("exam", byTid);
            return "teacherexamlist";
        } else {
            return "redirect:/tologin";
        }
    }
}
