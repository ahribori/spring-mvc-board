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
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
<table>
	<tr>
		<td>category : </td>
		<td><input type="text" name="category"></td>
	</tr>
	<tr>
		<td>writer : </td>
		<td><input type="text" name="writer"></td>
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
<input type="submit" value="등록"><br>
</form>
</body>
</html>