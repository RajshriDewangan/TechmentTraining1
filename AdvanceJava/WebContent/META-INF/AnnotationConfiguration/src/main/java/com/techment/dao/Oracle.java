package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements Dao {

	@Override
	public void dataBaseName() {

		System.out.println("connecting to oracle database");
	}

}
