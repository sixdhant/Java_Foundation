/********************************************* ASSIGNMENT NO - 20B   ***************************************
 
 STATEMENT: Accept Character from user and check whether it is capital or not (A-Z).
 
 INPUT :   Z							y				
 OUTPUT :  It is Capital Character		It is not a capital Character
  
*********************************************************************************************************/
 
package Assignment_20;

import java.util.Scanner;

public class Assignment_20B {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		boolean bRet= false;
		
		System.out.print("Enter the character: ");  
		char c = Sobj.next().charAt(0);   
			
		bRet = Siddhant20B.assign20B(c);
		
		if(bRet == true)
	    {
			System.out.println("It is Capital Character");
	    }
	    else
	    {
	    	System.out.println("It is not a capital Character");
	    }				 
	}
}

class Siddhant20B
{
	public static boolean assign20B(char ch)
	{
	   
		if(ch >= 65 && ch<= 90)	  
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

Enter the character: Z
It is Capital Character

Enter the character: y
It is not a capital Character

Enter the character: S
It is Capital Character
*/





