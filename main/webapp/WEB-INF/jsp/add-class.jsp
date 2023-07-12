<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<%@include file="common.jsp"%>
		<base href="${bp}/static/">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Preskool - Subject</title>
		
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
								<h3 class="page-title">添加班级</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a href="subjects.jsp">班级</a></li>
									<li class="breadcrumb-item active">添加班级</li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /Page Header -->
				
					<div class="row">
						<div class="col-sm-12">
						
							<div class="card">
								<div class="card-body">
									<form action="${bp}/addclass" method="post">
										<div class="row">
											<div class="col-12">
												<h5 class="form-title"><span>班级详情</span></h5>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>班级名称</label>
													<input type="text" class="form-control" name="className">
												</div>
											</div>
											<div class="col-12 col-sm-6">  
												<div class="form-group">
													<label>专业</label>
													<select class="form-control" name="mId">
														<c:forEach var="major" items="${list}">
															<option value="${major.mId}">${major.mName}</option>
														</c:forEach>
													</select>
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>年级</label><select class="form-control" name="gId">
														<c:forEach var="grade" items="${grades}">
															<option value="${grade.gid}">${grade.gname}</option>
														</c:forEach>
													</select>
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>状态</label>
													<input type="text" class="form-control" name="cState">
												</div>
											</div>
											<div class="col-12">
												<button type="submit" class="btn btn-primary">Submit</button>
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