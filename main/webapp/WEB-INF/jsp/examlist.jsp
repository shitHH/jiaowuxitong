<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Exam</title>

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
                        <h3 class="page-title">考试管理</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index.jsp">考试</a></li>
                            <li class="breadcrumb-item active">考试列表</li>
                        </ul>
                    </div>
                    <div class="col-auto text-right float-right ml-auto">
                        <button type="button" class="btn btn-block btn-outline-success"
                                style="width: 100px;margin-right: 150px"
                                onclick="window.location.href='/edu/toexamplan?cId=${cId}'">
                            安排考试
                        </button>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">
                    <input name="cId" type="hidden" id="cId" value="${cId}">
                    <div class="card card-table">
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-hover table-center mb-0 datatable">
                                    <thead>
                                    <tr>
                                        <th>班级名称</th>
                                        <th>考试学科</th>
                                        <th>教室名称</th>
                                        <th>时间段</th>
                                        <th>考试日期</th>
                                        <th>监考老师</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="exam" items="${exam}">
                                        <tr>
                                            <td>
                                                <h2>
                                                    <a>${exam.className}</a>
                                                </h2>
                                            </td>
                                            <td>${exam.lName}</td>
                                            <td>${exam.cName}</td>
                                            <td>${exam.timeName}</td>
                                            <td>${exam.date}</td>
                                            <td>${exam.tName}</td>
                                            <td>
                                                <button type="button" class="btn btn-danger btn-sm" style="width: 100px"
                                                        onclick="deleteOne(${exam.eId})">
                                                    删除
                                                </button>
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

<script>
    function deleteOne(eId) {
        var cId = $("#cId").val();
        var flag = confirm("确认删除吗！")
        if (flag) {
            window.location.href = "/edu/deleteexam?cId=" + cId + "&eId=" + eId + "";
        }
    }
</script>
</html>