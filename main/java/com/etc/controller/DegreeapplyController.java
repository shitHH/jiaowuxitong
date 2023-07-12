package com.etc.controller;

import com.etc.po.Degree;
import com.etc.po.Degreeapply;
import com.etc.service.DegreeService;
import com.etc.service.DegreeapplyService;
import com.etc.service.StudentService;
import com.etc.vo.DegreeapplyVO;
import com.etc.vo.StudentVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.xml.ws.Action;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DegreeapplyController {
    Logger logger = Logger.getLogger(DegreeapplyController.class);
    @Autowired
    DegreeapplyService degreeapplyService;
    @Autowired
    DegreeService degreeService;
    @Autowired
    StudentService studentService;

    @GetMapping("/degreeapply")
    public String degreeapply(Model model) {
        List<DegreeapplyVO> list = degreeapplyService.selectAll();
        model.addAttribute("list", list);
        return "degreeaoolies";
    }

    @GetMapping("/toshenqing")
    public String toshenqing(int sid, Model model) {
        List<DegreeapplyVO> list = degreeapplyService.selectAll();
        model.addAttribute("list", list);
        Date date = new Date();
        DegreeapplyVO degreeapplyVO = degreeapplyService.selectBySid(sid);
        StudentVO studentVO = studentService.findBySId(sid);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

        String format = simpleDateFormat.format(date);
        int year = Integer.valueOf(format);
        String gname = studentVO.getgName();
        logger.info(gname);
        String gName = gname.substring(0, 4);
        logger.info(gName);
        int gradeName = Integer.valueOf(gName);
        int i = year - gradeName;
        logger.info(i);
        model.addAttribute("i", i);
        model.addAttribute("degreeappluVO", degreeapplyVO);
        return "shenqingxuewei";
    }

    @RequestMapping("/shenqing")
    public String shenqing(Degreeapply degreeapply, RedirectAttributes redirectAttributes) {
        logger.info(degreeapply.getDegreeid());
        logger.info(degreeapply.getDtype());
        logger.info(degreeapply.getDdate());
        logger.info(degreeapply.getSid());
        degreeapplyService.add(degreeapply);
        int sid = degreeapply.getSid();
        redirectAttributes.addAttribute("sid", sid);
        return "redirect:toshenqing";
    }

    @RequestMapping("/shenhe")
    public String shenhe(Degreeapply degreeapply) {
        DegreeapplyVO degreeapplyVO = degreeapplyService.selectone(degreeapply.getDid());
        degreeapply.setSid(degreeapplyVO.getSid());
        degreeapply.setDdate(degreeapplyVO.getDdate());
        degreeapply.setDegreeid(degreeapplyVO.getDegreeid());
        degreeapplyService.update(degreeapply);
        return "redirect:degreeapply";
    }

}
