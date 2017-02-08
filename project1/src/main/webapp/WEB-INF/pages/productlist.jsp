<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Product Name</th>
					<th>Description</th>
				</tr>
			</thead>
			<c:forEach var="p" items="${productList }">
				<tr>
					<td>${p.description }</td>
					<td>${p.category.categoryDetails }</td>
				</tr>
				<tr>
				<c:url var="url" value="/all/product/viewproduct/${p.id}"></c:url>
				<td><a href="${url}"><span class="glyphicon glyphicon-info-sign"></span></a></td>
				</tr>
			</c:forEach>
			</table>


	</div>
</body>
</html>