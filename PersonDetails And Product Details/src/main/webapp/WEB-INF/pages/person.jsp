<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addPerson" commandName="person" method="POST">
Name :<form:input type="text" path="name"></form:input>
Email:<form:input type="text" path="email"></form:input>
Phone Number:<form:input type="text" path="phoneNumber"></form:input>
<input type="submit" value="Submit" />
</form:form>

</body>
</html>