package com.etc.controller;

import com.etc.po.Admin;
import com.etc.service.AdminService;
import com.etc.util.FileUpload;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author lyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/9 11:40:21
 * 管理员控制器
 */
@Controller
public class AdminController {
    Logger logger = Logger.getLogger(AdminController.class);
    @Autowired
    AdminService adminService;


    //查看管理员列表
    @RequestMapping("/toadmin")
    public String toadmin(Model model) {
        logger.info("查看管理员列表");
        List<Admin> list = adminService.findAll();
        model.addAttribute("admin", list);
        return "admin";
    }

    //增加管理员信息
    @RequestMapping("/toaddadmin")
    public String toAddadmin() {
        logger.info("去增加管理员");
        return "add-admin";
    }

    @RequestMapping("/add-admin")
    public String addAdmin(@ModelAttribute("admin") Admin admin, @RequestParam("file") MultipartFile file) {

        logger.info(admin);
        logger.info("add-admin action");
        String s = FileUpload.saveFile(file);
        admin.setAdminHead(s);
        logger.info(admin);
        boolean flag = adminService.addAdmin(admin);
        logger.info(flag);
        return "redirect:/toadmin.action";
    }

    //修改管理员信息
    @RequestMapping("/toeditadmin")
    public String toEditAdmin(int adminId,Model model){
        logger.info("去修改");
        Admin admin1= adminService.findById(adminId);
        model.addAttribute("admin",admin1);
        return "edit-admin";
    }
    @RequestMapping("/edit-admin")
    public String editAdmin(Admin admin,@RequestParam("file") MultipartFile file){
        logger.info("editadmin action");
        logger.info(admin);
        String s = FileUpload.saveFile(file);
        Admin byId = adminService.findById(admin.getAdminId());
        byId.setAdminHead(s);
        byId.setAdminName(byId.getAdminName());
        byId.setaPass(byId.getaPass());
        byId.setAdminTel(byId.getAdminTel());
        boolean flag = adminService.updateAdmin(byId);
        logger.info(flag);
        return "redirect:/toadmin.action";
    }

    //修改管理员状态
    @RequestMapping("/updateadminatate")
    public String updateAdminState(Admin admin){
        logger.info(admin);
        logger.info("去修改状态");
        boolean flag = adminService.updateAdminState(admin);
        logger.info(flag);
        return "redirect:/toadmin.action";

    }

}