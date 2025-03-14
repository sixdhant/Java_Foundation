/*			Interface Static Methods 			*/

package com.JavaBasicConcept;
public class _39_Interface_Static_Methods 
{
	public static void main(String[] args) 
	{
		A22.show();
		B22 B = new B22();
		B.show();
	}
}
interface A22
{
	public static void show()
	{
		System.out.println("Can Not Override interface static methods");
	}
}

class B22 implements A22
{
	//@Override
	public static void show()
	{
		System.out.println("Errors");
	}
}
/*
Can Not Override interface static methods
Errors


*/