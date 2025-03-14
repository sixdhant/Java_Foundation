/**************************************** ASSIGNMENT NO - 24C ***************************************
 
 STATEMENT: Write a program which accept string from user and accept one character. 
 	    Return index of first occurrence of that character.
  
 INPUT :   siddhant deshmukh    	k
 OUTPUT :  The First Occurrence of the Search Element k at Position 16 
  
*****************************************************************************************************/
package Assignment_24; 

import java.util.*;

public class Assignment_24C1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.print("Enter String: ");
		String str=sobj.nextLine();
		
		System.out.print("Enter Character to search: ");
		char cValue = sobj.next().charAt(0);
		
		int iRet = Siddhant24C1.assign24C(str, cValue);

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

class Siddhant24C1
{
	public static int assign24C(String str, char cValue) 
	{

		for(int i = 0; i <  str.length() ; i++)
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
The First Occurrence of the Search Element t at Position 8

Enter String: siddhant deshmukh
Enter Character to search: k
The First Occurrence of the Search Element k at Position 16

Enter String: siddhant deshmukh
Enter Character to search: x
Sorry!! We haven't found the the Search Element x
*/












