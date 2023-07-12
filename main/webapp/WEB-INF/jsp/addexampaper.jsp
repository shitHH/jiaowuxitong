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
								<h3 class="page-title">创建试卷</h3>
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
									<form  method="post" action="${bp}/exampaperinsert.action?photoid=${photoid}" enctype="multipart/form-data" id="from1">
										<div class="row">
											<div class="col-12 col-sm-6">  
												<div class="form-group">
													<label>试卷名称：</label>
													<input type="text" class="form-control" name="exampapername" placeholder="请输入试卷名称" required="required">
													<input type="hidden" name="photoid" value="${photoid}">
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>创建人：</label>
													<input type="text" class="form-control" name="tname" value="${currentUser.tName}" readonly="readonly">
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>结束时间：(单位：秒)</label>
													<input type="number" id="endtime" style="width: 100px" class="form-control" name="endtime"  required="required">
													<input type="hidden" name="exampapertype" value="考试中">
												</div>
											</div>

											<div class="col-12">
												<input type="button" onclick="fun3()" class="btn btn-primary" value="提交">
											</div>
										</div>
									</form>
									<script>
										function fun3(){
											var endtime=$("#endtime").val();
											if (endtime<=0||endtime>8000){
												alert("时间设置不合理");
											}else {
												$("#from1").submit();
											}
										}
									</script>
								</div>
							</div>
						</div>					
					</div>					
				</div>
				<div class="card card-table">
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-hover table-center mb-0 datatable">
								<thead>
								<tr>
									<th>考试纪录</th>
									<th>创建人</th>
									<th>创建时间</th>
									<th>结束时间</th>
									<th>状态</th>
									<th class="text-right">操作</th>
								</tr>
								</thead>
								<tbody>
								<c:forEach items="${exampaperlist}" var="exlist">
									<tr>
										<td><a href="${bp}/toaddcontant?exampapername=${exlist.exampapername}&id=${exlist._id}">${exlist.exampapername}</a></td>
										<td style="color: #d2d7e0">${exlist.tname}</td>
										<td><fmt:formatDate value="${exlist.starttime}" pattern="yyyy/MM/dd HH:mm:ss"></fmt:formatDate></td>
										<td>${exlist.endtime}</td>
										<td>${exlist.exampapertype}</td>
										<td class="text-right">
											<div class="actions">
												<a href="${bp}/toaddcontant?exampapername=${exlist.exampapername}&id=${exlist._id}" class="btn btn-sm bg-success-light mr-2">
													<i class="fas fa-pen"></i>
												</a>
												<a href="${bp}/deletepaper.action?photoid=${photoid}&_id=${exlist._id}" class="btn btn-sm bg-danger-light">
													<i class="fas fa-trash"></i>
												</a>
												<span style="color: red">${mess1}</span>
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