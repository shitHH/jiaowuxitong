package com.etc.controller;

import com.etc.po.Classroom;
import com.etc.service.ClassroomService;
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
 * @date 2022/10/8 16:59:48
 */
@Controller
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;

    @RequestMapping("/toclassroomlist")
    public String toClassrommList(Model model) {
        List<Classroom> classrooms = classroomService.selectAll();
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
        model.addAttribute("classroom", classrooms);
        return "classroomlist";
    }

    @RequestMapping("/toaddclassroom")
    public String toAddClassroom() {
        return "addclassroom";
    }

    @RequestMapping("/checkclassroomname")
    @ResponseBody
    public boolean checkClassroomName(String cName) {
        Classroom classroom = classroomService.checkClassroomName(cName);
        return classroom == null ? true : false;
    }

    @RequestMapping("/addclassroom")
    public String addClassroom(Classroom classroom) {
        classroomService.add(classroom);
        return "redirect:/toclassroomlist";
    }

    @RequestMapping("/toeditclassroom")
    public String toEditClassroom(int classroomId, Model model) {
        Classroom classroom = classroomService.selectByid(classroomId);
        model.addAttribute("classroom", classroom);
        return "editclassroom";
    }

    @RequestMapping("/editclassroom")
    public String editClassroom(Classroom classroom) {
        classroomService.update(classroom);
        return "redirect:/toclassroomlist";
    }

    @RequestMapping("/findclassroombyname")
    public String findClassroomByName(String name, RedirectAttributes attributes) {
        attributes.addAttribute("name", name);
        return "redirect:/toclassroomlistb";
    }

    @RequestMapping("/toclassroomlistb")
    public String toClassroomListB(Model model, String name) {
        model.addAttribute("name", name);
        List<Classroom> byName = classroomService.findByName(name);
        model.addAttribute("classroom", byName);
        return "classroomlist";
    }

}
