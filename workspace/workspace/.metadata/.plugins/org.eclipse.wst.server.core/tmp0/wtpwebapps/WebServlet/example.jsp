<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP Page</title>
<%
	String bgColor = request.getParameter("bgColor");
	if((bgColor== null) || (bgColor.trim().equals("")))
		{
		bgColor="Green";
		}
%>
</head>
<body style="background-color:<%=bgColor%>">
	<h1><% out.println("First JSP Page"); %></h1>
	<h2><% out.println(new java.util.Date()); %></h2>
	<h2>This is a random number<% Math.random(); %></h2>
	<ul>
		<li>Color:<%= request.getParameter("color") %></li>
		<li>Size:<%= request.getParameter("size") %></li>
		<li>Weight:<%= request.getParameter("weight") %></li>
	</ul>
	
	<a href="index.html">GO back home</a>
</body>
</html>