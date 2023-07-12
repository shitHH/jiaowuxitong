<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<%@include file="common.jsp"%>
		<base href="${bp}/static/">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Preskool - Departments</title>
		
		<!-- Favicon -->
        <link rel="shortcut icon" href="assets/img/favicon.png">
	
		<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&display=swap">
		
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
								<h3 class="page-title">学位申请</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a href="index.jsp">学位申请</a></li>
									<li class="breadcrumb-item active">学位申请</li>
								</ul>
							</div>
							<div class="col-auto text-right float-right ml-auto">
								<a href="#" class="btn btn-outline-primary mr-2"><i class="fas fa-download"></i> Download</a>
								<a href="add-department.jsp" class="btn btn-primary"><i class="fas fa-plus"></i></a>
							</div>
						</div>
					</div>
					<!-- /Page Header -->
				<h1>${i}</h1>
					<div class="row">
						<div class="col-sm-12">
						
							<div class="card card-table">
								<div class="card-body">
									<div class="table-responsive">
										<form action="${bp}/shenqing" method="post">
										<table class="table table-hover table-center mb-0 datatable">
											<thead>
												<tr>
													<th>学位名称</th>
													<th class="text-right">编辑</th>
												</tr>
											</thead>
											<tbody>
											<c:forEach var="shenqing" items="${list}">
												<tr>
													<input name="sid" value="${currentUser.sId}" type="hidden">
													<td><input name="degreeid" value="${shenqing.degreeid}"
															   type="hidden">${shenqing.degreeName}</td>
													<c:if test="${i==4}">
													<td class="text-right">
														<c:if test="${degreeappluVO ==null}">
														<div class="actions">
															<input type="submit" value="申请">
														</div>
														</c:if>
														<c:if test="${degreeappluVO != null}">
															<p>${shenqing.dtype}</p>
														</c:if>
													</td>
													</c:if>
													<c:if test="${i!=4}">
													<td class="text-right">
														<p>未到申请时间</p>
													</td>
													</c:if>
												</tr>
											</c:forEach>
											</tbody>
										</table>
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
		
		<!-- Datatables JS -->
		<script src="assets/plugins/datatables/datatables.min.js"></script>
		
		<!-- Custom JS -->
		<script src="assets/js/script.js"></script>
    </body>
</html>