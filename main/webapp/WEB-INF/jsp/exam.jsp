<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<%@include file="common.jsp"%>
		<base href="${bp}/static/">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Preskool - Exam</title>
		
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
								<h3 class="page-title">Exam</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
									<li class="breadcrumb-item active">Exam</li>
								</ul>
							</div>
							<div class="col-auto text-right float-right ml-auto">
								<a href="#" class="btn btn-outline-primary mr-2"><i class="fas fa-download"></i> Download</a>
								<a href="add-exam.html" class="btn btn-primary"><i class="fas fa-plus"></i></a>
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
													<th>Exam Name</th>
													<th>Class</th>
													<th>Subject</th>
													<th>Start Time</th>
													<th>End Time</th>
													<th>Date</th>
													<th class="text-right">Action</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>
														<h2>
															<a>Class Test</a>
														</h2>
													</td>
													<td>10</td>
													<td>English</td>
													<td>10:00 AM</td>
													<td>01:00 PM</td>
													<td>23 Apr 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
												</tr>
												<tr>
													<td>
														<h2>
															<a>Half Yearly</a>
														</h2>
													</td>
													<td>1</td>
													<td>Botony</td>
													<td>10:00 AM</td>
													<td>01:00 PM</td>
													<td>23 Apr 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
												</tr>
												<tr>
													<td>
														<h2>
															<a>Quaterly</a>
														</h2>
													</td>
													<td>9</td>
													<td>Biology</td>
													<td>01:00 PM</td>
													<td>04:00 PM</td>
													<td>26 Nov 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
												</tr>
												<tr>
													<td>
														<h2>
															<a>Class Test</a>
														</h2>
													</td>
													<td>8</td>
													<td>Science</td>
													<td>01:00 PM</td>
													<td>04:00 PM</td>
													<td>18 Sep 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
												</tr>
												<tr>
													<td>
														<h2>
															<a>Quaterly</a>
														</h2>
													</td>
													<td>7</td>
													<td>History</td>
													<td>01:00 PM</td>
													<td>04:00 PM</td>
													<td>23 Jul 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
												</tr>
												<tr>
													<td>
														<h2>
															<a>Class Test</a>
														</h2>
													</td>
													<td>2</td>
													<td>Biology</td>
													<td>10:00 AM</td>
													<td>01:00 PM</td>
													<td>15 Oct 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
												</tr>
												<tr>
													<td>
														<h2>
															<a>Half Yearly</a>
														</h2>
													</td>
													<td>6</td>
													<td>Botony</td>
													<td>10:00 AM</td>
													<td>01:00 PM</td>
													<td>02 Jun 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
												</tr>
												<tr>
													<td>
														<h2>
															<a>Class Test</a>
														</h2>
													</td>
													<td>12</td>
													<td>Mathematics</td>
													<td>10:00 AM</td>
													<td>01:00 PM</td>
													<td>23 Apr 2020</td>
													<td class="text-right">
														<div class="actions">
															<a href="edit-exam.html" class="btn btn-sm bg-success-light mr-2">
																<i class="fas fa-pen"></i>
															</a>
															<a href="#" class="btn btn-sm bg-danger-light">
																<i class="fas fa-trash"></i>
															</a>
														</div>
													</td>
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