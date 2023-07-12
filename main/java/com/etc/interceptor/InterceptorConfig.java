package com.etc.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/11 19:20:27
 * 权限拦截器配置类
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    //登陆权限验证
    @Autowired
    LoginInterceptor loginInterceptor;
    String[] firstUrls = {"/login", "/tologin", "/login.action", "/tologin.action"};
    String[] secondUrls = {"/*"};
    //学生权限验证
    @Autowired
    StudentInterceptor studentInterceptor;
    String[] thirdUrls = {"/tostudentclasstable", "/tostudentclasstable.action", "/studentexamselect", "/studentexamselect.action"};
    //老师权限验证
    @Autowired
    TeacherInterceptor teacherInterceptor;
    String[] fouthUrls = {"/toteacherclasstable", "/toteacherclasstable.action", "/teacherexamlist", "/teacherexamlist.action"};
    //管理员权限验证
    @Autowired
    AdminInterceptor adminInterceptor;
    String[] fifthUrls = {"/classlist", "/classlist.action", "/toclassroomlist", "/toclassroomlist.action", "/toaddclassroom", "/toaddclassroom.action",
            "/checkclassroomname", "/checkclassroomname.action", "/addclassroom", "/addclassroom.action", "/toeditclassroom", "/toeditclassroom.action", "/editclassroom.action", "/editclassroom"
            , "/findclassroombyname", "/findclassroombyname.action", "/toclassroomlistb", "/toclassroomlistb.action", "/toclasstable", "/toclasstable.action", "/classplan", "/classplan.action"
            , "/checktime", "/checktime.action", "/checksame", "/checksame.action", "/addcourses", "/addcourses.action", "/deleteclasstables", "/deleteclasstables.action", "/deleteoneclassplan",
            "/deleteoneclassplan.action", "/toexamlist", "/toexamlist.action", "/findeclass", "/findeclass.action", "/deleteexam", "/deleteexam.action", "/toexamplan", "/toexamplan.action",
            "/checksamelession", "/checksamelession.action", "/checkclassroomc", "/checkclassroomc.action", "/checkteacherstate", "/checkteacherstate.action", "/addexam", "/addexam.action",
            "/tomajorlist", "/tomajorlist.action", "/toaddmajor", "/toaddmajor.action", "/findallcollege", "/findallcollege.action", "/checkmajorname", "/checkmajorname.action", "/addmajor",
            "/addmajor.action", "/toeditmajor", "/toeditmajor.action", "/editmajor", "/editmajor.action", "/findmajorbyname", "/findmajorbyname.action", "/tomajorlista", "/tomajorlista.action",
            "/tosubjectslist", "/tosubjectslist.action", "/addsuject", "/addsuject.action", "/checkname", "/checkname.action", "/toeditsubject", "/toeditsubject.action", "/editsubject", "/editsubject.action",
            "/deletesubject", "/deletesubject.action", "/findteacher", "/findteacher.action", "/findlessionbyname", "/findlessionbyname.action", "/tolessionlist", "/tolessionlist.action"};

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns(secondUrls).excludePathPatterns(firstUrls);
        registry.addInterceptor(studentInterceptor).addPathPatterns(thirdUrls).excludePathPatterns(firstUrls);
        registry.addInterceptor(teacherInterceptor).addPathPatterns(fouthUrls).excludePathPatterns(firstUrls);
        registry.addInterceptor(adminInterceptor).addPathPatterns(fifthUrls).excludePathPatterns(firstUrls);
    }
}
