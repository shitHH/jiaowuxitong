<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Admin</title>

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
                        <h3 class="page-title">增加管理员</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="students.jsp">管理员</a></li>
                            <li class="breadcrumb-item active">增加管理员</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form action="/edu/add-admin.action" id="form1" method="post" enctype="multipart/form-data">
                                <div class="row">
                                    <div class="col-12">
                                        <h5 class="form-title"><span>管理员信息</span></h5>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>管理员姓名</label>
                                            <input type="text" class="form-control" onblur="aname()" name="adminName"
                                                   id="adminName">
                                            <span id="ss1" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label id="mess" class="warning">管理员电话</label>
                                            <input type="text" class="form-control" maxlength="11" minlength="11"
                                                   name="adminTel" id="adminTel" onblur="stel() ">
                                            <span id="ss2" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>管理员密码</label>
                                            <input type="password" onblur="apass()" class="form-control" name="aPass"
                                                   id="aPass">
                                            <span id="ss3" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>管理员头像</label>
                                            <div>
                                                <input type="file" name="file" id="file" class="form-control" onchange="photo()">
                                                <span id="ss4" style="color: red"></span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>管理员状态</label>
                                            <select class="form-control" name="state">
                                                <option value="1">在职</option>
                                                <option value="2">离职</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-12">
                                        <button type="button" class="btn btn-primary" onclick="myfun()">Submit</button>
                                    </div>
                                </div>
                            </form>
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

    function photo() {
        var photo = $("#file").val().trim();
        if (photo == "") {
            $("#ss4").html("头像不能为空");
            return false;
        } else {
            $("#ss4").html("");
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


    function myfun() {
        aname();
        stel();
        photo();
        apass();

        var ss1 = $("#ss1").html();
        var ss2 = $("#ss2").html();
        var ss3 = $("#ss3").html();
        var ss4 = $("#ss4").html();
        console.log(ss1)
        console.log(ss2)
        console.log(ss3)
        console.log(ss4)

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

        $("#form1").submit();

    }

    // function commit() {
    // 	var ss1 = $("#ss1").html();
    // 	var ss2 = $("#ss2").html();
    // 	var ss3 = $("#ss3").html();
    // 	console.log(ss1)
    // 	console.log(ss2)
    // 	console.log(ss3)
    //
    // 	if (ss1 != "") {
    // 		return false;
    // 	}
    // 	if (ss2 != "") {
    // 		return false;
    // 	}
    // 	if (ss3 != "") {
    // 		return false;
    // 	}
    //
    // 	$("#function1").submit();
    // }
    // function name(){
    // 	var name = $("#name").val().trim();
    // 	if (name == "") {
    // 		$("#ss1").html("姓名不能为空");
    // 		return false;
    // 	} else {
    // 		$("#ss1").html("");
    // 	}
    //
    // }

    function apass() {
        var pass = $("#aPass").val().trim();
        if (pass == "") {
            $("#ss3").html("密码不能为空");
            return false;
        } else {
            $("#ss3").html("");
        }

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