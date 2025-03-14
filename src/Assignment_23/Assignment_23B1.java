/**************************************** ASSIGNMENT NO - 23B ***************************************
 
 STATEMENT:  Write a program which accept string from user and convert it into Upper case.
 
 INPUT :   siddhant deshmukh    
 OUTPUT :  S I D D H A N T   D E S H M U K H 
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23B1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.print("Enter String: ");
		str=sobj.nextLine();

		Siddhant23B1.assign23B(str);		
	}
}

class Siddhant23B1
{
	public static void assign23B(String str) {
		
		System.out.println("Output :" +str.toUpperCase().trim());
	}
}

/* OUTPUT:

Enter String: siddhant
Modified string is : S I D D H A N T

Enter String: siddhant deshmukh
Modified string is : S I D D H A N T   D E S H M U K H
*/