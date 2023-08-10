<%@page import="com.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome , 
<br> 
<br><br>
<% 
	ArrayList<ProductBean> products = (	ArrayList<ProductBean>)request.getAttribute("products");
%>

<%for(ProductBean p:products){ %>
	<%=p.getName() %> : <%=p.getPrice() %> : <a href="AddToCartServlet?productId=<%=p.getProductId()%>">AddToCart</a><br><Br>

<%} %>
</body>
</html>