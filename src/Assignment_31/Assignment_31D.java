/**************************************** ASSIGNMENT NO - 31D ***************************************
 
 STATEMENT: Write a java program which accept string from user and check whether it contains vowels
  			in it or not.
 
 INPUT :  Siddhant
 OUTPUT : String Contains Vowels
   
*****************************************************************************************************/

package Assignment_31;

import java.lang.*;
import java.util.Scanner;

public class Assignment_31D {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String: ");
		String str = sobj.nextLine();
	
		boolean bRet = Siddhant31D.assign31D(str);
		
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

class Siddhant31D 
{
	public static boolean  assign31D(String str) 
	{	
		for(int iCnt=0; iCnt<str.length(); iCnt++)
		{
			char ch=str.charAt(iCnt);
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
*/