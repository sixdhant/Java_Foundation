/********************************************* ASSIGNMENT NO - 21A   ***************************************
 
 STATEMENT: Write a program which displays ASCII table. Table contains symbol, Decimal, Hexadecimal and Octal
  	    representation of every member from 0 to 255.
 
 INPUT :   
 OUTPUT :  ******************ASCII TABLE IS********************
  
*********************************************************************************************************/
 
package Assignment_21;

public class Assignment_21A {

	public static void main(String[] args) {
				
		Siddhant21A.assign21A();			 
	}
}

class Siddhant21A
{
	public static void assign21A()
	{
		int i= 0;
	    System.out.println("******************ASCII TABLE IS********************");	    
	    System.out.println("\tCharaters \t Decimal\n");
	    
	    for(i=0; i<=255; i++)
	    {
	    	System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
	    }    	 	
	}
}

/*OUTPUT: 

******************ASCII TABLE IS********************
	
		Charaters 	      Decimal

*/






