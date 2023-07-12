<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<%@include file="common.jsp"%>
		<base href="${bp}/static/">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Preskool - Students</title>
		
		<!-- Favicon -->
        <link rel="shortcut icon" href="assets/img/favicon.png">
	
		<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&display=swap">
		
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
			<%@include file="header.jsp"%>
			<!-- /Header -->
			
			<!-- Sidebar -->
			<%@include file="left.jsp"%>
			<!-- /Sidebar -->
			
			<!-- Page Wrapper -->
            <div class="page-wrapper">
                <div class="content container-fluid">
				
					<!-- Page Header -->
					<div class="page-header">
						<div class="row align-items-center">
							<div class="col">
								<h3 class="page-title">Edit Admins</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a href="students.jsp">Admins</a></li>
									<li class="breadcrumb-item active">Edit Admins</li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /Page Header -->
				
					<div class="row">
						<div class="col-sm-12">
						
							<div class="card">
								<div class="card-body">
									<form id="form1" action="/edu/edit-admin.action" method="post" enctype="multipart/form-data">
										<input type="hidden" name="adminId" id="adminId" value="${admin.adminId}">
										<div class="row">
											<div class="col-12">
												<h5 class="form-title"><span>管理员信息</span></h5>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>${admin.adminName}</label>
													<input type="text" class="form-control" name="adminName" id="adminName" value="${admin.adminName}">
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label id="mess" class="warning">管理员电话</label>
													<input type="tel" class="form-control" name="adminTel" id="adminTel" value="${admin.adminTel}">
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label >管理员密码</label>
													<input type="password" class="form-control" name="aPass" id="aPass" value="${admin.aPass}">
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>管理员头像</label>
													<div>
														<input type="file" name="file" id="file" class="form-control" value="${admin.adminHead}" onchange="photo()">
														<span id="s1" style="color: red"></span>
													</div>
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
		function photo(){
			var photo = $("#file").val().trim();
			if (photo==""){
				$("#s1").html("头像不能为空");
				return false;
			}else {
				$("#s1").html("");
			}
		}

		function myfun(){

			photo();

			var s1 = $("#s1").html();
			if (s1!=""){
				return false;
			}

			$("#form1").submit();
		}

	</script>
    </body>
</html>