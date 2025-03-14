package com.CalculationProblems;

import java.util.Scanner;

public class CalculateElectricityBill {

	public static void main(String args[]) 
	{
		long iUnits;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number of iUnits: ");
		iUnits = sobj.nextLong();

		double iBillpay = 0;

		if (iUnits < 100) 
		{
			iBillpay = iUnits * 1.20;
		} 
		else if (iUnits < 300) 
		{
			iBillpay = 100 * 1.20 + (iUnits - 100) * 2;
		} 
		else if (iUnits > 300) 
		{
			iBillpay = 100 * 1.20 + 200 * 2 + (iUnits - 300) * 3;
		}
		System.out.println("Bill to pay : " + iBillpay);
	}
}
/* OUTPUT:

Enter number of Units: 320 
Bill to pay : 580.0
*/