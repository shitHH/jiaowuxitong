package com.etc.controller;

import com.etc.po.Admin;
import com.etc.po.Student;
import com.etc.po.Teacher;
import com.etc.service.AdminService;
import com.etc.service.StudentService;
import com.etc.service.TeacherService;
import com.etc.vo.StudentVO;
import com.etc.vo.TeacherVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @author:yjt
 * @category 登录控制器
 */
@Controller
public class LoginController {

    Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    AdminService adminService;

    //去登陆控制器
    @GetMapping({"/", "/tologin"})
    public String toLogin() {
        logger.info("去登陆控制器！");
        return "login";
    }

    @RequestMapping("/login")
    public String login(Student student, Teacher teacher, Admin admin, HttpServletRequest request, HttpSession session, int type) {
        logger.info(type);
        logger.info(student);
        if (type == 1) {
            StudentVO currentStudent = studentService.findBySIdAndPass(student.getsId(), student.getsPass());
            logger.info(currentStudent);
            if (currentStudent != null) {
                logger.info(currentStudent.getsId());
                logger.info(currentStudent.getsPass());
                if (currentStudent.getsState().equals("2")){
                    //登录成功，记录当前登录的人进入到session中
                    session.setAttribute("currentUser", currentStudent);
                    return "redirect:/index.action";
                }else {
                    request.setAttribute("mess", "账号已禁用，请联系管理员");
                    logger.info(request.getAttribute("mess"));
                    return "login";
                }
            } else {
                //登录失败，跳转到登录页面继续登录
                try {
                    request.setCharacterEncoding("utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                request.setAttribute("mess", "学号或密码错误");
                logger.info(request.getAttribute("mess"));
                return "login";
            }
        } else if (type == 2) {
            TeacherVO currentTeacher = teacherService.findByTidAndTpass(teacher.getTid(), teacher.getTpass());
            logger.info(currentTeacher);
            if (currentTeacher != null) {
                logger.info(currentTeacher.getTid());
                logger.info(currentTeacher.getTpass());
                if (currentTeacher.getTstate().equals("1")){
                    session.setAttribute("currentUser", currentTeacher);
                    return "redirect:/index.action";
                }else {
                    request.setAttribute("mess", "账号已禁用，请联系管理员");
                    logger.info(request.getAttribute("mess"));
                    return "login";
                }

            } else {
                //登录失败，跳转到登录页面继续登录
                try {
                    request.setCharacterEncoding("utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                request.setAttribute("mess", "工号或密码错误");
                logger.info(request.getAttribute("mess"));
                return "login";
            }
        } else if (type == 3) {
            Admin currentAdmin = adminService.findByIdAndPass(admin);
            logger.info(currentAdmin);
            if (currentAdmin != null) {
                logger.info(currentAdmin.getAdminId());
                logger.info(currentAdmin.getaPass());
                if (currentAdmin.getState()==1){
                    session.setAttribute("currentUser", currentAdmin);
                    return "redirect:/index.action";
                }else {
                    request.setAttribute("mess", "账号已禁用，请联系超级管理员");
                    logger.info(request.getAttribute("mess"));
                    return "login";
                }
            } else {
                //登录失败，跳转到登录页面继续登录
                try {
                    request.setCharacterEncoding("utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                request.setAttribute("mess", "账号或密码错误");
                logger.info(request.getAttribute("mess"));
                return "login";
            }
        } else if (type == 4) {
            request.setAttribute("mess", "权限不足!");
            return "login";
        } else {
            return "redirect:/tologin.action";
        }
    }

    @RequestMapping("/toforgetpassword")
    public String toForgetPassWord() {
        logger.info("去忘记密码");
        return "forgetpassword";
    }

    @PostMapping("/forgetpassword")
    @ResponseBody
    public boolean forgetPassWord(Student student) {
        Student bySTel = studentService.findBySTel(student.getsTel());
        if (bySTel == null) {
            return false;
        }
        String s = bySTel.getsEmail();
        String s1 = student.getsEmail();
        logger.info(student);
        logger.info(bySTel);
        if (s.equals(s1)) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/updatepass")
    public String updatePass(Student studentVO) {
        logger.info(studentVO);
        Student bySTel = studentService.findBySTel(studentVO.getsTel());
        StudentVO bySId = studentService.findBySId(bySTel.getsId());
        bySId.setsPass(studentVO.getsPass());
        studentService.updateSPass(bySId);
        logger.info("进入忘记密码控制器");
        return "redirect:/tologin.action";
    }

    @RequestMapping("/exit")
    public String exit(HttpSession session) {
        session.invalidate();
        return "login";
    }

}
