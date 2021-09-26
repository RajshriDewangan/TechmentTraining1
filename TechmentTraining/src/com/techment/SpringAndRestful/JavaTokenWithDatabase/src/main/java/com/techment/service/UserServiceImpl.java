package com.techment.service;

import java.util.NoSuchElementException;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.techment.dto.UserDto;
import com.techment.repository.UserRepsitory;

public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepsitory userRepsitory ;
	
	@Override
	public UserDto login(String username, String password) throws NoSuchElementException {
		
		User user = userRepsitory.findByUserNameAndPassword( username,  password).get();
		UserDto userDto = new UserDto(user.getUsername(),user.getPassword(),"muToken");
		
		return userDto;
	}
}
