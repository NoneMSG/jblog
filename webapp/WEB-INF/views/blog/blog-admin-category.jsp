<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JBlog</title>
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jblog.css">
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery/jquery-1.9.0.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">

var isEnd = false;

var render =function(vo,mode){
	var html=
		"<tr id='sno' data-no='"+vo.categoryNo+"'>"+
		"<td>"+vo.categoryNo+"</td>"+
		"<td>"+vo.categoryName+"</td>"+
		"<td>"+vo.postCount+"</td>"+
		"<td>"+vo.categoryDisc+"</td>"+
		"<td>Delete</td>"+
		"</tr>"	;
		
		if(mode === true){
			$("#list-category").prepend(html);
		}else{
			$("#list-category").after(html);
		}
		
}

var fetchList = function(){
	if(isEnd===true){
		return;
	}
	var startNo = $("#sno").data("no") || 0;
	
	$.ajax({
		url:"${pageContext.request.contextPath}/blog/api/blog-admin-category?sno="+startNo,
		type:"get",
		dataType:"json",
		data:"",
		success:function(response){
			if(response.result==="fail"){
				console.error(response.message);
				return;
			}
			
			//detect
			if(response.data.length < 5){
				isEnd=true;
				$("#next-btn").prop("disabled",true);
				$("#next-btn").hide();
			}
			
			//rendering
			$.each(response.data, function(index, vo){
				render(vo, false);
			});
		},
		error:function(jqXHR,status,e){
			console.log(status+":"+e);
		}
	});
}

$(function(){
	$("#next-btn").click(function(){
		fetchList();
	});
	//기본렌더링
	fetchList();
});

</script>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1>Spring 이야기</h1>
			<c:import url="/WEB-INF/views/include/blogMenu.jsp" />
		</div>
		<div id="wrapper">
			<div id="content" class="full-screen">
				<ul class="admin-menu">
					<c:import url="/WEB-INF/views/include/adminMenu.jsp" />
				</ul>
				<button id="next-btn">next</button>
		      	<table class="admin-cat">
		      		<tr id="list-category">
		      			<th>번호</th>
		      			<th>카테고리명</th>
		      			<th>포스트 수</th>
		      			<th>설명</th>
		      			<th>삭제</th>      			
		      		</tr>
		      			  
				</table>
      	
      			<h4 class="n-c">새로운 카테고리 추가</h4>
      			<form action="${pageContext.request.contextPath}/blog/blog-admin-category" method="post">
			      	<table id="admin-cat-add">
			      		<tr>
			      			<td class="t">카테고리명</td>
			      			<td><input type="text" name="categoryName"></td>
			      		</tr>
			      		<tr>
			      			<td class="t">설명</td>
			      			<td><input type="text" name="categoryDisc"></td>
			      		</tr>
			      		<tr>
			      			<td class="s">&nbsp;</td>
			      			<td><input type="submit" value="카테고리 추가"></td>
			      		</tr>      		      		
			      	</table> 
		      	</form>
			</div>
		</div>
		<div id="footer">
			<c:import url="/WEB-INF/views/include/blogFoot.jsp" />
		</div>
	</div>
</body>
</html>