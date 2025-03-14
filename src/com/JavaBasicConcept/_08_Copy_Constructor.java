/* 		Copy   Constructor			*/

package com.JavaBasicConcept;
public class _08_Copy_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Siddhant8 sid = new Siddhant8();		// Object Creation
		Siddhant8 sid1 = new Siddhant8(sid);	// Object Creation
	}
}
class Siddhant8
{
	int iNo1;
	String sName;
	
	
	Siddhant8()   	// 	Constructor
	{
		iNo1 = 100;
		sName = "Siddhant Deshmukh";
		System.out.println("Output Constructor :"+iNo1+ " / "+sName);
	}
	Siddhant8(Siddhant8 ref) // Copy Constructor
	{
		int a = ref.iNo1;
		String b = ref.sName;
		System.out.println("Output Copy Constructor :"+a+ " / "+b);
	}
	
}


/* Output is :

Output Constructor :100 / Siddhant Deshmukh
Output Copy Constructor :100 / Siddhant Deshmukh

*/