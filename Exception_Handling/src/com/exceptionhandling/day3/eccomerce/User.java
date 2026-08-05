package com.exceptionhandling.day3.eccomerce;

public class User
{

	public static void main(String[] args)
	{
		Order order = new Order("iphone 18", 8);
		
		try
		{
			order.placeOrder("iphone 18", 7);
			
		} catch (Exception e)
		{
			System.out.println("chech the quesntity" + e.getMessage());
			e.printStackTrace();
		}

	}

}
