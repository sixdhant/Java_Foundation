/* 		Method Overriding  - Compile Time Polymorphism	*/

package com.JavaBasicConcept;
public class _27_Method_Overriding 
{
	public static void main(String[] args) 
	{
		Siddhant27 sid =  new Square();	// Object Creation
		sid.draw();
	}
}

class Siddhant27
{
	void draw() 	// Method 
	{
		System.out.println("Cant Not Say Shape Type");
	}
}
class Square extends Siddhant27 // Inheritance
{
	@Override
	void draw()	// Method 
	{
		super.draw();
		System.out.println("Square Shape");
	}		
}
	
/*

Cant Not Say Shape Type
Square Shape

*/