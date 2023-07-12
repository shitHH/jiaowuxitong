package com.etc.controller;

import com.etc.po.College;
import com.etc.po.Student;
import com.etc.po.Teacher;
import com.etc.service.CollegeService;
import com.etc.service.TeacherService;
import com.etc.util.FileUpload;
import com.etc.vo.TeacherVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 15:39:37
 * 教室控制器
 */
@Controller
public class TeacherContrller {
    Logger logger = Logger.getLogger(TeacherContrller.class);
    @Autowired
    TeacherService teacherService;
    @Autowired
    CollegeService collegeService;


    //查询所有老师
    @RequestMapping("/teacherlist")
    public String toTeachers(Model model) {
        logger.info("查询所有教师");
        List<TeacherVO> list = teacherService.findAll();
        model.addAttribute("teacherVo", list);
        logger.info(list);
        return "teachers";
    }

    //根据老师编号查自己的信息
    @RequestMapping("/findByName")
    public String findByTid(String tName,Model model){
        logger.info(tName);
        logger.info("进入查询");
       List<TeacherVO> byTid = teacherService.findByName(tName);
        model.addAttribute("teacherVo",byTid);
        return "teachers";
    }

    //增加老师
    @RequestMapping("/toaddteacherac")
    public String toAddTeacher(Model model) {
        logger.info("去添加老师");
        List<College> list = collegeService.findAll();
        for (College college : list) {
            logger.info(college);
        }
        logger.info(list);
        model.addAttribute("college", list);
        return "add-teacher";
    }

    @RequestMapping("/add-teacher")
    public String addTeacher(Teacher teacher, @RequestParam("file") MultipartFile file) {
        logger.info(teacher.getTname());
        logger.info("add-teacher action");
        String s = FileUpload.saveFile(file);
        teacher.setTphoto(s);
        boolean flag = teacherService.addteacher(teacher);
        logger.info(flag);
        return "redirect:/teacherlist.action";
    }

    //修改老师信息
    @RequestMapping("/toeditteachers")
    public String toEditTeacher(Integer tid, Model model) {
        logger.info("去修改");
        TeacherVO teacherVO = teacherService.findByTid(tid);
        model.addAttribute("teacherVo", teacherVO);
        List<College> list = collegeService.findAll();
        model.addAttribute("college", list);
        return "edit-teacher";
    }

    @RequestMapping("/edit-teacher")
    public String editTeacher(Teacher teacher) {
        logger.info("editteacher action");
        boolean flag = teacherService.editteacher(teacher);
        logger.info(flag);
        return "redirect:/teacherlist.action";
    }

    @RequestMapping("/teachersdetail")
    public String toTeachersDetail(Integer tid, Model model) {
        logger.info("去老师详情页面");
        logger.info(tid);
        TeacherVO teacherVO = teacherService.findByTid(tid);
        logger.info(teacherVO);
        model.addAttribute("teacherVO", teacherVO);
        logger.info(tid);
        return "teacher-details";
    }

    @RequestMapping("/updatestates")
    public String updateState(TeacherVO teacher) {
        logger.info(teacher);
        logger.info("更改状态");
        boolean flag = teacherService.updateState(teacher);
        logger.info(flag);
        return "redirect:/teacherlist.action";
    }
    /*验证电话*/
    @RequestMapping("/checkttel")
    @ResponseBody
    public boolean checkTtel(String ttel) {
        logger.info("验证手机号");
        logger.info(ttel);
        TeacherVO byTtel = teacherService.findByTtel(ttel);
        boolean flag = byTtel == null ? true : false;
        return flag;
    }
    /*验证邮箱*/
    @RequestMapping("/checktemail")
    @ResponseBody
    public boolean checkTEmail(String temail) {
        logger.info("验证邮箱");
        logger.info(temail);
        TeacherVO byTemail = teacherService.findByTemail(temail);
        boolean flag = byTemail == null ? true : false;
        return flag;
    }
}
