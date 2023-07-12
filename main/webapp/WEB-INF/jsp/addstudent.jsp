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
                        <h3 class="page-title">添加学生</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="students.jsp">学生</a></li>
                            <li class="breadcrumb-item active">添加学生</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form id="form1" method="post" action="/edu/addstudent.action">
                                <div class="row">
                                    <div class="col-12">
                                        <h5 class="form-title"><span>学生信息</span></h5>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>姓名：</label>
                                            <input type="text" name="sName" id="name" class="form-control"
                                                   maxlength="20"
                                                   minlength="1" onblur="sname()">
                                            <span id="ss1" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>性别</label>
                                            <select class="form-control" name="sex" id="sex">
                                                <option>男</option>
                                                <option>女</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>生日：</label>
                                            <div>
                                                <input type="date" class="form-control" name="birthday" id="bir"
                                                       onblur="birth()">
                                                <span id="ss2" style="color: red"></span>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>学院：</label>
                                            <select class="form-control" id="collid" name="collid"
                                                    onchange="findMajor(this.value)">
                                                <c:forEach var="college" items="${college}">
                                                    <option value="${college.collid}">${college.collname}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>专业：</label>
                                            <select class="form-control" id="mId" name="mId"
                                                    onchange="findclass(this.value)">
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>班级：</label>
                                            <select class="form-control" id="cId" name="cId">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>地址：</label>
                                            <input type="text" class="form-control" name="address" id="add"
                                                   onblur="addre()" maxlength="30" minlength="1">
                                            <span id="ss6" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>电话：</label>
                                            <input type="tel" name="sTel" id="tel" maxlength="11" minlength="11"
                                                   class="form-control" onchange="stel()">
                                            <span id="ss3" style="color: red"></span>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>邮箱：</label>
                                            <input type="email" name="sEmail" id="email" class="form-control"
                                                   onchange="semail()" maxlength="20" minlength="5">
                                            <span id="ss4" style="color: red"></span>
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>政治面貌：</label>
                                            <select class="form-control" name="status" id="st">
                                                <option>共青团员</option>
                                                <option>中共党员</option>
                                                <option>群众</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button type="button" class="btn btn-primary" onclick="myfun()">提交</button>
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
</body>

<script>
    $(function () {
        findMajor(1);

        const t = new Date(new Date().getTime() + 86400000);
        console.log(t)
        //得到当前年份
        var year = t.getFullYear() - 100;
        var year2 = t.getFullYear();
        console.log(year)
        //得到当前月份
        //注：
        //  1：js中获取Date中的month时，会比当前月份少一个月，所以这里需要先加一
        //  2: 判断当前月份是否小于10，如果小于，那么就在月份的前面加一个 '0' ， 如果大于，就显示当前月份
        var month = t.getMonth() + 1 < 10 ? "0" + (t.getMonth() + 1) : (t.getMonth() + 1);
        // 明天多少号
        const torr = t.getDate() < 10 ? "0" + t.getDate() : t.getDate();
        var torr2 = torr - 2;
        //设置input标签的min属性 从明天选择之后的日期，max最大，只能选择之前的日期
        $("#bir").attr("min", year + "-" + month + "-" + torr);
        $("#bir").attr("max", year2 + "-" + month + "-" + torr2)
    })

    function findMajor(cId) {
        $.post("/edu/findmajor.action", {"cId": cId}, function (data) {
            var html = "";
            $.each(data, function (i, item) {
                html += "<option value='" + item.mId + "'>" + item.mName + "</option>";
            })
            $("#mId").html(html);
        })
        setTimeout("timeOut()", 100);
    }

    function timeOut() {
        var mId = $("#mId").val()
        findclass(mId);
    }

    function findclass(mId) {
        $.post("/edu/findclass.action", {"mId": mId}, function (data) {
            var html = "";
            $.each(data, function (i, item) {
                html += "<option value='" + item.cId + "'>" + item.className + "</option>";
            })
            $("#cId").html(html);
        })
    }

    function sname() {
        var sname = $("#name").val().trim();
        if (sname == "") {
            $("#ss1").html("姓名不能为空");
            return false;
        } else {
            $("#ss1").html("");
        }
    }

    function birth() {
        var bir = $("#bir").val().trim();
        if (bir == "") {
            $("#ss2").html("生日不能为空");
            return false;
        } else {
            $("#ss2").html("");
        }
    }

    function addre() {
        var add = $("#add").val().trim();
        if (add == "") {
            $("#ss6").html("地址不能为空");
            return false;
        } else {
            $("#ss6").html("");
        }
    }

    function stel() {
        var tel = $("#tel").val().split("").join('');
        console.log(tel);
        if (tel == "") {
            $("#ss3").html("电话不能为空");
            return false;
        } else {
            $("#ss3").html("");
        }
        var reg_tel = /^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/;
        if (reg_tel.test(tel)) {
            // $("#ss3").html("<font style='color: green'>√</font>")
            $("#ss3").html("");
            checkTel(tel);
        } else {
            $("#ss3").html("电话格式有误")
            return false;
        }
    }

    function semail() {
        var email = $("#email").val().split("").join('');
        console.log(email);
        if (email == "") {
            $("#ss4").html("邮箱不能为空");
            return false;
        } else {
            $("#ss4").html("");
        }
        var reg_email = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
        if (reg_email.test(email)) {
            // $("#ss4").html("<font style='color: green'>√</font>")
            $("#ss4").html("");
            checkEmail(email);
        } else {
            $("#ss4").html("邮箱格式有误")
            return false;
        }
    }

    /*使用AJAX完成对于电话号码的验证*/
    function checkTel(phone) {
        console.log(phone);
        $.post("/edu/checktel.action", {"tel": phone}, function (data) {
            console.log(data);/*显示出回调函数的结果*/
            if (data == false) {
                $("#ss3").html("该电话已注册");
                return;
            } else {
                $("#ss3").html("");
            }
        });
    }

    /*使用AJAX完成对于邮箱的验证*/
    function checkEmail(email) {
        console.log(email);
        var e = $("#email").val().trim();
        console.log(e)
        if (e == "") {
            $("#ss4").html("邮箱不能为空");
            return false;
        } else {
            $("#ss4").html("");
        }
        $.post("/edu/checkemail.action", {"email": email}, function (data) {
            console.log(data);/*显示出回调函数的结果*/
            if (data == false) {
                $("#ss4").html("该邮箱已注册");
                return;
            } else {
                $("#ss4").html("");
            }
        });
    }


    function myfun() {
        sname();
        birth();
        addre();
        stel();
        semail();
        setTimeout("commit()", 150)
    }


    function commit() {
        var ss1 = $("#ss1").html();
        var ss2 = $("#ss2").html();
        var ss3 = $("#ss3").html();
        var ss4 = $("#ss4").html();
        var ss6 = $("#ss6").html();
        console.log(ss1)
        console.log(ss2)
        console.log(ss3)
        console.log(ss4)
        console.log(ss6)

        if (ss1 != "") {
            return false;
        }
        if (ss2 != "") {
            return false;
        }
        if (ss3 != "") {
            return false;
        }
        if (ss4 != "") {
            return false;
        }
        if (ss6 != "") {
            return false;
        }

        $("#form1").submit();
    }
</script>

</html>