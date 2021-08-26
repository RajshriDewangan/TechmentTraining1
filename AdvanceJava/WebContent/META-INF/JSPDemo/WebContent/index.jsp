<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: olive;">

<h1>this is my first jsp servlet</h1>
<h2>JSP</h2>

<%

int  a=10;
int b=20;
int c= a+b;
out.print("result="+c);

%>

<form action="login.jsp">
<input type="text" name="u">
<input type="text" name="p">
<button type="submit">Login</button>


</form>
</body>
</html>