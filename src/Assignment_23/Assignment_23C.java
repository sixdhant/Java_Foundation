/**************************************** ASSIGNMENT NO - 23C ***************************************
 
 STATEMENT:  Write a program which accept string from user and toggle the case.
 
 INPUT :  Siddhant Deshmukh     
 OUTPUT : s I D D H A N T d E S H M U K H  
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23C
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.println("Enter String: ");
		str=sobj.nextLine();

		Siddhant23C sid23C = new Siddhant23C();
		sid23C.assign23C(str);		
	}
}

class Siddhant23C
{
	public void assign23C(String str) {
		int iCnt = 0;
		char ch;
		
		System.out.print("Modified string is :");
		
		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if(( ch >='a') && (ch <= 'z'))
	        {
				ch = (char) (ch - 32);
				System.out.print(" " + ch);
	        }
	        else if(( ch >='A') && ( ch <= 'Z'))
	        {
	        	ch = (char) (ch + 32);
	        	System.out.print(" "+ ch);
	        }
		}		
	}
}

/* OUTPUT:

Enter String: Siddhant
Modified string is : s I D D H A N T

Enter String: Siddhant Deshmukh
Modified string is : s I D D H A N T d E S H M U K H
*/