/* 		Abstraction Example		*/

package com.JavaBasicConcept; 
public class _29_Abstraction 
{
	public static void main(String[] args)  
	{
		// Create an object of type Dog1, but reference it with Siddhant29 (parent class type)
		Siddhant29 sid = new Dog1();  
		// Call the show method using the Dog1 object
		sid.show();  
	}
}

// Abstract class named Siddhant29
// It contains a method 'show' which is non-abstract (concrete method)
abstract class Siddhant29
{
	// A concrete method that prints "Hello World"
	 void show()  
	 {
		System.out.println("Siddhant Deshmukh");  // Output "Hello World"
	}
}

// A class named Dog1 that extends the abstract class Siddhant29
// Since Siddhant29 has no abstract methods, Dog1 is not forced to override any methods
class Dog1 extends Siddhant29  
{
	// No additional methods or properties are added in this class
}

/*

Siddhant Deshmukh

*/