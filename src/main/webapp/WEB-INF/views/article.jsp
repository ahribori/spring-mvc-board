<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>article</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="col-md-2"></div>
	<div align="center" class="col-md-8">
		<table class="table">
			<tr>
				<td>no</td>
				<td>${article.no}</td>
			</tr>
			<tr>
				<td>date</td>
				<td>${article.regdate}</td>
			</tr>
			<tr>
				<td>category</td>
				<td>${article.category}</td>
			</tr>
			<tr>
				<td>writer</td>
				<td>${article.writer}</td>
			</tr>
			<tr>
				<td>title</td>
				<td>${article.title}</td>
			</tr>
			<tr>
				<td>contents</td>
				<td>${article.contents}</td>
			</tr>
			<tr>
				<td>good</td>
				<td>${article.good}</td>
			</tr>
			<tr>
				<td>bad</td>
				<td>${article.bad}</td>
			</tr>
			<tr>
				<td>hits</td>
				<td>${article.hits}</td>
			</tr>
		</table>
	</div>
</body>
</html>