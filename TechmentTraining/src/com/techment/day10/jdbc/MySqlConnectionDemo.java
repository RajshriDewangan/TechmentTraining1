package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false


public class MySqlConnectionDemo {

	public static void main(String[] args) {

		//A a = new A();
		try {
			//Class.forName("com.techment.day10.jdbc.A");
			//	Class.forName("com.techment.day10.jdbc.B");

			//step1 load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found");
		
		//step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Techment?autoReconnect=true&useSSL=false", "root", "root");
		System.out.println("connected");
		
		//step3 create statement pr preparedstatement object
		Statement stmt = con.createStatement();
		
//		stmt.execute("insert into employee values(101 , 'raji' , 10000);");
//		System.out.println("inserted");
		
		ResultSet rs = stmt.executeQuery("select * from employee;");

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
