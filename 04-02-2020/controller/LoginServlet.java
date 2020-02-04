package com.cts.training.controller;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import com.cts.training.controller.LoginDatabase;

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException
			{
		
		//response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String name=request.getParameter("user");  
	    String password=request.getParameter("pass");  
	          
	    LoginDatabase ldb=new LoginDatabase();
	    
	    if(ldb.validate(name, password)){  
	        RequestDispatcher rd=request.getRequestDispatcher("welcome.html");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("login.html");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
		
			}

}
