<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<%@include file="common.jsp"%>
		<base href="${bp}/static/">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Preskool - Form Input Groups</title>
		
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
						<div class="row">
							<div class="col">
								<h3 class="page-title">Input Groups</h3>
								<ul class="breadcrumb">
									<li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
									<li class="breadcrumb-item active">Input Groups</li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /Page Header -->
					
					<div class="row">
						<div class="col-lg-12">
							<div class="card">
								<div class="card-header">
									<h5 class="card-title">Basic Examples</h5>
								</div>
								<div class="card-body">
									<form action="#">
										<div class="form-group row">
											<label class="col-form-label col-lg-2">Group Left</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text" id="basic-addon1">@</span>
													</div>
													<input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
												</div>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-form-label col-lg-2">Group Right</label>
											<div class="col-lg-10">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="Recipient's username" aria-label="Recipient's username" aria-describedby="basic-addon2">
													<div class="input-group-append">
														<span class="input-group-text" id="basic-addon2">@example.com</span>
													</div>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-form-label col-lg-2">URL Example</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text">https://</span>
													</div>
													<input type="text" class="form-control">
												</div>
											</div>
										</div>

										<div class="form-group row">
											<label class="col-form-label col-lg-2">Group with Price</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text">$</span>
													</div>
													<input type="text" class="form-control">
													<div class="input-group-append">
														<span class="input-group-text">.00</span>
													</div>
												</div>
											</div>
										</div>

										<div class="form-group row mb-0">
											<label class="col-form-label col-lg-2">Group with Price (Left)</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text">$</span>
													</div>
													<div class="input-group-prepend">
														<span class="input-group-text">0.00</span>
													</div>
													<input type="text" class="form-control">
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
							<div class="card">
								<div class="card-header">
									<h5 class="card-title">Sizing</h5>
								</div>
								<div class="card-body">
									<form action="#">
										<div class="form-group row">
											<label class="col-form-label col-lg-2">Input Group Large</label>
											<div class="col-lg-10">
												<div class="input-group input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" id="sizing-addon1">@</span>
													</div>
													<input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon1">
												</div>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-form-label col-lg-2">Input Group Default</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text" id="sizing-addon2">@</span>
													</div>
													<input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon2">
												</div>
											</div>
										</div>
										<div class="form-group row mb-0">
											<label class="col-form-label col-lg-2">Input Group Small</label>
											<div class="col-lg-10">
												<div class="input-group input-group-sm">
													<div class="input-group-prepend">
														<span class="input-group-text" id="sizing-addon3">@</span>
													</div>
													<input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon3">
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
							<div class="card">
								<div class="card-header">
									<h5 class="card-title">Checkbox and Radio Addons</h5>
								</div>
								<div class="card-body">
									<form action="#">
										<div class="form-group row">
											<label class="col-form-label col-lg-2">Checkbox</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text">
															<input type="checkbox">
														</span>
													</div>
													<input type="text" class="form-control">
												</div>
											</div>
										</div>
										<div class="form-group row mb-0">
											<label class="col-form-label col-lg-2">Radio</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text">
															<input type="radio">
														</span>
													</div>
													<input type="text" class="form-control">
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
							<div class="card">
								<div class="card-header">
									<h5 class="card-title">Multiple Addons</h5>
								</div>
								<div class="card-body">
									<form action="#">
										<div class="form-group row">
											<label class="col-form-label col-lg-2">Radio and Text Addons</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text">
															<input type="checkbox">
														</span>
													</div>
													<div class="input-group-prepend">
														<span class="input-group-text">$</span>
													</div>
													<input type="text" class="form-control">
												</div>
											</div>
										</div>
										<div class="form-group row mb-0">
											<label class="col-form-label col-lg-2">Two Addons</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<span class="input-group-text">$</span>
													</div>
													<div class="input-group-prepend">
														<span class="input-group-text">0.00</span>
													</div>
													<input type="text" class="form-control">
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
							<div class="card">
								<div class="card-header">
									<h5 class="card-title">Buttons with dropdowns</h5>
								</div>
								<div class="card-body">
									<form action="#">
										<div class="form-group row">
											<label class="col-form-label col-lg-2">Radio and Text Addons</label>
											<div class="col-lg-10">
												<div class="input-group">
													<div class="input-group-prepend">
														<button type="button" class="btn btn-white dropdown-toggle" data-toggle="dropdown">Action</button>
														<div class="dropdown-menu">
															<a class="dropdown-item" href="#">Action</a>
															<a class="dropdown-item" href="#">Another action</a>
															<a class="dropdown-item" href="#">Something else here</a>
															<div role="separator" class="dropdown-divider"></div>
															<a class="dropdown-item" href="#">Separated link</a>
														</div>
													</div>
													<input type="text" class="form-control" placeholder="Left dropdown">
												</div>
											</div>
										</div>

										<div class="form-group row mb-0">
											<label class="col-form-label col-lg-2">Two Addons</label>
											<div class="col-lg-10">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="Right dropdown">
													<div class="input-group-append">
														<button type="button" class="btn btn-white dropdown-toggle" data-toggle="dropdown">Action</button>
														<div class="dropdown-menu dropdown-menu-right">
															<a class="dropdown-item" href="#">Action</a>
															<a class="dropdown-item" href="#">Another action</a>
															<a class="dropdown-item" href="#">Something else here</a>
															<div role="separator" class="dropdown-divider"></div>
															<a class="dropdown-item" href="#">Separated link</a>
														</div>
													</div>
												</div>
											</div>
										</div>
									</form>
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
		
		<!-- Custom JS -->
		<script  src="assets/js/script.js"></script>
		
    </body>
</html>