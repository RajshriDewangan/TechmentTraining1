package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		try {
			//step1 load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found");
		
		//step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Techment?autoReconnect=true&useSSL=false", "root", "root");
		System.out.println("connected");

		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?);");
		ps.setInt(1, 2);
		ps.setString(2, "shejal");
		ps.setInt(3, 20000);
		
		ps.execute();
		
		System.out.println("inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
