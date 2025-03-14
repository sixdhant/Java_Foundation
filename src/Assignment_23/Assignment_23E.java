/**************************************** ASSIGNMENT NO - 23E ***************************************
 
 STATEMENT: Write a program which accept string from user and count number of white spaces
 
 INPUT :  siddhant suryakant deshmukh     
 OUTPUT : number of white spaces is: 2  
  
*****************************************************************************************************/
package Assignment_23; 

import java.util.*;

public class Assignment_23E
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		int iRet = 0;
		
		System.out.println("Enter String: ");
		str=sobj.nextLine();

		Siddhant23E sid23E = new Siddhant23E();
		iRet = sid23E.assign23E(str);	
		
		System.out.print("number of white spaces is: "+iRet);
	}
}

class Siddhant23E
{
	public int assign23E(String str) {
		int iCnt = 0, iSpace= 0;
		char ch;

		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if(ch == ' ') 
	        {
				iSpace++;
	        }
		}
		return iSpace;
	}
}

/* OUTPUT:

Enter String: siddhant suryakant deshmukh
number of white spaces is: 2

Enter String: S i d d h a n t
number of white spaces is: 7
*/