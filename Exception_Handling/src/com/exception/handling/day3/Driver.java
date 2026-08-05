package com.exception.handling.day3;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.exception.handling.day3.Driver2;

public class Driver implements Serializable
{
	private String name;
	private String city;
	private int age;

	public Driver(String name, String city, int age)
	{
		this.name = name;
		this.city = city;
		this.age = age;
	}
     
	@Override
	public String toString() {
		
		 return "Driver[name : "+ name+ "," + " city : " + city + "," + " age : " + age + "]";
		
	}
	

	public void writeFile()
	{
		ObjectOutputStream oos  = null;
		try
		{
			 oos = new ObjectOutputStream(new FileOutputStream("driver.srv"));

			oos.writeObject(this);

		} catch (FileNotFoundException e)
		{

			e.printStackTrace();

		} catch (IOException e)
		{

			e.printStackTrace();
		}
		
		finally {
			if(oos != null) {
				
				
				try {
					
					oos.close();
				}
				catch(IOException e) {
					
					e.printStackTrace();
				}
			}
			
		}

	}

	public static void main(String[] args) // there is a class (Class in java)
	{
		// two types of class loading
		// dynamic class loading( Class.forName(com.exception.handling.day3.Order))
		// static class loading(Driver driver = new Driver();)

		// file not found exception
		Driver driver = new Driver("krishna", "bengaluru", 24);
		driver.writeFile();

		// Read object from file
		Driver2 driver2 = new Driver2();

		driver2.readFile();

	}

}
