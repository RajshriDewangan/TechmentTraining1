<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
int a=10;

int add(int a,int b)
{
	return a+b;
}
%>

<%
String username= request.getParameter("u");
String password= request.getParameter("p");

out.println("username="+username+ "<br>");
out.println("password="+password+ "<br>");

out.println("value of a="+a +"<br>");
out.println(add(2,4) + "<br>");
%>

<%= a %>
<%= add(4,5) %>

</body>
</html>