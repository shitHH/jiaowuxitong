package com.etc.controller;

import com.etc.po.College;
import com.etc.po.Student;
import com.etc.service.ClassService;
import com.etc.service.CollegeService;
import com.etc.service.MajorService;
import com.etc.service.StudentService;
import com.etc.util.FileUpload;
import com.etc.vo.ClassVO;
import com.etc.vo.MajorVo;
import com.etc.vo.StudentVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author:yjt
 * @category 学生控制器
 */
@Controller
public class StudentController {

    Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    StudentService studentService;

    @Autowired
    CollegeService collegeService;

    @Autowired
    MajorService majorService;

    @Autowired
    ClassService classService;

    /*学生列表*/
    @RequestMapping("/studentslist")
    public String studentList(Model model) {
        logger.info("进入学生列表控制器");
        List<StudentVO> list = studentService.findAll();
        model.addAttribute("list", list);
        return "students";
    }

    /*学生详情*/
    @RequestMapping("/studentdetails")
    public String studentDetail(int sId, Model model) {
        logger.info("进入学生详情控制器");
        StudentVO student = studentService.findBySId(sId);
        model.addAttribute("student", student);
        return "studentdetails";
    }

    /*去添加学生*/
    @RequestMapping("/toaddstudent")
    public String toAddStudent(Model model) {
        logger.info("去添加学生控制器");
        List<College> all = collegeService.findAll();
        model.addAttribute("college", all);
        return "addstudent";
    }

    /*查找专业*/
    @RequestMapping("/findmajor")
    @ResponseBody
    public List<MajorVo> findMajor(int cId) {
        List<MajorVo> byCollId = majorService.findByCollId(cId);
        return byCollId;
    }

    /*查找班级*/
    @RequestMapping("/findclass")
    @ResponseBody
    public List<ClassVO> findClass(int mId) {
        List<ClassVO> byMId = classService.findByMId(mId);
        return byMId;
    }


    /*添加学生*/
    @RequestMapping("/addstudent")
    public String addstudent(Student studentVO) {
        logger.info(studentVO);
        logger.info("添加学生控制器");
        boolean b = studentService.add(studentVO);
        logger.info(b);
        return "redirect:/studentslist.action";
    }

    /*管理员去修改学生信息*/
    @RequestMapping("/toeditstudent")
    public String toEditStudent(int sId, Model model) {
        List<College> all = collegeService.findAll();
        model.addAttribute("college", all);
        logger.info("去编辑学生控制器");
        StudentVO bySId = studentService.findBySId2(sId);
        logger.info(bySId);
        model.addAttribute("student", bySId);
        return "editstudent";
    }

    /*管理员修改学生信息*/
    @RequestMapping("/editstudent")
    public String editStudent(@ModelAttribute("student") StudentVO studentVO, @RequestParam("file") MultipartFile file) {
        logger.info("编辑学生控制器");
        logger.info(studentVO);
        String s = FileUpload.saveFile(file);
        studentVO.setsPhoto(s);
        StudentVO bySId = studentService.findBySId(studentVO.getsId());
        bySId.setsName(studentVO.getsName());
        bySId.setSex(studentVO.getSex());
        bySId.setsTel(studentVO.getsTel());
        bySId.setsEmail(studentVO.getsEmail());
        bySId.setAddress(studentVO.getAddress());
        bySId.setCollId(studentVO.getCollId());
        bySId.setmId(studentVO.getmId());
        bySId.setcId(studentVO.getcId());
        bySId.setStatus(studentVO.getStatus());
        bySId.setsPhoto(studentVO.getsPhoto());
        studentService.updateStudent(bySId);
        return "redirect:/studentslist.action";
    }

    /*学生去修改学生信息*/
    @RequestMapping("/toupdatestudent")
    public String toUpdateStudent(int sId, Model model) {
        List<College> all = collegeService.findAll();
        model.addAttribute("college", all);
        logger.info("去编辑学生控制器");
        StudentVO bySId = studentService.findBySId2(sId);
        logger.info(bySId);
        model.addAttribute("student", bySId);
        return "updatestudent";
    }

    /*学生修改学生信息*/
    @RequestMapping("/updatestudent")
    public String updateStudent(@ModelAttribute("student") StudentVO studentVO, @RequestParam("file") MultipartFile file) {
        logger.info("编辑学生控制器");
        logger.info(studentVO);
        String s = FileUpload.saveFile(file);
        studentVO.setsPhoto(s);
        StudentVO bySId = studentService.findBySId(studentVO.getsId());
        bySId.setsName(studentVO.getsName());
        bySId.setSex(studentVO.getSex());
        bySId.setsTel(studentVO.getsTel());
        bySId.setsEmail(studentVO.getsEmail());
        bySId.setAddress(studentVO.getAddress());
        bySId.setCollId(studentVO.getCollId());
        bySId.setmId(studentVO.getmId());
        bySId.setcId(studentVO.getcId());
        bySId.setStatus(studentVO.getStatus());
        bySId.setsPhoto(studentVO.getsPhoto());
        studentService.editStudent(bySId);
        return "redirect:/tologin.action";
    }

    /*更改状态*/
    @RequestMapping("/updatesstatus")
    public String updateSstatus(StudentVO studentVO) {
        logger.info(studentVO);
        logger.info("更改状态");
        boolean flag = studentService.updateSState(studentVO);
        logger.info(flag);
        return "redirect:/studentslist.action";
    }


    /*通过名称查询学生*/
    @RequestMapping("/findstudentbysname")
    public String findStudentBySname(String sName, Model model){
        logger.info("通过名字查学生控制器");
        logger.info(sName);
        List<StudentVO> bySName = studentService.findBySName(sName);
        model.addAttribute("list",bySName);
        logger.info(bySName);
        return "students";
    }


    /*验证电话*/
    @RequestMapping("/checktel")
    @ResponseBody
    public boolean checkTel(String tel) {
        logger.info("验证手机号");
        logger.info(tel);
        Student bySTel = studentService.findBySTel(tel);
        boolean flag = bySTel == null ? true : false;
        return flag;
    }

    /*验证邮箱*/
    @RequestMapping("/checkemail")
    @ResponseBody
    public boolean checkEmail(String email) {
        logger.info("验证邮箱");
        logger.info(email);
        Student byEmail = studentService.findByEmail(email);
        boolean flag = byEmail == null ? true : false;
        return flag;
    }


    /*缴费详情页面*/
    @RequestMapping("/tofeesdetails")
    public String tofeesdetails(Model model, HttpSession session) {
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser != null) {
            StudentVO studentVO = (StudentVO) currentUser;
            logger.info(studentVO);
            StudentVO bySId = studentService.findBySId(studentVO.getsId());
            model.addAttribute("currentUser", bySId);
            return "feesdetails";
        } else {
            return "redirect:/tologin";
        }
    }

}
