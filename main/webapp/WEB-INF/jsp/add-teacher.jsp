<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <%@include file="common.jsp" %>
    <base href="${bp}/static/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - Teachers</title>

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
                        <h3 class="page-title">增加老师</h3>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="teachers.jsp">老师</a></li>
                            <li class="breadcrumb-item active">增加老师</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->

            <div class="row">
                <div class="col-sm-12">

                    <div class="card">
                        <div class="card-body">
                            <form id="form1" action="/edu/add-teacher.action" method="post"
                                  enctype="multipart/form-data">
                                <input type="hidden" name="tstate" value="1">
                                <div class="row">
                                    <div class="col-12">
                                        <h5 class="form-title"><span>基本信息</span></h5>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>姓名</label>
                                            <input type="text" class="form-control" name="tName" id="tname"
                                                   onchange="checktName()">
                                            <font id="s1" color="red"></font>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>性别</label>
                                            <select class="form-control" name="tsex">
                                                <option>男</option>
                                                <option>女</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>出生日期</label>
                                            <input type="date" class="form-control" name="tbirthday" id="tbirthday"
                                                   onchange="bir()">
                                            <font id="s2" color="red"></font>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>电话</label>
                                            <input type="text" maxlength="11" minlength="11" class="form-control"
                                                   id="ttel" name="ttel"
                                                   onchange="checktTel()">
                                            <font id="s3" color="red"></font>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>学历</label>
                                            <%--                                            <input class="form-control" type="text" name="teducation" id="teducation"--%>
                                            <%--                                                   onchange="checkEducationValue()">--%>
                                            <%--                                            <font id="s3" color="red"></font>--%>
                                            <select class="form-control" name="teducation">
                                                <option>本科</option>
                                                <option>硕士</option>
                                                <option>博士</option>
                                                <option>院士</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>所在学院</label>
                                            <select class="form-control" name="collid">
                                                <c:forEach items="${college}" var="college1">
                                                    <option value="${college1.collid}">${college1.collname}</option>
                                                </c:forEach>
                                            </select>

                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>职称</label>
                                            <%--                                            <input class="form-control" type="text" name="profession" id="profession"--%>
                                            <%--                                                   onchange="checkProfessionValue()">--%>
                                            <%--                                            <font id="s4" color="red"></font>--%>
                                            <select class="form-control" name="profession">
                                                <option>讲师</option>
                                                <option>高级教师</option>
                                                <option>特级教师</option>
                                                <option>教授</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <h5 class="form-title"><span>登录信息</span></h5>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>密码</label>
                                            <input type="password" class="form-control" name="tpass" id="tpass"
                                                   onchange="pass()">
                                            <font id="s4" color="red"></font>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>确认密码</label>
                                            <input type="password" class="form-control" id="tpass2"
                                                   onchange="repass()"><span id="tishi"></span>
                                            <font id="s5" color="red"></font>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>邮箱</label>
                                            <input class="form-control" type="email" name="temail" id="temail"
                                                   onchange="email()">
                                            <font id="s6" color="red"></font>
                                        </div>
                                    </div>
                                    <div class="col-12 col-sm-6">
                                        <div class="form-group">
                                            <label>头像</label>
                                            <div>
                                                <input type="file" name="file" class="form-control" id="photo"
                                                       onchange="checkPhoto()">
                                                <font id="s7" color="red"></font>
                                            </div>
                                        </div>
                                    </div>
                                    <%--                                    <div class="col-12">--%>
                                    <%--                                        <h5 class="form-title"><span>地址</span></h5>--%>
                                    <%--                                    </div>--%>
                                    <div class="col-12">
                                        <div class="form-group">
                                            <label>地址</label>
                                            <input type="text" class="form-control" name="taddress" id="address"
                                                   onchange="add()">
                                            <font id="s8" color="red"></font>

                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button type="button" class="btn btn-primary" onclick="myfun()">提交</button>
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
    function checktName() {
        var tname = $("#tname").val().trim();
        if (tname == "") {
            $("#s1").html("姓名不能为空");
            return false;
        } else {
            $("#s1").html("");
        }
    }

    function bir() {
        var bir = $("#tbirthday").val().trim();
        if (bir == "") {
            $("#s2").html("生日不能为空");
            return false;
        } else {
            $("#s2").html("");
        }
    }

    /*使用AJAX完成对于电话号码的验证*/
    // function checkTtel(phone) {
    //     console.log(phone);
    //     $.post("/edu/checkttel.action", {"tel": phone}, function (data) {
    //         console.log(data);/*显示出回调函数的结果*/
    //         if (data == false) {
    //             $("#s3").html("该电话已注册");
    //             return;
    //         } else {
    //             $("#s3").html("");
    //         }
    //     });
    // }


    function checktTel() {
        var ttel = $("#ttel").val().split("").join('');
        console.log(ttel);
        if (ttel == "") {
            $("#s3").html("电话不能为空");
            return false;
        } else {
            $("#s3").html("");
        }
        var reg_ttel = /^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/;
        if (reg_ttel.test(ttel)) {
            // $("#ss3").html("<font style='color: green'>√</font>")
            $("#s3").html("");
            // chechTtel(ttel);
        } else {
            $("#s3").html("电话格式有误")
            return false;
        }
    }

    function pass() {
        var pass = $("#tpass").val().trim();
        if (pass == "") {
            $("#s4").html("密码不能为空");
            return false;
        } else {
            $("#s4").html("");
        }
    }

    function repass() {
        var repass = $("#tpass2").val().trim();
        if (repass == "") {
            $("#s5").html("确认密码不能为空");
            return false;
        } else {
            $("#s5").html("");
        }
    }

    // function panduan(){
    //     var pass = $("#tpass").val().trim();
    //     var repass = $("#tpass2").val().trim();
    //     if (repass!=pass){
    //         $("#s7").html("两次密码不一致");
    //         return false;
    //     }else {
    //         $("#s7").html("");
    //     }
    //
    // }

    // function checkTEmail() {
    //     var e = $("#temail").val().trim();
    //     console.log(e)
    //     if (e == "") {
    //         $("#s8").html("邮箱不能为空");
    //         return false;
    //     } else {
    //         $("#s8").html("");
    //     }
    //     $.post("/edu/checktemail.action", {"temail": email}, function (data) {
    //         console.log(data);/*显示出回调函数的结果*/
    //         if (data == false) {
    //             $("#s6").html("该邮箱已注册");
    //             return;
    //         } else {
    //             $("#s6").html("");
    //         }
    //     });
    // }
    function email() {
        var temail = $("#temail").val().split("").join('');
        console.log(temail);
        if (temail == "") {
            $("#s6").html("邮箱不能为空");
            return false;
        } else {
            $("#s6").html("");
        }
        var reg_email = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
        if (reg_email.test(temail)) {
            // $("#ss4").html("<font style='color: green'>√</font>")
            $("#s6").html("");
            // checkTEmail(temail);
        } else {
            $("#s6").html("邮箱格式有误")
            return false;
        }
    }

    function checkPhoto() {
        var photo = $("#photo").val().trim();
        if (photo == "") {
            $("#s7").html("头像不能为空");
            return false;
        } else {
            $("#s7").html("");
        }
    }

    function add() {
        var taddress = $("#address").val().trim();
        if (taddress == "") {
            $("#s8").html("地址不能为空");
            return false;
        } else {
            $("#s8").html("");
        }
    }

    function myfun() {
        checktName();
        bir();
        checktTel();
        pass();
        repass();
        email();
        checkPhoto();
        add();
        setTimeout("commit()", 200);

    }

    function commit() {
        var ss1 = $("#s1").html();
        var ss2 = $("#s2").html();
        var ss3 = $("#s3").html();
        var ss4 = $("#s4").html();
        var ss5 = $("#s5").html();
        var ss6 = $("#s6").html();
        var ss7 = $("#s7").html();
        var ss8 = $("#s8").html();


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
        if (ss5 != "") {
            return false;
        }
        if (ss6 != "") {
            return false;
        }
        if (ss7 != "") {
            return false;
        }
        if (ss8 != "") {
            return false;
        }

        $("#form1").submit();
    }

</script>

</body>
</html>