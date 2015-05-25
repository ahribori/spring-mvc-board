<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="resources/bootstrap/bootstrap-simplex.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<!-- JQuery -->
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.js"></script>

<!-- Script -->
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<div class="col-md-4"></div>
	<div class="col-md-4" align="center">
		<form action="login">
			<input type="hidden" name="path" value="${path}">
			<div class="form-group">
				<label for="exampleInputId">ID</label> <input type="text"
					class="form-control" id="id"
					placeholder="아이디를 입력하세요" name="id">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input type="password"
					class="form-control" id="exampleInputPassword1" placeholder="암호를 입력하세요" name="password">
			</div>
			<button type="submit" class="btn btn-default">로그인</button>
		</form>
	</div>
</body>
</html>