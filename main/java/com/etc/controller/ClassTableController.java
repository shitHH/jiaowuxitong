package com.etc.controller;

import com.etc.po.Classroom;
import com.etc.po.Course;
import com.etc.po.Time;
import com.etc.service.*;
import com.etc.vo.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/9 12:08:06
 * 课表控制器
 */
@Controller
public class ClassTableController {

    Logger logger = Logger.getLogger(ClassTableController.class);

    @Autowired
    CourseService courseService;

    @Autowired
    ClassService classService;

    @Autowired
    LessionService lessionService;

    @Autowired
    ClassroomService classroomService;

    @Autowired
    TimeService timeService;

    @Autowired
    TeacherService teacherService;

    @GetMapping("/toclasstable")
    public String toClassTable(Model model, int cId) {
        List<CourseVo> byClassroomId = courseService.findClassAll(cId);
        List<CourseVo> monday = new ArrayList<>();
        List<CourseVo> tuesday = new ArrayList<>();
        List<CourseVo> wednesday = new ArrayList<>();
        List<CourseVo> thursday = new ArrayList<>();
        List<CourseVo> firday = new ArrayList<>();

        for (CourseVo courseVo : byClassroomId) {
            if (courseVo.getWeek().equals("周一")) {
                monday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周二")) {
                tuesday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周三")) {
                wednesday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周四")) {
                thursday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周五")) {
                firday.add(courseVo);
            }
        }
        model.addAttribute("monday", monday);
        model.addAttribute("tuesday", tuesday);
        model.addAttribute("wednesday", wednesday);
        model.addAttribute("thursday", thursday);
        model.addAttribute("firday", firday);
        model.addAttribute("cId", cId);
        return "classtable";
    }

    @RequestMapping("/classplan")
    public String classTable(int cId, Model model) {
        ClassVO byCId = classService.findByCId(cId);
        List<LessionTeacherVo> all = lessionService.findAll();
        List<Classroom> classrooms = classroomService.selectAll();
        model.addAttribute("classroomlist", classrooms);
        model.addAttribute("lessionlist", all);
        logger.info(byCId);
        model.addAttribute("classs", byCId);
        return "classplan";
    }

    @RequestMapping("/checktime")
    @ResponseBody
    public List<Time> checkTime(Course course, Model model) {
        logger.info(course);
        List<CourseVo> byClassroomId = courseService.findClassAll(course.getcId());
        List<CourseVo> monday = new ArrayList<>();
        List<CourseVo> tuesday = new ArrayList<>();
        List<CourseVo> wednesday = new ArrayList<>();
        List<CourseVo> thursday = new ArrayList<>();
        List<CourseVo> firday = new ArrayList<>();


        List<Integer> mondys = new ArrayList<>();
        List<Integer> tuesdays = new ArrayList<>();
        List<Integer> wednesdays = new ArrayList<>();
        List<Integer> thursdays = new ArrayList<>();
        List<Integer> firdays = new ArrayList<>();

        for (CourseVo courseVo : byClassroomId) {
            if (courseVo.getWeek().equals("周一")) {
                monday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周二")) {
                tuesday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周三")) {
                wednesday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周四")) {
                thursday.add(courseVo);
            }
            if (courseVo.getWeek().equals("周五")) {
                firday.add(courseVo);
            }
        }
        model.addAttribute("cId", course.getcId());
        for (CourseVo courseVo : monday) {
            mondys.add(courseVo.getTimeId());
        }
        for (CourseVo courseVo : tuesday) {
            tuesdays.add(courseVo.getTimeId());
        }
        for (CourseVo courseVo : wednesday) {
            wednesdays.add(courseVo.getTimeId());
        }
        for (CourseVo courseVo : thursday) {
            thursdays.add(courseVo.getTimeId());
        }
        for (CourseVo courseVo : firday) {
            firdays.add(courseVo.getTimeId());
        }

        for (Integer integer : tuesdays) {
            System.out.println(integer);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);


        List<Course> byClassroomIdAndWeek = courseService.findByClassroomIdAndWeek(course);
        List<Integer> timeList = new ArrayList<>();

        List<Time> timess = new ArrayList<>();

        for (Course time : byClassroomIdAndWeek) {
            timeList.add(time.getTimeId());
        }

        if (course.getWeek().equals("周一")) {
            //班级可用时间段
            list.removeAll(mondys);
            //教室可用时间段
            list.removeAll(timeList);
            for (Integer integer : list) {
                timess.add(timeService.findById(integer));
            }
        } else if (course.getWeek().equals("周二")) {
            list.removeAll(tuesdays);
            list.removeAll(timeList);
            for (Integer integer : list) {
                timess.add(timeService.findById(integer));
            }
        } else if (course.getWeek().equals("周三")) {
            list.removeAll(wednesdays);
            list.removeAll(timeList);
            for (Integer integer : list) {
                timess.add(timeService.findById(integer));
            }
        } else if (course.getWeek().equals("周四")) {
            list.removeAll(thursdays);
            list.removeAll(timeList);
            for (Integer integer : list) {
                timess.add(timeService.findById(integer));
            }
        } else if (course.getWeek().equals("周五")) {
            list.removeAll(firdays);
            list.removeAll(timeList);
            for (Integer integer : list) {
                timess.add(timeService.findById(integer));
            }
        }
        return timess;
    }

    @RequestMapping("/checksame")
    @ResponseBody
    public boolean checkName(Course course) {
        Course same = courseService.findSame(course);
        if (same == null) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/addcourses")
    public String addCourses(Course course, RedirectAttributes redirectAttributes) {
        logger.info(course);
        courseService.addCourse(course);
        redirectAttributes.addAttribute("cId", course.getcId());
        return "redirect:/toclasstable";
    }

    @RequestMapping("/deleteclasstables")
    public String deleteClassTable(int cId, RedirectAttributes redirectAttributes) {


        List<CourseVo> classAll = courseService.findClassAll(cId);

        if (classAll.size() == 0) {
            redirectAttributes.addAttribute("cId", cId);
            return "redirect:/toclasstable";
        }

        List<Integer> list = new ArrayList<>();

        for (CourseVo courseVo : classAll) {
            list.add(courseVo.getCourseId());
        }
        Integer[] array = new Integer[list.size()];
        list.toArray(array);
        int[] ints = Arrays.stream(array).mapToInt(Integer::valueOf).toArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);

        }
        courseService.deleteByCid(ints);
        redirectAttributes.addAttribute("cId", cId);
        return "redirect:/toclasstable";
    }

    @RequestMapping("/deleteoneclassplan")
    public String deleteOneClassPlan(int[] courseId, int cId, RedirectAttributes redirectAttributes) {
        boolean b = courseService.deleteByCid(courseId);

        redirectAttributes.addAttribute("cId", cId);
        return "redirect:/toclasstable";
    }

    @RequestMapping("/toteacherclasstable")
    public String toTeacherClassTable(HttpSession session, Model model) {
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser != null) {
            TeacherVO teacherVO = (TeacherVO) currentUser;
            List<LessionTeacherVo> byTid = lessionService.findByTid(teacherVO.getTid());
            int i = 0;
            for (LessionTeacherVo lessionTeacherVo : byTid) {
                i = lessionTeacherVo.getlId();
            }
            List<CourseVo> byLid = courseService.findByLid(i);
            List<CourseVo> monday = new ArrayList<>();
            List<CourseVo> tuesday = new ArrayList<>();
            List<CourseVo> wednesday = new ArrayList<>();
            List<CourseVo> thursday = new ArrayList<>();
            List<CourseVo> firday = new ArrayList<>();

            for (CourseVo courseVo : byLid) {
                if (courseVo.getWeek().equals("周一")) {
                    monday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周二")) {
                    tuesday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周三")) {
                    wednesday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周四")) {
                    thursday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周五")) {
                    firday.add(courseVo);
                }
            }
            model.addAttribute("monday", monday);
            model.addAttribute("tuesday", tuesday);
            model.addAttribute("wednesday", wednesday);
            model.addAttribute("thursday", thursday);
            model.addAttribute("firday", firday);
            return "teacherclasstable";
        } else {
            return "redirect:/tologin";
        }
    }

    //学生课表查询
    @RequestMapping("/tostudentclasstable")
    public String studentClassTable(Model model, HttpSession session) {
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser != null) {
            StudentVO studentVO = (StudentVO) currentUser;
            List<CourseVo> byClassroomId = courseService.findClassAll(studentVO.getcId());
            List<CourseVo> monday = new ArrayList<>();
            List<CourseVo> tuesday = new ArrayList<>();
            List<CourseVo> wednesday = new ArrayList<>();
            List<CourseVo> thursday = new ArrayList<>();
            List<CourseVo> firday = new ArrayList<>();

            for (CourseVo courseVo : byClassroomId) {
                if (courseVo.getWeek().equals("周一")) {
                    monday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周二")) {
                    tuesday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周三")) {
                    wednesday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周四")) {
                    thursday.add(courseVo);
                }
                if (courseVo.getWeek().equals("周五")) {
                    firday.add(courseVo);
                }
            }
            model.addAttribute("monday", monday);
            model.addAttribute("tuesday", tuesday);
            model.addAttribute("wednesday", wednesday);
            model.addAttribute("thursday", thursday);
            model.addAttribute("firday", firday);
            model.addAttribute("cId", studentVO.getcId());
            return "studentclasstable";
        } else {
            return "redirect:/tologin";
        }
    }
}
