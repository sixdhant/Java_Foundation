/*			Var Arg Method				*/

package com.JavaBasicConcept;
public class _43_Var_Arg_Method 
{
	public static void main(String[] args) 
	{
		A26 A =  new A26();
		A.add();
		A.add(10);
		A.add(10,20);
		A.add(10,20,30);
		A.add(10,20,30,40);
	}
}
class A26
{
	
	void add(int ...a)		// Var Arg Method
	{
		int iSum  = 0;
		for(int x:a)
		{
			iSum = iSum + x;
		}
		System.out.println("Sum of all numbers is : "+iSum);
	}
}

/*

Sum of all numbers is : 0
Sum of all numbers is : 10
Sum of all numbers is : 30
Sum of all numbers is : 60
Sum of all numbers is : 100


*/