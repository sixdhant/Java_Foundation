/********************************************* ASSIGNMENT NO - 4E ***********************************************
 
 STATEMENT: Write a program which accept number from user and return difference between summation of all 
 			its factors and non factors.
 			
 INPUT :    12        10 
 OUTPUT :  -34       -29
 
******************************************************************************************************************/
package Assignment_4;

 import java.util.*;
 
 public class Assignment_4E
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0, iRet = 0;
        
        System.out.print("Enter Number: ");
        iNo = Sobj.nextInt();
        
        iRet = Siddhant4E.assign4E(iNo);
        
        System.out.println("Difference between summation of its factor & non factor is: "+iRet);
    }
 }
 class Siddhant4E
 {
    public static int assign4E(int iValue)
    {
        int iCnt = 1, iFact= 0, iNonFact= 0, iDiff= 0;
        
        if(iValue <= 0)
        {
            iValue = - iValue;
        }
        
        System.out.println();
        for(iCnt = 1; iCnt < iValue; iCnt++)
        {
            if(iValue % iCnt == 0)
            {
                iFact = iFact + iCnt;
            }
            else
            {
                iNonFact = iNonFact + iCnt;
            }
        }
        iDiff = iFact - iNonFact;
        return iDiff;
    }
 }
 
/*OUTPUT: 
 
 Enter Number: 12
 Difference between summation of its factor & non factor is: -34
 
 Enter Number: 10
 Difference between summation of its factor & non factor is: -29
*/