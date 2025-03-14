/**************************************** ASSIGNMENT NO - 24E ***************************************
 
 STATEMENT: Write a program which accept string from user reverse that string in place.
  
 INPUT :  Siddhant Suryakant Deshmukh     
 OUTPUT : hkumhseD tnakayruS tnahddiS  
  
*****************************************************************************************************/
package Assignment_24; 

import java.util.*;

public class Assignment_24E
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str, sReverse;
		
		System.out.print("Enter String: ");
		str=sobj.nextLine();
				
		Siddhant24E.assign24E(str);

		//System.out.println("Reverse string is : "+sReverse);	
	}
}

class Siddhant24E
{
	public static void  assign24E(String str) 
	{
			String temp = " ";
			
			for(int i = str.length() - 1; i >= 0 ; i--)
			{
				temp = temp + str.charAt(i);
			}
			System.out.println("Output : "+temp);
	}
}

/* OUTPUT:

Enter String: Siddhant
Reverse string is : tnahddiS

Enter String: Siddhant Suryakant Deshmukh
Reverse string is : hkumhseD tnakayruS tnahddiS
*/




