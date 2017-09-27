package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Example for Session Object 
@WebServlet(name = "session", description = "Exmaple for Session Config  Object and Session Context Object", urlPatterns = { "/session" })
public class SessionExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SessionExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Whenever parameter is passed to servlet from the view we can store the object in Session 
		
		String str = request.getParameter("a");
		//request.setAttribute("name", str);
		
//		HttpSession session = request.getSession();
//		if(str!=null)
//		session.setAttribute("name" , str);
		
		PrintWriter out = response.getWriter();
		
		
		response.sendRedirect("display?a=" + str);
//		out.println("Hello");
//		out.println("Request Object :" + request.getAttribute("name"));
//		out.println("Session Object  : " + session.getAttribute("name"));
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
