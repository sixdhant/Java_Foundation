/**************************************** ASSIGNMENT NO - 22E ***************************************
 
 STATEMENT: Write a java program which accept string from user and display it in reverse order.
 
 INPUT :  Siddhant Suryakant Deshmukh    
 OUTPUT : hkumhseD tnakayruS tnahddiS  
  
*****************************************************************************************************/
package Assignment_22; 

import java.util.*;

public class Assignment_22E
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str, sReverse;
		

		System.out.println("Enter String: ");
		str=sobj.nextLine();

		sReverse = Siddhant22E.assign22E(str);

		System.out.println("Reverse string is : "+sReverse);	
	}
}

class Siddhant22E
{
	public static String assign22E(String str)
	{
		char Arr[] = str.toCharArray();
		int iStart = 0, iEnd = Arr.length-1;
		char temp;
		while(iStart < iEnd)
		{
			temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = temp;
			iStart++;
			iEnd--;
		}		
		return new String(Arr);
	}
}

/* OUTPUT:

Enter String: Siddhant
Reverse string is : tnahddiS

Enter String: Siddhant Suryakant Deshmukh
Reverse string is : hkumhseD tnakayruS tnahddiS
*/