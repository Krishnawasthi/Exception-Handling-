package com.exceptionhandling.day4.trywith.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver
{

	public static void main(String[] args)
	{
		
		try(ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("sales.txt"));)
		{
			  
/* there is a new concept introduced in java 1.7 that told that you dont need to write the finally block try block will be 
write the closbale code automatically , but the code should be @autoclosable(class)

 */
			
			System.out.println("Driver.main()");
			
		} catch ( ArithmeticException|NullPointerException|ClassCastException|IOException e)
	//we can write multiple exception in catch block but there should not be  a relationship among the exceptions	
		{

			e.printStackTrace();
			
		} 

/*		finally
		{

			try
			{
				ois.close();
				
			} catch (IOException e)
			{
				
				e.printStackTrace();
			}
		}
  */
		
	}

}
