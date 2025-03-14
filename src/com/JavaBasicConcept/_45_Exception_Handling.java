/*	Exception Handling		*/

package com.JavaBasicConcept;

import java.util.jar.Attributes.Name;

public class _45_Exception_Handling 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		
		int iNo1 = 10, iNo2 = 0, iReturn = 0;
		try 
		{
			iReturn = iNo1 / iNo2;
			System.out.println(iReturn);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("We can not divide any value by zero");
		}
		
		System.out.println("Program Ended");
	}
}

/*
Program Started
We can not divide any value by zero
Program Ended
*/

























