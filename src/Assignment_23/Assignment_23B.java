/**************************************** ASSIGNMENT NO - 23B ***************************************
 
 STATEMENT:  Write a program which accept string from user and convert it into Upper case.
 
 INPUT :   siddhant deshmukh    
 OUTPUT :  S I D D H A N T   D E S H M U K H 
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23B
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.print("Enter String: ");
		str=sobj.nextLine();

		Siddhant23B sid23B = new Siddhant23B();
		sid23B.assign23B(str);		
	}
}

class Siddhant23B
{
	public void assign23B(String str) {
		int iCnt = 0;
		char ch;
		
		System.out.print("Modified string is :");
		
		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if ((ch >= 'a') && (ch <= 'z')) 
			{
				ch= (char) (ch - 32);
				System.out.print(" " +ch);
			} 
			else 
			{
				System.out.print(" " +ch);
			}
		}		
	}
}

/* OUTPUT:

Enter String: siddhant
Modified string is : S I D D H A N T

Enter String: siddhant deshmukh
Modified string is : S I D D H A N T   D E S H M U K H
*/