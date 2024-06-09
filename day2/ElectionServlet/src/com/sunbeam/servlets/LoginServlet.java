package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.entity.User;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
      String email = req.getParameter("email");
      String passwd = req.getParameter("passwd");
      try(UserDao userDao = new UserDaoImpl())
      {
    	  User user = userDao.findByEmail(email);
    	  if(user != null && user.getPassword().equals(passwd))
    	  {
    		  Cookie c = new Cookie("uname",user.getFirstName());
    		  c.setMaxAge(3600);//age limit of cookie
    		  resp.addCookie(c);//added cookie in your response
    		  System.out.println("login Successfull :"+user);
    		  
    		  HttpSession session = req.getSession();
    		  session.setAttribute("curuser",user);
    		  System.out.println(session);
    		  if(user.getRole().equals("voter"))
    		  {
    			  resp.sendRedirect("candlist");
    			  
    		  }
    		  else if(user.getRole().equals("admin"))
    		  {
    			  resp.sendRedirect("result");
    		  }
    		  
    	  }
    	  
    	  else 
    	  {
    		  //login Failed
    		  resp.setContentType("text/html");
    		  PrintWriter out = resp.getWriter();
    		  out.println("<html>");
    		  out.println("<head>");
    		  out.println("<title>Login Failed</title>");
    		  out.println("</head>");
    		  out.println("<body>");
    		  out.println("Invalid email or password. </br></br>");
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

	
}
