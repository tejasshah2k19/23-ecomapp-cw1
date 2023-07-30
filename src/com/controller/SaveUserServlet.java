package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.service.MailerService;

public class SaveUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//validation 
		
		//db save 
		UserDao userDao = new UserDao();
		userDao.addUser(firstName,email,password);

		//send welcome mail 
		MailerService mailService =new MailerService();
		mailService.sendWelcomeMail(email, firstName);
 		
		response.sendRedirect("Login.jsp");
	}
}

//web.xml 
//server -> read -> configuration -> deployment descriptor {web.xml} 
//server -> read -> configuration -> web.xml  

