package com.exception.integer.problem;

public class ReturnProb
{

	public int getInt(int a)
	{

		try
		{

			return 10;
		} 
		catch (
			Exception e
		)
		{

			e.getStackTrace();
		}

		finally
		{
			// finally will always override the try block out if if it os returning the same
			// output
			return 20;
		}

	}
}