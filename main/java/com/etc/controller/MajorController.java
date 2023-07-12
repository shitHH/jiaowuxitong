package com.etc.controller;

import com.etc.po.College;
import com.etc.po.Major;
import com.etc.service.CollegeService;
import com.etc.service.MajorService;
import com.etc.vo.LessionTeacherVo;
import com.etc.vo.MajorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 14:28:20
 * 专业控制器
 */
@Controller
public class MajorController {

    @Autowired
    MajorService majorService;

    @Autowired
    CollegeService collegeService;

    @RequestMapping("/tomajorlist")
    public String toMajorList(Model model) {
        List<MajorVo> all = majorService.findAll();
        model.addAttribute("major", all);
        return "majorlist";
    }

    @RequestMapping("/toaddmajor")
    public String toAddMajor() {
        return "addmajor";
    }

    @RequestMapping("/findallcollege")
    @ResponseBody
    public List<College> findAllCollege() {
        List<College> all = collegeService.findAll();
        return all;
    }

    @RequestMapping("/checkmajorname")
    @ResponseBody
    public boolean checkMajorName(String mName) {
        Major major = majorService.checkName(mName);
        return major == null ? true : false;
    }

    @RequestMapping("/addmajor")
    public String addMajor(Major major) {
        majorService.addMajor(major);
        return "redirect:/tomajorlist";
    }

    @RequestMapping("/toeditmajor")
    public String toEditMajor(int mId, Model model) {
        MajorVo byId = majorService.findById(mId);
        model.addAttribute("major", byId);
        return "editmajor";
    }

    @RequestMapping("/editmajor")
    public String editMajor(Major major) {
        majorService.updateMajor(major);
        return "redirect:/tomajorlist";
    }

    @RequestMapping("/findmajorbyname")
    public String findMajorByName(String name, RedirectAttributes attributes) {
        attributes.addAttribute("name", name);
        return "redirect:/tomajorlista";
    }

    @RequestMapping("/tomajorlista")
    public String toMajorListA(Model model, String name) {
        model.addAttribute("name", name);
        List<MajorVo> byName = majorService.findByName(name);
        model.addAttribute("major", byName);
        return "majorlist";
    }
}
