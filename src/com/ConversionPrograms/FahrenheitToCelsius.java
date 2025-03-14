package com.ConversionPrograms;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String arg[]) 
	{
		double iFahre = 0, iCelsius = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Fahrenheit temperature : ");
		iFahre = sobj.nextDouble();
		System.out.println("Celsius temperature is = " + celsius(iFahre));
	}

	static double celsius(double iFahre) 
	{
		return (iFahre - 32) * 5 / 9;
	}
}
/* OUTPUT:

Enter Fahrenheit temperature : 56
Celsius temperature is = 13.333333333333334
*/