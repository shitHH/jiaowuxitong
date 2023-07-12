<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>疫情上报</title>

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
                        <h3 class="page-title">疫情管理</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="students.jsp">学生</a></li>
                            <li class="breadcrumb-item active">增加疫情状态</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form action="/edu/add-yiqing.action" method="post" enctype="multipart/form-data">
                                <input type="hidden" id="collIds" value="${currentUser.collId}">
                                <input type="hidden" id="majorId" value="${currentUser.mId}">
                                <input type="hidden" id="classId" value="${currentUser.cId}">
                                <div class="row">
                                    <div class="col-12">
                                        <h5 class="form-title"><span>学生信息</span></h5>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <input type="hidden" name="sid" id="sId" value="${currentUser.sId}">
                                        <div class="form-group">
                                            <label>姓名</label>
                                            <input type="text" name="sName" id="sName" class="form-control"
                                                   value="${currentUser.sName}">
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>性别</label>
                                            <select class="form-control" name="sex" id="sex">
                                                <option>男</option>
                                                <option>女</option>
                                            </select>
                                            <%--                                            <input type="text" name="sex" id="sex" class="form-control"--%>
                                            <%--                                                   value="${student.sex}">--%>
                                        </div>
                                    </div>
                                    <%--                                    <div class="col-12 col-sm-6">--%>
                                    <%--                                        <div class="form-group">--%>
                                    <%--                                            <label>生日</label>--%>
                                    <%--                                            <div>--%>
                                    <%--                                                <input type="date" name="birthday" id="birthday" class="form-control"--%>
                                    <%--                                                       value="${student.birthday}">--%>
                                    <%--                                            </div>--%>
                                    <%--                                        </div>--%>
                                    <%--                                    </div>--%>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>学院：</label>
                                            <input type="text" id="collname" name="collname" class="form-control"
                                                   value="${currentUser.collname}" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>专业：</label>
                                            <input type="text" id="mName" name="mName" class="form-control"
                                                   value="${currentUser.mName}" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>班级：</label>
                                            <input type="text" id="className" name="className" class="form-control"
                                                   value="${currentUser.className}" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>电话</label>
                                            <input type="text" id="sTel" name="sTel" class="form-control"
                                                   value="${currentUser.sTel}">
                                        </div>
                                    </div>


                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>今日体温</label>
                                            <input type="number" onblur="tiwen()" class="form-control"
                                                   name="tiwen" id="tiwen">
                                            <span id="ss3" style="color: red"></span>
                                        </div>
                                    </div>


                                    <%--                                    <div class="col-12 col-sm-6">--%>
                                    <%--                                        <div class="form-group">--%>
                                    <%--                                            <label>Admission Number</label>--%>
                                    <%--                                            <input type="text" class="form-control" value="PRE1252">--%>
                                    <%--                                        </div>--%>
                                    <%--                                    </div>--%>
                                    <div class="col-12">
                                        <button type="submit" class="btn btn-primary">提交</button>
                                    </div>

                                </div>
                            </form>
                            <%--									<form action="/edu/add-.action" id="form1" method="post" enctype="multipart/form-data">--%>
                            <%--										<input type="hidden" id="collIds" value="${student.collId}">--%>
                            <%--										<input type="hidden" id="majorId" value="${student.mId}">--%>
                            <%--										<input type="hidden" id="classId" value="${student.cId}">--%>
                            <%--										<div class="row">--%>
                            <%--											<div class="col-12">--%>
                            <%--												<h5 class="form-title"><span>学生信息</span></h5>--%>
                            <%--											</div>--%>
                            <%--											<div class="col-12 col-sm-6">--%>
                            <%--												<div class="form-group">--%>
                            <%--													<label>学生姓名</label>--%>
                            <%--													<input type="text" class="form-control" value="${student.sName}"  onblur="aname()" name="adminName" id="adminName">--%>
                            <%--													<span id="ss1" style="color: red"></span>--%>
                            <%--												</div>--%>
                            <%--											</div>--%>
                            <%--											<div class="col-12 col-sm-6">--%>
                            <%--												<div class="form-group">--%>
                            <%--													<label>性别</label>--%>
                            <%--													<select class="form-control" name="sex" id="sex">--%>
                            <%--														<option>男</option>--%>
                            <%--														<option>女</option>--%>
                            <%--													</select>--%>
                            <%--												</div>--%>
                            <%--											</div>--%>
                            <%--											<div class="col-12 col-sm-6">--%>
                            <%--												<div class="form-group">--%>
                            <%--													<label>学院：</label>--%>
                            <%--													<select class="form-control" id="collid" name="collid"--%>
                            <%--															onchange="findMajor(this.value)">--%>
                            <%--														<c:forEach var="college" items="${college}">--%>
                            <%--															<option value="${college.collid}">${college.collname}</option>--%>
                            <%--														</c:forEach>--%>
                            <%--													</select>--%>
                            <%--												</div>--%>
                            <%--											</div>--%>

                            <%--											<div class="col-12 col-sm-6">--%>
                            <%--												<div class="form-group">--%>
                            <%--													<label>专业：</label>--%>
                            <%--													<select class="form-control" id="mId" name="mId"--%>
                            <%--															onchange="findclass(this.value)">--%>
                            <%--													</select>--%>
                            <%--												</div>--%>
                            <%--											</div>--%>

                            <%--											<div class="col-12 col-sm-6">--%>
                            <%--												<div class="form-group">--%>
                            <%--													<label>班级：</label>--%>
                            <%--													<select class="form-control" id="cId" name="cId">--%>
                            <%--													</select>--%>
                            <%--												</div>--%>
                            <%--											</div>--%>
                            <%--											<div class="col-12 col-sm-6">--%>
                            <%--												<div class="form-group">--%>
                            <%--													<label id="mess" class="warning">学生电话</label>--%>
                            <%--													<input type="text" class="form-control" maxlength="11" minlength="11" name="adminTel" id="adminTel" onblur="stel() ">--%>
                            <%--													<span id="ss2" style="color: red"></span>--%>
                            <%--												</div>--%>
                            <%--											</div>--%>
                            <%--											<div class="col-12 col-sm-6">--%>
                            <%--												<div class="form-group">--%>
                            <%--													<label >今日体温</label>--%>
                            <%--													<input type="number" onblur="tiwen()" class="form-control" name="tiwen" id="tiwen">--%>
                            <%--													<span id="ss3" style="color: red"></span>--%>
                            <%--												</div>--%>
                            <%--											</div>--%>

                            <%--&lt;%&ndash;											<div class="col-12 col-sm-6">&ndash;%&gt;--%>
                            <%--&lt;%&ndash;												<div class="form-group">&ndash;%&gt;--%>
                            <%--&lt;%&ndash;													<label>管理员头像</label>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;													<div>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;														<input type="file" name="file" class="form-control">&ndash;%&gt;--%>
                            <%--&lt;%&ndash;													</div>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;												</div>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;											</div>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;											<div class="col-12 col-sm-6">&ndash;%&gt;--%>
                            <%--&lt;%&ndash;												<div class="form-group">&ndash;%&gt;--%>
                            <%--&lt;%&ndash;													<label>管理员状态</label>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;													<select class="form-control" name="state">&ndash;%&gt;--%>
                            <%--&lt;%&ndash;														<option>1</option>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;														<option>2</option>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;													</select>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;												</div>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;											</div>&ndash;%&gt;--%>

                            <%--											<div class="col-12">--%>
                            <%--												<button type="button" class="btn btn-primary" onclick="myfun()">Submit</button>--%>
                            <%--											</div>--%>
                            <%--										</div>--%>
                            <%--									</form>--%>
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
<script>
    /*使用AJAX完成对于电话号码的验证*/
    // function infromation(phone) {
    // 	console.log(phone);
    // 	$.post("/edu/add-admin.action",{"adminTel":phone},function(data) {
    // 		console.log(data);/*显示出回调函数的结果*/
    // 		if (data == false) {
    // 			$("#ss2").html("手机号输入错误");
    // 		} else {
    // 			$("#ss2").html("");
    // 		}
    // 	});
    // }

    function aname() {
        var name = $("#adminName").val().trim();
        if (name == "") {
            $("#ss1").html("姓名不能为空");
            return false;
        } else {
            $("#ss1").html("");
        }

    }

    function stel() {
        var tel = $("#adminTel").val().split("").join('');
        console.log(tel);
        if (tel == "") {
            $("#ss2").html("电话不能为空");
            return false;
        } else {
            $("#ss2").html("");
        }
        var reg_tel = /^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/;
        if (reg_tel.test(tel)) {
            // $("#ss3").html("<font style='color: green'>√</font>")
            $("#ss2").html("");
            // checkTel(tel);
        } else {
            $("#ss2").html("电话格式有误")
            return false;
        }
    }
    function tiwen() {
        var tiwen = $("#tiwen").val().split("").join('');
        if (tiwen == "") {
            $("#ss3").html("体温不能为空");
            return false;
        } else {
            $("#ss3").html("");
        }
        var reg_tiwen = /^(^3[5-9])(\.\d{1})?$|^(4[0-2])(\.\d{1})?$/;
        if (reg_tiwen.test(tiwen)){
            $("#ss3").html("");
        }else {
            $("#ss3").html("体温输入有误！")
            return false;
        }

    }


    function myfun() {
        tiwen()
        var ss3 = $("#ss3").html();
        console.log(ss3)

        if (ss3 != "") {
            return false;
        }

        $("#form1").submit();

    }



    function function1() {
        var adminName = $("#adminName").val();
        var adminTel = $("#adminTel").val();
        var apass = $("#aPass").val();

        if (adminName != "") {
            alert("姓名不能为空");
            return false;
        }
        if (adminTel == "") {
            alert("手机号不能为空");
            return false;
        }
        if (apass == "") {
            alert("密码不能为空！");
            return false;
        }

        $("#function1").submit();
    }

</script>
</body>
</html>