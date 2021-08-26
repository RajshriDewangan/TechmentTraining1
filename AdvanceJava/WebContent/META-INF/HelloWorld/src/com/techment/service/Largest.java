package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Largest
 */
@WebServlet("/Largest")
public class Largest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		
		String whichCalculation = request.getParameter("largest");
		if(whichCalculation.equalsIgnoreCase("MAX"))
		{

		String n1 = request.getParameter("n1");
		int num1 = Integer.parseInt(n1);
		
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		int num3 = Integer.parseInt(request.getParameter("n3"));
	 	
	 	if(num1>num2 && num1>num3)
	 	{
	 		int max=num1;
		 	pw.println("Result of Addition is: "+max);

	 	}
	 	else if(num2>num1 && num2>num3)
	 	{
	 		int max=num2;
		 	pw.println("Result of Addition is: "+max);

	 	}
	 	else if(num3>num2 && num3>num1)
	 	{
	 		int max=num3;
		 	pw.println("Result of Addition is: "+max);

	 	}
	 	else
		 	pw.println("one or more numbers are same ");

		}
	
	}

}
