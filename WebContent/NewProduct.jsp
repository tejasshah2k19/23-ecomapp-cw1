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
	 

	<div class="container">

		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<form action="SaveProductServlet" method="post">

					<div class="form-group">
						<label>ProductName</label> <input type="text" class="form-control"
							name="productName"></div>


					<div class="form-group">
						<label>Qty</label> <input type="text" class="form-control"
							name="qty">  
					</div>

<div class="form-group">
						<label>Price</label> <input type="text" class="form-control"
							name="price">  
					</div>


					<div class="form-group">
						Category : <input type="text" name="category"
							class="form-control">  		</div>





					<input type="submit" class="btn btn-primary" value="Add Product" />  
						 


				</form>

				<br> <br>  

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