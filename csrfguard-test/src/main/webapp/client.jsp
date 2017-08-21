<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>JSP Tag Token Injection</title>
</head>
<body>
<%@ taglib uri="/csrf" prefix="csrf" %>
<h3>Test Link(s)</h3>
<ul>
	<li><a href="protect.html?<csrf:token uri="protect.html"/>">protect.html</a></li>
	<li><a href="/protect.html">/protect.html</a></li>
	<li><a href="hello.jsp?<csrf:token uri="hello.jsp"/>">hello.jsp</a></li>
</ul>
</body>
</html>