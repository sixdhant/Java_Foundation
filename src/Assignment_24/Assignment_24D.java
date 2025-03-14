/**************************************** ASSIGNMENT NO - 24D ***************************************
 
 STATEMENT: Write a program which accept string from user and accept one character. 
 	    Return index of Last occurrence of that character.
  
 INPUT :   siddhant			t    
 OUTPUT :  The Last Occurrence of the Search Element t at Position 8 
  
*****************************************************************************************************/
package Assignment_24; 

import java.util.*;

public class Assignment_24D
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
		
		iRet = Siddhant24D.assign24D(str, cValue);

		if(iRet == -1)
	    {
			System.out.println("Sorry!! We haven't found the the Search Element "+cValue);
	    }
	    else
	    {
	    	System.out.println("The Last Occurrence of the Search Element "+cValue+" at Position "+iRet);
	    }
	}
}

class Siddhant24D 
{
	public static int assign24D(String str, char cValue) 
	{
		int iCnt = 0,in = 0, iIndex = -1;
		char ch;

		for (iCnt = 0; iCnt < str.length(); iCnt++) 
		{
			ch = str.charAt(iCnt);
			if (ch == cValue) 
			{
				iIndex = iCnt;
			}
			//iCnt++;
		}
		if (iIndex == str.length()) 
		{
			return -1;
		} 
		else 
		{
			return iCnt;
		}
	}
}

/* OUTPUT:

Enter String: siddhant
Enter Character to search: t
The Last Occurrence of the Search Element t at Position 8

Enter String: siddhant deshmukh
Enter Character to search: k
The Last Occurrence of the Search Element k at Position 16

Enter String: siddhant deshmukh
Enter Character to search: x
Sorry!! We haven't found the the Search Element x
*/




