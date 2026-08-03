package com.exception.handling.Classwork;

public class Exception extends Object {

	public static void main(String[] args) {
		System.out.println("Exception.main() ...start");

		// String name =; //arithmatic operation when we donot provide the arguments

		// null pointer exception
		try {

			String name = "krishna";

			String animal = args[0];

			int number = 200 / 2;

			System.out.println(name.length());// NullPointer exception

			System.out.println(animal.charAt(2));

			System.out.println(number);

			Exception e = new Exception();
			e.doSomething();
		}

		catch (NullPointerException e) {

			System.out.println("Exception : name is null");
			e.printStackTrace(); // this is used to print the actual exception where is the problem
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception : array index are not found");
			e.printStackTrace();
		}

		catch (ArithmeticException e) {

			System.out.println("Exception :Arithmatic operator");
			e.printStackTrace();
		}

		System.out.println("Exception.main()..END");

	}

	private void doSomething() {

		System.out.println("Exception.doSothing()....START");
		System.out.println("Exception.doSothing()....doing something");
		System.out.println("Exception.doSothing()....END");
	}
}
