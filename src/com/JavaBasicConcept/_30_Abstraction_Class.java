/* 		Abstraction_Class Example		*/

package com.JavaBasicConcept; 
public class _30_Abstraction_Class 
{
	public static void main(String[] args)  
	{
		// Creating instances of Dog2 and Lion
		Dog2 d = new Dog2();
		Lion l = new Lion();
		
		// Calling the Sound method of both Dog2 and Lion objects
		d.Sound();  // Output: "Dog is Barking"
		l.Sound();  // Output: "Lion is Roaring"
	}
}

// Abstract class Animal1
abstract class Animal1
{
	// Constructor for Animal1 class
	Animal1()
	{
		// This constructor will be called when any subclass object is created
		System.out.println("All Animal........");
	}

	// Abstract method 'Sound' which must be implemented by subclasses
	public abstract void Sound();
}

// Dog2 class extends the abstract class Animal1
class Dog2 extends Animal1
{
	// Constructor of Dog2 class
	Dog2()
	{
		// Calls the constructor of Animal1 using super()
		super();
	}

	// Implementation of the abstract method 'Sound'
	public void Sound()
	{
		// Prints that the dog is barking
		System.out.println("Dog is Barking");
	}
}

// Lion class extends the abstract class Animal1
class Lion extends Animal1
{
	// Constructor of Lion class
	Lion()
	{
		// Calls the constructor of Animal1 using super()
		super();
	}

	// Implementation of the abstract method 'Sound'
	public void Sound()
	{
		// Prints that the lion is roaring
		System.out.println("Lion is Roaring");
	}
}

/*

All Animal........
All Animal........
Dog is Barking
Lion is Roaring

*/
