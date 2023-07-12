package com.etc.controller;

import com.etc.po.College;
import com.etc.po.Grade;
import com.etc.service.CollegeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CollegeController {
    Logger logger = Logger.getLogger(CollegeController.class);
    @Autowired
    CollegeService collegeService;
    @GetMapping("/collegelist")
    public String collegelist(Model model){
        List<College> list = collegeService.findAll();
        model.addAttribute("list",list);
        return "college";
    }
    @GetMapping("/toaddcollege")
    public String toaddcollege(){
        logger.info("进入去添加年级控制器");
        return "add-college";
    }
    @PostMapping("/addcollege")
    public String addGrade(College college, Model model){
        logger.info("添加年级");
        collegeService.addcollege(college);
        model.addAttribute("college",college);
        return "redirect:/collegelist.action";
    }
    @GetMapping("/toupdatecollege")
    public String toupdatecollege(int collid,Model model){
        logger.info("进入去修改年级控制器");
        College college = collegeService.findbycollid(collid);
        logger.info(college);
        model.addAttribute("college",college);
        return "edit-college";
    }
    @PostMapping("updatecollege")
    public String updateGrade(College college){
        logger.info("修改年级");
        collegeService.update(college);
        return "redirect:/collegelist.action";
    }
}
