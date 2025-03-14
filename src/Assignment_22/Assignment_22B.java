/**************************************** ASSIGNMENT NO - 22B ***************************************
 
 STATEMENT: Write a java program which accept string from user and count number of small characters.
 
 INPUT :  siddhant     
 OUTPUT : Number of Small characters are: 8  
  
*****************************************************************************************************/
package Assignment_22; 

import java.util.*;

public class Assignment_22B
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		int iRet=0;

		System.out.print("Enter String: ");
		str=sobj.nextLine();

		iRet = Siddhant22B.assign22B(str);

		System.out.println("Number of Small characters are: "+iRet);	
	}
}

class Siddhant22B
{
	public static int assign22B(String str)
	{
		int iCnt=0, iSmall=0;
		char ch;

		for(iCnt=0; iCnt<str.length(); iCnt++)
		{
			ch=str.charAt(iCnt);
			if((ch >= 'a') && (ch <= 'z'))
			{
				iSmall++;
			}
		}
		return iSmall;
	}
}

/* OUTPUT:

Enter String: siddhant
Number of Small characters are: 8

Enter String: siddhant
Number of Small characters are: 8
*/