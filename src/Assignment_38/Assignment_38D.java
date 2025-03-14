/**************************************** ASSIGNMENT NO - 38D ***************************************
 
 STATEMENT: Write Java program which accept String from user and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_38;

import java.util.Scanner;

public class Assignment_38D {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str = sobj.nextLine();
	
		Siddhant38D.assign38D(str);
		
	}
}

class Siddhant38D 
{
	public static void  assign38D(String str) 
	{
		System.out.println("Output : ");

		char Arr[]=str.toCharArray();
		int i=0,j=0;
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
		for(i=1;i<Arr.length;i++)
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

Enter String: RAJASHIVAJI
Output : 
R	A	J	A	S	H	I	V	A	J	I	
R	A	J	A	S	H	I	V	A	J	
R	A	J	A	S	H	I	V	A	
R	A	J	A	S	H	I	V	
R	A	J	A	S	H	I	
R	A	J	A	S	H	
R	A	J	A	S	
R	A	J	A	
R	A	J	
R	A	
R	
R	A	
R	A	J	
R	A	J	A	
R	A	J	A	S	
R	A	J	A	S	H	
R	A	J	A	S	H	I	
R	A	J	A	S	H	I	V	
R	A	J	A	S	H	I	V	A	
R	A	J	A	S	H	I	V	A	J	
R	A	J	A	S	H	I	V	A	J	I	

*/


