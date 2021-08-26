package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.Dao;
import com.techment.dao.Employee;

@Service("dbService")
public class DataBaseService {

	@Autowired
	@Qualifier("oracle")
	Dao dao;
	
	@Autowired
	Employee emp;
	
	public void displayDatabaseInfo() {
		dao.dataBaseName();
		
	}
	
}
