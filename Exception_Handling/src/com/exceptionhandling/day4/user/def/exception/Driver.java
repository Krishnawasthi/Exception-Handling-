package com.exceptionhandling.day4.user.def.exception;

public class Driver
{
	public static void main(String[] args)
	{
		RegistorUser register = new RegistorUser();
		try
		{

			register.doRegistration("kwdd133");
		}

		catch (UserAlreadyExistException e)
		{

			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
		}
	}
}
