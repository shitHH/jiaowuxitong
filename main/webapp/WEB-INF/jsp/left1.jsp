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
    <title>Title</title>
</head>
<body>
<div class="sidebar" id="sidebar">
    <div class="sidebar-inner slimscroll">
        <div id="sidebar-menu" class="sidebar-menu">
            <ul>
                <li class="menu-title">
                    <span>智慧云课堂</span>
                </li>
                <li class="active">
                    <a href="${bp}/yunindex"><i class="fas fa-th-large"></i> <span>主页</span></a>
                </li>
                <li class="submenu">
                    <a href="#"><i class="fas fa-chalkboard-teacher"></i> <span> 课程分类</span> <span
                            class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="${bp}/phototype?phototype=计算机&pip=上架">计算机</a></li>
                        <li><a href="${bp}/phototype?phototype=美术&pip=上架">美术</a></li>
                        <li><a href="${bp}/phototype?phototype=音乐&pip=上架">音乐</a></li>
                        <li><a href="${bp}/phototype?phototype=汉语言文学&pip=上架">汉语言文学</a></li>
                        <li><a href="${bp}/phototype?phototype=医药&pip=上架">医药</a></li>
                        <li><a href="${bp}/phototype?phototype=机械&pip=上架">机械</a></li>
                    </ul>
                </li>
                <c:if test="${currentUser.roleId==2}">
                <li class="submenu">
                    <a href="#"><i class="fas fa-building"></i> <span> 课程管理</span> <span
                            class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="${bp}/phtname.action?ptname=${currentUser.tName}">我的课程</a></li>
                        <li><a href="${bp}/addphoto.action">添加课程</a></li>
                    </ul>
                </li>
                </c:if>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
