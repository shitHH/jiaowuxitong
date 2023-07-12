<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Students</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/img/favicon.png">

    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&display=swap">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">

    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/fontawesome.min.css">
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/all.min.css">

    <!-- Datatables CSS -->
    <link rel="stylesheet" href="assets/plugins/datatables/datatables.min.css">

    <!-- Main CSS -->
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>

<!-- Main Wrapper -->
<div class="main-wrapper">

    <!-- Header -->
    <%@include file="header.jsp" %>
    <!-- /Header -->

    <!-- Sidebar -->
    <%@include file="left.jsp" %>
    <!-- /Sidebar -->

    <!-- Page Wrapper -->
    <div class="page-wrapper">
        <div class="content container-fluid">

            <!-- Page Header -->
            <div class="page-header">
                <div class="row align-items-center">
                    <div class="col">
                        <h3 class="page-title">学生</h3>
                        <ul class="breadcrumb">
                            <%--									<li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>--%>
                            <li class="breadcrumb-item active">学生</li>
                        </ul>
                    </div>
                    <div class="top-nav-search">
                        <form method="post" action="/edu/findstudentbysname.action">
                            <input type="text" name="sName" class="form-control" placeholder="学生姓名" maxlength="10"
                                   minlength="1">
                            <button class="btn" type="submit"><i class="fas fa-search"></i></button>
                        </form>
                    </div>

                    <div class="col-auto text-right float-right ml-auto">
                        <a href="/edu/toaddstudent.action" class="btn btn-primary"><i class="fas fa-plus"></i></a>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card card-table">
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-hover table-center mb-0 datatable">
                                    <thead>
                                    <tr>
                                        <th>学号</th>
                                        <th>姓名</th>
                                        <th>班级</th>
                                        <th>生日</th>
                                        <th>邮箱</th>
                                        <th>电话</th>
                                        <th>地址</th>
                                        <th>状态</th>
                                        <th class="text-right">操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="students" items="${list}">
                                        <tr>
                                            <td><a href="/edu/studentdetails.action?sId=${students.sId}">${students.sId}</a></td>
                                            <td>
                                                <h2 class="table-avatar">
                                                    <a href="/edu/studentdetails.action?sId=${students.sId}" class="avatar avatar-sm mr-2"><img
                                                            class="avatar-img rounded-circle"
                                                            src="/edu/img/${students.sPhoto}"
                                                            alt="User Image"></a>
                                                    <a href="/edu/studentdetails.action?sId=${students.sId}">${students.sName}</a>
                                                </h2>
                                            </td>
                                            <td><a href="/edu/studentdetails.action?sId=${students.sId}">${students.className}</a></td>
                                            <td><fmt:formatDate value="${students.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                                            <td>${students.sEmail}</td>
                                            <td>${students.sTel}</td>
                                            <td>${students.address}</td>
                                            <td>
                                                <c:if test="${students.sState==1}">
                                                    <button class="btn btn-primary"
                                                            onclick="window.location.href='/edu/updatesstatus.action?sId=${students.sId}&sState=2'">
                                                        <a style="color: #e63333">已毕业</a>
                                                    </button>
                                                </c:if>
                                                <c:if test="${students.sState==2}">
                                                    <button class="btn btn-sm bg-success-light mr-2"
                                                            onclick="window.location.href='/edu/updatesstatus.action?sId=${students.sId}&sState=1'">
                                                        <a style="color: white">在校</a>
                                                    </button>
                                                </c:if>

                                                    <%--<a href="/edu/teachers.action?tid = ${tid}">${teacherVo.tstate}</a>--%>
                                            </td>
                                            <td class="text-right">
                                                <div class="actions">
                                                    <a href="/edu/toeditstudent.action?sId=${students.sId}" class="btn btn-sm bg-success-light mr-2">
                                                        <i class="fas fa-pen"></i>
                                                    </a>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Footer -->
<%--        <footer>--%>
<%--            <p>Copyright © 2020By <a href="http://www.bootstrapmb.com/">Dreamguys.</a></p>--%>
<%--        </footer>--%>
        <!-- /Footer -->
    </div>
    <!-- /Page Wrapper -->

</div>
<!-- /Main Wrapper -->

<!-- jQuery -->
<script src="assets/js/jquery-3.5.1.min.js"></script>

<!-- Bootstrap Core JS -->
<script src="assets/js/popper.min.js"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>

<!-- Slimscroll JS -->
<script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Datatables JS -->
<script src="assets/plugins/datatables/datatables.min.js"></script>

<!-- Custom JS -->
<script src="assets/js/script.js"></script>
</body>
</html>