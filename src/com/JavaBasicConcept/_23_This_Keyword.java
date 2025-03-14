/* 		This Keyword 		*/

package com.JavaBasicConcept;
public class _23_This_Keyword 
{
	public static void main(String[] args) 
	{
		_23_This_Keyword sid = new _23_This_Keyword();	// Object Creation
		 System.out.println(sid);
		 sid.Display();
	}
	
	void Display() 	// Method
	{
		System.out.println(this);  // Same Instance value
	}
}

/* OUTPUT :

org.Interview._23_This_Keyword@515f550a
org.Interview._23_This_Keyword@515f550a

*/
