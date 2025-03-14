/**************************************** ASSIGNMENT NO - 25B ***************************************
 
 STATEMENT: Write a program which accept string from user and copy the contents of that 
 			string into another string.
 
 INPUT :   siddhant deshmukh    -   4
 OUTPUT :  sidd
  
*****************************************************************************************************/

package Assignment_25;

import java.util.Scanner;

public class Assignment_25B1 {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
		int iSize = 8;

		System.out.print("Enter String: ");
		str = sobj.nextLine();

		System.out.print("Enter Size : ");
		iSize = sobj.nextInt();
		
		if(iSize > str.length())
		{
			System.out.println("Please Enter size less that string length.");
		}
		else 
		{
			rString = Siddhant25B1.assign25B(str, iSize);
			System.out.println("Modified String: " + rString);
		}
	}
}

class Siddhant25B1 
{
	public static String assign25B(String str, int iSize) 
	{
		 	String newString = ""; // Initialize an empty string

	        // Using for loop to copy first N characters
	        for (int i = 0; i < iSize; i++) 
	        {
	            newString = newString + str.charAt(i);
	        }
	        return newString;
	}
}

/** OUTPUT:

Enter String: Siddhant Deshmukh
Enter Size: 8
Modified String: Siddhant

Enter String: siddhant
Enter Size : 15
Please Enter size less that string length.
*/