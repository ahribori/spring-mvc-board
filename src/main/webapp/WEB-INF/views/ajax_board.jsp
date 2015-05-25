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
		
		$(window).scroll(function(){ 
		   if($(window).scrollTop() == $(document).height() - $(window).height()){ 
		      $("#loding").html("<img src='resources/loading.gif' alt='loading'>");
		      setTimeout(function(e){
		      $("#loding img").remove();
		      },500)
		   	
		      
		     
		   } 
		});
		/* 
		ajaxRequest();
		var currentPageSize = 2;
		alert(currentPageSize);
		function ajaxRequest() {
			$.ajax({
				type:'post',
				url:'board.json',
				data:'currentPage='+currentPageSize,
				dataType:'json',
				success:function(data){
					alert(data);
				},
				
				error:function(request,status,error){
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
				},
				
				timeout:5000
			})
		} */
	});
</script>
</head>
<body>
<div class="col-md-2"></div>
<div align="center" class="col-md-8">
	<table class="table">
		<thead>
			<tr>
				<th>#</th>
				<th>category</th>
				<th>title</th>
				<th>writer</th>
				<th>좋아요</th>
				<th>싫어요</th>
				<th>hits</th>
				<th>date</th>
			</tr>
		</thead>
		<tbody id="ajaxView">
		</tbody>
	</table>
</div>
</body>
</html>