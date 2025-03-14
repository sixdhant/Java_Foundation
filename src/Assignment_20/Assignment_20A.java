/********************************************* ASSIGNMENT NO - 20A   ***************************************
 
 STATEMENT: Write a Java program which accept string from user and count number of capital characters.
 
 INPUT :   5						s
 OUTPUT :  It is not a Character	It is Character
  
*********************************************************************************************************/
 
package Assignment_20;

import java.util.Scanner;

public class Assignment_20A {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		boolean bRet= false;
		
		System.out.print("Enter the character: ");  
		char c = Sobj.next().charAt(0);   
			
		bRet = Siddhant20A.assign20A(c);
		
		if(bRet == true)
	    {
			System.out.println("It is Character");
	    }
	    else
	    {
	    	System.out.println("It is not a Character");
	    }
				 
	}
}

class Siddhant20A
{
	public static boolean assign20A(char ch)
	{
	   
	   if(ch >= 65 && ch <= 90 || ch>= 97 && ch<= 122)	  
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }	      	 	
	}
}

/*OUTPUT: 

Enter the character: 5
It is not a Character

Enter the character: z
It is Character

Enter the character: @
It is not a Character
*/





