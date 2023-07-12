<%--
  Created by IntelliJ IDEA.
  User: 111
  Date: 2022/10/1
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主菜单</title>
</head>
<body>
<div class="sidebar" id="sidebar">
    <div class="sidebar-inner slimscroll">
        <div id="sidebar-menu" class="sidebar-menu">
            <ul>
                <li class="menu-title">
                    <span>主菜单</span>
                </li>
                <li class="active">
                    <a href="/edu/index.action"><i class="fas fa-th-large"></i> <span>主页</span></a>
                </li>
                <c:if test="${currentUser.roleId==3||currentUser.roleId==4}">
                    <c:if test="${currentUser.roleId==4}">
                        <li class="submenu">
                            <a href="#"><i class="fas fa-user-graduate"></i> <span> 管理员管理</span> <span
                                    class="menu-arrow"></span></a>
                            <ul>
                                <li><a href="/edu/toadmin">管理员列表</a></li>
                                <li><a href="/edu/toaddadmin">添加管理员</a></li>
                            </ul>
                        </li>
                    </c:if>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-user-graduate"></i> <span> 学生管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/studentslist.action">学生列表</a></li>
                            <li><a href="/edu/toaddstudent.action">添加学生</a></li>
                        </ul>
                    </li>

                    <li class="submenu">
                        <a href="#"><i class="fas fa-chalkboard-teacher"></i> <span> 教师管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/teacherlist">教师列表</a></li>
                            <li><a href="/edu/toaddteacherac">教师添加</a></li>
                                <%--                            <li><a href="/edu/toeditteacher">编辑教师</a></li>--%>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 学科管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/tosubjectslist">学科列表</a></li>
                            <li><a href="/edu/toaddsubject">添加学科</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 专业管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/tomajorlist">专业列表</a></li>
                            <li><a href="/edu/toaddmajor">添加专业</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 教室管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/toclassroomlist">教室列表</a></li>
                            <li><a href="/edu/toaddclassroom">添加教室</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-user-graduate"></i> <span>学院管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/collegelist">学院列表</a></li>
                            <li><a href="/edu/toaddcollege ">学院年级</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-user-graduate"></i> <span>年级管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/gradelist">年级列表</a></li>
                            <li><a href="/edu/toaddgrade ">添加年级</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-user-graduate"></i> <span>班级管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/classlist">班级列表</a></li>
                            <li><a href="/edu/toaddclass">添加班级</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-user-graduate"></i> <span>教评管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/appralist">教评内容列表</a></li>
                            <li><a href="/edu/toaddappra">添加教评内容</a></li>
                            <li><a href="/edu/teacherscore">教评分数</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="/edu/scorelist"><i class="fas fa-clipboard-list"></i> <span>成绩列表</span></a>
                    </li>


                    <li class="submenu">
                        <a href="#"><i class="fas fa-file-invoice-dollar"></i> <span> 财务</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/tosalary">学费缴纳历史</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="/edu/toyiqinglist"><i class="fas fa-table"></i> <span>疫情状态记录</span></a>
                    </li>
                    <li>
                        <a href="${bp}/photoall"><i class="fas fa-book"></i> <span>审核</span></a>
                    </li>
                    <li>
                        <a href="${bp}/degreeapply"><i class="fas fa-book"></i> <span>学位申请列表</span></a>
                    </li>
                </c:if>
                <c:if test="${currentUser.roleId==2}">
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 课程管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/toteacherclasstable">个人课表查询</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 班级信息</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/teacherselectclass">查看所带班级</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 考试信息</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/teacherexamlist">查看考试安排</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="${bp}/yunindex"><i class="fas fa-holly-berry"></i> <span>云智慧课堂</span></a>
                    </li>

                </c:if>
                <c:if test="${currentUser.roleId==1}">
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 信息维护</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/toupdatestudent.action?sId=${currentUser.sId}">编辑个人信息</a></li>
                            <li><a href="/edu/toforgetpassword">修改密码</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 信息查询</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/tostudentclasstable">学生课表查询</a></li>
                            <li><a href="/edu/studentdetails.action?sId=${currentUser.sId}">个人信息查询</a></li>
                            <li><a href="/edu/myscore?sid=${currentUser.sId}">学生成绩查询</a></li>
                            <li><a href="/edu/studentexamselect">考试信息查询</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span>公开课选课</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/xuankelist?sid=${currentUser.sId}">公开课列表</a></li>
                            <li><a href="/edu/myxuanke?sid=${currentUser.sId}">我的公开课</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 缴费</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/tofeesdetail">学生缴费</a></li>
                            <li><a href="/edu/tofeescollections">缴费历史查询</a></li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-user-graduate"></i> <span>选课管理</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/chooselessionlist?sid=${currentUser.sId}">选课列表</a></li>
                            <li><a href="/edu/mychoose?sid=${currentUser.sId}">我的选课</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="${bp}/toshenqing?sid=${currentUser.sId}"><i class="fas fa-holly-berry"></i>
                            <span>学位申请</span></a>
                    </li>
                    <li>
                        <a href="/edu/tojiaoping?sid=${currentUser.sId}"><i class="fas fa-holly-berry"></i>
                            <span>教学评价</span></a>
                    </li>

                    <li>
                        <a href="${bp}/yunindex"><i class="fas fa-holly-berry"></i> <span>云智慧课堂</span></a>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fas fa-book-reader"></i> <span> 疫情防控</span> <span
                                class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/edu/toaddyiqing">疫情上报</a></li>
                            <li><a href="/edu/">每日健康状态更新</a></li>
                        </ul>
                    </li>
                </c:if>
            </ul>
        </div>
    </div>
</div>
</body>
</html>