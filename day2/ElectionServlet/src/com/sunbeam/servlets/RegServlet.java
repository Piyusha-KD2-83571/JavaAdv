package com.sunbeam.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
		String first_name = req.getParameter("first_name");
	      String last_name = req.getParameter("last_name");
	      String email = req.getParameter("email");
	      String passwd = req.getParameter("passwd");
	      String date = req.getParameter("date");
	      Date dob =Date.valueOf(date);
	      
	     
	}
protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
