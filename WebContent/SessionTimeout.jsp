<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SessionTimeout</title>
</head>
<body>

	<form action="SaveSessionTimeoutServlet">
		Time :  <input type="text" name="time" hint="Please Enter Your expected minutes "/><br><br>
		<input type="submit" value="Set My Session Timeout"/>
	</form>

</body>
</html>