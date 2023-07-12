<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Error 404</title>

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

    <script>
        var num = 3;

        function myfun() {
            if (num > 0) {
                $("#tips").html("" + num + "秒后返回主页！")
                num--;
                setTimeout("myfun()", 1000);
            } else {
                window.location.href = "/edu/index";
            }
        }
    </script>
</head>
<body class="error-page" onload="myfun()">

<!-- Main Wrapper -->
<div class="main-wrapper">

    <div class="error-box">
        <h1>404</h1>
        <h3 class="h2 mb-3"><i class="fas fa-exclamation-triangle"></i> 页面未找到</h3>
        <a href="" class="btn btn-primary" id="tips">5秒后返回主页！</a>
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
</html>