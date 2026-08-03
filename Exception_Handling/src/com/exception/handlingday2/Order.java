package com.exception.handlingday2;

public class Order
{
	String name = "krishna"; // asssume recieve from another call
    String Animalname = "dog";
	public void doSomething()
	{
		try
		{
			System.out.println(name.charAt(3)); // risky code
			System.out.println("after the element at index for name ");
			System.out.println(Animalname.charAt(3));  //String index out of the bound exception
			System.out.println("after the element at index for animalname ");
		}

		catch (Exception e)
		{
		    name= "NA";
			e.printStackTrace();
		}
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Order.doSomething()" + i);
		}

	}
}
