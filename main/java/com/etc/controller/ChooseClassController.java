package com.etc.controller;

import com.etc.po.ChooseClass;
import com.etc.po.Lession;
import com.etc.service.ChooseclassService;
import com.etc.service.LessionService;
import com.etc.vo.ChooseClassVO;
import com.etc.vo.LessionTeacherVo;
import com.etc.vo.StudentVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ChooseClassController {
    Logger logger = Logger.getLogger(ChooseClassController.class);
    @Autowired
    LessionService lessionService;
    @Autowired
    ChooseclassService chooseclassService;

    @GetMapping("/chooselessionlist")
    public String chooselessionlist(int sid, Model model) {
        logger.info(sid);
        List<LessionTeacherVo> list = lessionService.findByLtype("选修");
        model.addAttribute("list", list);
        List<ChooseClassVO> list2 = chooseclassService.selectBysid(sid);
        model.addAttribute("size", list2.size());
        logger.info(list2.size());
        return "chooseclass";
    }

    @GetMapping("/mychoose")
    public String mychoose(int sid, Model model) {
        List<ChooseClassVO> list = chooseclassService.selectBysid(sid);
        model.addAttribute("list", list);
        return "mychoose";
    }

    @RequestMapping("/chooselession")
    public String chooselession(int lid, int sid, Model model, RedirectAttributes redirectAttributes) {
        logger.info(lid);
        logger.info(sid);
        ChooseClass chooseClass = new ChooseClass();
        chooseClass.setLid(lid);
        chooseClass.setSid(sid);
        logger.info(chooseClass);
        chooseclassService.chooseClass(chooseClass);
        model.addAttribute("chooseClass", chooseClass);
        redirectAttributes.addAttribute("sid", sid);
        return "redirect:/mychoose";
    }


    @RequestMapping("/checksize")
    @ResponseBody
    public int checkSize(int sid, int lid) {
        List<ChooseClassVO> list2 = chooseclassService.selectBysid(sid);
        if (list2.size() < 2) {
            for (ChooseClassVO chooseClassVO : list2) {
                if (chooseClassVO.getLid() == lid) {
                    return 3;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @RequestMapping("/deletechooseclass")
    public String deleteLession(int ids, HttpSession session, RedirectAttributes redirectAttributes) {
        Object currentUser = session.getAttribute("currentUser");
        StudentVO studentVO = (StudentVO) currentUser;
        int[] array = new int[1];
        array[0] = ids;
        logger.info("进入删除选课控制器");
        boolean delete = chooseclassService.delete(array);
        logger.info(delete);
        redirectAttributes.addAttribute("sid", studentVO.getsId());
        return "redirect:/mychoose";
    }
//    @GetMapping("chooseclassstudentlist")
//    public String chooseclassstudentlist(Model model){
////        List<ChooseClassVO> list = chooseclassService.selectAll();
////        model.addAttribute("list",list);
//        return "choosestudentlist";
//    }
}
