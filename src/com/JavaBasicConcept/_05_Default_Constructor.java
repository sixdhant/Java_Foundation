/* 		Default	  Constructor			*/

package com.JavaBasicConcept;

public class _05_Default_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Siddhant5 sid = new Siddhant5();  // Object Creation
		sid.Show();
		
	}
}
class Siddhant5
{
	int iNo1;
	String sName;
	boolean bValue;
	/*
	Siddhant5()   		// Default Constructor
	{
		iNo1 = 0;
		sName = null;
		bValue = false;
	}
	*/
	void Show() //Method
	{
		System.out.println("Output is : "+iNo1+" / "+sName+" / "+bValue);
	}
	
}


/* Output is :

Output is : 0 / null / false

*/