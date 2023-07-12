<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Holiday</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/img/favicon.png">

    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&display=swap">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">

    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/fontawesome.min.css">
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/all.min.css">

    <!-- Datetimepicker CSS -->
    <link rel="stylesheet" href="assets/css/bootstrap-datetimepicker.min.css">

    <!-- Full Calander CSS -->
    <link rel="stylesheet" href="assets/plugins/fullcalendar/fullcalendar.min.css">

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
                        <h3 class="page-title">课表</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index.jsp">课程管理</a></li>
                            <li class="breadcrumb-item active">课表查看</li>
                        </ul>
                    </div>
                    <div class="col-6 col-sm-4 col-md-2 col-xl mb-3 mb-xl-0">
                    </div>
                    <button class="btn btn-info" type="button"
                            onclick="window.history.go(-1)" style="margin-right: 150px;width: 100px">返回
                    </button>
                </div>

            </div>
            <!-- /Page Header -->

            <div class="row" style="margin-left: 250px">
                <div class="col-lg-6">
                    <div class="card" style="width: 1000px;height: 600px">
                        <div class="card-header">
                            <h5 class="card-title">班级课表</h5>
                        </div>
                        <div class="card-body" style="width: 900px">
                            <div class="table-responsive">
                                <table class="table table-bordered mb-0">
                                    <thead>
                                    <tr>
                                        <th style="width: 166.69px;height: 49.5px"></th>
                                        <th style="width: 166.69px;height: 49.5px">星期一</th>
                                        <th style="width: 166.69px;height: 49.5px">星期二</th>
                                        <th style="width: 166.69px;height: 49.5px">星期三</th>
                                        <th style="width: 166.69px;height: 49.5px">星期四</th>
                                        <th style="width: 166.69px;height: 49.5px">星期五</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>8:00-10:00</td>
                                        <td><c:forEach var="monday" items="${monday}">
                                            <c:if test="${monday.timeId==1}">${monday.lName}<br>${monday.tName}<br>
                                                ${monday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="tuesday" items="${tuesday}">
                                            <c:if test="${tuesday.timeId==1}">${tuesday.lName}<br>${tuesday.tName}<br>
                                                ${tuesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="wednesday" items="${wednesday}">
                                            <c:if test="${wednesday.timeId==1}">${wednesday.lName}<br>${wednesday.tName}<br>
                                                ${wednesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="thursday" items="${thursday}">
                                            <c:if test="${thursday.timeId==1}">${thursday.lName}<br>${thursday.tName}<br>
                                                ${thursday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="firday" items="${firday}">
                                            <c:if test="${firday.timeId==1}">${firday.lName}<br>${firday.tName}<br>
                                                ${firday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                    </tr>
                                    <tr>
                                        <td>10:00-12:00</td>
                                        <td><c:forEach var="monday" items="${monday}">
                                            <c:if test="${monday.timeId==2}">${monday.lName}<br>${monday.tName}<br>
                                                ${monday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="tuesday" items="${tuesday}">
                                            <c:if test="${tuesday.timeId==2}">${tuesday.lName}<br>${tuesday.tName}<br>
                                                ${tuesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="wednesday" items="${wednesday}">
                                            <c:if test="${wednesday.timeId==2}">${wednesday.lName}<br>${wednesday.tName}<br>
                                                ${wednesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="thursday" items="${thursday}">
                                            <c:if test="${thursday.timeId==2}">${thursday.lName}<br>${thursday.tName}<br>
                                                ${thursday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="firday" items="${firday}">
                                            <c:if test="${firday.timeId==2}">${firday.lName}<br>${firday.tName}<br>
                                                ${firday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                    </tr>
                                    <tr>
                                        <td>14:00-16:00</td>
                                        <td><c:forEach var="monday" items="${monday}">
                                            <c:if test="${monday.timeId==4}">${monday.lName}<br>${monday.tName}<br>
                                                ${monday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="tuesday" items="${tuesday}">
                                            <c:if test="${tuesday.timeId==4}">${tuesday.lName}<br>${tuesday.tName}<br>
                                                ${tuesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="wednesday" items="${wednesday}">
                                            <c:if test="${wednesday.timeId==4}">${wednesday.lName}<br>${wednesday.tName}<br>
                                                ${wednesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="thursday" items="${thursday}">
                                            <c:if test="${thursday.timeId==4}">${thursday.lName}<br>${thursday.tName}<br>
                                                ${thursday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="firday" items="${firday}">
                                            <c:if test="${firday.timeId==4}">${firday.lName}<br>${firday.tName}<br>
                                                ${firday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                    </tr>
                                    <tr>
                                        <td>16:00-18:00</td>
                                        <td><c:forEach var="monday" items="${monday}">
                                            <c:if test="${monday.timeId==5}">${monday.lName}<br>${monday.tName}<br>
                                                ${monday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="tuesday" items="${tuesday}">
                                            <c:if test="${tuesday.timeId==5}">${tuesday.lName}<br>${tuesday.tName}<br>
                                                ${tuesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="wednesday" items="${wednesday}">
                                            <c:if test="${wednesday.timeId==5}">${wednesday.lName}<br>${wednesday.tName}<br>
                                                ${wednesday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="thursday" items="${thursday}">
                                            <c:if test="${thursday.timeId==5}">${thursday.lName}<br>${thursday.tName}<br>
                                                ${thursday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                        <td><c:forEach var="firday" items="${firday}">
                                            <c:if test="${firday.timeId==5}">${firday.lName}<br>${firday.tName}<br>
                                                ${firday.cName}
                                            </c:if>
                                        </c:forEach></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <!-- Add Event Modal -->
            <div class="modal fade none-border" id="my_event">
                <div class="modal-dialog modal-dialog-centered">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Add Event</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body"></div>
                        <div class="modal-footer justify-content-center">
                            <button type="button" class="btn btn-success save-event submit-btn">Create event</button>
                            <button type="button" class="btn btn-danger delete-event submit-btn" data-dismiss="modal">
                                Delete
                            </button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /Add Event Modal -->
        </div>

        <!-- Footer -->
        <footer>
            <p>Copyright © 2020By <a href="http://www.bootstrapmb.com/">Dreamguys.</a></p>
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

<!-- Datetimepicker JS -->
<script src="assets/js/moment.min.js"></script>
<script src="assets/js/bootstrap-datetimepicker.min.js"></script>

<!-- Full Calendar JS -->
<script src="assets/js/jquery-ui.min.js"></script>
<script src="assets/plugins/fullcalendar/fullcalendar.min.js"></script>
<script src="assets/plugins/fullcalendar/jquery.fullcalendar.js"></script>

<!-- Custom JS -->
<script src="assets/js/script.js"></script>

</body>
<script>
    function deleteAll(cId) {
        var flag = confirm("确认删除吗？");
        if (flag) {
            window.location.href = "/edu/deleteclasstables?cId=" + cId + ""
        }
    }

</script>
</html>