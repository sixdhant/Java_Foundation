/****************************** ASSIGNMENT NO - 4C ***********************************************************
 
 STATEMENT: Write a program which accept number from user and display all its non factors.
 
 INPUT :   12
 OUTPUT :  5 7 8 9 10 11
 
***************************************************************************************************************/
package Assignment_4;

 import java.util.*;
 
 public class Assignment_4C
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0;
        
        System.out.print("Enter Number: ");
        iNo = Sobj.nextInt();
        
        Siddhant4C.assign4C(iNo);
    }
 }
 class Siddhant4C
 {
    public static void assign4C(int iValue)
    {
        int iCnt = 1;
        
        if(iValue <= 0)
        {
            iValue = - iValue;
        }        
        System.out.println();
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            if(iValue % iCnt != 0)
            {
                System.out.print(iCnt);
                System.out.print("\t");
            }
        }       
    }
 }
 
/*OUTPUT: 
 
 Enter Number: 12
 5       7       8       9       10      11
 
 Enter Number: 15
 2       4       6       7       8       9       10      11      12      13      14
*/