package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class randomid
 */
@WebServlet(description = "Random Id generator for Name and Id", urlPatterns = { "/randomid" })
public class randomid extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public randomid() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

		//get the name and id parameters from index.html
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		int reverse = 0;
		
		//reverse the id logic
		while(id !=0){
		reverse = reverse *10;
		reverse = reverse + id%10;
		id = id/10;
		}
		
		//Generate random id with Characters + reverse Id
		String randomId = "";
		String a = name.substring(0, 3);
		randomId = a + reverse;

		PrintWriter pw = response.getWriter();
		pw.println("<h1>" + randomId + "</h1>");

	}

	

}
