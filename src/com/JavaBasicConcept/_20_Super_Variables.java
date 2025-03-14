/* 		Super Keyword Using Variables Example	*/

package com.JavaBasicConcept;
public class _20_Super_Variables 
{
	public static void main(String args[])
	{
		Siddhant_201 sid = new Siddhant_201(); // Object Creation
		sid.Display();
	}
}
class Siddhant_20
{
	int iNo1 = 100, iNo2 = 200, iResult = 0;
}

class Siddhant_201 extends Siddhant_20		// Inheritance
{
	int iNo1 = 300, iNo2 = 400, iResult = 0;
	
	void Display()	// Method
	{
		iResult = iNo1 + iNo2;
		System.out.println("Addition is : "+iNo1+" and " +iNo2+ " is "+iResult);   // Normal
		
		super.iResult = super.iNo1 + super.iNo2;
		System.out.println("Super class variables Addition is : "+super.iNo1+" and " +super.iNo2+ " is "+super.iResult);	// Call Super class variables in Sub_Class Using "Super Keyword"
	}
}
/* OUTPUT: 

Addition is : 300 and 400 is 700
Super class variables Addition is : 100 and 200 is 300

*/