package com.techment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MySqlConnection {

	JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertData()
	{
		jdbcTemplate.execute("insert into employee values(200, 'Raj',4897)");
		System.out.println("data is inserted");
	}
	
	DriverManagerDataSource ds;
}
