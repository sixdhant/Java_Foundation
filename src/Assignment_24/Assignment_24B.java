/**************************************** ASSIGNMENT NO - 24B ***************************************
 
 STATEMENT: Write a program which accept string from user and accept one character. 
 	    Return frequency of that character.
  
 INPUT :    siddhant deshmukh  	d
 OUTPUT :   frequency of Character is: 3
  
*****************************************************************************************************/
package Assignment_24; 

import java.util.*;

public class Assignment_24B
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		char cValue = '\0';
		int iRet = 0;
		
		System.out.print("Enter String: ");
		str=sobj.nextLine();
		
		System.out.print("Enter Character to search: ");
		cValue = sobj.next().charAt(0);
		
		iRet = Siddhant24B.assign24B(str, cValue);

		System.out.println("frequency of Character is: "+iRet);
	}
}

class Siddhant24B
{
	public static int assign24B(String str, char cValue) {
		int iCnt = 0, iCount = 0;
		char ch;
			
		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if(ch == cValue) 
	        {
				iCount++;
	        }
		}
		return iCount;
	}
}

/* OUTPUT:

Enter String: siddhant deshmukh
Enter Character to search: d
frequency of Character is: 3

Enter String: siddhant suryakant deshmukh
Enter Character to search: s
frequency of Character is: 3
*/




