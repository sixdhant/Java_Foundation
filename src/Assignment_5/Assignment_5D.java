/**************************************** ASSIGNMENT NO - 5D **********************************************
 
 STATEMENT: Write a program which accept number from user and count frequency of 4 in it.
 
 INPUT :    2395  9944344	1458
 OUTPUT :   0		4		0
 
***********************************************************************************************************/

 package Assignment_5;

 import java.util.*;
 
 public class Assignment_5D
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0, iRet = 0;
        
        System.out.print("Enter Number: ");
        iNo = Sobj.nextInt();
        
        iRet = Siddhant5D.assign5D(iNo);
        
        System.out.println("Frequency of four is: "+iRet);
    }
 }
 class Siddhant5D
  {
     public static int assign5D(int iValue)
     {   	   
    	 int iCnt=0, iDigit= 0;
         
         if(iValue < 0) 
         {
            iValue = - iValue; 
         }
         while(iValue > 0)  //(iNo != 0)
         {
            iDigit= iValue % 10;
            
            if(iDigit == 4)
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
Frequency of four is: 0

Enter Number: 9944344
Frequency of four is: 4
*/
