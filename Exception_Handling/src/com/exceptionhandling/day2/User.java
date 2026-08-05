package com.exceptionhandling.day2;

public class User
{

	public String userLogin(String userName, String pwd) throws Exception
	{

		String userId = null;
		String country = "IN";

		try
		{
			// code to connect woth databe
			// open connection with databse
			System.out.println("User.userLogin()...." + country);
			userId = userName.substring(0, 5) + "123"; // resiky code

			System.out.println("User id generated :  " + userId);

			// System.out.println("close the connection of database"); //when there is the
			// closing statemets that will not exceuted if any exception will occurs so we
			// use finally that are bound to excute

		}
		
		catch (NullPointerException e)
		{

			e.printStackTrace();

			System.out.println("user name can not be null");
			throw new Exception("user id can not be null");
		}
		
		catch (Exception e)
		{

			e.printStackTrace();

			
			
			
		}

		

		finally
		{

			System.out.println("closing the connection of database ....END");
		} 

		System.out.println("close the driver....");
		return userId;
	}

}
