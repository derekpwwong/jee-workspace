
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="randomNumberGenerate.RandomNumberGenerator"%>
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
	<%! private int x=0; %>
	<h2>x:<%= ++x %></h2>
	<div><h1>Random Number: JSP Expressions</h1></div>
	<div><%= RandomNumberGenerator.returnRandomNumber(100) %></div>
	<div><%= RandomNumberGenerator.returnRandomNumber(100) %></div>
	<div><%= RandomNumberGenerator.returnRandomNumber(100) %></div>
	<div><%= RandomNumberGenerator.returnRandomNumber(100) %></div>
	<div><%= RandomNumberGenerator.returnRandomNumber(100) %></div>
	
	<% for(int i=0;i<10;i++)%>
	<%{%>
	<div>a<%= RandomNumberGenerator.returnRandomNumber(100) %></div>
	<%}%>
	
	<div><h1>Random Number: JSP Scriplets V1</h1></div>
	<ul>
	<%
	int numEntries = RandomNumberGenerator.returnRandomNumber(100);
	for(int b = 0; b< numEntries;b++){
		out.println("<li>"+RandomNumberGenerator.returnRandomNumber(100)+"</li>");
	}
	%>
	</ul>
	
	<div><h1>Random Number: JSP Scriplets V2</h1></div>
	<ul>
	<%
	int numEntriesAgain = RandomNumberGenerator.returnRandomNumber(100);
	for(int b = 0; b< numEntriesAgain;b++){%><%
		out.println("<li>"+RandomNumberGenerator.returnRandomNumber(100)+"</li>");
	}
	%>
	</ul>
	
	<div><h1>Random Number: JSP Declarations V1</h1></div>
	<%! private int randNum = RandomNumberGenerator.returnRandomNumber(100); %>
	<div>Private Randomn NUmber<%=randNum %></div>
	<a href="index.html">GO back home</a>
</body>
</html>