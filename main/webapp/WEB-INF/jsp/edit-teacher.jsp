<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Teachers</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/img/favicon.png">

    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&display=swap">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">

    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/fontawesome.min.css">
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/all.min.css">

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
                        <h3 class="page-title">编辑教师信息</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="teachers.jsp">教师</a></li>
                            <li class="breadcrumb-item active">修改教师信息</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form action="/edu/edit-teacher.action" method="post">
                                <input type="hidden" name="tid" id="tid" value="${teacherVo.tid}">
                                <div class="row">
                                    <div class="col-12">
                                        <h5 class="form-title"><span>基本信息</span></h5>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>姓名</label><input type="text" class="form-control" readonly
                                                                    value="${teacherVo.tName}">
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>电话</label>
                                            <input type="tel" class="form-control" id="ttel" name="ttel">

                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>邮箱</label>
                                            <input type="email" class="form-control" id="temail" name="temail">

                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>学历</label>
                                            <input class="form-control" type="text" name="teducation" id="teducation">
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">

                                            <label>所在学院</label>
                                            <select class="form-control" name="collid">
                                                <c:forEach items="${college}" var="college">
                                                    <option value="${college.collid}">${college.collname}</option>
                                                </c:forEach>
                                            </select>

                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>职称</label>
                                            <input class="form-control" type="text" name="profession" id="profession">

                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>状态</label>
                                            <input class="form-control" type="text" name="status" id="status">
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>修改密码</label>
                                            <input type="text" class="form-control" name="tpass" id="tpass1">
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>确认密码</label>
                                            <input type="text" class="form-control" name="tpass" id="tpass2"
                                                   onclick="checkPass()"><span id="tishi"></span>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                    </div>
                                </div>
                            </form>
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
<script>
    function checkPass() {
        var tpass1 = document.getElementById("tpass1").value;
        var tpass2 = document.getElementById("tpass2").value;
        if (tpass1 == tpass2) {
            document.getElementById("tishi").innerHTML = "<font color='green'>两次密码相同</font>";
            document.getElementById("submit").disabled = false;
        } else {
            document.getElementById("tishi").innerHTML = "<font color='red'>两次密码不相同</font>";
            document.getElementById("submit").disabled = true;
        }
    }
</script>
</body>
</html>