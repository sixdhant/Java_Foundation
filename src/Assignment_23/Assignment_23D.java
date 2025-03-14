/**************************************** ASSIGNMENT NO - 23D ***************************************
 
 STATEMENT:  Write a program which accept string from user and display only digits from that string.
 
 INPUT :  siddhant121deshmukh108     
 OUTPUT : Digits in the string is : 1 2 1 1 0 8  
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23D
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.println("Enter String: ");
		str=sobj.nextLine();

		Siddhant23D sid23D = new Siddhant23D();
		sid23D.assign23D(str);		
	}
}

class Siddhant23D
{
	public void assign23D(String str) {
		int iCnt = 0;
		char ch;
		
		System.out.print("Digits in the string is :");
		
		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if((ch>='0') && (ch <='9')) 
	        {
				System.out.print(""+ch);
	        }
		}		
	}
}

/* OUTPUT:

Enter String: siddhant121
Digits in the string is : 1 2 1

Enter String: siddhant121deshmukh108
Digits in the string is : 1 2 1 1 0 8
*/