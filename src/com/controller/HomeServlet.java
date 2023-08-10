package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ProductBean;
import com.dao.ProductDao;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductDao pdao = new ProductDao();
		ArrayList<ProductBean> products = pdao.getAllproducts();
		request.setAttribute("products", products);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

}
