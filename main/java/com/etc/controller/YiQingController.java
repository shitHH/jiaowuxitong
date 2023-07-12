package com.etc.controller;

import com.etc.po.YiQing;
import com.etc.service.StudentService;
import com.etc.service.YiQingService;
import com.etc.vo.StudentVO;
import com.etc.vo.YiQingVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/12 11:40:35
 * 疫情控制器
 */
@Controller
public class YiQingController {
    Logger logger = Logger.getLogger(YiQingController.class);

    @Autowired
    YiQingService yiQingService;

    @Autowired
    StudentService studentService;

    @RequestMapping("/toyiqinglist")
    public String toyiqinglist(Model model) {
        logger.info("疫情记录");
        List<YiQingVo> list = yiQingService.findAll();
        model.addAttribute("yiqing", list);
        logger.info(list);
        return "yiqinglist";
    }

    @RequestMapping("/toaddyiqing")
    public String toAddYiQing() {
        logger.info("去上传");
        return "add-yiqing";
    }

    @RequestMapping("/add-yiqing")
    public String addYiQing(YiQingVo yiQingVo, Model model) {
        logger.info("上传");
        logger.info(yiQingVo);
        YiQingVo bySid = yiQingService.findBySid(yiQingVo.getSid());
        model.addAttribute("student", bySid);
        YiQing yiQing = new YiQing();
        yiQing.setSid(yiQingVo.getSid());
        logger.info(yiQingVo.getSid());
        yiQing.setDATE(new Date());
        logger.info(new Date());
        yiQing.setTiwen(yiQingVo.getTiwen());
        logger.info(yiQingVo.getTiwen());
        logger.info(yiQing);
        yiQingService.addYiQing(yiQing);
        return "redirect:/index.action";
    }
}
