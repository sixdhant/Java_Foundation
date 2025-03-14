/********************************************* ASSIGNMENT NO - 19E   ***************************************
 
 STATEMENT: Accept N numbers from user and display summation of digits of each number.
 
 INPUT :   
 OUTPUT :  
  
*********************************************************************************************************/



package Assignment_19;

import java.util.Scanner;

public class Assignment_19E {

    public static void main(String[] args) {

        Scanner Sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0;

        System.out.print("Enter number of elements: ");
        iSize = Sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter " + iSize + " numbers: ");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            Arr[iCnt] = Sobj.nextInt();
        }

        Siddhant19E.assign19E(Arr);

        Sobj.close(); // Close the Scanner
    }
}

class Siddhant19E {
    public static void assign19E(int Brr[]) 
    {
        for (int i = 0; i < Brr.length; i++) 
        {
            int iSum = 0;
            // Using a for loop to extract digits and calculate sum
            for (int j = Brr[i]; j > 0; j /= 10) 
            {
                iSum =  iSum + (j % 10);
            }

            System.out.println("Sum of digits of " + Brr[i] + " is: " + iSum);
        }
    }
}
