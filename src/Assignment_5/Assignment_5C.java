/**************************************** ASSIGNMENT NO - 5C **********************************************
 
 STATEMENT: Write a program which accept number from user and count frequency of 2 in it.
 
 INPUT :    2395  9922322	1358
 OUTPUT :   1		4		0
 
***********************************************************************************************************/

 package Assignment_5;

 import java.util.*;
 
 public class Assignment_5C
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0, iRet = 0;
        
        System.out.print("Enter Number: ");
        iNo = Sobj.nextInt();
        
        iRet = Siddhant5C.assign5C(iNo);
        
        System.out.println("Frequency of Two is: "+iRet);
    }
 }
 class Siddhant5C
  {
     public static int assign5C(int iValue)
     {    	   
    	 int iCnt=0, iDigit= 0;       
         if(iValue < 0) 
         {
            iValue = - iValue; 
         }
         while(iValue > 0)  //(iNo != 0)
         {
            iDigit= iValue % 10;
            
            if(iDigit == 2)
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
Frequency of Two is: 1

Enter Number: 9922322
Frequency of Two is: 4
*/
