package com.etc.controller;


import com.etc.po.*;
import com.etc.service.AppraiseService;
import com.etc.service.CommentSercice;
import com.etc.service.CourseService;
import com.etc.service.StudentService;
import com.etc.vo.CommentVO;
import com.etc.vo.CourseVo;
import com.etc.vo.StudentVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 17:45:55
 */
@Controller
public class AppraiseController {
    Logger logger = Logger.getLogger(AppraiseController.class);
    @Autowired
    AppraiseService appraiseService;
    @Autowired
    CourseService courseService;
    @Autowired
    StudentService studentService;
    @Autowired
    CommentSercice commentSercice;

    @GetMapping("/appralist")
    public String appralist(Model model) {
        logger.info("进入教评问题列表控制器");
        List<Appraiseoption> list = appraiseService.findAllAp();
        model.addAttribute("list", list);
        return "appra";
    }

    @GetMapping("/toaddappra")
    public String toaddappra() {
        logger.info("进入添加教评控制器");
        return "add-appra";
    }

    @PostMapping("addappra")
    public String addappra(Appraiseoption appraiseoption, Model model) {
        logger.info("添加教评");
        appraiseService.addOneAp(appraiseoption);
        model.addAttribute("appraiseoption", appraiseoption);
        return "redirect:/appralist.action";
    }

    @GetMapping("toupdateappar")
    public String toupdateappra(int chooseid, Model model) {
        logger.info("进入去修改教评控制器");
        Appraiseoption appraiseoption = appraiseService.findbyId(chooseid);
        logger.info(appraiseoption);
        model.addAttribute("appraiseoption", appraiseoption);
        return "edit-appra";
    }

    @PostMapping("/updateappra")
    public String updateappra(Appraiseoption appraiseoption) {
        logger.info("修改教评");
        appraiseService.editOneAp(appraiseoption);
        return "redirect:/appralist.action";
    }

    @RequestMapping("/delete")
    public String delete(int chooseid) {
        boolean b = appraiseService.deleteOneAp(chooseid);
        logger.info(b ? "删除成功" : "删除失败");
        return "redirect:/appralist.action";
    }

    @GetMapping("tojiaoping")
    public String tojiaoping(int sid, Model model) {
        logger.info("进入到去评教控制器");
        List<Appraiseoption> list = appraiseService.findAllAp();
        model.addAttribute("list", list);
        StudentVO studentVO = studentService.findBySId(sid);
        int cid = studentVO.getcId();
        List<CourseVo> list1 = courseService.findClassAll(cid);
        model.addAttribute("list1", list1);
        return "pingjiao";
    }

    @PostMapping("/jiaopiao")
    public String jiaoping(int[] score, int[] chooseId, Comment comment) {
        logger.info("进入到评教控制器");
        logger.info(comment.getSid());
        logger.info(comment.getTid());
        for (int i = 0; i < 10; i++) {
            commentSercice.pingjiao(new Comment(comment.getSid(), comment.getTid(), chooseId[i], score[i]));
        }

        return "pingjiaoSuccess";
    }
    @GetMapping("teacherscore")
    public String teacherscore(Model model){
        List<CommentVO> list = commentSercice.findAll();
        model.addAttribute("list",list);
        return "teacherscore";
    }

}
