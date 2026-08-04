package com.typesofexception.checked;

public class Driver
{

	public static void main(String[] args)
	{
		String name = "";
		System.out.println(name.length()); // NPE --> unchecked/runtime exception
		// checked excpetion

		try
		{
			Class.forName("com.typesofexception.checked.Driver1111");
			
		} 
		
		catch (ClassNotFoundException e)
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			//forcing to handle it cuz class not found exception
		}
		// class not found exception
		// load or readfile -->exception
		//SQL EXCEPTION

	}

}
