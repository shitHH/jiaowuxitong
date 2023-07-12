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
                        <h3 class="page-title">考试管理</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="subjects.jsp">考试</a></li>
                            <li class="breadcrumb-item active">安排考试</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form method="post" action="/edu/addexam" id="f1">
                                <input type="hidden" name="cId" id="cId" value="${classs.cId}">
                                <div class="row">
                                    <div class="col-12">
                                        <h5 class="form-title"><span>考试详情</span></h5>
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
                                            <select class="form-control" name="lId" id="lId"
                                                    onchange="checkSameLession()">
                                                <c:forEach var="lession" items="${lession}">
                                                    <option value="${lession.lId}">${lession.lName}</option>
                                                </c:forEach>
                                            </select>
                                            <span style="color: red" id="lessionMess"></span>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <label>监考老师选择</label>
                                        <div class="form-group">
                                            <select class="form-control" name="tId" id="tId"
                                                    onchange="checkClassroom()">
                                                <c:forEach var="teacher" items="${teacher}">
                                                    <option value="${teacher.tid}">${teacher.tName}</option>
                                                </c:forEach>
                                            </select>
                                            <span style="color: red" id="teacherMess"></span>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <label>选择教室</label>
                                        <div class="form-group">
                                            <select class="form-control" name="classroomId" id="classroomId"
                                                    onchange="checkClassroom()">
                                                <c:forEach var="classroom" items="${classroom}">
                                                    <option value="${classroom.classroomid}">${classroom.cName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>


                                    <div class="col-12 col-sm-6">
                                        <label>选择日期</label>
                                        <div class="form-group">
                                            <input type="date" class="form-control form-control-custom" name="date"
                                                   id="date" onchange="checkClassroom();finalCheck()">
                                            <span id="datemess" style="color: red"></span>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <label>选择时间段</label>
                                        <div class="form-group">
                                            <select class="form-control" name="timeId" id="timeId"
                                                    onchange="checkTeacherState()">
                                            </select>
                                            <span id="timemess" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button type="button" onclick="commit()" class="btn btn-primary">提交</button>
                                        <button class="btn btn-info" type="button"
                                                onclick="window.history.go(-1)">返回
                                        </button>
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
        checkSameLession();
        //input date 限制选择的时间，只能选择之后的时间
        //得到明天时间
        const t = new Date(new Date().getTime() + 86400000);
        console.log(t)
        //得到当前年份
        var year = t.getFullYear();
        console.log(year)
        //得到当前月份
        //注：
        //  1：js中获取Date中的month时，会比当前月份少一个月，所以这里需要先加一
        //  2: 判断当前月份是否小于10，如果小于，那么就在月份的前面加一个 '0' ， 如果大于，就显示当前月份
        var month = t.getMonth() + 1 < 10 ? "0" + (t.getMonth() + 1) : (t.getMonth() + 1);
        // 明天多少号
        const torr = t.getDate() < 10 ? "0" + t.getDate() : t.getDate();
        //设置input标签的min属性 从明天选择之后的日期，max最大，只能选择之前的日期
        $("#date").attr("min", year + "-" + month + "-" + torr);
    })

    function checkSameLession() {
        var cId = $("#cId").val();
        var lId = $("#lId").val();
        if (lId != null) {
            $.post("/edu/checksamelession", {"cId": cId, "lId": lId}, function (data) {
                if (data == true) {
                    $("#lessionMess").html("")
                } else {
                    $("#lessionMess").html("该课程考试已被安排，请重新选择！")

                }
            })
        } else {
            $("#lessionMess").html("该班级暂无课程安排，请先去排课！")
        }
    }

    function checkClassroom() {
        var date = $("#date").val()
        var classroomId = $("#classroomId").val();
        $.post("/edu/checkclassroomc", {"date": date, "classroomId": classroomId}, function (data) {
            var html = "";
            $.each(data, function (i, item) {
                html += "<option value='" + item.timeId + "'>" + item.timeName + "</option>"
            })
            $("#timeId").html(html);
        })
        setTimeout("checkTeacherState()", 300);
    }

    function checkTeacherState() {
        var date = $("#date").val()
        var timeId = $("#timeId").val();
        var tId = $("#tId").val();
        console.log(timeId);
        if (timeId != null) {
            $.post("/edu/checkteacherstate", {"tId": tId, "date": date, "timeId": timeId}, function (data) {
                console.log(data);
                if (data == true) {
                    $("#teacherMess").html("")
                } else {
                    $("#teacherMess").html("该老师此时间段已经有监考安排，请重新选择！")

                }
            })
        }
    }

    function finalCheck() {
        var date = $("#date").val()

        if (date == "") {
            $("#datemess").html("日期不能为空！")
            return;
        } else {
            $("#datemess").html("")
        }

        setTimeout("finalCheckTwo()", 300)
    }

    function finalCheckTwo() {
        var timeId = $("#timeId").val();
        if (timeId == null) {
            $("#timemess").html("该教室今天已无空闲时间段，请重新选择教室或日期！")
            return;
        } else {
            $("#timemess").html("")
        }
    }

    function commit() {
        finalCheck();
        setTimeout("myfun()", 350)
    }

    function myfun() {
        var mess3 = $("#lessionMess").html()
        if (mess3 != "") {
            return;
        }
        var mess1 = $("#datemess").html()
        if (mess1 != "") {
            return;
        }
        var mess2 = $("#timemess").html()
        if (mess2 != "") {
            return;
        }
        var mess4 = $("#teacherMess").html()
        if (mess4 != "") {
            return;
        }
        $("#f1").submit();
    }
</script>
</html>