package com.typesofexception.checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class ReadFile
{

	public static void main(String[] args)
	{
		ReadFile rf = new ReadFile();
		rf.readFile();

	}

	public void readFile()
	{

		String fileName = "C:\\Users\\91800\\git\\Exception-handling\\Exception_Handling\\src\\com\\typesofexception\\checked\\sales_file.txt";

		try
		{
			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
			// FindNotDFoundException
         	br.readLine(); //skip the header
			// read the data inside the file(in form of line)
			String line;
			double totalSalary = 0;
		 	while ((line = br.readLine()) != null)
			{
				
			
				String lineArr[] = line.split(",");
				String city = lineArr[3];
			    totalSalary = Double.parseDouble(lineArr[8]);
			    
				if (city.equalsIgnoreCase("Bengaluru"))
				{
					
					System.out.println("city name :" + city);
					
				
			}
			    System.out.println(lineArr[1] +" "+ lineArr[2]);
				System.out.println("total salary :" + totalSalary);
				
				
				
			}
		} catch (FileNotFoundException e) // filenotfoundexception
		{
			System.out.println("Wrong path");
			e.printStackTrace();

		} catch (IOException e)// IOexception while reading the file(exception causes due to wrong path of file
								// or or wrong name)
		{
			e.printStackTrace();
		}
	}

}
