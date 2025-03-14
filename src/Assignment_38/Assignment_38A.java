/**************************************** ASSIGNMENT NO - 38A ***************************************
 
 STATEMENT: Write Java program which accept String from user and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_38;

import java.util.Scanner;

public class Assignment_38A {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str = sobj.nextLine();
	
		Siddhant38A.assign38A(str);
		
	}
}

class Siddhant38A 
{
	public static void  assign38A(String str) 
	{
		System.out.println("Output : ");
		char Arr[]=str.toCharArray();
		int i=0,j=0;
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length;j++)
			{
				System.out.print(Arr[j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

/*  OUTPUT:

Enter String: SIDDHANT
Output : 
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	T
*/


