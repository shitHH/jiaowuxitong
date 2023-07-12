package com.etc.controller;

import com.etc.po.ChooseClass;
import com.etc.po.Photo;
import com.etc.po.Score;
import com.etc.po.Xuanke;
import com.etc.service.*;
import com.etc.vo.ChooseClassVO;
import com.etc.vo.LessionTeacherVo;
import com.etc.vo.StudentVO;
import com.etc.vo.XuankeVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class XuankeController {
    Logger logger = Logger.getLogger(XuankeController.class);
    @Autowired
    PhotoService photoService;
    @Autowired
    XuankeService xuankeService;
    @Autowired
    StudentService studentService;
    @Autowired
    ScoreService scoreService;
    @GetMapping("/xuankelist")
    public String xuankelist(int sid,Model model) {
        logger.info(sid);
        List<Photo> list = photoService.findAll();
        model.addAttribute("list", list);
        List<XuankeVO> list2 = xuankeService.selectBysid(sid);
        model.addAttribute("size", list2.size());
        logger.info(list2.size());
        return "choosesubjectlist";
    }

    @GetMapping("/myxuanke")
    public String myxuanke(int sid, Model model) {
        List<XuankeVO> list = xuankeService.selectBysid(sid);
        model.addAttribute("list", list);
        return "myxuanke";
    }

    @RequestMapping("/xuankeing")
    public String choosesubject(int photoid, int sid, Model model, RedirectAttributes redirectAttributes) {
        logger.info("进入选课界面");
        logger.info(photoid);
        logger.info(sid);
        Xuanke xuanke = new Xuanke();
        xuanke.setPhotoid(photoid);
        xuanke.setSid(sid);
        xuankeService.choosesubject(xuanke);
        model.addAttribute("xuanke", xuanke);
        redirectAttributes.addAttribute("sid", sid);
        return "redirect:/myxuanke";
    }
    @RequestMapping("/checkxuankesize")
    @ResponseBody
    public int checkSize(int sid, int photoid) {
        List<XuankeVO> list2 = xuankeService.selectBysid(sid);
        if (list2.size() < 2) {
            for (XuankeVO xuankeVO : list2) {
                if (xuankeVO.getPhotoid() == photoid) {
                    return 3;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }
}
