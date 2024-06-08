package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.entity.Candidate;


public class ResultServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
   protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   List<Candidate> list = new ArrayList<Candidate>();
		 
		 try(CandidateDao candDao = new CandidateDaoImpl())
		 {
			 list = candDao.findAll();
			 
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
		 
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>");
		 out.println("Candidate List");
		 out.println("</title>");
		 out.println("<body>");
		 out.println("<h3>Online Voting</h3>");
		 out.println("<table>");
		 out.println("<thead>");
		 out.println("<tr>");
		 out.println("<th>Id</th>");
		 out.println("<th>Name</th>");
		 out.println("<th>Party</th>");
		 out.println("<th>Vote</th>");
		 out.println("</tr>");
		 out.println("</thead>");
		 out.println("<tbody>");
		 for(Candidate c : list)
		 {
			 out.println("<tr>");
			 out.printf("<td>%d</td>",c.getId());
			 out.printf("<td>%s</td>",c.getName());
			 out.printf("<td>%s</td>",c.getParty()); 
			 out.printf("<td>%d</td>",c.getVotes());
			 
			 out.println("</tr>");
		 }
		 out.println("<tbody/>");
		 out.println("</table>");
		 out.println("</body>");
		 out.println("</html>");
		 
		
		}
		
		
	}

