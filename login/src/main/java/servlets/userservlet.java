package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnection.userdb;
import models.user;
import services.userservice;
@WebServlet("/Signup")
public class userservlet extends HttpServlet {
   
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String fname = req.getParameter("firstname");
		 String lname = req.getParameter("lastname");
		 String email = req.getParameter("email");
		 String password = req.getParameter("password");
		 int age = Integer.parseInt(req.getParameter("age"));
		 String gender = req.getParameter("gender");
		 PrintWriter pw = resp.getWriter();
		 
		 user us = new user(fname,lname,email,password,age,gender);
		 
		 userservice service = new userservice(userdb.getconn());
		 
		 boolean f = service.adduser(us);
		
		 if(f) {
			 
			 resp.sendRedirect("welcome.jsp");
		 }
		 else {
			 resp.sendRedirect("register.jsp?error=Registration failed. Please try again.");
		 }

	}
}
