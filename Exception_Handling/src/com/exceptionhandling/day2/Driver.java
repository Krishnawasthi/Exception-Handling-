package com.exceptionhandling.day2;

public class Driver
{

	public static void main(String[] args)
	{  
		
		String userid = null;
		User user = new User();
		try
		{
	    userid =	user.userLogin(null, "4y24924");
		
		} catch (Exception e)
		{
			
	
			System.out.println("got an exception"+e.getMessage());
		}
		
		System.out.println(" here is you usr id : "+userid);
	}

}
