/*  	Constructor 	Overloading			*/

package A_BasicConcept;

public class _12_Constructor_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siddhant11 sid = new Siddhant11();
		Siddhant11 sid1 = new Siddhant11(100);
		Siddhant11 sid2 = new Siddhant11(99,"Siddhant Deshmukh", 99.99);
		System.out.println("Output 1 is : "+sid.iVal1+" | "+sid.sVal1+" | "+sid.dVal1);
		System.out.println("Output 2 is : " +sid1.iVal1);
		System.out.println("Output 3 is : "+sid2.iVal1+" | "+sid.sVal1+" | "+sid2.dVal1);
	}

}
class Siddhant11
{
	int iVal1; String sVal1; double dVal1;
	Siddhant11()
	{
		iVal1 = 20; sVal1 = "Siddhant Deshmukh"; dVal1 = 20.20;
		
	}
	
	Siddhant11(int iValue1)
	{
		iVal1 = iValue1;
		
	}
	Siddhant11(int iValue1, String iValue2, double iValue3)
	{
		iVal1 = iValue1;
		sVal1 = iValue2;
		dVal1 = iValue3;
	}
}


/* Output is :

Output 1 is : 20 | Siddhant Deshmukh | 20.2
Output 2 is : 100
Output 3 is : 99 | Siddhant Deshmukh | 99.99

*/