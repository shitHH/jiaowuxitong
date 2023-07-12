<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Dashboard</title>

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
    <style>
        .div3:hover{
            cursor: pointer;
            transform: translateY(-5px);
            box-shadow: darkgray 0 3px 3px 3px;
            transition: all .2s ease-in-out;
        }
        .div3 {
            box-shadow: 0 1px 1px 1px darkgray; /*设置阴影*/
        }
    </style>
</head>
<body>

<!-- Main Wrapper -->
<div class="main-wrapper">

    <!-- Header -->
    <%@include file="header.jsp"%>
    <!-- /Header -->

    <!-- Sidebar -->
    <%@include file="left1.jsp"%>
    <!-- /Sidebar -->

    <!-- Page Wrapper -->
    <div class="page-wrapper">

        <div class="content container-fluid">

        <div style="width: 100%;height: 400px;background-image: url(https://resource.zretc.net/banners/1584712269877.jpg);background-size: 100% 100%;"></div>
        </div>
        <div style="float: left;width: 100%;">
            <div style="width: 100%;height: 60px;float: left;border-bottom: #1b1e21 2px solid;margin-top: 20px"><b style="margin-left: 200px;font-size: 25px;margin-bottom: 30px">||课程</b>
                <div class="top-nav-search" style="float: right;margin-right: 80px">

                <form action="${bp}/photoname.action" method="post">
                    <input type="text" class="form-control" placeholder="Search here" name="photoname">
                    <input type="hidden" name="pip" value="上架">
                    <button class="btn" type="submit"><i class="fas fa-search"></i></button>
                </form>

            </div>
            </div>
            <c:forEach var="photolist" items="${list}">
                <div class="div3" style="float: left;width: 300px;height: 400px;margin: 10px;border-radius: 30px">
                    <a href="${bp}/pptlist.action?photoid=${photolist.photoid}">
                    <div style="float: left;border-top-left-radius:30px;border-top-right-radius:30px;width: 100%;height: 340px;background-image: url(${bp}/${photolist.photosrc});background-size:100% 100%;margin-bottom: 10px;border-bottom: #1b1e21 2px solid;"></div>
                    <div style="float: left;text-align: center;width: 100%;">课程名：${photolist.photoname}</div>
                    <div style="float: left;text-align: center;width: 100%;">老师：${photolist.ptname}</div>
                    </a>
                </div>
            </c:forEach>

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

<!-- Chart JS -->
<script src="assets/plugins/apexchart/apexcharts.min.js"></script>
<script src="assets/plugins/apexchart/chart-data.js"></script>

<!-- Custom JS -->
<script src="assets/js/script.js"></script>

</body>
</html>