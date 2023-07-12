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
								<h3 class="page-title">Admins</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
									<li class="breadcrumb-item active">Admins</li>
								</ul>
							</div>
							<div class="col-auto text-right float-right ml-auto">
								<a href="#" class="btn btn-outline-primary mr-2"><i class="fas fa-download"></i> Download</a>
								<a href="addstudent.jsp" class="btn btn-primary"><i class="fas fa-plus"></i></a>
							</div>
						</div>
					</div>
					<!-- /Page Header -->

					<div class="row">
						<div class="col-sm-12">

							<div class="card card-table">
								<div class="card-body">
									<div class="table-responsive">
										<table class="table table-hover table-center mb-0 datatable">
											<thead>
												<tr>
													<th>管理员编号</th>
													<th>管理员姓名</th>
													<th>管理员电话</th>
													<th>管理员状态</th>
<%--													<th>角色编号</th>--%>
													<th class="text-right">Action</th>
												</tr>
											</thead>
											<tbody>
											<c:forEach var="admin" items="${admin}">
												<tr>
													<td>${admin.adminId}</td>
													<td>
														<h2 class="table-avatar">
															<a href="admin-details.jsp" class="avatar avatar-sm mr-2"><img class="avatar-img rounded-circle" src="${bp}/img/${admin.adminHead}" alt="User Image"></a>
															<a href="admin-details.jsp">${admin.adminName}</a>
														</h2>
													</td>
													<td><a href="/edu/admin.action?adminId = ${adminId}">${admin.adminTel}</a></td>
													<td>
														<c:if test="${admin.state==1}">
															<button class="btn btn-primary"
																	onclick="window.location.href='/edu/updateadminatate.action?adminId=${admin.adminId}&state=2'">
																<a style="color: #e63333">离职</a>
															</button>
														</c:if>
														<c:if test="${admin.state==2}">
															<button class="btn btn-sm bg-success-light mr-2"
																	onclick="window.location.href='/edu/updateadminatate.action?adminId=${admin.adminId}&state=1'">
																<a style="color: white">在职</a>
															</button>
														</c:if>
													</td>
<%--													<td><a href="/edu/admin.action?adminId = ${adminId}">${admin.roleId}</a></td>--%>
													<td class="text-right">
														<div class="actions">
															<a href="/edu/toeditadmin.action?adminId=${admin.adminId}" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
														</div>
													</td>
												</tr>
											</c:forEach>

											</tbody>
										</table>
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