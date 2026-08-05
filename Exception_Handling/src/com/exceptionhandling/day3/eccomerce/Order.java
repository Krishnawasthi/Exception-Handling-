package com.exceptionhandling.day3.eccomerce;

public class Order
{
	String product;
	int quantity;

	public Order(String product, int quantity)
	{
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public void placeOrder(String item, int quantity) throws Exception
	{

		System.out.println(item);

		if (quantity <= 0)
		{

			try
			{
				System.out.println("your quantity: " + quantity);
			} catch (ArithmeticException e)
			{

				e.printStackTrace();
				throw new Exception("quantity can't be negative");
			}

		}

	}
}
