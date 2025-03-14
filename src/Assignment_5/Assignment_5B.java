/**************************************** ASSIGNMENT NO - 5B **********************************************
 
 STATEMENT: Write a program which accept number from user and check whether it contains 0 in it or not.
 
 INPUT :    2395
 OUTPUT :   There is no Zero
 
***********************************************************************************************************/

 package Assignment_5;

 import java.util.*;
 
 public class Assignment_5B
 {
    public static void main(String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo= 0;
        boolean bRet = false;
        
        System.out.println("Enter Number: ");
        iNo = Sobj.nextInt();
        
        bRet = Siddhant5B.assign5B(iNo);
        
        if(bRet == true)
        {
        	System.out.println("It Contains Zero");
        }
        else
        {
        	System.out.println("There is no Zero");
        }
    }
 }
 class Siddhant5B
  {
     public static boolean assign5B(int iValue)
     {
    	   if(iValue == 0)
    	   {
    		   return true;
    	   }
    
           if(iValue < 0)      //Intput Updater
           {
        	   iValue = - iValue;    
           }
           while(iValue > 0)
           {
        	   if(iValue % 10 == 0)
        	   {
        		   return true;
        	   }
        	   iValue /= 10;
           }        
   	     return false;
     }
  }

 /*OUTPUT: 
 
Enter Number: 
123654789
There is no Zero

Enter Number: 
1254796320
It Contains Zero

 */