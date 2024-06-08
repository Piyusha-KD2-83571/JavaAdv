package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("Text/html");
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Logout</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("Thank you for saving democracy. <br/><br/>");
	out.println("<a href = 'index.html'>Login Again</a>");
	out.println("</body>");
	out.println("</html>");
}
}
