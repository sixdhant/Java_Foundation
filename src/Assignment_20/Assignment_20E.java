/********************************************* ASSIGNMENT NO - 20E   ***************************************
 
 STATEMENT: Accept division of student from user and depends on the division display exam timing. 
 			There are 4 divisions in school as A,B,C,D. Exam of division A at 7 AM, B at 8.30 AM, 
 			C at 9.20 AM and D at 10.30 AM. (Application should be case insensitive)
 
 INPUT :   a
 OUTPUT :  Exam of division A at 7 AM
  
*********************************************************************************************************/
 
package Assignment_20;

import java.util.Scanner;

public class Assignment_20E {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);		
		
		System.out.println("Enter Your division: ");  
		char c = Sobj.next().charAt(0);   
			
		Siddhant20E.assign20E(c);			 
	}
}

class Siddhant20E
{
	public static void assign20E(char ch)
	{
		if(ch == 97 || ch == 65)  
	      {
			System.out.println("Exam of division A at 7 AM");
	      }
	      else if(ch == 98 || ch == 66)  
	      {
	    	  System.out.println("Exam of division B at 8.30 AM");
	      }
	      else if(ch == 99 || ch == 67)  
	      {
	    	  System.out.println("Exam of division C at 9.30 AM");
	      }
	      else if(ch == 100 || ch == 68)  
	      {
	    	  System.out.println("Exam of division D at 10.30 AM");
	      }
	      else
	      {
	    	  System.out.println("You entered wrong division");
	      }
	}
}

/*OUTPUT: 

Enter Your division: a
Exam of division A at 7 AM

Enter Your division: B
Exam of division B at 8.30 AM

Enter Your division: D
Exam of division D at 10.30 AM

Enter Your division: s
You entered wrong division
*/





