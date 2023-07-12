<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<%@include file="common.jsp"%>
		<base href="${bp}/static/">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Preskool - Holiday</title>
		
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
								<h3 class="page-title">Holiday</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
									<li class="breadcrumb-item active">Holiday</li>
								</ul>
							</div>
							<div class="col-auto text-right float-right ml-auto">
								<a href="#" class="btn btn-outline-primary mr-2"><i class="fas fa-download"></i> Download</a>
								<a href="add-holiday.html" class="btn btn-primary"><i class="fas fa-plus"></i></a>
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
													<th>ID</th>
													<th>Holiday Name</th>
													<th>Type</th>
													<th>Start Date</th>
													<th>End Date</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>PRE2209</td>
													<td>
														<h2>
															<a>Sports Day</a>
														</h2>
													</td>
													<td>College Holiday</td>													
													<td>17 Aug 2020</td>
													<td>19 Aug 2020</td>
												</tr>
												<tr>
													<td>PRE2213</td>
													<td>
														<h2>
															<a>Memorial Day</a>
														</h2>
													</td>
													<td>Public Holiday</td>													
													<td>05 Aug 2020</td>
													<td>06 Aug 2020</td>
												</tr>
												<tr>
													<td>PRE2143</td>
													<td>
														<h2>
															<a>Annual Day</a>
														</h2>
													</td>
													<td>College Holiday</td>														
													<td>04 Sept 2020</td>
													<td>07 Sept 2020</td>
												</tr>
												<tr>
													<td>PRE2431</td>
													<td>
														<h2>
															<a>Exam Holiday</a>
														</h2>
													</td>
													<td>Semester leave</td>													
													<td>17 Sept 2020</td>
													<td>30 Sept 2020</td>
												</tr>
												<tr>
													<td>PRE2209</td>
													<td>
														<h2>
															<a>Sports Day</a>
														</h2>
													</td>
													<td>College Holiday</td>													
													<td>17 Aug 2020</td>
													<td>19 Aug 2020</td>
												</tr>
												<tr>
													<td>PRE2213</td>
													<td>
														<h2>
															<a>Memorial Day</a>
														</h2>
													</td>
													<td>Public Holiday</td>													
													<td>05 Aug 2020</td>
													<td>06 Aug 2020</td>
												</tr>
												<tr>
													<td>PRE2143</td>
													<td>
														<h2>
															<a>Annual Day</a>
														</h2>
													</td>
													<td>College Holiday</td>														
													<td>04 Sept 2020</td>
													<td>07 Sept 2020</td>
												</tr>
												<tr>
													<td>PRE2431</td>
													<td>
														<h2>
															<a>Exam Holiday</a>
														</h2>
													</td>
													<td>Semester leave</td>													
													<td>17 Sept 2020</td>
													<td>30 Sept 2020</td>
												</tr>
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