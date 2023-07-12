<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Departments</title>

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
                        <h3 class="page-title">班级</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index.jsp">班级列表</a></li>
                            <li class="breadcrumb-item active">班级</li>
                        </ul>
                    </div>
                    <!-- Search Bar -->
                    <div class="top-nav-search">
                        <form action="${bp}/findByclassName.action" method="post">
                            <input type="text" class="form-control" placeholder="Search here" name="className">
                            <button class="btn" type="submit"><i class="fas fa-search"></i></button>
                        </form>
                    </div>
                    <!-- /Search Bar -->
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
                                        <th>班级编号</th>
                                        <th>班级名称</th>
                                        <th>专业名称</th>
                                        <th>年级名称</th>
                                        <th>班级状态</th>
                                        <th>操作</th>
                                        <th class="text-right">编辑</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="cs" items="${list}">
                                        <tr>
                                            <td>${cs.cId}</td>
                                            <td>
                                                <h2>
                                                    <a>${cs.className}</a>
                                                </h2>
                                            </td>
                                            <td>${cs.mName}</td>
                                            <td>${cs.gName}</td>
                                            <c:if test="${cs.cState==1}">
                                                <td>
                                                    <button type="button" class="btn btn-danger"
                                                            onclick="window.location.href='/edu/updateclassstate?cId=${cs.cId}&cState=2'">
                                                        禁用
                                                    </button>
                                                </td>
                                            </c:if>
                                            <c:if test="${cs.cState==2}">
                                                <td>
                                                    <button type="button" class="btn btn-success"
                                                            onclick="window.location.href='/edu/updateclassstate?cId=${cs.cId}&cState=1'">
                                                        启用
                                                    </button>
                                                </td>
                                            </c:if>
                                            <td>
                                                <c:if test="${cs.cState==1}">
                                                    <button type="button" class="btn btn-rounded btn-success"
                                                            onclick="window.location.href='/edu/toclasstable?cId=${cs.cId}'">
                                                        查看课表
                                                    </button>
                                                    <button type="button" class="btn btn-rounded btn-info"
                                                            onclick="window.location.href='/edu/classplan?cId=${cs.cId}'">
                                                        排课
                                                    </button>
                                                </c:if>
                                                <c:if test="${cs.cState==2}">
                                                    <button type="button" class="btn btn-rounded btn-success"
                                                            onclick="window.location.href='/edu/toclasstable?cId=${cs.cId}'">
                                                        查看课表
                                                    </button>
                                                </c:if>
                                            </td>
                                            <td class="text-right">
                                                <div class="actions">
                                                    <a href="${bp}/toupdateClass.action?cId=${cs.cId}"
                                                       class="btn btn-sm bg-success-light mr-2">
                                                        <i class="fas fa-pen"></i>
                                                    </a>
                                                    <a href="#" class="btn btn-sm bg-danger-light">
                                                        <i class="fas fa-trash"></i>
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
        <footer>
            <p>Copyright © 2020By <a href="http://www.bootstrapmb.com/">Dreamguys.</a></p>
        </footer>
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