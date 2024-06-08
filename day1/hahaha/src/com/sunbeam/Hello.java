package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value ="/hi" , loadOnStartup = 9, initParams = {
		@WebInitParam(name ="color" ,value ="blue"),
		@WebInitParam(name = "course",value="dac")})
public class Hello extends HttpServlet{
	private String color = "";
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	super.init(config);
	System.out.println("Hello From Init Method");
	color = config.getInitParameter("color");
}

@Override
	public void destroy() {
	super.destroy();
		System.out.println("Hello Server From destroy");
	}

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	processRequest(req,resp);
		
	}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   processRequest(req,resp);
		System.out.println("Inside Do post");
	}

   protected void processRequest(HttpServletRequest req,HttpServletResponse resp) throws IOException
   {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Hello</title>");
		out.print("</head>");
		out.printf("<body bgcolor='%s'> \n",color);
		out.printf("<h1>You have reached here by get method </h1>",color);
		out.print("</body>");
		out.print("</html>");
		System.out.println("Inside Do get");
   }


}
