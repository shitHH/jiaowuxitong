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
                        <h3 class="page-title">学生</h3>
                        <ul class="breadcrumb">
                            <%--									<li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>--%>
                            <li class="breadcrumb-item active">学生</li>
                        </ul>
                    </div>
                    <div class="col-auto text-right float-right ml-auto">
                        <a href="/edu/toaddstudent.action" class="btn btn-primary"><i class="fas fa-plus"></i></a>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card card-table">
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-hover table-center mb-0 datatable">
                                    <thead>
                                    <tr>
                                        <th>学号</th>
                                        <th>姓名</th>
                                        <th>邮箱</th>
                                        <th>电话</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="students" items="${list}" varStatus="loop">

                                        <tr>
                                            <td>
                                                <a href="/edu/studentdetails.action?sId=${students.sId}">${students.sId}</a>
                                            </td>
                                            <td>
                                                <h2 class="table-avatar">
                                                    <a href="/edu/studentdetails.action?sId=${students.sId}"
                                                       class="avatar avatar-sm mr-2"><img
                                                            class="avatar-img rounded-circle"
                                                            src="/edu/img/1665319744137.jpeg"
                                                            alt="User Image"></a>
                                                    <a href="/edu/studentdetails.action?sId=${students.sId}">${students.sName}</a>
                                                </h2>
                                            </td>
                                            <td>${students.sEmail}</td>
                                            <td>${students.sTel}</td>
                                            <c:choose>
                                                <c:when test="${lists[loop.count-1]==1}">
                                                    <td>
                                                        <form action="/edu/luruscore" method="post">
                                                            <input type="number" name="score" style="width: 80px">
                                                            <input type="hidden" name="lId" value="${lId}"
                                                                   style="width: 80px">
                                                            <input type="hidden" name="cId" value="${students.cId}"
                                                                   style="width: 80px">
                                                            <input type="hidden" name="sId" value="${students.sId}"
                                                                   style="width: 80px">
                                                            <button type="submit" class="btn btn-rounded btn-info"
                                                            >
                                                                录入成绩
                                                            </button>
                                                        </form>
                                                    </td>
                                                </c:when>
                                                <c:otherwise>
                                                    <td>
                                                            ${lists[loop.count-1]}
                                                    </td>
                                                </c:otherwise>
                                            </c:choose>
                                                <%--                                            <c:if test="${lists[loop.count-1]==1}">--%>
                                                <%--                                                <td>--%>
                                                <%--                                                    <form action="/edu/luruscore" method="post">--%>
                                                <%--                                                        <input type="number" name="score" style="width: 80px">--%>
                                                <%--                                                        <input type="hidden" name="lId" value="${lId}"--%>
                                                <%--                                                               style="width: 80px">--%>
                                                <%--                                                        <input type="hidden" name="cId" value="${students.cId}"--%>
                                                <%--                                                               style="width: 80px">--%>
                                                <%--                                                        <input type="hidden" name="sId" value="${students.sId}"--%>
                                                <%--                                                               style="width: 80px">--%>
                                                <%--                                                        <button type="submit" class="btn btn-rounded btn-info"--%>
                                                <%--                                                        >--%>
                                                <%--                                                            录入成绩--%>
                                                <%--                                                        </button>--%>
                                                <%--                                                    </form>--%>
                                                <%--                                                </td>--%>
                                                <%--                                            </c:if>--%>
                                                <%--                                            <c:if test="${lists[loop.count-1]==2}">--%>
                                                <%--                                                <td>--%>
                                                <%--                                                    <button type="button" class="btn btn-rounded btn-success"--%>
                                                <%--                                                    >--%>
                                                <%--                                                        已录入--%>
                                                <%--                                                    </button>--%>
                                                <%--                                                </td>--%>
                                                <%--                                            </c:if>--%>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Footer -->
        <%--        <footer>--%>
        <%--            <p>Copyright © 2020By <a href="http://www.bootstrapmb.com/">Dreamguys.</a></p>--%>
        <%--        </footer>--%>
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
</html>