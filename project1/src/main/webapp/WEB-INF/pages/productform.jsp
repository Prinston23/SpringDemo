<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-wrapper">
<div class="container">
<form:form action="/admin/product/addProduct" commandName="product">

<div class="form-group">
  <label></label>
  <form:input path="" class="form-control"/>
</div>

<div class="form-group">
  <label for="name">NAME</label>
  <form:input path="name" class="form-control"/>
</div>

<div class="form-group">
  <label for="description">DESCRIPTION</label>
  <form:input path="description" class="form-control"/>
</div>

<div class="form-group">
  <label for="price">PRICE</label>
  <form:input path="price" class="form-control"/>
</div>

<div class="form-group">
  <label for="quantity">QUANTITY</label>
  <form:input path="quantity" class="form-control"/>
</div>

<div class="form-group">
  <label for="mfg">Mfg Date</label>
  <form:input path="mfg" class="form-control"/>
</div>

<input type="submit" value="Add Product" class="btn btn-default">

</form:form>
</div>
</div>
</body>
</html>