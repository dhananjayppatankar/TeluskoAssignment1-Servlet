<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form id="index.jsp">	
	<h1> Add 2 numbers</h1>
	Enter 1 number : <input type="text" id="num1" name="num1">
	Enter 1 number : <input type="text" id="num1" name="num2">
	<input type="submit" value = "Add" name="add">
	</form>
	
	<% 
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		
		int result = a+b;
		out.print(result);
	
	%>
	<%=
			result	
	%>
	

</body>
</html>