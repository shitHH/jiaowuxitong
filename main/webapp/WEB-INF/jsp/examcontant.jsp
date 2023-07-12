<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Department</title>

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
<body onload="myfun2()">

<!-- Main Wrapper -->
<div class="main-wrapper">

    <!-- Header -->
    <%@include file="header.jsp" %>
    <!-- /Header -->

    <!-- Sidebar -->
    <%@include file="left1.jsp" %>
    <!-- /Sidebar -->

    <!-- Page Wrapper -->
    <div class="page-wrapper">
        <div class="content container-fluid">

            <!-- Page Header -->
            <div class="page-header">
                <div class="row align-items-center">
                    <div class="col">
                        <h3 class="page-title">试题</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a onclick="myfun()">返回</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
            </div>
        </div>
        ${results}
        <div class="col-sm-12" align="center"><h3>${exampapername}</h3></div>
        <div class="card card-table">
            <form action="${bp}/exorderinsert.action" method="post" id="f1">
                <input type="hidden" name="id" value="${exampapername}">考试时间：<input type="hidden" id="endtime"
                                                                                    value="${endtime}">${endtime}
                <li id="tips">考试时间剩余100秒</li>
                <div class="table-responsive" style="margin: 20px">
                    <table class="table table-hover table-center mb-0 datatable">
                        <tbody>
                        <div class="test_content_nr">
                            <ul>
                                <c:forEach items="${examcontantlist}" var="elist">
                                    <li>考试时间：</li>
                                    <li id="qu_0_0">
                                        <div class="test_content_nr_tt">
                                            <span>${elist.num}.</span>&nbsp;<span>(${elist.score}分)</span><font>${elist.itemcontant}(
                                            )</font>
                                        </div>
                                        <input type="hidden" name="score" value="${elist.score}">
                                        <input type="hidden" name="answer" value="${elist.answer}">
                                        <input type="hidden" name="sscore">
                                        <input type="hidden" name="sscore1">
                                        <input type="hidden" name="sscore2" value="1">
                                        <input type="hidden" name="sscore3" value="1">
                                        <input type="hidden" name="sscore4" value="1">
                                        <input type="hidden" name="sscore5" value="1">
                                        <input type="hidden" name="sscore6" value="1">
                                        <input type="hidden" name="sscore7" value="1">
                                        <input type="hidden" name="sscore8" value="1">
                                        <input type="hidden" name="sscore9" value="1">
                                        <input type="hidden" name="sum" value="0">
                                        <div class="test_content_nr_main">
                                            <ul>
                                                <li class="option">
                                                    <input type="radio" class="radioOrCheck" checked name="${elist.num}"
                                                           id="${elist.num}" value="A"/>
                                                        ${elist.a}
                                                    <p class="ue" style="display: inline;">${elist.acontant}</p>
                                                </li>

                                                <li class="option">
                                                    <input type="radio" class="radioOrCheck" name="${elist.num}"
                                                           id="0_answer_3_option_1" value="B"/>
                                                        ${elist.b}
                                                    <p class="ue" style="display: inline;">${elist.bcontant}</p>
                                                </li>

                                                <li class="option">
                                                    <input type="radio" class="radioOrCheck" name="${elist.num}"
                                                           id="0_answer_3_option_1" value="C"/>
                                                        ${elist.c}
                                                    <p class="ue" style="display: inline;">${elist.ccontant}</p>
                                                </li>

                                                <li class="option">
                                                    <input type="radio" class="radioOrCheck" name="${elist.num}"
                                                           id="0_answer_3_option_1" value="D"/>
                                                        ${elist.d}
                                                    <p class="ue" style="display: inline;">${elist.dcontant}</p>

                                                </li>
                                            </ul>
                                        </div>
                                    </li>
                                    </li>
                                </c:forEach>
                                <div>
                                    <input style="float: right;margin-right: 55%" class="btn btn-primary"
                                           type="submit"></input>
                                </div>
                            </ul>
                        </div>
                        </tbody>
                    </table>
                </div>
            </form>
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
    function myfun() {
        if (confirm("确定要退出考试吗？")) {
            window.history.back(-1)
        }
    }
</script>
<script>
    var endtime = $("#endtime").val();
    var a = parseInt(endtime);

    function myfun2() {
        console.log(a);
        if (a > 0) {
            $("#tips").html("考试时间剩余" + a + "秒")
            a--;
            setTimeout("myfun2()", 1000);
        } else {
            $("#f1").submit();
        }
    }
</script>
</html>