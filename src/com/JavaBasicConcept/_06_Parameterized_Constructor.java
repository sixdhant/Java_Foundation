/* 		Parameterized	 Constructor			*/

package com.JavaBasicConcept;

public class _06_Parameterized_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Siddhant6 sid = new Siddhant6(100, "Siddhant Deshmukh", false);  // Object Creation
		sid.Show();
		
	}
}
class Siddhant6
{
	int iNo1;
	String sName;
	boolean bValue;
	
	Siddhant6(int iValue1, String iValue2, boolean iValue3)   		// Parameterized Constructor
	{
		iNo1 = iValue1;
		sName = iValue2;
	}
	
	void Show() // Method 
	{
		System.out.println("Output is : "+iNo1+" / "+sName+ " / "+bValue);
	}
	
}


/* Output is :

Output is : 100 / Siddhant Deshmukh / false

*/