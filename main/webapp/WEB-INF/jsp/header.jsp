<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="header">

    <!-- Logo -->
    <div class="header-left">
        <a href="/edu/index" class="logo">
            <img src="assets/img/logo.png" alt="Logo">
        </a>
        <a href="/edu/index" class="logo logo-small">
            <img src="assets/img/logo-small.png" alt="Logo" width="30" height="30">
        </a>
    </div>
    <!-- /Logo -->

    <a href="javascript:void(0);" id="toggle_btn">
        <i class="fas fa-align-left"></i>
    </a>

    <!-- Search Bar -->
    <%--    <div class="top-nav-search">--%>
    <%--        <form>--%>
    <%--            <input type="text" class="form-control" placeholder="Search here">--%>
    <%--            <button class="btn" type="submit"><i class="fas fa-search"></i></button>--%>
    <%--        </form>--%>
    <%--    </div>--%>
    <!-- /Search Bar -->

    <!-- Mobile Menu Toggle -->
    <a class="mobile_btn" id="mobile_btn">
        <i class="fas fa-bars"></i>
    </a>
    <!-- /Mobile Menu Toggle -->

    <!-- Header Right Menu -->
    <ul class="nav user-menu">

        <!-- Notifications -->
<%--        <li class="nav-item dropdown noti-dropdown">--%>
<%--            <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">--%>
<%--                <i class="far fa-bell"></i> <span class="badge badge-pill">3</span>--%>
<%--            </a>--%>
<%--            <div class="dropdown-menu notifications">--%>
<%--                <div class="topnav-dropdown-header">--%>
<%--                    <span class="notification-title">Notifications</span>--%>
<%--                    <a href="javascript:void(0)" class="clear-noti"> Clear All </a>--%>
<%--                </div>--%>
<%--                <div class="noti-content">--%>
<%--                    <ul class="notification-list">--%>
<%--                        <li class="notification-message">--%>
<%--                            <a href="#">--%>
<%--                                <div class="media">--%>
<%--												<span class="avatar avatar-sm">--%>
<%--													<img class="avatar-img rounded-circle" alt="User Image"--%>
<%--                                                         src="assets/img/profiles/avatar-02.jpg">--%>
<%--												</span>--%>
<%--                                    <div class="media-body">--%>
<%--                                        <p class="noti-details"><span class="noti-title">Carlson Tech</span> has--%>
<%--                                            approved <span class="noti-title">your estimate</span></p>--%>
<%--                                        <p class="noti-times"><span class="notification-times">4 mins ago</span></p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                        <li class="notification-message">--%>
<%--                            <a href="#">--%>
<%--                                <div class="media">--%>
<%--												<span class="avatar avatar-sm">--%>
<%--													<img class="avatar-img rounded-circle" alt="User Image"--%>
<%--                                                         src="assets/img/profiles/avatar-11.jpg">--%>
<%--												</span>--%>
<%--                                    <div class="media-body">--%>
<%--                                        <p class="noti-details"><span--%>
<%--                                                class="noti-title">International Software Inc</span> has sent you a--%>
<%--                                            invoice in the amount of <span class="noti-title">$218</span></p>--%>
<%--                                        <p class="noti-times"><span class="notification-times">6 mins ago</span></p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                        <li class="notification-message">--%>
<%--                            <a href="#">--%>
<%--                                <div class="media">--%>
<%--												<span class="avatar avatar-sm">--%>
<%--													<img class="avatar-img rounded-circle" alt="User Image"--%>
<%--                                                         src="assets/img/profiles/avatar-17.jpg">--%>
<%--												</span>--%>
<%--                                    <div class="media-body">--%>
<%--                                        <p class="noti-details"><span class="noti-title">John Hendry</span> sent a--%>
<%--                                            cancellation request <span class="noti-title">Apple iPhone XR</span></p>--%>
<%--                                        <p class="noti-times"><span class="notification-times">8 mins ago</span></p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                        <li class="notification-message">--%>
<%--                            <a href="#">--%>
<%--                                <div class="media">--%>
<%--												<span class="avatar avatar-sm">--%>
<%--													<img class="avatar-img rounded-circle" alt="User Image"--%>
<%--                                                         src="assets/img/profiles/avatar-13.jpg">--%>
<%--												</span>--%>
<%--                                    <div class="media-body">--%>
<%--                                        <p class="noti-details"><span class="noti-title">Mercury Software Inc</span>--%>
<%--                                            added a new product <span class="noti-title">Apple MacBook Pro</span>--%>
<%--                                        </p>--%>
<%--                                        <p class="noti-times"><span class="notification-times">12 mins ago</span></p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                    </ul>--%>
<%--                </div>--%>
<%--                <div class="topnav-dropdown-footer">--%>
<%--                    <a href="#">View all Notifications</a>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </li>--%>
        <!-- /Notifications -->
        <%--学生--%>
        <c:if test="${currentUser.roleId==1}">
            <li class="nav-item dropdown has-arrow">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                    <span class="user-img"><img class="rounded-circle" src="/edu/img/${currentUser.sPhoto}"
                                                width="31" alt="Ryan Taylor"></span>
                </a>
                <div class="dropdown-menu">
                    <div class="user-header">
                        <div class="avatar avatar-sm">
                            <img src="/edu/img/${currentUser.sPhoto}" alt="User Image"
                                 class="avatar-img rounded-circle">
                        </div>
                        <div class="user-text">
                            <h6>${currentUser.sName}</h6>
                        </div>
                    </div>
                    <a class="dropdown-item" href="/edu/studentdetails.action?sId=${currentUser.sId}">个人信息</a>
                    <a class="dropdown-item" href="/edu/exit">退出</a>
                </div>
            </li>
        </c:if>
        <%--教师--%>
        <c:if test="${currentUser.roleId==2}">
            <li class="nav-item dropdown has-arrow">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                    <span class="user-img"><img class="rounded-circle" src="/edu/img/${currentUser.tphoto}"
                                                width="31" alt="Ryan Taylor"></span>
                </a>
                <div class="dropdown-menu">
                    <div class="user-header">
                        <div class="avatar avatar-sm">
                            <img src="/edu/img/${currentUser.tphoto}" alt="User Image"
                                 class="avatar-img rounded-circle">
                        </div>
                        <div class="user-text">
                            <h6>${currentUser.tName}</h6>
                        </div>
                    </div>
                    <a class="dropdown-item" href="/edu/toteachersdetail.action?tid=${currentUser.tid}">个人信息</a>
                    <a class="dropdown-item" href="/edu/exit">退出</a>
                </div>
            </li>
        </c:if>
        <%--管理员--%>
        <c:if test="${currentUser.roleId==3}">
            <li class="nav-item dropdown has-arrow">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                    <span class="user-img"><img class="rounded-circle" src="/edu/img/${currentUser.adminHead}"
                                                width="31" alt="Ryan Taylor"></span>
                </a>
                <div class="dropdown-menu">
                    <div class="user-header">
                        <div class="avatar avatar-sm">
                            <img src="/edu/img/${currentUser.adminHead}" alt="User Image"
                                 class="avatar-img rounded-circle">
                        </div>
                        <div class="user-text">
                            <h6>${currentUser.adminName}</h6>
                        </div>
                    </div>

                    <a class="dropdown-item" href="/edu/exit">退出</a>

                </div>
            </li>
        </c:if>
        <%--超级管理员--%>
        <c:if test="${currentUser.roleId==4}">
            <li class="nav-item dropdown has-arrow">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                    <span class="user-img"><img class="rounded-circle" src="/edu/img/${currentUser.adminHead}"
                                                width="31" alt="Ryan Taylor"></span>
                </a>
                <div class="dropdown-menu">
                    <div class="user-header">
                        <div class="avatar avatar-sm">
                            <img src="/edu/img/${currentUser.adminHead}" alt="User Image"
                                 class="avatar-img rounded-circle">
                        </div>
                        <div class="user-text">
                            <h6>${currentUser.adminName}</h6>
                        </div>
                    </div>
                    <a class="dropdown-item" href="/edu/exit">退出</a>

                </div>
            </li>
        </c:if>
    </ul>
    <!-- /Header Right Menu -->

</div>
</body>
</html>
