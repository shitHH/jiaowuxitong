package com.etc.controller;

import com.etc.po.Lession;
import com.etc.po.Major;
import com.etc.service.LessionService;
import com.etc.service.TeacherService;
import com.etc.vo.LessionTeacherVo;
import com.etc.vo.TeacherVO;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;


/**
 * @author lyt
 * 管理员控制器
 */
@Controller
public class SubjectController {
    Logger logger = Logger.getLogger(SubjectController.class);
    @Autowired
    LessionService lessionService;
    @Autowired
    Major major;
    @Autowired
    TeacherService teacherService;

    //查找所有课程
    @RequestMapping("/tosubjectslist")
    public String lessionlist(Model model) {
        logger.info("进入学科列表");
        List<LessionTeacherVo> list = lessionService.findAll();
        model.addAttribute("lession", list);
        return "subjects";
    }

    @RequestMapping("/addsuject")
    public String addsuject(Lession lession) {
        logger.info("addsuject action");
        boolean flag = lessionService.addLession(lession);
        logger.info(flag);
        return "redirect:/tosubjectslist.action";
    }

    @RequestMapping("/checkname")
    @ResponseBody
    public boolean checkName(String lName) {

        Lession lession = lessionService.checkName(lName);

        return lession == null ? true : false;

    }

    //修改课程
    @RequestMapping("/toeditsubject")
    public String toEditSubject(int lId, Model model) {
        logger.info("去修改课程");
        Lession lession = lessionService.findByid(lId);
        TeacherVO byTid = teacherService.findByTid(lession.gettId());
        model.addAttribute("name", byTid.gettName());
        model.addAttribute("lession", lession);
        return "edit-subject";
    }

    @RequestMapping("/editsubject")
    public String editsubject(Lession lession, Model model) {
        logger.info(lession);
        logger.info("editsubject action");
        boolean flag = lessionService.updateLession(lession);
        model.addAttribute("subject", lession);
        return "redirect:/tosubjectslist.action";

    }

    //删除课程
    @RequestMapping("/deletesubject")
    public String deletesuject(int lId) {
        logger.info(lId);
        logger.info("删除课程");
        boolean flag = lessionService.deleteLession(lId);
        logger.info(flag);
        return "redirect:/tosubjectslist.action";
    }

    @RequestMapping("/findteacher")
    @ResponseBody
    public List<TeacherVO> findTeacher() {
        List<Integer> integerList = new ArrayList<>();
        List<LessionTeacherVo> all = lessionService.findAll();
        for (LessionTeacherVo lessionTeacherVo : all) {
            integerList.add(lessionTeacherVo.gettId());
        }
        List<Integer> integers = new ArrayList<>();

        List<TeacherVO> all1 = teacherService.findAll();
        for (TeacherVO teacherVO : all1) {
            integers.add(teacherVO.getTid());
        }

        integers.removeAll(integerList);

        List<TeacherVO> teacherVOList = new ArrayList<>();
        for (Integer integer : integers) {
            TeacherVO byTid = teacherService.findByTid(integer);
            teacherVOList.add(byTid);
        }
        return teacherVOList;
    }

    @RequestMapping("/findlessionbyname")
    public String findLessionByName(String name, RedirectAttributes attributes) {
        attributes.addAttribute("name", name);
        return "redirect:/tolessionlist";
    }

    @RequestMapping("/tolessionlist")
    public String toLessionList(Model model, String name) {
        model.addAttribute("name", name);
        List<LessionTeacherVo> byName = lessionService.findByName(name);
        model.addAttribute("lession", byName);
        return "subjects";
    }
}
