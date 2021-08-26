package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.print("<br>----calaculation-----------<br>");
	
		String whichCalculation = request.getParameter("calculation");
		if(whichCalculation.equalsIgnoreCase("ADD"))
		{
			String n1 = request.getParameter("n1");
			int num1 = Integer.parseInt(n1);
			
			int num2 = Integer.parseInt(request.getParameter("n2"));
		 	
		 	int add=num1+num2;
		 	pw.println("Result of Addition is: "+add);
	 	}
	 	else if(whichCalculation.equalsIgnoreCase("SUB"))
	 	{
	 		String n1= request.getParameter("n1");
		 	int num1= 	Integer.parseInt(n1);
		 	int num2 = Integer.parseInt(request.getParameter("n2"));
		 	
		 	int sub=num1-num2;
		 	pw.println("Result of Subtraction is: "+sub);
	 	}
	 	else if(whichCalculation.equalsIgnoreCase("MUL"))
	 	{
	 		String n1= request.getParameter("n1");
		 	int num1= 	Integer.parseInt(n1);
		 	int num2 = Integer.parseInt(request.getParameter("n2"));
		 	
		 	int mul=num1*num2;
		 	pw.println("Result of Multiplication is: "+mul);
	 	}
	 	else if (whichCalculation.equalsIgnoreCase("DIV"))
	 	{
	 		String n1= request.getParameter("n1");
		 	int num1= 	Integer.parseInt(n1);
		 	int num2 = Integer.parseInt(request.getParameter("n2"));
		 	
		 	int div=num1/num2;
		 	pw.println("Result of Division is: "+div);
	 	}
	 	else if (whichCalculation.equalsIgnoreCase("MAX"))
	 	{
	 		String n1= request.getParameter("n1");
		 	int num1= 	Integer.parseInt(n1);
		 	int num2 = Integer.parseInt(request.getParameter("n2"));
		 	
		 	int max=num1>num2 ? num1 : num2;
		 	pw.println("Max number is: "+max);
	 	}
		
		}

}
