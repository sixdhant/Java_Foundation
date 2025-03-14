/* 			Instance Block Example			*/

package com.JavaBasicConcept;

public class _16_Instance_Block_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Siddhant13 sid = new Siddhant13();		// Object Creation
		sid.Show();
	}

}
class Siddhant13
{
	Siddhant13() 	// Constructor
	{
		int iNo1 = 100, iNo2 = 200;
		System.out.println("Output 1 : "+iNo1+" and "+iNo2);		// Second Run Constructor
	}
	
	// Instance Block
	{
		int iNo1 = 300, iNo2 = 400;
		System.out.println("Output 2 : "+iNo1+" and "+iNo2);		// 	First Run Instance Block
	}
	
	void Show()  // Method
	{
		int iNo1 = 500, iNo2 = 600;
		System.out.println("Output 3 : "+iNo1+" and "+iNo2);		// 	Third Run Method
	}
}

/*

Output 2 : 300 and 400
Output 1 : 100 and 200
Output 3 : 500 and 600


*/