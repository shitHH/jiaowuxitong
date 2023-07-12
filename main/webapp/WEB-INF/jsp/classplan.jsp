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
                        <h3 class="page-title">学科</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="subjects.jsp">学科</a></li>
                            <li class="breadcrumb-item active">排课</li>
                        </ul>
                    </div>
                    <button class="btn btn-info" type="button"
                            onclick="window.history.go(-1)" style="margin-right: 150px;width: 150px">返回
                    </button>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form method="post" action="/edu/addcourses" id="f1">
                                <input type="hidden" name="cId" id="cId" value="${classs.cId}">
                                <div class="row">
                                    <div class="col-12">
                                        <h5 class="form-title"><span>排课详情</span></h5>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>班级名称</label>
                                            <input type="text" class="form-control"
                                                   readonly value="${classs.className}">
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <label>课程选择</label>
                                        <div class="form-group">
                                            <select class="form-control" name="lId" id="lId" onclick="checkTime()">
                                                <c:forEach items="${lessionlist}" var="list">
                                                    <option value="${list.lId}">${list.lName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <label>选择教室</label>
                                        <div class="form-group">
                                            <select class="form-control" name="classroomId" id="classroomId"
                                                    onchange="checkTime()">
                                                <c:forEach items="${classroomlist}" var="list">
                                                    <option value="${list.classroomid}">${list.cName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>


                                    <div class="col-12 col-sm-6">
                                        <label>选择星期</label>
                                        <div class="form-group">
                                            <select class="form-control" name="week" id="week"
                                                    onchange="checkTime()">
                                                <option value="周一">周一</option>
                                                <option value="周二">周二</option>
                                                <option value="周三">周三</option>
                                                <option value="周四">周四</option>
                                                <option value="周五">周五</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <label>选择时间段</label>
                                        <div class="form-group">
                                            <select class="form-control" name="timeId" id="time"
                                                    onchange="checkNull();checkSame()">

                                            </select>
                                            <span id="sss1" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button type="button" onclick="myfun7()" class="btn btn-primary">提交</button>
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
    $(function () {
        checkTime();
    })

    function checkTime() {
        var week = $("#week").val();
        var classroomId = $("#classroomId").val();
        var cId = $("#cId").val();
        $.post("/edu/checktime.action", {"week": week, "classroomId": classroomId, "cId": cId}, function (data) {
            var html = "";
            console.log(data.length)
            if (data.length > 0) {
                $.each(data, function (i, item) {
                    html += "<option value='" + item.timeId + "'>" + item.timeName + "</option>";
                })
            }
            $("#time").html(html);
        })
        setTimeout("checkNull()", 100);
        setTimeout("checkSame()", 500);
    }

    function checkSame() {
        var lId = $("#lId").val();
        var week = $("#week").val();
        var timeId = $("#time").val();
        if (timeId != null) {
            $.post("/edu/checksame.action", {"timeId": timeId, "lId": lId, "week": week}, function (data) {
                if (data == true) {
                    $("#sss1").html("")
                } else {
                    $("#sss1").html("课程授课老师该时间段正在上课，请重新选择！")
                }
            })
        }
    }

    function checkNull() {
        var mess = $("#time").val();
        console.log(mess);
        if (mess == null || mess == 0) {
            $("#sss1").html("该班级或该教室今日已满课，请重新选择教室或星期！")
            return false;
        } else {
            $("#sss1").html("")
            return true;
        }
    }

    function myfun7() {
        var b = checkNull();
        if (b == true) {
            checkSame();
        } else {
            return;
        }
        setTimeout("submit()", 100);
    }

    function submit() {
        var mess = $("#sss1").html();
        if (mess == "") {
            $("#f1").submit();
        }
    }
</script>
</html>