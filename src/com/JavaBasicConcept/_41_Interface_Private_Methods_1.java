/*		Interface Private Methods		*/

package com.JavaBasicConcept;
public class _41_Interface_Private_Methods_1 
{
	public static void main(String[] args) 
	{
		B24 B = new B24();
		A24.call();					// No need create object of interface
		B.sub(400, 300);
	}
}
interface A24
{
	public static void call()
	{
		add(300,500);
	}
	private static void add(int x, int y)
	{
		System.out.println("Sum of two numbers:   "+(x+y));
	}
}
class B24 implements A24
{
	public void sub(int x, int y)
	{
		System.out.println("Diff of two numbers:   "+(x-y));
	}
}

/* 
Sum of two numbers:   800
Diff of two numbers:   100

*/