package com.techment.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	public ResponseEntity<String> myException(InvalidUserException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(),);
	}
} 
