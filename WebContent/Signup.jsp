<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>

<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

</head>
<body>
	<%
		String error = (String) request.getAttribute("error");
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
	%>

	<div class="container">

		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<form action="SaveUserServlet" method="post">

					<div class="form-group">
						<label>FirstName</label> <input type="text" class="form-control"
							name="firstName"> <span class="text-danger"><%=firstNameError == null ? "" : firstNameError%></span>
					</div>


					<div class="form-group">
						<label>Email</label> <input type="text" class="form-control"
							name="email"> <span class="text-danger"> <%=emailError == null ? "" : emailError%>
						</span>
					</div>




					<div class="form-group">
						Password : <input type="password" name="password"
							class="form-control"> <span class="text-danger">${passwordError }</span>
					</div>





					<input type="submit" class="btn btn-primary" value="Signup" /> <a
						href="Login.jsp" class="btn btn-danger">Cancel</a>



				</form>

				<br> <br> <a href="Login.jsp">Already Signup? Login</a> <br>

				<br>
				<%-- <div class="text-danger">
					<%=error == null ? "" : error%>
				</div> --%>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>

</body>
</html>