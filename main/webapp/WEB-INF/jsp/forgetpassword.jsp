<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Forgot Password</title>

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
<div class="main-wrapper login-body">
    <div class="login-wrapper">
        <div class="container">
            <div class="loginbox">
                <div class="login-left">
                    <img class="img-fluid" src="assets/img/logo-white.png" alt="Logo">
                </div>
                <div class="login-right">
                    <div class="login-right-wrap">
                        <h1>忘记密码?</h1>
                        <p class="account-subtitle">输入您的电话和邮箱进行密码修改</p>

                        <!-- Form -->
                        <form id="form1" action="/edu/updatepass.action" method="post">
                            <div class="form-group">
                                <input class="form-control" type="text" placeholder="电话" id="sTel" name="sTel"
                                       onblur="myfuns()">
                                <span id="ss1" style="color: red"></span>
                            </div>

                            <div class="form-group">
                                <input class="form-control" type="email" placeholder="邮箱" id="sEmail" name="sEmail"
                                       onblur="email()">
                                <span id="ss2" style="color: red"></span>
                            </div>

                            <div class="form-group">
                                <input class="form-control" type="password" placeholder="密码" id="sPass" name="sPass"
                                       onblur="pass()">
                                <span id="ss3" style="color: red"></span>
                            </div>

                            <div class="form-group">
                                <input class="form-control" type="password" placeholder="确认密码" id="sRePass"
                                       name="sRePass" onblur="rePass()">
                                <span id="ss4" style="color: red"></span>
                                <span id="ss5" style="color: red"></span>
                            </div>

                            <div class="form-group">
                                <label type="hidden" id="mess" class="warning" style="color: red"></label>
                            </div>

                            <div class="form-group mb-0">
                                <input class="btn btn-primary btn-block" type="button" onclick="submits()" value="提交">
                            </div>
                        </form>
                        <!-- /Form -->

                        <div class="text-center dont-have">记住你的密码? <a href="/edu/tologin.action">登录</a></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /Main Wrapper -->

<!-- jQuery -->
<script src="assets/js/jquery-3.5.1.min.js"></script>

<!-- Bootstrap Core JS -->
<script src="assets/js/popper.min.js"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>

<!-- Custom JS -->
<script src="assets/js/script.js"></script>
<script>

    function myfuns() {
        var tel = $("#sTel").val().trim();
        var email = $("#sEmail").val().trim();
        if (tel == "") {
            $("#ss1").html("电话不能为空");
            return false;
        } else {
            $("#ss1").html("");
        }

        $.post("/edu/forgetpassword.action", {"sTel": tel, "sEmail": email}, function (data) {
            console.log(data)
            if (data == true) {
                $("#mess").html("")
            } else {
                $("#mess").html("信息输入错误！")
            }
        })
    }

    function email() {
        myfuns();
        var email = $("#sEmail").val().trim();
        if (email == "") {
            $("#ss2").html("邮箱不能为空");
            return false;
        } else {
            $("#ss2").html("");
        }
    }

    function pass() {
        myfuns();
        email();
        var sPass = $("#sPass").val().trim();
        if (sPass == "") {
            $("#ss3").html("密码不能为空！");
            return false;
        } else {
            $("#ss3").html("");
        }
    }

    function rePass() {
        myfuns();
        email();
        pass();
        var sRePass = $("#sRePass").val().trim();
        if (sRePass == "") {
            $("#ss4").html("确认密码不能为空！");
            return false;
        } else {
            $("#ss4").html("");
        }
    }

    function conPass() {
        myfuns();
        email();
        pass();
        rePass();
        var sPass = $("#sPass").val().trim();
        var sRePass = $("#sRePass").val().trim();
        if (sRePass != sPass) {
            $("#ss5").html("两次密码输入不一致");
            return false;
        } else {
            $("#ss5").html("");
        }
    }

    function submits() {
        myfuns();
        email();
        pass();
        rePass();
        conPass();
        var ss1 = $("#ss1").html()
        var ss2 = $("#ss2").html()
        var ss3 = $("#ss3").html()
        var ss4 = $("#ss4").html()
        // var ss5 = $("#ss5").html()
        var mess = $("#mess").html()
        console.log(ss1)
        console.log(ss2)
        console.log(ss3)
        console.log(ss4)
        // console.log(ss5)
        console.log(mess)
        if (mess != "") {
            return false;
        }

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
        // if (ss5 != "") {
        //     return false;
        // }
        $("#form1").submit();
    }
</script>
</body>
</html>