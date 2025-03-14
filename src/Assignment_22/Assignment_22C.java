/**************************************** ASSIGNMENT NO - 22C ***************************************
 
 STATEMENT: Write a java program which accept string from user and return difference between 
 	    frequency of small characters and frequency of capital characters.
 
 INPUT :   Siddhant Deshmukh    
 OUTPUT :  difference between frequency are: 12 
  
*****************************************************************************************************/
package Assignment_22; 

import java.util.*;

public class Assignment_22C
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		int iRet=0;

		System.out.print("Enter String: ");
		str=sobj.nextLine();

		iRet = Siddhant22C.assign22C(str);

		System.out.println("difference between frequency are: "+iRet);	
	}
}

class Siddhant22C
{
	public static int assign22C(String str)
	{
		int iCnt=0, iSmall=0, iCap = 0, iDiff= 0;
		char ch;

		for(iCnt=0; iCnt<str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if((ch>= 'a') && (ch<= 'z'))
			{
				iSmall++;
			}
			else if((ch>= 'A') && (ch<= 'Z'))
			{
			    iCap++;
			}
		}
		System.out.println("String iSmall : "+iSmall);
		System.out.println("String iCap: "+iCap);
		iDiff = iSmall - iCap;
		return iDiff;
	}
}

/* OUTPUT:
Enter String: Siddhant
String iSmall : 7
String iCap: 1
difference between frequency are: 6


Enter String: Siddhant Deshmukh
String iSmall : 14
String iCap: 2
difference between frequency are: 12
*/