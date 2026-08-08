package com.exceptionhandling.day4.user.def.exception;

public class UserAlreadyExistException extends RuntimeException
{
  
	public UserAlreadyExistException(String _message) {
		
		super(_message);
	}
	
}
