package com.exception.handling;

public class ExceptionHandling {

	  static  int somevalue;
	public static void main(String[] args) {
		
		System.out.println("ExceptionHandling.main()......START");
		
		String name = null;
		
		
		
		
		
		// we will put the exptected exception problem in try and block and throws it via catch block so there will be no abnormal termination
		
		try 
		{   
			int amount = 200/0;
			System.out.println("amount" + amount); // ArithmeticException occurs
			
			System.out.println("before exception");
			System.out.println(name.length()); //Risky may throw -->NullPointerException
			System.out.println("after exception");
		}
		
	  catch(NullPointerException e) 
		{
		   e.printStackTrace();
		   
		   System.out.println("Name is null....");
			
		}
		catch(ArithmeticException e1) 
		{
		   e1.printStackTrace();
		   
		   System.out.println("A number can not zero");
			
		}
		
					
		System.out.println("ExceptionHandling.main()......END");

	}

}
