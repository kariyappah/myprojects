<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	</head>
	<%@ taglib uri="/csrf" prefix="csrf" %>
   <body>
      
      <form action = "main.jsp" method = "POST">
         First Name: <input type = "text" name = "first_name">
         <br />
         Last Name: <input type = "text" name = "last_name" />
         <input type="hidden" name="<csrf:tokenname/>" value="<csrf:tokenvalue uri="main.jsp"/>"/>
         <input type = "submit" value = "Submit" />
      </form>
   </body>
   <script src="/JavaScriptServlet"></script>
</html>