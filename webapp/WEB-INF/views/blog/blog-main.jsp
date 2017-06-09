<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${map.blogVo.title }</title>
<Link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/jblog.css">
</head>
<body>
	<div id="container">
		<div id="header">

			<h1>${map.blogVo.title }</h1>
			<c:import url="/WEB-INF/views/include/blogMenu.jsp" />
		</div>

		<div id="wrapper">
			<div id="content">
				<div class="blog-content">
					<h4> ${map.postView.title }</h4>
					<p>
						${map.postView.content }
					<p>
				</div>
				<ul class="blog-list">
					<c:forEach items="${map.postList }" var="posting" varStatus="status">
						<li><a href="${pageContext.request.contextPath}/blog/blog-main/${posting.userNo }/${posting.no }/${posting.categoryNo}">${posting.title }</a> <span>${posting.regDate }</span>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>

		<div id="extra">
			<div class="blog-logo">
				<img src="${pageContext.request.contextPath}/${map.blogVo.logoPath}">
			</div>
		</div>

		<div id="navigation">
			<h2>카테고리</h2>
			<ul>
			<c:forEach items="${map.categoryList }" var="category" varStatus="status">
				<li><a href="${pageContext.request.contextPath}/blog/categoryList/${category.userNo}/${category.no}">${category.name }</a></li>
			</c:forEach>
			</ul>
		</div>

		<div id="footer">
			<c:import url="/WEB-INF/views/include/blogFoot.jsp" />
		</div>
	</div>
</body>
</html>