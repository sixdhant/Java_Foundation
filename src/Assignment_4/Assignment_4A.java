/**************************** ASSIGNMENT NO - 4A **************************************************************
 
 STATEMENT: Write a program which accept number from user and display its multiplication of factors.
 
 INPUT :    12      13    10
 OUTPUT :   144     1     10
 
***************************************************************************************************************/
package Assignment_4;

 import java.util.*;
 
 public class Assignment_4A 
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0, iRet = 0;
        
        System.out.print("Enter Number: ");
        iNo = Sobj.nextInt();
        
        iRet = Siddhant4A.assign4A(iNo);
        
        System.out.println("Multplication of Factor is: "+iRet);
    }
 }
 class Siddhant4A
 {
    public static int assign4A(int iValue)
    {
        int iCnt = 1, iMult = 1;
        
        if(iValue <= 0)
        {
            iValue = - iValue;
        }
        System.out.println();
        for(iCnt = 1; iCnt <= iValue/2; iCnt++)
        {
            if(iValue % iCnt == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
 }
 
/*OUTPUT: 
 
 Enter Number: 12
 Multplication of Factor is: 144
 
 Enter Number: 10
 Multplication of Factor is: 10
*/