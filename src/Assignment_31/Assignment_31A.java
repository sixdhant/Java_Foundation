/**************************************** ASSIGNMENT NO - 31A ***************************************
 
 STATEMENT: Write a Java program which accept string from user and count number of capital characters.
 
 INPUT :   SiddhNT
 OUTPUT :  3
   
*****************************************************************************************************/

package Assignment_31;

import java.util.Scanner;

public class Assignment_31A {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
	
		System.out.print("Enter String: ");
		String str = sobj.nextLine();
	
		int iRet= Siddhant31A.assign31A(str);
		
		System.out.println("Number of small characters are: "+iRet);	
	}
}

class Siddhant31A 
{
	public static int assign31A(String str) 
	{	
		int iCap = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if((ch>='A') && (ch<='Z'))
				iCap++;
		}
		return iCap;
	}
}

/* OUTPUT:

Enter String : SiddhNT
Number of capital characters are : 3

Enter String :Siddhant Suryakant Deshmukh
Number of capital characters are : 3
*/