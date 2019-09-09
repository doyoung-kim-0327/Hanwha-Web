<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert post</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Resume - Start Bootstrap Theme</title>

<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link
	href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i"
	rel="stylesheet">
<link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/resume.min.css" rel="stylesheet">
<script src="https://cdn.ckeditor.com/ckeditor5/12.4.0/classic/ckeditor.js"></script>

<style type="text/css">
.head-div {
	padding-bottom: 10px;
}

.heading {
	padding-top: 30px;
	padding-bottom: 30px;
}

.word-box {
	width: 80% !important;
}

.edit-btn{
	float: right;
}

.btn {
	background-color: rgb(189, 93, 56) !important;
	border-color: rgb(189, 93, 56) !important;
}

</style>

</head>
<body>
  <%@include file="navbar.jsp" %>
	
	<div class="container-fluid p-0">

		<section class="resume-section p-3 p-lg-5 d-flex justify-content-center" id="experience">
			<div class="word-box">

			<div class="heading">
				<h3>게시물 작성</h3>
			</div>
			
			<form action="insertpost" method="post">
				<div class="mb-3">
					<label for="title">제목</label>
					<input type="text" class="form-control" name="ptitle" id="ptitle">
				</div>
				<div class="mb-3" style="height:500px;">
					<span>
						<label for="content">내용</label>
					</span>
					<span>
						<textarea class="form-control pcontent" rows="10" name="pcontent" id="pcontent"></textarea>
					</span>				
					<span>
						<input type="hidden" name="poster" value="${mem.mname }">
					</span>				
					
					
				</div>
				<div class="edit-btn">
					<input type="submit" value="확인"  class="btn btn-info">
					<a href="mypage" class="btn btn-info" role="button">목록</a>
				</div>
				
			</form>
					
				
			</div>
		</section>
	</div>

	<hr class="m-0">
<script src="${pageContext.request.contextPath}/resources/js/ckeditor.js"></script>

</body>
</html>