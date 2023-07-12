<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Student Details</title>

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

            <div class="page-header">
                <div class="row">
                    <div class="col-sm-12">
                        <h3 class="page-title">学生详情</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="students.jsp">学生</a></li>
                            <li class="breadcrumb-item active">学生详情</li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="about-info">
                                <h4>关于我</h4>

                                <div class="media mt-3">
                                    <img src="/edu/img/${student.sPhoto}" class="mr-3" alt="...">
                                    <div class="media-body">
                                        <ul>
                                            <li>
                                                <span class="title-span">姓名 : </span>
                                                <span class="info-span">${student.sName}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">性别 : </span>
                                                <span class="info-span">${student.sex}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">学院 : </span>
                                                <span class="info-span">${student.collname}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">专业 : </span>
                                                <span class="info-span">${student.mName}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">班级 : </span>
                                                <span class="info-span">${student.className}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">生日 : </span>
                                                <span class="info-span"><fmt:formatDate value="${student.birthday}"
                                                                                        pattern="yyyy-MM-dd"></fmt:formatDate></span>
                                            </li>
                                            <li>
                                                <span class="title-span">地址 : </span>
                                                <span class="info-span">${student.address}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">手机 : </span>
                                                <span class="info-span">${student.sTel}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">邮箱 : </span>
                                                <span class="info-span">${student.sEmail}</span>
                                            </li>
                                            <li>
                                                <span class="title-span">政治面貌 : </span>
                                                <span class="info-span">${student.status}</span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div>
                                    <button class="btn btn-info" onclick="javascript:window.history.go(-1)"
                                            type="button">返 回
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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

<!-- Custom JS -->
<script src="assets/js/script.js"></script>

</body>
</html>