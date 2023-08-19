package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		 	
			HttpSession session =  request.getSession(); //server -> ask 
			session.setAttribute("user", map); 
			session.setAttribute("userId", map.get("userId"));//dummy 
			
			session.setMaxInactiveInterval(60*5);//5 minutes 
			//you can write below logic in any servlet 
//			HttpSession session =  request.getSession(); 
			//HashMap<String, Object> map2 =    (HashMap<String, Object> ) session.getAttribute("user");
			//String userId = (String)map2.get("userId");
			
			
			
			if (map.get("role") != null && map.get("role").equals("ADMIN")) {
				response.sendRedirect("Dashboard.jsp");// home -> request no data

			} else {
				response.sendRedirect("HomeServlet");
				
			}
		} else {
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		}

	}
}
