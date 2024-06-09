package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.entity.User;

@WebServlet("/register")
public class RegServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
		String firstName = req.getParameter("first_name");
	      String lastName = req.getParameter("last_name");
	      String email = req.getParameter("email");
	      String passwd = req.getParameter("password");
	      String date = req.getParameter("dob");
	      Date dob =Date.valueOf(date);
	      int status = 0;
	      String role = "voter";
	      try(UserDao userDao =  new UserDaoImpl())
	      {
	    	 User u = new User(firstName,lastName, email, passwd,dob,status,role);
	    	 //save the user object using the userDao Save Method.
	    	 int save = userDao.save(u);
	    	 if(save != 0)
	    	 {
	    		 resp.setContentType("text/html");
	    		  PrintWriter out = resp.getWriter();
	    		  out.println("<html>");
	    		  out.println("<head>");
	    		  out.println("<title>Registeration Successfully</title>");
	    		  out.println("</head>");
	    		  out.println("<body>");
	    		  out.println("Registeratin done Successfully!!</br></br>");
	    		  out.println("<a href = 'index.html'>Login Again</a>");
	    		  out.println("</body>");
	    		  out.println("</html>");
	    		 
	    	 }
	    	 else
	    	 {
	    		 resp.setContentType("text/html");
	    		  PrintWriter out = resp.getWriter();
	    		  out.println("<html>");
	    		  out.println("<head>");
	    		  out.println("<title>Registeration Failed</title>");
	    		  out.println("</head>");
	    		  out.println("<body>");
	    		  out.println("Please fill all the information</br></br>");
	    		  out.println("<a href = 'index.html'>Login Again</a>");
	    		  out.println("</body>");
	    		  out.println("</html>");
	    	 }
	    	  
	      } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
	      
	     
	}
protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
