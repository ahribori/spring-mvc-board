<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		$('#category').change(function(){
			var selected = $(this).val();
			if(selected=='') {
				alert('category를 선택해 주세요');
			}
		})
		
		$('#registerForm').submit(function(){
			if('')
			return false;
		});
	});
</script>

<title>Insert title here</title>
<script type="text/javascript">
	document.find
</script>
</head>
<body>
<div align="center">
<form id='registerForm' action="register" method="post">
<table>
	<tr>
		<td>category : </td>
		<td>
			<select id="category" name="category">
				<option value="">------</option>
				<option value="test">test</option>
				<option value="notice">notice</option>
				<option value="free">free</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>writer : </td>
		<td>${auth_info.name}(${auth_info.id})<input type="hidden" name="writer" value="${auth_info.id}"></td>
	</tr>
	<tr>
		<td>title : </td>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<td>contents : </td>
		<td><textarea rows="20" cols="20" name="contents"></textarea></td>
	</tr>
</table>
<br>
<input type="submit" value="등록" class="btn btn-info"><br>
</form>
</div>
</body>
</html>