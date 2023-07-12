<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>111${bp}111</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="${bp}/static/assets/img/favicon.png">

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
                        <h1>登录</h1>
                        <%--								<p class="account-subtitle">Access to our dashboard</p>--%>

                        <!-- Form -->
                        <form action="/edu/login.action?type=1" method="post" id="f1">
                            <div class="form-group">
                                <input class="form-control" type="text" name="sId" maxlength="8" minlength="8"
                                       placeholder="学号" id="account">
                            </div>
                            <div class="form-group">
                                <input class="form-control" type="password" maxlength="15" name="sPass"
                                       placeholder="密码" id="pass">
                            </div>
                            <div class="form-group">
                                <input type="radio" name="radio" onclick="student()" checked="checked">学生
                                <input type="radio" name="radio" onclick="teacher()">教师
                                <input type="radio" name="radio" onclick="admin()">管理员<br>
                                <br><button class="btn btn-primary btn-block" type="submit">登录</button>
                            </div>
                            <div class="form-group">
                                <span style="color: #ff0000">${mess}</span>
                            </div>
                        </form>
                        <!-- /Form -->

                        <div class="text-center forgotpass"><a href="/edu/toforgotpassword">忘记密码?</a></div>

<%--                        <div class="text-center dont-have">没有账户? <a href="/edu/toregister.action">注册一个</a></div>--%>
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

</body>
<script>
    function student() {
        $("#f1").attr({
            "action": "/edu/login.action?type=1"
        })
        $("#account").attr({
            "name": "sId",
            "placeholder": "学号"
        })
        $("#pass").attr({
            "name": "sPass",
            "placeholder": "密码"
        })
    }

    function teacher() {
        $("#f1").attr({
            "action": "/edu/login.action?type=2"
        })
        $("#account").attr({
            "name": "tid",
            "placeholder": "工号"
        })
        $("#pass").attr({
            "name": "tpass",
            "placeholder": "密码"
        })
    }

    function admin() {
        $("#f1").attr({
            "action": "/edu/login.action?type=3"
        })
        $("#account").attr({
            "name": "adminId",
            "placeholder": "账号"
        })
        $("#pass").attr({
            "name": "aPass",
            "placeholder": "密码"
        })
    }
</script>
</html>