/**************************************** ASSIGNMENT NO - 22A ***************************************
 
 STATEMENT: Write a Java program which accept string from user and count number of capital characters.
 
 INPUT :    Siddhant Suryakant Deshmukh   
 OUTPUT :   Number of capital characters are : 3
  
*****************************************************************************************************/
package Assignment_22; 

import java.util.*;

public class Assignment_22A
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		int iRet=0;

		System.out.print("Enter String: ");
		str=sobj.nextLine();

		iRet = Siddhant22A.assign22A(str);

		System.out.println("Number of capital characters are: "+iRet);	
	}
}

class Siddhant22A
{
	public static int assign22A(String str)
	{
		int i=0, iCap=0;
		char ch;

		for(i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			if((ch>='A') && (ch<='Z'))
			{
				iCap++;
			}
		}
		return iCap;
	}
}


/* OUTPUT:

Enter String: SiddhNT
Number of capital characters are : 3

Enter String :Siddhant Suryakant Deshmukh
Number of capital characters are : 3
*/