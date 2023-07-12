package com.etc.controller;

import com.etc.dao.GradeDao;
import com.etc.po.Grade;
import com.etc.service.GradeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GradeController {
    Logger logger = Logger.getLogger(GradeController.class);
    @Autowired
    GradeService gradeService;
    @GetMapping("/gradelist")
    public String gradelist(Model model){
        logger.info("进入去年级列表控制器");
        List<Grade> list = gradeService.findAll();
        model.addAttribute("list",list);
        return "grade";
    }
    @GetMapping("/toaddgrade")
    public String toaddGrade(){
        logger.info("进入去添加年级控制器");
        return "add-grade";
    }
    @PostMapping("/addgrade")
    public String addGrade(Grade grade,Model model){
        logger.info("添加年级");
        gradeService.add(grade);
        model.addAttribute("grade",grade);
        return "redirect:/gradelist.action";
    }
    @GetMapping("/toupdateGrade")
    public String toupdateGrade(int gid,Model model){
        logger.info("进入去修改年级控制器");
        Grade grade = gradeService.findOne(gid);
        logger.info(grade);
        model.addAttribute("grade",grade);
        return "edit-grade";
    }
    @PostMapping("updateGrade")
    public String updateGrade(Grade grade){
        logger.info("修改年级");
        gradeService.update(grade);
        return "redirect:/gradelist.action";
    }
}
