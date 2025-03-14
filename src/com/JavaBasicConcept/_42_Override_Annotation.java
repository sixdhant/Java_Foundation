/*		@Override Annotation	 Example		*/

package com.JavaBasicConcept;
public class _42_Override_Annotation 
{
	public static void main(String[] args) 
	{
		B25 B = new B25();
		B.show();
		B.disp();
	}
}
class A25
{
	void show()
	{
		System.out.println("Super Class");
	}
}
class B25 extends A25
{
	@Override
	void show()
	{
		System.out.println("Sub Class");
	}
	void disp()
	{
		System.out.println("Display Method");
	}
}

/*

Sub Class
Display Method


*/