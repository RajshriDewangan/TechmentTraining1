package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//com.mysql.cj.jdbc.Driver

public class UserInputDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 //int id=0,salary=0;
		 //String name=null;
		
		try {
			//step1 load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found");
		
		//step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Techment?autoReconnect=true&useSSL=false", "root", "root");
		System.out.println("connected");

		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?);");

		System.out.println("enter no of employee:");
		int emp = scanner.nextInt();
		
		for(int i=1;i<=emp;i++)
		{
		System.out.println("enter id:");
		int id = scanner.nextInt();
		ps.setInt(1, id);
		
		System.out.println("enter name:");
		 String name = scanner.next() ;
		 name+=scanner.next();
			ps.setString(2, name);
		
		System.out.println("enter salary:");
		int salary = scanner.nextInt();
		ps.setInt(3, salary);

		ps.execute();

		}


		System.out.println("inserted");
		
		ResultSet rs = ps.executeQuery("select * from employee;");

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
