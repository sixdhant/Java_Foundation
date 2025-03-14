/* 		Copy   Constructor			*/

package com.JavaBasicConcept;

import java.util.Scanner;

public class _09_Copy_Constructor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sobj = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int iNo1 = Sobj.nextInt();
		Sobj.nextLine();   // Consume the leftover newline
		
		System.out.print("Enter String : ");
		String sName = Sobj.nextLine();
		
		Siddhant9 sid = new Siddhant9(iNo1,sName);  	// Object Creation
		Siddhant9 sid1 = new Siddhant9(sid);			// Object Creation
	}
}
class Siddhant9
{
	int iNo1;
	String sName;
	
	Siddhant9(int iValue1, String iValue2)   // Constructor	
	{
		iNo1 = iValue1;
		sName = iValue2;
		System.out.println("Output Constructor :"+iNo1+ " / "+sName);
	}
	Siddhant9(Siddhant9 ref) // Copy Constructor
	{
		int a = ref.iNo1;
		String b = ref.sName;
		System.out.println("Output Copy Constructor :"+a+ " / "+b);
	}
}


/* Output is :

Enter Number : 100
Enter String : Siddhant Deshmukh
Output Constructor :100 / Siddhant Deshmukh
Output Copy Constructor :100 / Siddhant Deshmukh

*/