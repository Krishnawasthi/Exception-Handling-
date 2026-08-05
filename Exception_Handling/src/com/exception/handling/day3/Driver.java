package com.exception.handling.day3;

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

	   public static void writeLine() {
		   

			try
			{
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sales_file.txt"));
				
				Driver driver = new Driver();

	            oos.writeObject(driver);
	            
			} catch (FileNotFoundException e)
			{
				
				e.printStackTrace();
				
			
			} catch (IOException e)
			{
				
				e.printStackTrace();
			}
			
	   }
	   
	public static void main(String[] args)  //there is a class (Class in java)
	{
		//two types of class loading 
		//dynamic class loading( Class.forName(com.exception.handling.day3.Order))
		//static class loading(Driver driver = new Driver();)
		
           //file not found exception
		
		Driver.writeLine();

        // Read object from file
        Driver2 driver2 = new Driver2();
        
        driver2.readFile();
		  
		
		
	}

}
