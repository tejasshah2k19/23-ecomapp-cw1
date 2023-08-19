package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SaveSessionTimeoutServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String time = request.getParameter("time"); // read time from html form

		int timeInt = Integer.parseInt(time);

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(timeInt * 60);

		response.sendRedirect("HomeServlet");

	}

}
