package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PhonePrice
 */
@WebServlet("/PhonePrice")
public class PhonePrice extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int price=40000;
		PrintWriter pw = response.getWriter();
		
		int quantity = Integer.parseInt(request.getParameter("phone"));
		pw.print("u have selected "+quantity);
		
		double totalPrice = quantity*price;
		pw.print(totalPrice);
	}

}
