<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Subjects</title>

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
                        <h3 class="page-title">公共选课列表</h3>
                        <input type="hidden" id="size" value="${size}">
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index.jsp">公共选课管理</a></li>
                            <li class="breadcrumb-item active">公共选课列表</li>
                        </ul>
                    </div>
                    <div class="top-nav-search">
                        <form method="post" action="/edu/findlessionbyname">
                            <input type="text" name="name" class="form-control" placeholder="学科名" maxlength="15"
                                   minlength="1" value="${name}">
                            <button class="btn" type="submit"><i class="fas fa-search"></i></button>
                        </form>
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
                                        <th>编号</th>
                                        <th>名称</th>
                                        <th>授课老师</th>
                                        <th>类型</th>
                                        <th class="text-right">操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${list}" var="subject">
                                        <tr>
                                            <td>${subject.photoid}</td>
                                            <td>
                                                    ${subject.photoname}
                                            </td>
                                            <td>${subject.ptname}</td>
                                            <td>${subject.phototype}</td>
                                            <td class="text-right">
                                                <div class="actions">
                                                    <button type="button" class="btn btn-primary"><a
                                                            onclick="myfunction(${subject.photoid},${currentUser.sId})">选课</a></button>
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

<script>
    function myfunction(photoid, sid) {
        $.post("/edu/checkxuankesize", {"sid": sid, "photoid": photoid}, function (data) {
            console.log(data)
            if (data == 1) {
                window.location.href = "${bp}/xuankeing.action?photoid=" + photoid + "&sid=" + sid;
            } else if (data == 2) {
                alert("只能选两门课");
            } else {
                alert("不能选相同课程！")
            }
        })
    }
</script>
</html>