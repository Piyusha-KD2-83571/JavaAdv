package com.sunbeam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ctl")
public class AppController extends HttpServlet{

	//Do-Get Method
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	requestProcess(req,resp);
}	

//Do-Post-Method
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	requestProcess(req,resp);
}


protected void requestProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String page = req.getParameter("page");
	String URI = "/WEB-INF/pages/index.jsp";
	
	if(page.equals("index"))
	{
		URI = "/WEB-INF/pages/index.jsp";
	}
	else if(page.equals("login"))
	{
		URI = "/WEB-INF/pages/login.jsp";
		
	}
	else if(page.equals("candlist"))
	{
		URI ="/WEB-INF/pages/candlist.jsp";
	}
	else if(page.equals("newuser"))
	{
		URI ="/WEB-INF/pages/newuser.jsp";
	}
	else if(page.equals("register"))
	{
		URI ="/WEB-INF/pages/register.jsp";
	}
	else if(page.equals("result"))
	{
		URI ="/WEB-INF/pages/result.jsp";
	}
	else if(page.equals("updatecand"))
	{
		URI ="/WEB-INF/pages/updatecand.jsp";
	}
	else if(page.equals("vote"))
	{
		URI ="/WEB-INF/pages/vote.jsp";
	}
	else if(page.equals("logout"))
	{
		URI ="/WEB-INF/pages/logout.jsp";
	}
	
	ServletContext ctx = this.getServletContext();
	RequestDispatcher rd = ctx.getRequestDispatcher(URI);
	rd.forward(req, resp);
	
}






}
