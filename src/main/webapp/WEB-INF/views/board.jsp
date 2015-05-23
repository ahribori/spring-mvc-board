<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board</title>
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
			<thead>
				<tr>
					<th>no</th>
					<th>category</th>
					<th>title</th>
					<th>writer</th>
					<th>good</th>
					<th>bad</th>
					<th>hits</th>
					<th>date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="article" items="${articles}">
					<tr>
						<td>${article.no}</td>
						<td>${article.category}</td>
						<td><a href="article/${article.no}">${article.title}</a></td>
						<td>${article.writer}</td>
						<td>${article.good}</td>
						<td>${article.bad}</td>
						<td>${article.hits}</td>
						<td>${article.regdate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<ul class="pagination pagination">
			<li><a href="${page.beginPage-1}">Prev</a></li>
			<c:if test="${page.currentPageGroup!=1}">
			<li><a href="1">1</a></li>
			<li><a href="#">...</a></li>
			</c:if>
			<c:forEach var="i" begin="${page.beginPage}" end="${page.endPage}">
				<c:choose>
					<c:when test="${i==page.currentPage}">
						<li class="active"><a href="${i}">${i}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${i}">${i}</a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:if test="${page.currentPageGroup!=page.pageGroupCount}">
			<li><a href="#">...</a></li>
			<li><a href="${page.pageCount}">${page.pageCount}</a></li>
			</c:if>
			<li><a href="${page.endPage+1}">Next</a></li>
		</ul>
		<a href="register.jsp">글 쓰 기</a>
	</div>
</body>
</html>