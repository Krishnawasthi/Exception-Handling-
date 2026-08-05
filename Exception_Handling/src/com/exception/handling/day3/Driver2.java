package com.exception.handling.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.exception.handling.day3.Driver;

public class Driver2
{
	public void readFile()
	{

		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("driver.srv")); // filenotfoundexception
																									// //ioexception

			try
			{
				Driver dv = (Driver) ois.readObject();
				// classnot found exception here
				System.out.println(dv);
				
			} catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Driver2.readFile()..class not found exception");
			}

		} catch (FileNotFoundException e)
		{
			System.out.println("Driver2.readFile()..file not found exception");
			e.printStackTrace();
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Driver2.readFile()..io exception found exception");
			
			
			e.printStackTrace();
		}
	}
}
