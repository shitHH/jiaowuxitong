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
                        <h3 class="page-title">学位申请列表列表</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index.jsp">学位申请列表管理</a></li>
                            <li class="breadcrumb-item active">学位申请列表列表</li>
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
                                <form action="${bp}/shenhe" method="post">
                                <table class="table table-hover table-center mb-0 datatable">
                                    <thead>
                                    <tr>
                                        <th>学号</th>
                                        <th>姓名</th>
                                        <th>所属学院</th>
                                        <th>所属年级</th>
                                        <th>所属专业</th>
                                        <th>所属班级</th>
                                        <th>申请学位名称</th>
                                        <th>申请状态</th>
                                        <th>申请学位时间</th>
                                        <th class="text-right">操作</th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${list}" var="degree">
                                        <tr>
                                            <input name="degreeid" value="${degree.degreeid}" type="hidden">
                                            <input name="did" value="${degree.did}" type="hidden">
                                            <td><input name="sid" type="hidden" value="${degree.sid}">${degree.sid}</td>
                                            <td>
                                                    ${degree.sName}
                                            </td>
                                            <td>${degree.collname}</td>
                                            <td>${degree.gname}</td>
                                            <td>${degree.mname}</td>
                                            <td>${degree.classname}</td>
                                            <td>${degree.degreeName}</td>
                                            <td>${degree.dtype}</td>
                                            <td>${degree.ddate}</td>
                                            <td>
                                            <select name="dtype">
                                                <option value="审核通过">审核通过</option>
                                                <option value="审核未通过">审核未通过</option>
                                            </select>
                                                <input type="submit">
                                            </td>

                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                                </form>
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
    function deleteOne(lId) {
        var flag = confirm("确认删除吗？")
        if (flag) {
            window.location.href = "/edu/deletesubject?lId=" + lId + "";
        }
    }
</script>
</html>