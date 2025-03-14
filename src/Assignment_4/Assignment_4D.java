/************************************** ASSIGNMENT NO - 4D ***************************************************

STATEMENT: Write a program which accept number from user and return summation of all its non factors.

INPUT :   12      10
OUTPUT :  50      37

**************************************************************************************************************/

package Assignment_4;

import java.util.*;

public class Assignment_4D
{
   public static void main(String arg[])
   {
       Scanner Sobj = new Scanner(System.in);
       int iNo= 0, iRet = 0;
       
       System.out.print("Enter Number: ");
       iNo = Sobj.nextInt();
       
       iRet = Siddhant4D.assign4D(iNo);
       
       System.out.println("Addition is: "+iRet);
   }
}
class Siddhant4D
{
   public static int assign4D(int iValue)
   {
       int iCnt = 1, iSum= 0;
       
       if(iValue <= 0)
       {
           iValue = - iValue;
       }      
       System.out.println();
       for(iCnt = 1; iCnt <= iValue; iCnt++)
       {
           if(iValue % iCnt != 0)
           {
               iSum = iSum + iCnt;
           }
       }
       return iSum;
   }
}

/*OUTPUT: 

Enter Number: 12
Addition is: 50

Enter Number: 10
Addition is: 37
*/
