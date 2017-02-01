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

<form:form action="" commandName="product">

<div class="form-group">
  <label></label>
  <form:input path="" class="form-control"/>
</div>

<div class="form-group">
  <label>NAME</label>
  <form:input path="name" class="form-control"/>
</div>

<div class="form-group">
  <label>DESCRIPTION</label>
  <form:input path="description" class="form-control"/>
</div>

<div class="form-group">
  <label>PRICE</label>
  <form:input path="price" class="form-control"/>
</div>

<div class="form-group">
  <label>QUANTITY</label>
  <form:input path="quantity" class="form-control"/>
</div>

<div class="form-group">
  <label>Mfg Date</label>
  <form:input path="mfg" class="form-control"/>
</div>

<input type="submit" value="Add Product" class="btn btn-default">

</form:form>


</body>
</html>