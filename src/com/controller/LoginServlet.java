package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ProductBean;
import com.dao.ProductDao;
import com.dao.UserDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDao userDao = new UserDao();
		HashMap<String, Object> map = userDao.authenticate(email, password);// if correct : true , else false

		if (map != null) {
			if (map.get("role").equals("ADMIN")) {
				response.sendRedirect("Dashboard.jsp");// home -> request no data

			} else {
				ProductDao pdao = new ProductDao();
				ArrayList<ProductBean> products = pdao.getAllproducts();
				//send to Home.jsp 
				response.sendRedirect("Home.jsp");// home -> request no data
			}
		} else {
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		}

	}
}
