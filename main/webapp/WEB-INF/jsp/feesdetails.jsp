<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Teacher Details</title>

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

            <div class="page-header">
                <div class="row">
                    <div class="col-sm-12">
                        <h3 class="page-title">学费缴纳</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="teachers.jsp">学费</a></li>
                            <li class="breadcrumb-item active">学费缴纳</li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="about-info">
                                <h4>相关学费</h4>
                                <div class="media mt-3">
                                    <img src="/edu/img/${currentUser.sPhoto}" class="mr-3" alt="...">
                                    <div class="media-body">
                                        <form action="/edu/feesdetails.action" method="post">
                                            <input type="hidden" name="sId" id="sId" value="${currentUser.sId}">
                                            <ul>
                                                <li>
                                                    <span class="title-span">姓名 : </span>
                                                    <span class="info-span"><a
                                                            href="/edu/students.action?sId = ${sId}"
                                                            id="sName">${currentUser.sName}</a></span>
                                                </li>
                                                <li>
                                                    <span class="title-span">性别: </span>
                                                    <span class="info-span"><a
                                                            href="/edu/students.action?sId = ${sId}">${currentUser.sex}</a></span>
                                                </li>
                                                <li>
                                                    <span class="title-span">学院: </span>
                                                    <span class="info-span"><a
                                                            href="/edu/students.action?sId = ${sId}">${currentUser.collname}</a></span>
                                                </li>
                                                <li>
                                                    <span class="title-span">专业编号: </span>
                                                    <span class="info-span"><a
                                                            href="/edu/students.action?sId = ${sId}"
                                                            id="mId">${currentUser.mId}</a></span>
                                                </li>

                                                <li>
                                                    <span class="title-span">专业: </span>
                                                    <span class="info-span"><a
                                                            href="/edu/students.action?sId = ${sId}"
                                                            id="mName">${currentUser.mName}</a></span>
                                                </li>
                                                <li>
                                                    <span class="title-span">班级 : </span>
                                                    <span class="info-span"><a
                                                            href="/edu/students.action?sId = ${sId}">${currentUser.className}</a></span>
                                                </li>
                                                <li>
                                                    <span class="title-span">学费: </span>
                                                    <span class="info-span"><a
                                                            href="/edu/students.action?sId = ${sId}"
                                                            id="mMoney">${currentUser.mMoney}</a></span>
                                                </li>
                                                <c:if test="${typs==1}">
                                                    <li>
                                                        <span class="title-span">缴费状态: </span>
                                                        <span class="info-span">未缴费</span>
                                                    </li>
                                                </c:if>

                                                <c:if test="${typs==2}">
                                                    <li>
                                                        <span class="title-span">缴费状态: </span>
                                                        <span class="info-span">已缴费</span>
                                                    </li>
                                                </c:if>

                                            </ul>
                                        </form>
                                    </div>
                                </div>

                                <div class="row mt-3">
                                    <div class="col-md-12">
                                        <p></p>
                                    </div>
                                </div>

                                <%--            <div class="row follow-sec">
                                                <div class="col-md-4 mb-3">
                                                    <div class="blue-box">
                                                        <h3>2850</h3>
                                                        <p>Followers</p>
                                                    </div>
                                                </div>
                                                <div class="col-md-4 mb-3">
                                                    <div class="blue-box">
                                                        <h3>2050</h3>
                                                        <p>Following</p>
                                                    </div>
                                                </div>
                                                <div class="col-md-4 mb-3">
                                                    <div class="blue-box">
                                                        <h3>2950</h3>
                                                        <p>Friends</p>
                                                    </div>
                                                </div>
                                            </div>--%>

                                <%--<div class="row mt-2">
                                    <div class="col-md-12">
                                        <h5>Permanent Address</h5>
                                        <p>480, Estern Avenue, Courtage area, New York</p>
                                    </div>
                                </div>--%>

                                <%-- <div class="row mt-2">
                                     <div class="col-md-12">
                                         <h5>Present Address</h5>
                                         <p>480, Estern Avenue, Courtage area, New York</p>
                                     </div>
                                 </div>--%>
                            </div>
                        </div>
                    </div>

                    <div class="row mt-2">
                        <div class="col-md-12">
                            <div class="skill-info">
                                <%--<h4>Skills</h4>
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry, simply
                                    dummy text of the printing and typesetting industry</p>--%>

                                <%--<ul>
                                    <li>
                                        <label>Lorem Ipsum is simply</label>
                                        <div class="progress">
                                            <div class="progress-bar progress-bar-striped progress-bar-animated"
                                                 role="progressbar" aria-valuenow="75" aria-valuemin="0"
                                                 aria-valuemax="100" style="width: 75%"></div>
                                        </div>
                                    </li>

                                    <li>
                                        <label>Lorem Ipsum is simply</label>
                                        <div class="progress">
                                            <div class="progress-bar progress-bar-striped progress-bar-animated bg-success"
                                                 role="progressbar" aria-valuenow="69" aria-valuemin="0"
                                                 aria-valuemax="100" style="width: 69%"></div>
                                        </div>
                                    </li>

                                    <li>
                                        <label>Lorem Ipsum is simply</label>
                                        <div class="progress">
                                            <div class="progress-bar progress-bar-striped progress-bar-animated bg-info"
                                                 role="progressbar" aria-valuenow="86" aria-valuemin="0"
                                                 aria-valuemax="100" style="width: 86%"></div>
                                        </div>
                                    </li>

                                    <li>
                                        <label>Lorem Ipsum is simply</label>
                                        <div class="progress">
                                            <div class="progress-bar progress-bar-striped progress-bar-animated bg-warning"
                                                 role="progressbar" aria-valuenow="65" aria-valuemin="0"
                                                 aria-valuemax="100" style="width: 65%"></div>
                                        </div>
                                    </li>
                                </ul>--%>

                                <%--<div class="row mt-3">
                                    <div class="col-md-12">
                                        <h5>Education</h5>
                                        <p class="mt-3">Secondary Schooling at xyz school of secondary education,
                                            Mumbai.</p>
                                        <p>Higher Secondary Schooling at xyz school of higher secondary education,
                                            Mumbai.</p>
                                        <p>Bachelor of Science at Abc College of Art and Science, Chennai.</p>
                                        <p>Master of Science at Cdm College of Engineering and Technology, Pune.</p>
                                    </div>
                                </div>--%>

                                <%-- <div class="row mt-3">
                                     <div class="col-md-12">
                                         <h5>所获奖项</h5>
                                         <p class="mt-3">2010年 中国书画院最高学术奖项徐悲鸿美术奖</p>
                                         <p>2009年 中国工艺美术最高奖项“百花奖”</p>
                                         <p>2012年 约翰·莫尔绘画奖</p>
                                     </div>
                                 </div>
                             </div>
                         </div>
                     </div>--%>

                                <%--  <div class="row mt-2">
                                      <div class="col-md-12">
                                          <div class="skill-info">
                                              <h4>Settings</h4>

                                              <form>
                                                  <div class="row mt-3">
                                                      <div class="col-12 col-sm-6">
                                                          <div class="form-group">
                                                              <label>Username</label>
                                                              <input type="text" class="form-control">
                                                          </div>
                                                      </div>
                                                      <div class="col-12 col-sm-6">
                                                          <div class="form-group">
                                                              <label>Current Password</label>
                                                              <input type="password" class="form-control">
                                                          </div>
                                                      </div>
                                                      <div class="col-12 col-sm-6">
                                                          <div class="form-group">
                                                              <label>New Password</label>
                                                              <input type="password" class="form-control">
                                                          </div>
                                                      </div>--%>
                                <c:if test="${count==0}">
                                    <div class="col-12">
                                        <button type="button" class="btn btn-primary"
                                                onclick="clearing('${currentUser.sName}',${currentUser.mMoney})">缴费
                                        </button>
                                    </div>
                                </c:if>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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

<!-- Custom JS -->
<script src="assets/js/script.js"></script>
<script>
    /*订单结算*/
    function clearing(sname, mMoney) {
        var sid = $("#sId").val();

        $.get("/edu/payment/goAlipay", {
            merchantUserId: sid,
            merchantOrderId: Date.parse(new Date()),
            merchantName: sname,
            money: mMoney
        }, function (data) {
            console.log(data);
            var url = data.data;
            console.log(url);
            window.location.href = url;
        }, "json");
    }
</script>

</body>
</html>