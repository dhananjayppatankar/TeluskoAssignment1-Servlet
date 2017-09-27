package com.telusko;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Controller to handle request and response from the Cutomer JSP ..... 
// Handle this and generate a view 
@WebServlet(name = "add", description = "servletfor  generating random id for customer", urlPatterns = { "/add" })
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

      
    public AddCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	    
	    String name = request.getParameter("name");
	    int age = Integer.parseInt(request.getParameter("age"));
	     
	    Customer customer = new Customer();   
	    customer.setAge(age);
	    customer.setName(name);
	    customer.getRandomId(); //method to generate a random id
	    
	    System.out.println(customer.getRandomid());
	    request.setAttribute("customer", customer);
		RequestDispatcher rd = request.getRequestDispatcher("customerid.jsp");
	    rd.forward(request, response);
	    
		}

}
