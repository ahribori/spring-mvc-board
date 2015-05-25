<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<table border="1" cellpadding="5">
	<thead>
		<tr>
			<th>순위</th>
			<th>검색어</th>
			<th>COUNT</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="report" items="${reports}">
		<tr>
			<td>${report.rank}</td>
			<td>${report.word}</td>
			<td>${report.count}</td>
		</tr>		
	</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>