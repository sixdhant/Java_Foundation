/*		Interface Private Methods		*/

package com.JavaBasicConcept;
public class _40_Interface_Private_Methods 
{
	public static void main(String[] args) 
	{
		B23 B = new B23();
		B.call();
		B.sub(400, 300);
	}
}
interface A23
{
	default void call()
	{
		add(300,500);
	}
	private void add(int x, int y)
	{
		System.out.println("Sum of two numbers:   "+(x+y));
	}
}
class B23 implements A23
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