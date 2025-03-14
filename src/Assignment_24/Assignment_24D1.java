/**************************************** ASSIGNMENT NO - 24D ***************************************
 
 STATEMENT: Write a program which accept string from user and accept one character. 
 	    Return index of Last occurrence of that character.
  
 INPUT :   siddhant			t    
 OUTPUT :  The Last Occurrence of the Search Element t at Position 8 
  
*****************************************************************************************************/
package Assignment_24; 

import java.util.*;

public class Assignment_24D1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=sobj.nextLine();
		
		System.out.print("Enter Character to search: ");
		char cValue = sobj.next().charAt(0);
		
		int iRet = Siddhant24D1.assign24D(str, cValue);

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

class Siddhant24D1
{
	public static int assign24D(String str, char cValue) 
	{
		int i = 0;
		
		for(i = str.length()-1; i >= 0 ; i--)
		{
			char ch = str.charAt(i);
			if(ch == cValue)
			{
				return i;
			}
		}
		return -1;
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




