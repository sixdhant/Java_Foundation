/**************************************** ASSIGNMENT NO - 23A ***************************************
 
 STATEMENT:  Write a program which accept string from user and convert it into lower case.
 
 INPUT :   SIDDHANT DESHMUKH
 OUTPUT :  s i d d h a n t   d e s h m u k h 
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23A1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.print("Enter String: ");
		str=sobj.nextLine();

		Siddhant23A1.assign23A(str);		
	}
}

class Siddhant23A1
{
	public static void assign23A(String str) {
		
		System.out.println("Output :"+str.toLowerCase().trim());
	}
}

/* OUTPUT:

Enter String: SIDDHANT
Modified string is : s i d d h a n t

Enter String: SIDDHANT DESHMUKH
Modified string is : s i d d h a n t   d e s h m u k h
*/