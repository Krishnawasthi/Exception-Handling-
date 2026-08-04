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

			// read the data inside the file(in form of line)
			String line;

			while ((line = br.readLine()) != null)
			{

				System.out.println(line);
			}
		} catch (FileNotFoundException e)  //filenotfoundexception
		{
			System.out.println("Wrong path");
			e.printStackTrace();
			
		} catch (IOException e)//IOexception while reading the file(exception causes due to wrong path of file or or wrong name)
		{
          e.printStackTrace();
		}
	}

}
