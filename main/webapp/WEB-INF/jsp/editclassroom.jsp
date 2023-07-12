<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Subject</title>

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
                        <h3 class="page-title">修改教室名称</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="subjects.jsp">教室管理</a></li>
                            <li class="breadcrumb-item active">修改教室名称</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form method="post" action="/edu/editclassroom" id="f1">
                                <input type="hidden" name="classroomid" value="${classroom.classroomid}">
                                <input type="hidden" id="oldName" value="${classroom.cName}">
                                <div class="row">

                                    <div class="col-12">
                                        <h5 class="form-title"><span>教室详情</span></h5>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>教室名称</label>
                                            <input type="text" class="form-control" name="cName" id="cName"
                                                   onblur="checkName()" maxlength="15" value="${classroom.cName}">
                                            <span id="s1" style="color: red"></span>
                                        </div>
                                    </div>


                                    <div class="col-12">
                                        <button type="button" onclick="sumbit()" class="btn btn-primary">Submit</button>
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
<%--<script src="assets/js/jquery-3.5.1.min.js"></script>--%>
<script src="assets/js/jquery3-2.1.min.js"></script>
<!-- Bootstrap Core JS -->
<script src="assets/js/popper.min.js"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>

<!-- Slimscroll JS -->
<script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Custom JS -->
<script src="assets/js/script.js"></script>
</body>
<script>

    function checkName() {
        var oldName = $("#oldName").val();
        var name = $("#cName").val().trim();
        if (oldName != name) {

            if (name == "") {
                $("#s1").html("教室名称不能为空！");
                return;
            }
            $.post("/edu/checkclassroomname.action", {"cName": name}, function (data) {
                if (data == false) {
                    $("#s1").html("该教室名称已存在，请重新输入!");
                } else {
                    $("#s1").html("");
                }
            })
        } else {
            $("#s1").html("");
        }


    }

    function sumbit() {
        checkName()
        var mess = $("#s1").html();
        if (mess == "") {
            $("#f1").submit();
        }
    }
</script>
</html>