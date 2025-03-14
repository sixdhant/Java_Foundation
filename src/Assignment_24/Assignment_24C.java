/**************************************** ASSIGNMENT NO - 24C ***************************************
 
 STATEMENT: Write a program which accept string from user and accept one character. 
 	    Return index of first occurrence of that character.
  
 INPUT :   siddhant deshmukh    	k
 OUTPUT :  The First Occurrence of the Search Element k at Position 16 
  
*****************************************************************************************************/
package Assignment_24; 

import java.util.*;

public class Assignment_24C
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
		
		Siddhant24C sid24C = new Siddhant24C();
		iRet = sid24C.assign24C(str, cValue);

		if(iRet == -1)
	    {
			System.out.println("Sorry!! We haven't found the the Search Element "+cValue);
	    }
	    else
	    {
	    	System.out.println("The First Occurrence of the Search Element "+cValue+" at Position "+iRet);
	    }
	}
}

class Siddhant24C
{
	public int assign24C(String str, char cValue) 
	{
		int iCnt = 0, iCount = 1;
		char ch;
			
		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if(ch == cValue)
	        {
	            break;
	        }
			iCount++;
		}
		if(iCnt == str.length())
		{
			return - 1;
		}
		else
		{
			return iCount;
		}
	}
}

/* OUTPUT:

Enter String: siddhant
Enter Character to search: t
The First Occurrence of the Search Element t at Position 8

Enter String: siddhant deshmukh
Enter Character to search: k
The First Occurrence of the Search Element k at Position 16

Enter String: siddhant deshmukh
Enter Character to search: x
Sorry!! We haven't found the the Search Element x
*/












