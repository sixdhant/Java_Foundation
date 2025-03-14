package A_BasicConcept;

import java.util.Scanner;

public class Calculator
{
	
	public static void main(String args[])
	{
		Scanner Sobj = new Scanner(System.in);
		int iNo1=0, iNo2=0, iRet=0;
		int choice = 0;
		
		System.out.println("Enter first Number: ");
		iNo1 = Sobj.nextInt();
		
		System.out.println("Enter first Number: ");
		iNo2 = Sobj.nextInt();
		
		System.out.println("Enter which activity need to perform: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Mutiplication");
		System.out.println("4. Division");
		
		choice = Sobj.nextInt();
		
		Siddhant sid = new Siddhant();  // Object Creation
		
		switch (choice)
		{
		case 1: iRet = sid.Addtion(iNo1,iNo2);
				System.out.println("Addition of "+ iNo1 + " and "+ iNo2 + " is : " +iRet);
				break;
				
		case 2: iRet = sid.Subtraction(iNo1,iNo2);
				System.out.println("Subtraction of "+ iNo1 + " and "+ iNo2 + " is : " +iRet);
				break;
				
		case 3: iRet = sid.Division(iNo1,iNo2);
				System.out.println("Subtraction of "+ iNo1 + " and "+ iNo2 + " is : " +iRet);
				break;
				
		case 4: if(iNo2 != 0)
				{ 
					iRet = sid.Multiplication(iNo1,iNo2);
					System.out.println("Subtraction of "+ iNo1 + " and "+ iNo2 + " is : " +iRet);
					break;
				}
				else
				{
					System.out.println("Error: Division by zero is not allowed.");
					break;
				}		
		default : System.out.println("Invalid choice. Please select a valid operation.");
    			  break;
		}
		
	}
}

class Siddhant
{

	public int Addtion(int iValue1, int iValue2)
	{
		// TODO Auto-generated method stub
		return iValue1 + iValue2;
	}

	public int Division(int iValue1, int iValue2) {
		// TODO Auto-generated method stub
		return iValue1 / iValue2;
	}

	public int Multiplication(int iValue1, int iValue2) {
		// TODO Auto-generated method stub
		return iValue1 * iValue2;
	}

	public int Subtraction(int iValue1, int iValue2) {
		// TODO Auto-generated method stub
		return iValue1 - iValue2;
	}
	
}