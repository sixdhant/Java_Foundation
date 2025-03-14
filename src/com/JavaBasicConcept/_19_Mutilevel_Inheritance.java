/* 		Mutilevel Inheritance Example	*/

package com.JavaBasicConcept;
public class _19_Mutilevel_Inheritance //Sub 2 class
{
	public static void main(String args[])
	{
		Mutilevel_Inheritance_1 sid = new Mutilevel_Inheritance_1();
		sid.add();
		sid.sub();
		sid.Muti();
		sid.Div();
		sid.rem();
	}
}

class Siddhant19 	// Super class
{
	int a,b,c;
	
	void add()
	{
		a=100; b=100;
		c=a+b;
		System.out.println("Addition is : "+c);
	}
	
	void sub()
	{
		a=100; b=100;
		c=a+-b;
		System.out.println("Subtraction is : "+c);
		
	}
}

class Mutilevel_Inheritance extends Siddhant19  // Sub 1 Class
{
	void Muti()
	{
		a=100; b=100;
		c=a * b;
		System.out.println("Addition is : "+c);
	}
	
	void Div()
	{
		a=100; b=100;
		c=a / b;
		System.out.println("Subtraction is : "+c);
	}	
}

class Mutilevel_Inheritance_1 extends Mutilevel_Inheritance // Sub 1 Class

{
	void rem()
	{
		a=100; b=100;
		c=a % b;
		System.out.println("Remender is : "+c);
	}
}
/*

Addition is : 200
Subtraction is : 0
Addition is : 10000
Subtraction is : 1
Remender is : 0


*/