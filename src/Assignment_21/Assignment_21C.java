/********************************************* ASSIGNMENT NO - 21C   ***************************************
 
 STATEMENT: Accept character from user. If it is capital then display all the characters from the input 
 	    characters till Z. If input character is small then print all the characters
 	    in reverse order till a. In other cases return directly.
 
 INPUT :  s 
 OUTPUT : S	T	U	V	W	X	Y	Z 
  
*********************************************************************************************************/
 
package Assignment_21;

import java.util.Scanner;

public class Assignment_21C {

	public static void main(String[] args) {
			
		Scanner Sobj = new Scanner(System.in);
		char cValue= '\0';
		
		System.out.print("Enter the character: ");  
		cValue = Sobj.next().charAt(0);
		
		Siddhant21C.assign21C(cValue);	
	}
}

class Siddhant21C
{
	public static void assign21C(char ch)
	{
		int i= 0;
		System.out.print("OUTPUT:");
	    
	    if((ch >= 97)&&(ch <= 122))     
	    {
	        ch= (char) (ch - 32);
	    }
	    
	    for(i= ch; i<=90; i++)
	    {
	    	System.out.print("\t"+ (char) i);
	    }			  	 	
	}
}

/*OUTPUT: 

Enter the character: s
OUTPUT:	S	T	U	V	W	X	Y	Z

Enter the character: M
OUTPUT:	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z

*/
