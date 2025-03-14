/**************************************** ASSIGNMENT NO - 23A ***************************************
 
 STATEMENT:  Write a program which accept string from user and convert it into lower case.
 
 INPUT :   SIDDHANT DESHMUKH
 OUTPUT :  s i d d h a n t   d e s h m u k h 
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23A
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.print("Enter String: ");
		str=sobj.nextLine();

		Siddhant23A.assign23A(str);		
	}
}

class Siddhant23A
{
	public static void assign23A(String str) {
		int iCnt = 0;
		char ch;
		
		System.out.print("Modified string is :");
		
		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if ((ch >= 'A') && (ch <= 'Z')) 
			{
				ch= (char) (ch + 32);
				System.out.print(" " +ch);
			} 
			else 
			{
				System.out.print(" " +ch);
			}
		}		
	}
}

/* OUTPUT:

Enter String: SIDDHANT
Modified string is : s i d d h a n t

Enter String: SIDDHANT DESHMUKH
Modified string is : s i d d h a n t   d e s h m u k h
*/