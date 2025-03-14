/**************************************** ASSIGNMENT NO - 38E ***************************************
 
 STATEMENT: Write Java program which accept String from user and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_38;

import java.util.Scanner;

public class Assignment_38E {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str = sobj.nextLine();
	
		Siddhant38E.assign38E(str);
	}
}

class Siddhant38E 
{
	public static void  assign38E(String str) 
	{
		System.out.println("Output : ");

		char Arr[]=str.toCharArray();
		int i=0,j=0;
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length-1;j++)
			{
					if(i>=j)
			{
				System.out.print(Arr[j]);
				System.out.print("\t");
			}
			}
			System.out.println();
		}
		for(i=Arr.length-1;i>=0;i--)
		{
			for(j=0;j<Arr.length;j++)
			{
			
				if(i>=j)
			{
				System.out.print(Arr[j]);
				System.out.print("\t");
			}
			
				
			}
			System.out.println();
		}
	}
}

/*  OUTPUT:

Enter String: SIDDHANT
Output : 
S	
S	I	
S	I	D	
S	I	D	D	
S	I	D	D	H	
S	I	D	D	H	A	
S	I	D	D	H	A	N	
S	I	D	D	H	A	N	
S	I	D	D	H	A	N	T	
S	I	D	D	H	A	N	
S	I	D	D	H	A	
S	I	D	D	H	
S	I	D	D	
S	I	D	
S	I	
S	

*/


