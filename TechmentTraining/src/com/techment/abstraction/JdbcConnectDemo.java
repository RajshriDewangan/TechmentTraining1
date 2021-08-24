package com.techment.abstraction;

interface JdbcConnection
{
	void connection();
}

class Oracle implements JdbcConnection
{

	@Override
	public void connection() {

		System.out.println("Oracle Connection");
	}
	
}
class MySql implements JdbcConnection
{

	@Override
	public void connection() {

		System.out.println("My SQL Connection");		
	}
	
}
public class JdbcConnectDemo {
	
	public static void main(String[] args) {
		JdbcConnection connect = new Oracle();
		connect.connection();
	}
}
