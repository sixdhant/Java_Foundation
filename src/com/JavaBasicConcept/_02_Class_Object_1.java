/* 			Class and Object Using Parametrized	*/

package com.JavaBasicConcept;

public class _02_Class_Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Siddhant2 sid = new Siddhant2();    // Object Creation
		// Reference     	// instance
		sid.show(100, "Siddhant Deshmukh"); // Call Method 
	}
}
class Siddhant2 
{
	void show(int iNo1, String sName)  // Method 
	{
		System.out.println("Output is : "+ iNo1  +" / " +sName);
	}
}

/**

Output is : 100 / Siddhant Deshmukh

*/