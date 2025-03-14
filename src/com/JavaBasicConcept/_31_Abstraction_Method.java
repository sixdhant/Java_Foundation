/* 		Abstraction Method Example		*/

package com.JavaBasicConcept; 
public class _31_Abstraction_Method 
{
	public static void main(String[] args) 
	{
		// Creating an object of Java class but referencing it with Programming type
		Programming h = new Java();  
		
		// Calling the methods Developer() and Rank() on the object h
		h.Developer();  // Output: "Siddhant Deshmukh"
		h.Rank();       // Output: "LA Esfera"
	}
}

// Abstract class Programming
abstract class Programming
{
	// Abstract method Developer(), must be implemented by a subclass
	public abstract void Developer();
	
	// Abstract method Rank(), must be implemented by a subclass
	public abstract void Rank();
}

// Abstract class HTML that extends Programming
abstract class HTML extends Programming
{
	// Provides an implementation for the Developer() method
	@Override
	public void Developer()
	{
		
		System.out.println("Siddhant Deshmukh");
	}
}

// Concrete class Java that extends the abstract class HTML
class Java extends HTML
{	
	// Implements the abstract method Rank() from the Programming class
	@Override
	public void Rank()
	{
		System.out.println("LA Esfera");
	}
}

/*

Siddhant Deshmukh
LA Esfera

*/