package com.exceptionhandling.day4.user.def.exception;

public class RegistorUser
{  
	
	public boolean doRegistration(String userId) throws  UserAlreadyExistException {
		
		System.out.println("RegistorUser.doRegistration()..... start ............");;
		boolean status = false;
		boolean isUserExist = true;
		
	
	if(!isUserExist) {
		System.out.println(" register the User" + userId);
		//insert the record into databse
		status = true;
	}
	else
	{
		System.out.println("User already exisit in db" + userId);
		//inform the caller --> throwing user already exist exception
		
		throw new UserAlreadyExistException("User is already registered");
	}
	
	return status;

  }
}
