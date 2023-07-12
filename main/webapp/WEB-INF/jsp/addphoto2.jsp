<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<%@include file="common.jsp"%>
		<base href="${bp}/static/">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Preskool - Department</title>
		
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
			<%@include file="left1.jsp"%>
			<!-- /Sidebar -->
			
			<!-- Page Wrapper -->
            <div class="page-wrapper">
                <div class="content container-fluid">
				
					<!-- Page Header -->
					<div class="page-header">
						<div class="row align-items-center">
							<div class="col">
								<h3 class="page-title">添加课程</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a onclick="window.history.back(-1)">返回</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /Page Header -->
				
					<div class="row">
						<div class="col-sm-12">
						
							<div class="card">
								<div class="card-body">
									<form  method="post" action="${bp}/insertphoto.action" enctype="multipart/form-data">
										<div class="row">
											<div class="col-12 col-sm-6">  
												<div class="form-group">
													<label>课程名称：</label>
													<input type="text" class="form-control" name="photoname" placeholder="请输入课程名称" required="required">
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>课程类型：</label>
													<select class="form-control" name="phototype">
														<option value="计算机">计算机</option>
														<option value="美术">美术</option>
														<option value="音乐">音乐</option>
														<option value="汉语言文学">汉语言文学</option>
														<option value="医药">医药</option>
														<option value="机械">机械</option>
													</select>
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>老师姓名：</label>
													<input type="text" class="form-control" name="ptname" value="${currentUser.tName}" readonly="readonly">
													<input type="hidden" name="pip" value="待审核">
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>课程封面：</label>
													<p><input type="file" name="file" class="form-control"></p>
												</div>
											</div>
											<div class="col-12">
												<button type="submit" class="btn btn-primary">提交</button>
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
    </body>
</html>