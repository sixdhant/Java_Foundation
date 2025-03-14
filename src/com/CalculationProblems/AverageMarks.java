package com.CalculationProblems;

import java.util.Scanner;

public class AverageMarks
{
  public static void main(String args[])
  {
    int i;
    Scanner sobj =new Scanner(System.in);
    System.out.print("Enter number of subjects : ");
    int iSub =sobj.nextInt();
 
    int[] arr = new int[iSub];
 
    System.out.println("Enter marks :");
 
    for( i=0; i<iSub; i++)
    {
    	arr[i]=sobj.nextInt();
    }
 
    AverageCalculation pobj =new AverageCalculation(arr);
 
    System.out.print("Average of (");
 
    for(i=0; i<iSub-1; i++)
    {
     System.out.print(arr[i]+",");
    }
    System.out.println(arr[i]+") ="+pobj.avg/iSub);
  }
}

class AverageCalculation
{
   double avg=0;
 
   AverageCalculation(int brr[])
   {
      for(int  i=0;i<brr.length;i++)
      {
        avg =avg + brr[i];
      }
   }
}

/*OUTPUT:

Enter number of subjects : 5
Enter marks :
100
100
100
100
100
Average of (100,100,100,100,100) =100.0
*/