<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lecture 2: JSP FILE</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1 class="title">Lecture 2</h1>
<h2>Based on the date and time on the server <%= new java.util.Date()%> 
, we are on track with our Curriculum Schedule
</h2>
<br>

<h3>Servlets are:</h3>
<ul>
	<li>
		<h3>Persistent since they are loaded once by the web server and
		 can therefore maintain services between requests(e.g. database
		 connection)</h3>
	</li>
	<li>
		<h3>Fast because the initialization code is done only once and
		not with every request. Also loaded only once.</h3>
	</li>
	<li>
		<h3>Platform independent because they are written in 
		Java</h3>
	</li>
	<li>
		<h3>Extensible, easier to maintain because Java is an OO
		Programming language</h3>
	</li>
</ul>
<a href="index.html">Go back to index!</a>
</body>
</html>