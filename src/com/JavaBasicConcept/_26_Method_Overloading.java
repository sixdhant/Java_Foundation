/* 		Method Overloading - Compile Time Polymorphism	*/

package com.JavaBasicConcept;
public class _26_Method_Overloading 
{
	public static void main(String[] args) 
	{
		Siddhant26 sid = new Siddhant26();	// Object Creation
		sid.add(100, 200);
		sid.add(50, 45.50);
		int addition = sid.add();
		System.out.println("Output 1 Addition is : "+addition);
	}
}

class Siddhant26
{
	int add() 	// Method return type
	{
		int iNo1 = 10, iNo2 = 20, iRet = 0;
		iRet = iNo1 + iNo2;
		return iRet;
	}
	
	void add(int x, int y)		// Method
	{
		int  z = 0;
		z = x + y;
		System.out.println("Output 2 Addition is : "+z);
	}
	
	void add(int a, double b)	// Method
	{
		double c = 0;
		c = a + b;
		System.out.println("Output 3 Addition is : "+c);
	}
}


//Give me another example of Method Overloading

/*

Output 2 Addition is : 300
Output 3 Addition is : 95.5
Output 1 Addition is : 30

*/