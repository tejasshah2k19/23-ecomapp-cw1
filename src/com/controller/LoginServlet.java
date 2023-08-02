package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDao userDao = new UserDao();
		boolean ans = userDao.authenticate(email, password);
		
		if(ans == true) {
			response.sendRedirect("Home.jsp");//home -> request no data 
		}else {
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}
		
		
		
	}
}
