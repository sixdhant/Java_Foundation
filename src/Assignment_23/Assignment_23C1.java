/**************************************** ASSIGNMENT NO - 23C ***************************************
 
 STATEMENT:  Write a program which accept string from user and toggle the case.
 
 INPUT :  Siddhant Deshmukh     
 OUTPUT : s I D D H A N T d E S H M U K H  
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23C1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.println("Enter String: ");
		str=sobj.nextLine();

		Siddhant23C1.assign23C(str);		
	}
}

class Siddhant23C1
{
	public static void assign23C(String str) {
		StringBuffer buffer = new StringBuffer();
		
		char ch;
		
		for(int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				buffer.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch))
			{
				buffer.append(Character.toUpperCase(ch));
			}
			else {
				buffer.append(ch);
			}
		}
		System.out.println(buffer);
	}
}

/* OUTPUT:

Enter String: 
Siddhant Deshmukh
sIDDHANT dESHMUKH

*/