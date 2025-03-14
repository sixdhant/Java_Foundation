/***************************** ASSIGNMENT NO - 4B ***************************************************************
 
 STATEMENT: Write a program which accept number from user and display its factors in decreasing order.
 
 INPUT :   12 
 OUTPUT :  6 4 3 2 1
 
*****************************************************************************************************************/
package Assignment_4;

 import java.util.*;
 
 public class Assignment_4B 
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0;
        
        System.out.print("Enter Number: ");
        iNo = Sobj.nextInt();
        
        Siddhant4B.assign4B(iNo);
    }
 }
 class Siddhant4B
 {
    public static void assign4B(int iValue)
    {
        int iCnt = 1;
        
        if(iValue <= 0)
        {
            iValue = - iValue;
        }       
        System.out.println();
        for(iCnt = iValue/2; iCnt >= 1; iCnt--)
        {
            if(iValue % iCnt == 0)
            {
                System.out.print(iCnt);
                System.out.print("\t");
            }
        }       
    }
 }
 
/*OUTPUT: 
 
 Enter Number: 12
 6       4       3       2       1
 
 Enter Number: 10
 5       2       1
*/