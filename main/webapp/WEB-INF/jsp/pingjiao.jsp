<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Appraiseoption</title>

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
    <form action="${bp}/jiaopiao" method="post">
        <input type="hidden" name="sid" value="${currentUser.sId}">
        <!-- Page Wrapper -->
        <div class="page-wrapper">
            <div class="content container-fluid">

                <!-- Page Header -->
                <div class="page-header">
                    <div class="row align-items-center">
                        <div class="col">
                            <h3 class="page-title">教学评价</h3>
                            <ul class="breadcrumb">
                                <li class="breadcrumb-item"><a href="index.jsp">教学评价</a></li>
                                <li class="breadcrumb-item active">教学评价</li>
                            </ul>
                        </div>
                        <div class="col-auto text-right float-right ml-auto">
                            <select name="tid" class="form-control">
                                <c:forEach var="teacher" items="${list1}">
                                    <option value="${teacher.tid}">${teacher.tName}</option>
                                </c:forEach>
                            </select>
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
                                            <th>教评内容</th>
                                            <th>分数</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="jiaoping" items="${list}">
                                            <tr>
                                                <td><input type="hidden" name="chooseId"
                                                           value="${jiaoping.chooseid}"/>${jiaoping.content}</td>
                                                <td>
                                                    <h2>
                                                        <select name="score">
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                            <option value="5">5</option>
                                                            <option value="6">6</option>
                                                            <option value="7">7</option>
                                                            <option value="8">8</option>
                                                            <option value="9">9</option>
                                                            <option value="10">10</option>
                                                        </select>
                                                    </h2>
                                                </td>
                                            </tr>
                                        </c:forEach>

                                        </tbody>

                                    </table>
                                    <input type="submit" class="btn btn-primary" value="提交" style="margin-left: 1350px;width: 100px;margin-top: 17px">

                                </div>

                            </div>

                        </div>

                    </div>

                </div>
            </div>

        </div>
    </form>
    <!-- Footer -->
    <footer>
        <p>Copyright ? 2020By <a href="http://www.bootstrapmb.com/">Dreamguys.</a></p>
    </footer>
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
<script type="text/javascript">
    function delete1(chooseid) {
        var b = confirm("确认删除吗？？");
        if (b) {
            window.location.href = "/edu/delete.action?chooseid=" + chooseid + "";
        }
    }
</script>
</body>
</html>
