package com.JavaBasicConcept;

//Singleton class
public class _46_Singleton_Design_Pattern 
{
	// Main method to test Singleton
	public static void main(String[] args)
	{
     // Get the single instance of Singleton
     _46_Singleton_Design_Pattern singleton1 = _46_Singleton_Design_Pattern.getInstance();
     singleton1.showMessage();

     // Try to get the instance again
     _46_Singleton_Design_Pattern singleton2 = _46_Singleton_Design_Pattern.getInstance();
     singleton2.showMessage();

     // Check if both instances are the same
     System.out.println("Are both instances the same? " + (singleton1 == singleton2));
	}
	
	// Step 1: Create a private static variable of the class (single instance)
	private static _46_Singleton_Design_Pattern instance;

	// Step 2: Make the constructor private to prevent instantiation from other classes
	private _46_Singleton_Design_Pattern() 
	{
		System.out.println("Singleton Instance Created");
	}

	// Step 3: Provide a public static method to get the instance
	public static _46_Singleton_Design_Pattern getInstance()
	{
			if (instance == null) { // Lazy initialization
				instance = new _46_Singleton_Design_Pattern();
     }
     return instance;
 }

	// Example method to demonstrate functionality
	public void showMessage() 
	{
		System.out.println("Hello from Singleton!");
	}	
}


/**

private static Singleton instance;
Holds the single instance of the class. Initially, it is null.

private Singleton()
The constructor is private to restrict direct instantiation of the class from outside.

public static Singleton getInstance()
Provides a global access point to get the Singleton instance. It uses lazy initialization, creating the instance only when it's needed.

Lazy Initialization
The instance is created only when getInstance() is called for the first time.


*/