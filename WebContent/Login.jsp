<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>

<div class="container">

		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<form action="LoginServlet" method="post">
 


					<div class="form-group">
						<label>Email</label> <input type="text" class="form-control"
							name="email">  
					</div>




					<div class="form-group">
						Password : <input type="password" name="password"
							class="form-control"> <span class="text-danger">${passwordError }</span>
					</div>





					<input type="submit" class="btn btn-primary" value="Login" /> <a
						href="Signup.jsp" class="btn btn-danger">Cancel</a>



				</form>

				<br> <br> <a href="Signup.jsp">New User? Signup</a> <br>
		${error}

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