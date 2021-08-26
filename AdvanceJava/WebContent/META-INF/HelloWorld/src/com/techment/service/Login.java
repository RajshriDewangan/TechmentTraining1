package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/userlogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println( "hello servlet called");
		PrintWriter out = response.getWriter();
		out.print("this is my first servlet \n");
		
		String name = request.getParameter("u");
		String pass = request.getParameter("p");
		
		int namelen = name.length();
		
		System.out.println("your name is:"+name +"size is:"+namelen);
		out.print("\n your name is:"+name +" size is:"+namelen);
	}

}
