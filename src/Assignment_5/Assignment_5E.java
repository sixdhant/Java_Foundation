/************************************************ ASSIGNMENT NO - 5E **********************************************
 
 STATEMENT: Write a program which accept number from user and count frequency of such a digits which are less than 6.
 
 INPUT :    2395  1018   944083
 OUTPUT :   3	 	3		4	
 
********************************************************************************************************************/

 package Assignment_5;

 import java.util.*;
 
 public class Assignment_5E
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0, iRet = 0;
        
        System.out.print("Enter Number: ");
        iNo = Sobj.nextInt();
        
        iRet = Siddhant5E.assign5E(iNo);
        
        System.out.println("frequency of such a digits which are less than 6 is: "+iRet);
    }
 }
 class Siddhant5E
  {
     public static int assign5E(int iValue)
     {  	   
    	 int iCnt=0, iDigit= 0;        
         if(iValue < 0) 
         {
            iValue = - iValue; 
         }
         while(iValue > 0)  //(iNo != 0)
         {
            iDigit= iValue % 10;         
            if(iDigit < 6)
            {
                iCnt++;
            }
            iValue= iValue/10;
         }
         return iCnt;   	    
     }
  }

/*OUTPUT: 
 
Enter Number: 2395
frequency of such a digits which are less than 6 is: 3

Enter Number: 1018
frequency of such a digits which are less than 6 is: 3

Enter Number: 944083
frequency of such a digits which are less than 6 is: 4
*/

