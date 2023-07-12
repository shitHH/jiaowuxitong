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
    <body onload="fun()">
		
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
								<h3 class="page-title">添加试题</h3>
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
									<form  method="post" action="${bp}/examcontantinsert.action?exampapername=${exampapername}&id=${_id}" enctype="multipart/form-data">
										<div class="row">
											<div class="col-12 col-sm-6">
												<div class="form-group" >
													<label>题号：</label>
													<select name="num" class="form-control" style="width: 100px">
														<option>I</option>
														<option>II</option>
														<option>III</option>
														<option>IV</option>
														<option>V</option>
													</select>
												</div>
											</div>
											<div class="col-12 col-sm-6">
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>试题：</label>
													<input type="text" class="form-control" style="width: 1200px" name="itemcontant" placeholder="请输入试题" required="required">
												</div>
											</div>
											<div class="col-12 col-sm-6">
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>A答案：</label>
													<input type="hidden" name="a" value="A">
													<input type="text" class="form-control" style="width: 1200px" name="acontant" placeholder="请输入A答案" required="required">
													<label>B答案：</label>
													<input type="hidden" name="b" value="B">
													<input type="text" class="form-control" style="width: 1200px" name="bcontant" placeholder="请输入B答案" required="required">
													<label>C答案：</label>
													<input type="hidden" name="c" value="C">
													<input type="text" class="form-control" style="width: 1200px" name="ccontant" placeholder="请输入C答案" required="required">
													<label>D答案：</label>
													<input type="hidden" name="d" value="D">
													<input type="text" class="form-control" style="width: 1200px" name="dcontant" placeholder="请输入D答案" required="required">
												</div>
											</div>
											<div class="col-12 col-sm-6">
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>标准答案：</label>
													<select class="form-control" style="width: 100px" name="answer">
														<option value="A">A</option>
														<option value="B">B</option>
														<option value="C">C</option>
														<option value="D">D</option>
													</select>
												</div>
											</div>
											<div class="col-12 col-sm-6">
												<div class="form-group">
													<label>题目分数：</label>
													<input type="text" class="form-control" style="width: 100px" name="score" value="20" readonly="readonly">
												</div>
												<div class="form-group">
													总分：100分
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
				${results}
				<div class="col-sm-12" align="center"><h3>${exampapername}</h3></div>
				<div class="card card-table">
						<div class="table-responsive" style="margin: 20px">
							<table class="table table-hover table-center mb-0 datatable">
								<tbody>
								<div class="test_content_nr">
									<ul>
										<c:forEach items="${examcontantlist}" var="elist">
										<li id="qu_0_0">
											<div class="test_content_nr_tt">
												<span>${elist.num}.</span>&nbsp;<span>(${elist.score}分)</span><font>${elist.itemcontant}(  )</font>
											</div>
<%--											<div>--%>
<%--												<a href="${bp}/deleteppt.action?pptid=${plist.pptid}&photoid=${photoid}" class="btn btn-sm bg-danger-light">--%>
<%--													<i class="fas fa-trash"></i>--%>
<%--												</a>--%>
<%--											</div>--%>
											<div class="test_content_nr_main">
												<ul>
													<li class="option">
														<input type="radio" class="radioOrCheck" name="answer1" id="0_answer_1_option_1"/>
														<label for="0_answer_1_option_1">
															${elist.a}
															<p class="ue" style="display: inline;">${elist.acontant}</p>
														</label>
													</li>

													<li class="option">
														<input type="radio" class="radioOrCheck" name="answer1" id="0_answer_1_option_2"/>
														<label for="0_answer_1_option_2">
															${elist.b}
															<p class="ue" style="display: inline;">${elist.bcontant}</p>
														</label>
													</li>

													<li class="option">
														<input type="radio" class="radioOrCheck" name="answer1" id="0_answer_1_option_3"/>
														<label for="0_answer_1_option_3">
															${elist.c}
															<p class="ue" style="display: inline;">${elist.ccontant}</p>
														</label>
													</li>

													<li class="option">
														<input type="radio" class="radioOrCheck" name="answer1" id="0_answer_1_option_4"/>
														<label for="0_answer_1_option_4">
															${elist.d}
															<p class="ue" style="display: inline;">${elist.dcontant}</p>
														</label>
													</li>
												</ul>
											</div>
										</li>
										</c:forEach>
												</ul>
											</div>
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