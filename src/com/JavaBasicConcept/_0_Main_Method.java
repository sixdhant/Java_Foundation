package com.JavaBasicConcept;

public class _0_Main_Method 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
}

/**

public:
		This is an access modifier.
		It means the main method is accessible from anywhere.
		Necessary because the Java Virtual Machine (JVM) needs to call this method to start the program.

static:
		Indicates that the main method belongs to the class and not to an instance of the class.
		This allows the JVM to invoke it without creating an object of the class.

void:
		The return type of the method.
		Specifies that the method does not return any value.

main:
		This is the name of the method.
		The JVM looks specifically for a method with this name to start execution.

String[] args:
		This is an array of String objects.
		It allows the program to accept command-line arguments when executed.
*/