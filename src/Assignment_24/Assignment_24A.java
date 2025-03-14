/**************************************** ASSIGNMENT NO - 24A ***************************************
 
 STATEMENT: Write a program which accept string from user and accept one character. 
 	    Check whether that character is present in string or not.
 
 INPUT :   Siddhant Deshmukh    k
 OUTPUT :  The k Character is Found
  
*****************************************************************************************************/
package Assignment_24; 

import java.util.*;

public class Assignment_24A
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		char cValue = '\0';
		boolean bRet = false;
		
		System.out.println("Enter String: ");
		str=sobj.nextLine();
		
		System.out.println("Enter Character to search: ");
		cValue = sobj.next().charAt(0);
		
		bRet = Siddhant24A.assign24A(str, cValue);
		
		if(bRet == true)
		{
			System.out.println("The " +cValue+" Character is Found");
		}
		else
		{
			System.out.println("The" +cValue+" Character is NOT Found");
		}
	}
}

class Siddhant24A
{
	public static boolean assign24A(String str, char cValue) {
		int iCnt = 0;
		char ch;
			
		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if(ch == cValue) 
	        {
	            return true;
	        }
		}
		return false;
	}
}

/* OUTPUT:

Enter String: Siddhant Deshmukh
Enter Character to search: k
Thek Character is Found

Enter String: 
siddhant deshmukh
Enter Character to search: x
Thex Character is NOT Found

*/




