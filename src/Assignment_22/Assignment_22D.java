/**************************************** ASSIGNMENT NO - 22D ***************************************
 
 STATEMENT: Write a java program which accept string from user and check  whether it contains vowels
  			in it or not.
 
 INPUT :  Siddhant     
 OUTPUT : String Contains Vowels  
  
*****************************************************************************************************/
package Assignment_22; 

import java.util.*;

public class Assignment_22D
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		boolean bRet= false;

		System.out.print("Enter String: ");
		str=sobj.nextLine();

		bRet = Siddhant22D.assign22D(str);

		if(bRet==true)
		{
			System.out.println("String Contains Vowels");
		}
		else
		{
			System.out.println("String does not Contains Vowels");
		}
	}
}

class Siddhant22D
{
	public static boolean assign22D(String str)
	{
		int iCnt=0;
		char ch;
		for(iCnt=0; iCnt<str.length(); iCnt++)
		{
			ch=str.charAt(iCnt);
			if((ch=='a') || (ch=='e')||(ch=='i') ||(ch=='o') ||(ch=='u')||
			   (ch=='A') ||(ch=='E') ||(ch=='I') ||(ch=='O') ||(ch=='U'))
			{
				return true;
			}			
		}
		return false;
	}
}

/* OUTPUT:

Enter String: Siddhant
String Contains Vowels

Enter String: xyz
String does not Contains Vowels
*/