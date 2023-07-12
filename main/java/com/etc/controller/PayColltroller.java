package com.etc.controller;

import com.etc.po.Record;
import com.etc.service.RecordService;
import com.etc.service.StudentService;
import com.etc.vo.RecordVO;
import com.etc.vo.StudentVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/11 08:54:01
 * 支付控制器
 */
@Controller
public class PayColltroller {
    Logger logger = Logger.getLogger(PayColltroller.class);
    @Autowired
    StudentService studentService;
    @Autowired
    RecordService recordService;

    //支付功能
    @RequestMapping("/tofeesdetail")
    public String goAlipay(String uid, String oid, Model model, HttpSession session) {
        logger.info("进入了feesdetails");
        Object currentUser = session.getAttribute("currentUser");
        StudentVO studentVO = null;
        if (currentUser != null) {
            studentVO = (StudentVO) currentUser;
            logger.info(studentVO);
            StudentVO bySId = studentService.findBySId(studentVO.getsId());
            model.addAttribute("currentUser", bySId);
            List<RecordVO> list = recordService.findBySId(studentVO.getsId());

            if (list.size() == 0) {
                int i = 1;
                model.addAttribute("typs", i);
            } else {
                int i = 2;
                model.addAttribute("typs", i);
            }
            int count = list.size();
            model.addAttribute("count", count);
            return "feesdetails";
        } else {
            String url = "http://localhost:8080/payment/goAlipay?merchantUserId=" + uid + "&merchantOrderId=" + oid;
            return "redirect:/tologin";
        }

    }

    @RequestMapping("/welcome")
    public String welcome() {
        logger.info("进入了welcome");
        return "welcome";
    }

    //支付记录
    @RequestMapping("/tosalary")
    public String salaryHistory(Model model) {
        logger.info("支付记录");
        List<RecordVO> list = recordService.findAll();
        model.addAttribute("salary", list);
        return "salary";
    }

    //学生查看自己的支付记录
    @RequestMapping("/tofeescollections")
    public String toFeesCollections(Model model, HttpSession session) {
        logger.info("查看缴费记录");
        Object currentUser = session.getAttribute("currentUser");
        StudentVO studentVO = (StudentVO) currentUser;
        logger.info(studentVO);
        List<RecordVO> list = recordService.findBySId(studentVO.getsId());
        model.addAttribute("list",list);
        return "fees-collections";
    }


}
